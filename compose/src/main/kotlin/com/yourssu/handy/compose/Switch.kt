package com.yourssu.handy.compose

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Switch의 크기를 나타내는 Sealed Class입니다.
 * [SwitchSize.Large], [SwitchSize.Medium], [SwitchSize.Small] 중 하나를 가질 수 있습니다.
 */
sealed class SwitchSize {
    data object Large : SwitchSize()
    data object Medium : SwitchSize()
    data object Small : SwitchSize()
}

/**
 * Switch의 상태를 나타내는 Sealed Class입니다.
 * [SwitchState.Unselected], [SwitchState.Selected], [SwitchState.Disabled] 중 하나를 가질 수 있습니다.
 */
sealed class SwitchState {
    data object Unselected : SwitchState()
    data object Selected : SwitchState()
    data object Disabled : SwitchState()
}

/**
 * Switch를 그리는 함수입니다.
 *
 * 스위치는 특정 기능을 활성 또는 비활성의 상태로 만들 수 있도록 도와주는 요소입니다.
 * 내부적으로 Track과 Thumb으로 구성되어 있습니다.
 *
 * @param switchState Switch의 상태. [SwitchState.Unselected], [SwitchState.Selected], [SwitchState.Disabled] 중 하나를 가질 수 있습니다.
 * @param onToggle Switch의 상태를 변경하는 함수. [SwitchState]를 인자로 가집니다.
 * @param switchSize Switch의 크기. [SwitchSize.Large], [SwitchSize.Medium], [SwitchSize.Small] 중 하나를 가질 수 있습니다.
 * @param modifier Modifier
 */
@Composable
fun Switch(
    switchState: SwitchState = SwitchState.Unselected,
    onToggle: (SwitchState) -> Unit,
    switchSize: SwitchSize = SwitchSize.Large,
    modifier: Modifier = Modifier
) {
    val switchTrackWidth = remember(switchSize) { switchTrackWidth(switchSize) }
    val switchTrackHeight = remember(switchSize) { switchTrackHeight(switchSize) }
    val switchThumbSize = remember(switchSize) { switchThumbSize(switchSize) }
    val switchPadding = remember(switchSize) { switchPadding(switchSize) }

    // Switch의 Track의 색상 변경을 에니메이션하기 위한 상태입니다.
    val trackColor: Color by animateColorAsState(switchTrackColor(switchState))

    val easeIn = SwitchAnimationEasing
    val easeOut = SwitchAnimationEasing

    // Trainstion을 사용하면 Switch의 상태가 변경될 때 애니메이션을 적용할 수 있습니다.
    val transition = updateTransition(targetState = switchState, label = "SwitchStateTransition")

    // Switch의 Thumb의 Offset을 에니메이션 하기위한 상태입니다.
    val thumbOffset: Dp by transition.animateDp(
        transitionSpec = {
            // Switch의 상태가 변경될 때 애니메이션을 적용합니다.
            // easeIn: Unselected -> Selected, easeOut: Selected -> Unselected
            when {
                SwitchState.Selected isTransitioningTo SwitchState.Unselected ->
                    tween(durationMillis = SwitchAnimationDuration, easing = easeOut)

                else ->
                    tween(durationMillis = SwitchAnimationDuration, easing = easeIn)
            }
        },
        label = "ThumbOffset"
    ) { state ->
        if (state == SwitchState.Selected) {
            // Switch의 Thumb이 Track의 오른쪽 끝에 위치하도록 하는 Offset입니다.
            switchTrackWidth - switchThumbSize - switchPadding
        } else {
            // Switch의 Thumb이 Track의 왼쪽 끝에 위치하도록 하는 Offset입니다.
            switchPadding
        }
    }

    Surface(
        checked = switchState == SwitchState.Selected,
        onCheckedChange = { onToggle(if (switchState == SwitchState.Selected) SwitchState.Unselected else SwitchState.Selected) },
        modifier = modifier
            .padding(switchPadding)
            .width(switchTrackWidth)
            .height(switchTrackHeight),
        enabled = switchState != SwitchState.Disabled,
        shape = RoundedCornerShape(size = SwitchTrackRoundedCorner.dp),
        backgroundColor = trackColor,
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
            // Offset을 사용하여 Switch의 Thumb을 이동시킵니다.
            SwitchThumb(
                switchSize = switchSize,
                modifier = Modifier
                    .offset(x = thumbOffset)
            )
        }
    }
}

// Switch의 상태가 변경될 때 애니메이션을 적용하기 위한 상수입니다.(ms)
private const val SwitchAnimationDuration = 150

// Switch의 Track의 모서리를 둥글게 만들기 위한 상수입니다.
private const val SwitchTrackRoundedCorner = 999

// Switch의 애니메이션 Easing입니다.
private val SwitchAnimationEasing = CubicBezierEasing(0.25f, 0.1f, 0.25f, 1f)

/**
 * Switch의 Thumb을 그리는 함수입니다.
 * @param switchSize Switch의 크기
 */
@Composable
private fun SwitchThumb(switchSize: SwitchSize, modifier: Modifier) {
    Surface(
        modifier = modifier
            .clip(CircleShape)
            .size(switchThumbSize(switchSize)),
        contentColor = HandyTheme.colors.switchThumb,
    ) {}
}

/**
 * Switch의 Track의 색상을 반환하는 함수입니다.
 * @param switchState Switch의 상태
 */
@Composable
private fun switchTrackColor(switchState: SwitchState): Color = when (switchState) {
    SwitchState.Unselected -> HandyTheme.colors.switchUnselected
    SwitchState.Selected -> HandyTheme.colors.switchSelected
    SwitchState.Disabled -> HandyTheme.colors.switchDisabled
}

/**
 * Switch의 Track의 높이를 반환하는 함수입니다.
 * @param switchSize Switch의 크기
 */
private fun switchTrackHeight(switchSize: SwitchSize): Dp = when (switchSize) {
    SwitchSize.Large -> 30.dp
    SwitchSize.Medium -> 20.dp
    SwitchSize.Small -> 16.dp
}

/**
 * Switch의 Track의 너비를 반환하는 함수입니다.
 * @param switchSize Switch의 크기
 */
private fun switchTrackWidth(switchSize: SwitchSize): Dp = when (switchSize) {
    SwitchSize.Large -> 48.dp
    SwitchSize.Medium -> 32.dp
    SwitchSize.Small -> 24.dp
}

/**
 * Switch의 Padding을 반환하는 함수입니다.
 * @param switchSize Switch의 크기
 */
fun switchPadding(switchSize: SwitchSize): Dp = when (switchSize) {
    SwitchSize.Large -> 2.5.dp
    SwitchSize.Medium -> 2.dp
    SwitchSize.Small -> 1.5.dp
}

/**
 * Switch의 Thumb의 크기를 반환하는 함수입니다.
 * @param switchSize Switch의 크기
 */
private fun switchThumbSize(switchSize: SwitchSize): Dp = when (switchSize) {
    SwitchSize.Large -> 25.dp
    SwitchSize.Medium -> 16.dp
    SwitchSize.Small -> 13.dp
}