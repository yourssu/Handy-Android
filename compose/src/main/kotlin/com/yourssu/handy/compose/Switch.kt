package com.yourssu.handy.compose

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


enum class SwitchSize(
    val trackWidth: Dp,
    val trackHeight: Dp,
    val padding: Dp,
    val thumbSize: Dp,
) {
    Large(48.dp, 30.dp, 2.5.dp, 25.dp),
    Medium(32.dp, 20.dp, 2.dp, 16.dp),
    Small(24.dp, 16.dp, 1.5.dp, 13.dp),
}

enum class SwitchState {
    Unselected,
    Selected,
    Disabled,
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
    onToggle: (SwitchState) -> Unit,
    modifier: Modifier = Modifier,
    switchState: SwitchState = SwitchState.Unselected,
    switchSize: SwitchSize = SwitchSize.Large
) {
    val trackWidth = switchSize.trackWidth
    val trackHeight = switchSize.trackHeight
    val trackPadding = switchSize.padding
    val thumbSize = switchSize.thumbSize

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
            trackWidth - thumbSize - trackPadding
        } else {
            // Switch의 Thumb이 Track의 왼쪽 끝에 위치하도록 하는 Offset입니다.
            trackPadding
        }
    }

    Surface(
        checked = switchState == SwitchState.Selected,
        onCheckedChange = { onToggle(if (switchState == SwitchState.Selected) SwitchState.Unselected else SwitchState.Selected) },
        modifier = modifier
            .padding(trackPadding)
            .width(trackWidth)
            .height(trackHeight),
        enabled = switchState != SwitchState.Disabled,
        shape = CircleShape,
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

// Switch의 애니메이션 Easing입니다.
private val SwitchAnimationEasing = CubicBezierEasing(0.25f, 0.1f, 0.25f, 1f)

/**
 * Switch의 Thumb을 그리는 함수입니다.
 * @param switchSize Switch의 크기
 */
@Composable
private fun SwitchThumb(switchSize: SwitchSize, modifier: Modifier) {
    Box(
        modifier = modifier
            .background(HandyTheme.colors.switchThumb, CircleShape)
            .clip(CircleShape)
            .size(switchSize.thumbSize),
    )
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
