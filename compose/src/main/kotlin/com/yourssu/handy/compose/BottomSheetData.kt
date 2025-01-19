package com.yourssu.handy.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal object BottomSheetDefaults {
    /**
     * The default peek height used by [BottomSheetScaffold].
     */
    val SheetPeekHeight = 56.dp

    /**
     * The default max width used by [ModalBottomSheet] and [BottomSheetScaffold]
     */
    val SheetMaxWidth = 640.dp

    /**
     * The optional visual marker placed on top of a bottom sheet to indicate it may be dragged.
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
            modifier = modifier,
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
}

private val DockedDragHandleWidth = 32.0.dp
private val DockedDragHandleHeight = 4.0.dp
