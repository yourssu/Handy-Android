package com.yourssu.handy.compose

import android.util.Log
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

enum class SheetValue {
    /**
     * Sheet가 보이지 않는 상태
     */
    Hidden,

    /**
     * Sheet가 현재 위치에서 보이는 상태
     */
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

@Stable
@OptIn(ExperimentalFoundationApi::class)
class SheetState(
    internal var density: Density,
    initialValue: SheetValue = Hidden,
) {
    val currentValue: SheetValue get() = anchoredDraggableState.currentValue

    val targetValue: SheetValue get() = anchoredDraggableState.targetValue

    val isVisible: Boolean
        get() = currentValue != Hidden

    fun requireOffset() = anchoredDraggableState.requireOffset()

    val hasExpandedState: Boolean
        get() = anchoredDraggableState.anchors.hasAnchorFor(Expanded)

    suspend fun show() {
        animateTo(Expanded)
    }

    suspend fun hide() {
        animateTo(Hidden)
    }

    internal var anchoredDraggableState = AnchoredDraggableState(
        initialValue = initialValue,
        animationSpec = SpringSpec(),
        positionalThreshold = { with(requireDensity()) { 56.dp.toPx() } },
        velocityThreshold = { with(requireDensity()) { 125.dp.toPx() } },
    )

    private suspend fun animateTo(
        targetValue: SheetValue,
        velocity: Float = anchoredDraggableState.lastVelocity
    ) {
        anchoredDraggableState.animateTo(targetValue, velocity)
    }

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

    private val DockedDragHandleWidth = 32.0.dp
    private val DockedDragHandleHeight = 4.0.dp
    private val DragHandleVerticalPadding = 16.dp
}

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
    Log.d("LYB", "newAnchors = ${newAnchors}, newTarget = $newTarget")
    sheetState.anchoredDraggableState.updateAnchors(newAnchors, newTarget)
}

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