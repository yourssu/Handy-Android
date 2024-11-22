package com.yourssu.handy.compose

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.AlertTriangle
import com.yourssu.handy.compose.icons.line.Close
import kotlin.math.roundToInt

/**
 * 드래그 위치를 나타냅니다.
 * Start는 초기 위치, End는 스낵바가 사라질 위치를 나타냅니다.
 */
enum class DragValue {
    Start, End
}

/**
 * 정보성 스낵바의 UI를 그린 함수입니다.
 *
 * 유저의 행동에 대한 단순 결과를 나타낼 때 사용합니다.
 *
 * 특정 시간(기본 5초) 노출 후에 자동으로 사라집니다.
 * 아래로 스와이프 할 경우에도 사라집니다.
 *
 * @param text 스낵바의 문구를 나타내는 텍스트, 최대 두 줄까지 입력 가능
 * @param modifier Modifier
 */
@OptIn(ExperimentalFoundationApi::class, ExperimentalLayoutApi::class)
@Composable
fun InfoSnackBar(
    text: String,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val density = LocalDensity.current
    val state = remember {
        AnchoredDraggableState(
            initialValue = DragValue.Start,
            anchors = DraggableAnchors {
                with(density) {
                    DragValue.Start at 0f
                    DragValue.End at 20.dp.toPx()
                }
            },
            positionalThreshold = { distance: Float -> distance * 0.5f },
            velocityThreshold = { with(density) { 50.dp.toPx() } },
            animationSpec = tween(),
        )
    }
    val offsetY = remember { Animatable(0f) }

    if (state.currentValue == DragValue.End) {
        onDismiss()
    }

    Column(
        modifier = modifier
            .offset {
                IntOffset(
                    x = 0,
                    y = offsetY.value.roundToInt()
                )
            }
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(HandyTheme.colors.snackBarInfo)
            .padding(16.dp)
            .anchoredDraggable(
                state = state,
                orientation = Orientation.Vertical,
            )
    ) {
        Column {
            text.split("\n").forEach { line ->
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    line.split(" ").forEachIndexed { index, word ->
                        Text(
                            text = word,
                            color = HandyTheme.colors.textBasicWhite,
                            maxLines = 2,
                            style = HandyTypography.B3Sb14
                        )
                        if (index != line.split(" ").lastIndex) {
                            Text(
                                text = " ",
                                color = HandyTheme.colors.textBasicWhite,
                                style = HandyTypography.B3Sb14
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * 에러 스낵바의 UI를 그린 함수입니다.
 *
 * 사용자의 수행 과정에 부정적인 결과가 발생하거나
 * 정보성 스낵바보다 강조해야 할 메시지를 담아야 할 때 사용합니다.
 *
 * X 버튼을 눌러야만 사라집니다.
 *
 * @param text 스낵바의 문구를 나타내는 텍스트, 최대 두 줄까지 입력 가능
 * @param onClick 스낵바의 X 버튼을 눌렀을 때 호출되는 함수
 * @param modifier Modifier
 */
@Composable
fun ErrorSnackBar(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(HandyTheme.colors.snackBarError)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = HandyIcons.Filled.AlertTriangle,
            tint = HandyTheme.colors.bgStatusNegative,
            modifier = Modifier.align(Alignment.Top)
        )
        Text(
            modifier = Modifier.weight(1f),
            text = text,
            color = HandyTheme.colors.textStatusNegative,
            maxLines = 2,
            style = HandyTypography.B3Sb14.copy(
                lineBreak = LineBreak(
                    strategy = LineBreak.Strategy.Simple,
                    strictness = LineBreak.Strictness.Strict,
                    wordBreak = LineBreak.WordBreak.Phrase
                )
            )
        )
        Icon(
            imageVector = HandyIcons.Line.Close,
            tint = HandyTheme.colors.textBasicTertiary,
            modifier = Modifier
                .clickable(onClick = onClick)
                .align(Alignment.Top)
        )
    }
}

object SnackBarDefaults {
    const val SNACK_BAR_DURATION = 5000L
    const val FADE_IN_DURATION = 500
    const val FADE_OUT_DURATION = 300
    const val TARGET_VALUE = -16f
}