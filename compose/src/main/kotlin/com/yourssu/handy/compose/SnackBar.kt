package com.yourssu.handy.compose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.yourssu.handy.compose.foundation.ColorGray800
import com.yourssu.handy.compose.foundation.ColorStatusRedSub
import com.yourssu.handy.compose.foundation.HandyTypography
import kotlinx.coroutines.delay

@Composable
fun InfoSnackBarItem(
    text: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(ColorGray800)
            .padding(16.dp)
    ) {
        Text(
            text = text,
            color = HandyTheme.colors.textBasicWhite,
            maxLines = 2,
            style = HandyTypography.B3Sb14
        )
    }
}

@Composable
fun InfoSnackBar(
    text: String,
    delay: Long = DURATION,
    onDismiss: () -> Unit
) {
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible = true
        delay(delay)
        visible = false
        delay(FADE_OUT_DURATION)
        onDismiss()
    }

    Popup(
        alignment = Alignment.BottomCenter
    ) {
        AnimatedVisibility(
            visible = visible,
            enter = fadeIn(
                animationSpec = tween(durationMillis = 500)
            ) + expandVertically(
                expandFrom = Alignment.Top
            ),
            exit = fadeOut(
                animationSpec = tween(durationMillis = 300)
            ) + shrinkVertically(
                shrinkTowards = Alignment.Bottom
            ) + slideOutVertically(
                targetOffsetY = { fullHeight -> fullHeight }
            )
        ) {
            InfoSnackBarItem(
                text = text,
            )
        }
    }
}

@Composable
fun ErrorSnackBarItem(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(ColorStatusRedSub)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_alert_triangle),
            tint = HandyTheme.colors.bgStatusNegative
        )
        Text(
            text = text,
            color = HandyTheme.colors.textStatusNegative,
            maxLines = 2,
            style = HandyTypography.B3Sb14
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.ic_cancel),
            tint = HandyTheme.colors.textBasicTertiary,
            modifier = Modifier
                .clickable(onClick = onClick)
                .align(Alignment.Top)
        )
    }
}

@Composable
fun ErrorSnackBar(
    text: String,
    onDismiss: () -> Unit
) {
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible = true
    }

    LaunchedEffect(visible) {
        if (!visible) {
            delay(FADE_OUT_DURATION)
            onDismiss()
        }
    }

    Popup(
        alignment = Alignment.BottomCenter
    ) {
        AnimatedVisibility(
            visible = visible,
            enter = fadeIn(
                animationSpec = tween(durationMillis = 500)
            ) + expandVertically(
                expandFrom = Alignment.Top
            ),
            exit = fadeOut(
                animationSpec = tween(durationMillis = 300)
            ) + shrinkVertically(
                shrinkTowards = Alignment.Bottom
            ) + slideOutVertically(
                targetOffsetY = { fullHeight -> fullHeight }
            )
        ) {
            ErrorSnackBarItem(
                text = text,
                onClick = { visible = false }
            )
        }
    }
}

private const val DURATION = 5000L
private const val FADE_OUT_DURATION = 300L