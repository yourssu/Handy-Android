package com.yourssu.handy.compose

import android.util.Log
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
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

    val trackColor: Color by animateColorAsState(switchTrackColor(switchState))

    val easeIn = CubicBezierEasing(0.25f, 0.1f, 0.25f, 1f)
    val easeOut = CubicBezierEasing(0.25f, 0.1f, 0.25f, 1f)

    val transition = updateTransition(targetState = switchState, label = "SwitchStateTransition")

    val thumbOffset: Dp by transition.animateDp(
        transitionSpec = {
            when {
                SwitchState.Selected isTransitioningTo SwitchState.Unselected ->
                    tween(durationMillis = 150, easing = easeOut)

                else ->
                    tween(durationMillis = 150, easing = easeIn)
            }
        },
        label = "ThumbOffset"
    ) { state ->
        if (state == SwitchState.Selected) {
            switchTrackWidth - switchThumbSize - switchPadding
        } else {
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
        shape = RoundedCornerShape(size = 999.dp),
        backgroundColor = trackColor,
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
            SwitchThumb(
                switchSize = switchSize,
                modifier = Modifier
                    .offset(x = thumbOffset)
            )
        }
    }
}

data class SwitchPreviewParameter(
    val switchState: SwitchState,
    val switchSize: SwitchSize
)

class SwitchPreviewParameterProvider : PreviewParameterProvider<SwitchPreviewParameter> {
    override val values = getAllCombinations()

    private fun getAllCombinations(): Sequence<SwitchPreviewParameter> {
        val samples = mutableListOf<SwitchPreviewParameter>()

        // SwitchState와 SwitchSize의 모든 조합 생성
        val switchStates =
            listOf(SwitchState.Unselected, SwitchState.Selected, SwitchState.Disabled)
        val switchSizes = listOf(SwitchSize.Large, SwitchSize.Medium, SwitchSize.Small)

        switchStates.forEach { state ->
            switchSizes.forEach { size ->
                samples.add(
                    SwitchPreviewParameter(
                        switchState = state,
                        switchSize = size
                    )
                )
            }
        }
        return samples.asSequence()
    }
}

@Preview
@Composable
private fun Preview1() {
    var switchState by remember { mutableStateOf<SwitchState>(SwitchState.Unselected) }

    Column {
        Text(text = "Size:Large State:$switchState")
        Switch(
            switchState = switchState,
            switchSize = SwitchSize.Large,
            onToggle = { switchState = it }
        )
    }
}

@Preview
@Composable
private fun PreviewThumb() {
    Column {
        SwitchThumb(switchSize = SwitchSize.Large, modifier = Modifier)
        SwitchThumb(switchSize = SwitchSize.Medium, modifier = Modifier)
        SwitchThumb(switchSize = SwitchSize.Small, modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview(
    @PreviewParameter(SwitchPreviewParameterProvider::class) parameter: SwitchPreviewParameter,
) {
    Column {
        Text(text = "Size:${parameter.switchSize} State:${parameter.switchState}")
        Switch(
            switchState = parameter.switchState,
            switchSize = parameter.switchSize,
            onToggle = { Log.d("Switch", "onToggle: $it") }
        )
    }
}
