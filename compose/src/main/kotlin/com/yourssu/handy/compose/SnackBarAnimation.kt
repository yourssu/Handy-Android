package com.yourssu.handy.compose

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.RecomposeScope
import androidx.compose.runtime.State
import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.SnackBarDefaults.FADE_IN_DURATION
import com.yourssu.handy.compose.SnackBarDefaults.FADE_OUT_DURATION
import com.yourssu.handy.compose.SnackBarDefaults.TARGET_VALUE

data class SnackBarTransitionItem(
    val snackBarData: SnackBarData?,
    val opacityTransition: OpacityTransition
)

typealias OpacityTransition = @Composable (snackBar: @Composable () -> Unit) -> Unit

/**
 * 스낵바에 애니메이션을 적용합니다.
 *
 * @param newSnackBarData 새로운 스낵바 데이터
 * @param modifier Modifier
 * @param snackBar 스낵바 UI의 컴포저블 함수
 */
@Composable
fun FadeInFadeOut(
    newSnackBarData: SnackBarData?,
    modifier: Modifier = Modifier,
    snackBar: @Composable (SnackBarData) -> Unit
) {
    var scheduledSnackBarData by remember { mutableStateOf<SnackBarData?>(null) }
    val snackBarTransitions = remember { mutableListOf<SnackBarTransitionItem>() }
    var scope by remember { mutableStateOf<RecomposeScope?>(null) }

    if (newSnackBarData != scheduledSnackBarData) {
        scheduledSnackBarData = newSnackBarData

        val snackBarDataList = snackBarTransitions.map { it.snackBarData }.toMutableList()

        snackBarDataList.add(newSnackBarData)

        snackBarTransitions.clear()

        snackBarDataList.filterNotNull()
            .mapTo(destination = snackBarTransitions) { appearedSnackBarData ->
                SnackBarTransitionItem(appearedSnackBarData) { snackBar ->
                    val isVisible = appearedSnackBarData == newSnackBarData
                    val animateInSpec: AnimationSpec<Float> =
                        tween(durationMillis = FADE_IN_DURATION)
                    val animateOutSpec: AnimationSpec<Float> =
                        tween(durationMillis = FADE_OUT_DURATION, easing = EaseOut)

                    val opacity = animatedOpacity(
                        visible = isVisible,
                        animateInSpec = animateInSpec,
                        animateOutSpec = animateOutSpec
                    )

                    val offsetY = animatedOffset(
                        visible = isVisible,
                        animateInSpec = animateInSpec,
                        animateOutSpec = animateOutSpec
                    )

                    Box(
                        modifier = Modifier
                            .offset(y = offsetY.value.dp)
                            .alpha(opacity.value)
                    ) {
                        snackBar()
                    }
                }
            }
    }

    Box(
        modifier = modifier
    ) {
        scope = currentRecomposeScope
        snackBarTransitions.forEach { (snackBarData, opacity) ->
            key(snackBarData) {
                opacity {
                    snackBar(snackBarData ?: return@opacity)
                }
            }
        }
    }
}

/**
 * 투명도 애니메이션을 위한 함수입니다.
 *
 * @param visible 애니메이션의 시작 여부
 * @param animateInSpec 애니메이션이 시작될 때 적용되는 스펙
 * @param animateOutSpec 애니메이션이 종료될 때 적용되는 스펙
 * @return 현재 투명도 상태
 */
@Composable
private fun animatedOpacity(
    visible: Boolean,
    animateInSpec: AnimationSpec<Float>,
    animateOutSpec: AnimationSpec<Float>,
): State<Float> {
    val alpha = remember { Animatable(0f) }

    LaunchedEffect(visible) {
        alpha.animateTo(
            if (visible) 1f else 0f,
            animationSpec = if (visible) animateInSpec else animateOutSpec
        )
    }
    return alpha.asState()
}

/**
 * Y축 오프셋 애니메이션을 위한 함수입니다.
 *
 * @param visible 애니메이션 시작 여부
 * @param animateInSpec 애니메이션이 시작될 때 적용되는 스펙
 * @param animateOutSpec 애니메이션이 종료될 때 적용되는 스펙
 * @return 현재 오프셋 상태
 */
@Composable
private fun animatedOffset(
    visible: Boolean,
    animateInSpec: AnimationSpec<Float>,
    animateOutSpec: AnimationSpec<Float>,
): State<Float> {
    val offsetY = remember { Animatable(0f) }

    LaunchedEffect(visible) {
        if (visible) {
            offsetY.animateTo(
                targetValue = TARGET_VALUE,
                animationSpec = animateInSpec
            )
        } else {
            offsetY.animateTo(
                targetValue = 0f,
                animationSpec = animateOutSpec
            )
        }
    }

    return offsetY.asState()
}
