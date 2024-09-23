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

/**
 * 정보성 스낵바의 UI를 그린 함수입니다.
 *
 * @param text 스낵바의 문구를 나타내는 텍스트, 최대 두 줄까지 입력 가능
 * @param modifier Modifier
 */
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

/**
 * 정보성 스낵바를 구현한 함수입니다.
 *
 * 유저의 행동에 대한 단순 결과를 나타낼 때 사용합니다.
 * 특정 시간 노출 후에 사라집니다.
 *
 * @param text 스낵바의 문구를 나타내는 텍스트, 최대 두 줄까지 입력 가능
 * @param onDismiss 스낵바가 사라질 때 호출되는 함수
 * @param duration 스낵바가 지속되어 있는 시간 (기본값은 5초)
 */
@Composable
fun InfoSnackBar(
    text: String,
    onDismiss: () -> Unit,
    duration: Long = SNACK_BAR_DURATION,
) {
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible = true
        delay(duration)
        visible = false
        delay(FADE_OUT_DURATION)
        onDismiss()
    }

    Popup(
        alignment = Alignment.BottomCenter,
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
            ) + slideOutVertically(
                targetOffsetY = { fullHeight -> fullHeight },
            )
        ) {
            InfoSnackBarItem(
                text = text,
            )
        }
    }
}

/**
 * 에러 스낵바의 UI를 그린 함수입니다.
 *
 * @param text 스낵바의 문구를 나타내는 텍스트, 최대 두 줄까지 입력 가능
 * @param onClick 스낵바의 X 버튼을 눌렀을 때 호출되는 함수
 * @param modifier Modifier
 */
@Composable
fun ErrorSnackBarItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
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
            tint = HandyTheme.colors.bgStatusNegative,
            modifier = Modifier.align(Alignment.Top)
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

/**
 * 에러 스낵바를 구현한 함수입니다.
 *
 * 사용자의 수행 과정에 부정적인 결과가 발생하거나
 * 정보성 스낵바보다 강조해야 할 메시지를 담아야 할 때 사용합니다.
 *
 * X 버튼을 눌러야만 사라집니다.
 *
 * @param text 스낵바의 문구를 나타내는 텍스트, 최대 두 줄까지 입력 가능
 * @param onDismiss 스낵바가 사라질 때 호출되는 함수
 */
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
            exit = shrinkVertically(
                shrinkTowards = Alignment.Bottom,
                animationSpec = tween(durationMillis = 300)
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

private const val SNACK_BAR_DURATION = 5000L
private const val FADE_OUT_DURATION = 300L