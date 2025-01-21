package com.yourssu.handy.compose

import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.SheetValue.Expanded
import com.yourssu.handy.compose.SheetValue.Hidden

/**
 * 바텀시트의 상태를 정의하는 Enum 클래스입니다.
 *
 * [Hidden]: 바텀시트가 보이지 않는 상태.
 * [Expanded]: 바텀시트가 보이는 상태.
 */
enum class SheetValue {
    Hidden,
    Expanded,
}

@Composable
fun rememberModalBottomSheetState(
    initialValue: SheetValue = Hidden
) = rememberSheetState(initialValue)

@Composable
internal fun rememberSheetState(
    initialValue: SheetValue = Hidden,
): SheetState {
    val density = LocalDensity.current
    return rememberSaveable(
        saver = SheetState.Saver(density = density)
    ) {
        SheetState(density, initialValue)
    }
}

/**
 * 바텀시트 상태를 관리하는 클래스입니다.
 *
 * @property density 화면 밀도
 * @param initialValue 초기 바텀시트 상태
 */
@Stable
@OptIn(ExperimentalFoundationApi::class)
class SheetState(
    internal var density: Density,
    initialValue: SheetValue = Hidden,
) {
    val currentValue: SheetValue get() = anchoredDraggableState.currentValue

    val targetValue: SheetValue get() = anchoredDraggableState.targetValue

    val isVisible: Boolean
        get() = anchoredDraggableState.currentValue != Hidden

    fun requireOffset(): Float = anchoredDraggableState.requireOffset()

    val hasExpandedState: Boolean
        get() = anchoredDraggableState.anchors.hasAnchorFor(Expanded)

    suspend fun show() {
        animateTo(Expanded)
    }

    suspend fun hide() {
        animateTo(Hidden)
    }

    private suspend fun animateTo(
        targetValue: SheetValue,
        velocity: Float = anchoredDraggableState.lastVelocity
    ) {
        anchoredDraggableState.animateTo(targetValue, velocity)
    }

    internal var anchoredDraggableState = AnchoredDraggableState(
        initialValue = initialValue,
        animationSpec = SpringSpec(),
        positionalThreshold = { with(requireDensity()) { 56.dp.toPx() } },
        velocityThreshold = { with(requireDensity()) { 125.dp.toPx() } },
    )

    private fun requireDensity() = density

    companion object {
        /**
         * The default [Saver] implementation for [SheetState].
         */
        fun Saver(
            density: Density
        ) = Saver<SheetState, SheetValue>(
            save = { it.currentValue },
            restore = { savedValue ->
                SheetState(density, savedValue)
            }
        )

    }
}

internal object BottomSheetDefaults {
    /**
     * Sheet 상단에 놓인 시각적 마커를 나타내며 드래그할 수 있습니다.
     */
    @Composable
    fun DragHandle(
        modifier: Modifier = Modifier,
        width: Dp = DockedDragHandleWidth,
        height: Dp = DockedDragHandleHeight,
        shape: Shape = RoundedCornerShape(28.0.dp),
        color: Color = Color(0xFFB5B9C4)
    ) {
        Surface(
            modifier = modifier
                .padding(vertical = DragHandleVerticalPadding),
            backgroundColor = color,
            shape = shape
        ) {
            Box(
                Modifier
                    .size(
                        width = width,
                        height = height
                    )
            )
        }
    }

    val bottomSheetContentPadding = 16.dp
    private val DockedDragHandleWidth = 32.0.dp
    private val DockedDragHandleHeight = 4.0.dp
    private val DragHandleVerticalPadding = 16.dp
}

/**
 * 바텀시트의 드래그 앵커를 설정하는 Modifier 확장 함수입니다.
 *
 * @param sheetState 현재 바텀시트 상태를 관리하는 객체
 * @param fullHeight 화면의 전체 높이
 */
@OptIn(ExperimentalFoundationApi::class)
internal fun Modifier.modalBottomSheetAnchors(
    sheetState: SheetState,
    fullHeight: Float
) = onSizeChanged { sheetSize ->

    val newAnchors = DraggableAnchors {
        Hidden at fullHeight - sheetSize.height
        Expanded at 0f
    }

    val newTarget = when (sheetState.anchoredDraggableState.targetValue) {
        Hidden -> Hidden
        Expanded -> Expanded
    }

    sheetState.anchoredDraggableState.updateAnchors(newAnchors, newTarget)
}

/**
 * 바텀시트가 보일 때 스크림 효과를 추가하는 함수입니다.
 *
 * @param color 스크림의 색상
 * @param onDismissRequest 스크림을 눌렀을 때 호출되는 콜백 함수
 * @param visible 스크림이 보이는지 여부를 결정
 */
@Composable
internal fun Scrim(
    color: Color,
    onDismissRequest: () -> Unit,
    visible: Boolean
) {
    if (color.isSpecified) {
        val alpha by animateFloatAsState(
            targetValue = if (visible) 1f else 0f,
            animationSpec = TweenSpec(), label = ""
        )
        val dismissSheet = if (visible) {
            Modifier
                .pointerInput(onDismissRequest) {
                    detectTapGestures {
                        onDismissRequest()
                    }
                }
                .clearAndSetSemantics {}
        } else {
            Modifier
        }
        Canvas(
            Modifier
                .fillMaxSize()
                .then(dismissSheet)
        ) {
            drawRect(color = color, alpha = alpha)
        }
    }
}