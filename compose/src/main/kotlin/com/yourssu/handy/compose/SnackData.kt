package com.yourssu.handy.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.yourssu.handy.compose.SnackBarDefaults.SNACK_BAR_DURATION
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.delay
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.coroutines.resume

interface SnackBarData {
    val message: String
    val type: SnackBarType

    fun dismiss()
}

enum class SnackBarResult {
    Dismissed,
}

enum class SnackBarType {
    Info,
    Error,
}

@Stable
class SnackBarHostState {
    private val mutex = Mutex()

    internal var currentSnackBarData by mutableStateOf<SnackBarData?>(null)
        private set

    suspend fun showSnackBar(
        message: String,
        type: SnackBarType
    ): SnackBarResult = mutex.withLock {
        try {
            return suspendCancellableCoroutine { continuation ->
                currentSnackBarData = SnackBarDataImpl(
                    message = message,
                    type = type,
                    continuation = continuation
                )
            }
        } finally {
            currentSnackBarData = null
        }
    }
}

@Composable
fun rememberSnackBarHostState(): SnackBarHostState = remember { SnackBarHostState() }

@Stable
private class SnackBarDataImpl(
    override val message: String,
    override val type: SnackBarType,
    private val continuation: CancellableContinuation<SnackBarResult>
) : SnackBarData {

    override fun dismiss() {
        if (continuation.isActive) {
            continuation.resume(SnackBarResult.Dismissed)
        }
    }
}

@Composable
fun SnackBarHost(
    snackBarHostState: SnackBarHostState,
    modifier: Modifier = Modifier,
    snackBar: @Composable (SnackBarData) -> Unit = { snackBarData ->
        when (snackBarData.type) {
            SnackBarType.Info -> InfoSnackBar(
                text = snackBarHostState.currentSnackBarData?.message.orEmpty(),
                onDismiss = snackBarData::dismiss
            )

            SnackBarType.Error -> ErrorSnackBar(
                text = snackBarHostState.currentSnackBarData?.message.orEmpty(),
                onClick = snackBarData::dismiss
            )
        }
    },
) {
    val currentSnackBarData = snackBarHostState.currentSnackBarData

    if (currentSnackBarData?.type == SnackBarType.Info) {
        LaunchedEffect(currentSnackBarData) {
            delay(SNACK_BAR_DURATION)
            currentSnackBarData.dismiss()
        }
    }

    FadeInFadeOut(
        newSnackBarData = currentSnackBarData,
        modifier = modifier,
        snackBar = snackBar
    )
}
