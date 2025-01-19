package com.yourssu.handy.compose

import androidx.compose.animation.core.SpringSpec
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
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
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class SheetValue {
    /**
     * The sheet is not visible.
     */
    Hidden,

    /**
     * The sheet is visible at its current position.
     */
    Expanded,
}

@Composable
fun rememberModalBottomSheetState(
    initialValue: SheetValue = SheetValue.Expanded
) = rememberSheetState(initialValue)

@Composable
internal fun rememberSheetState(
    initialValue: SheetValue = SheetValue.Expanded,
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
    density: Density,
    initialValue: SheetValue = SheetValue.Expanded,
) {
    var currentValue: SheetValue = initialValue
        private set

    val isVisible: Boolean // todo: 이거 필요가 없나?
        get() = currentValue != SheetValue.Hidden

    fun requireOffset(): Float = anchoredDraggableState.requireOffset()

    suspend fun show() {
        animateTo(SheetValue.Expanded)
    }

    suspend fun hide() {
        animateTo(SheetValue.Hidden)
    }

    private suspend fun animateTo(
        targetValue: SheetValue,
        velocity: Float = anchoredDraggableState.lastVelocity
    ) {
        anchoredDraggableState.animateTo(targetValue, velocity)
    }

    internal suspend fun settle(velocity: Float) {
        anchoredDraggableState.settle(velocity)
    }

    internal var anchoredDraggableState = AnchoredDraggableState(
        initialValue = initialValue,
        animationSpec = SpringSpec(),
        positionalThreshold = { with(requireDensity()) { 56.dp.toPx() } },
        velocityThreshold = { with(requireDensity()) { 125.dp.toPx() } }
    )

    internal var density: Density? = null
    private fun requireDensity() = requireNotNull(density) {
        "SheetState did not have a density attached. Are you using SheetState with " +
                "BottomSheetScaffold or ModalBottomSheet component?"
    }

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
     * The visual marker placed on top of a bottom sheet to indicate it may be dragged.
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