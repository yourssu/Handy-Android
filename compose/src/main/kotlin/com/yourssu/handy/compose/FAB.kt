package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.button.ButtonColorState
import com.yourssu.handy.compose.foundation.ColorFabPrimaryShadow
import com.yourssu.handy.compose.foundation.ColorFabSecondaryShadow
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.Add
import com.yourssu.handy.compose.icons.line.ExternalLink

enum class FloatingActionButtonSize(internal val value: Dp) {
    S(40.dp),
    L(56.dp),
}

enum class FloatingActionButtonType {
    Primary,
    Secondary;
}

@Composable
fun FloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = CircleShape,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: ImageVector = HandyIcons.Line.ExternalLink,
    sizeType: FloatingActionButtonSize = FloatingActionButtonSize.S,
    floatingActionButtonType: FloatingActionButtonType = FloatingActionButtonType.Primary,
) {
    val colors = floatingActionButtonColorByType(type = floatingActionButtonType)
    val localPressed by interactionSource.collectIsPressedAsState()
    val containerColor = colors.apply { pressed = localPressed }
    val contentColor by containerColor.contentColor(enabled)

    val (iconSize, containerSize) = boxButtonSizeStateBySize(size = sizeType)
    val elevation = 6.dp
    
    Surface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        shape = shape,
        backgroundColor = containerColor.backgroundColor(enabled).value,
        contentColor = contentColor,
        interactionSource = interactionSource,
        shadowColor = containerColor.shadowColor(enabled).value,
        shadowElevation = elevation,
    ) {
        Box(
            modifier = Modifier
                .defaultMinSize(
                    minWidth = FloatingActionButtonSize.S.value,
                    minHeight = FloatingActionButtonSize.S.value,
                )
                .size(containerSize.value),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                iconSize = iconSize,
            )
        }
    }
}

@Immutable
data class FloatingActionButtonSizeState(
    val iconSize: IconSize = IconSize.M, // icon size 24.dp 고정
    val containerSize: FloatingActionButtonSize = FloatingActionButtonSize.S,
)


private fun boxButtonSizeStateBySize(
    size: FloatingActionButtonSize,
): FloatingActionButtonSizeState = when (size) {
    FloatingActionButtonSize.S -> FloatingActionButtonSizeState(
        iconSize = IconSize.M,
        containerSize = FloatingActionButtonSize.S,
    )

    FloatingActionButtonSize.L -> FloatingActionButtonSizeState(
        iconSize = IconSize.M,
        containerSize = FloatingActionButtonSize.L,
    )
}

@Composable
private fun floatingActionButtonColorByType(
    type: FloatingActionButtonType,
): ButtonColorState = when (type) {
    FloatingActionButtonType.Primary -> ButtonColorState(
        contentColor = HandyTheme.colors.iconBasicWhite,
        bgColor = HandyTheme.colors.buttonFabPrimaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonFabPrimaryDisabled,
        shadowColor = ColorFabPrimaryShadow,
    )

    FloatingActionButtonType.Secondary -> ButtonColorState(
        contentColor = HandyTheme.colors.iconBasicWhite,
        bgColor = HandyTheme.colors.buttonFabSecondaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonFabSecondaryDisabled,
        shadowColor = ColorFabSecondaryShadow,
    )
}

@Composable
@Preview
fun FloatingActionButtonPreview() {
    HandyTheme {
        Column(
            modifier = Modifier.background(Color.White).fillMaxSize()
        ) {
            FloatingActionButton(
                onClick = {},
                icon = HandyIcons.Line.Add,
                sizeType = FloatingActionButtonSize.S,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )

            FloatingActionButton(
                onClick = {},
                icon = HandyIcons.Line.Add,
                sizeType = FloatingActionButtonSize.S,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                enabled = false,
            )
        }
    }
}
