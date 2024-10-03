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

    fun dismiss()
}

enum class SnackBarResult {
    Dismissed,
}

@Stable
class SnackBarHostState {
    private val mutex = Mutex()

    internal var currentSnackBarData by mutableStateOf<SnackBarData?>(null)
        private set

    suspend fun showToast(
        message: String,
    ): SnackBarResult = mutex.withLock {
        try {
            return suspendCancellableCoroutine { continuation ->
                currentSnackBarData = SnackBarDataImpl(message, continuation)
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
    snackBar: @Composable (SnackBarData) -> Unit = {
        InfoSnackBar(
            text = snackBarHostState.currentSnackBarData?.message ?: ""
        )
    }
) {
    val currentSnackBarData = snackBarHostState.currentSnackBarData
    LaunchedEffect(currentSnackBarData) {
        if (currentSnackBarData != null) {
            delay(SNACK_BAR_DURATION)
            currentSnackBarData.dismiss()
        }
    }
    FadeInFadeOut(
        newSnackBarData = snackBarHostState.currentSnackBarData,
        modifier = modifier,
        snackBar = snackBar
    )
}
