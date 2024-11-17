package com.yourssu.handy.compose.component.fab

import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.theme.HandyTheme
import com.yourssu.handy.compose.icons.Icon
import com.yourssu.handy.compose.icons.IconSize
import com.yourssu.handy.compose.foundation.Surface
import com.yourssu.handy.compose.foundation.ColorFabPrimaryShadow
import com.yourssu.handy.compose.foundation.ColorFabSecondaryShadow
import com.yourssu.handy.compose.icons.HandyIcons
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
    val borderColor = containerColor.borderColor()

    val containerSize = boxButtonSizeStateBySize(size = sizeType)

    Surface(
        onClick = onClick,
        modifier = modifier.semantics { role = Role.Button },
        shape = shape,
        backgroundColor = containerColor.backgroundColor(enabled).value,
        contentColor = contentColor,
        interactionSource = interactionSource,
        shadowColor = containerColor.shadowColor(enabled).value,
        shadowElevation = FloatingActionButtonDefaults.FloatingActionButtonShadowElevation,
    ) {
        Box(
            modifier = Modifier
                .size(containerSize.containerSize.value)
                .border(
                    width = FloatingActionButtonDefaults.FloatingActionButtonBorderSize,
                    color = borderColor.value,
                    shape = shape
                ),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                iconSize = FloatingActionButtonDefaults.iconSize,
            )
        }
    }
}


@Immutable
data class FloatingActionButtonSizeState(
    val containerSize: FloatingActionButtonSize = FloatingActionButtonSize.S,
)


private fun boxButtonSizeStateBySize(
    size: FloatingActionButtonSize,
): FloatingActionButtonSizeState = when (size) {
    FloatingActionButtonSize.S -> FloatingActionButtonSizeState(
        containerSize = FloatingActionButtonSize.S,
    )

    FloatingActionButtonSize.L -> FloatingActionButtonSizeState(
        containerSize = FloatingActionButtonSize.L,
    )
}

@Composable
private fun floatingActionButtonColorByType(
    type: FloatingActionButtonType,
): FloatingActionButtonColorState = when (type) {
    FloatingActionButtonType.Primary -> FloatingActionButtonColorState(
        contentColor = HandyTheme.colors.iconBasicWhite,
        disabledContentColor = HandyTheme.colors.iconBasicWhite,
        bgColor = HandyTheme.colors.buttonFabPrimaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonFabPrimaryDisabled,
        shadowColor = ColorFabPrimaryShadow,
        borderColor = Color.Transparent
    )

    FloatingActionButtonType.Secondary -> FloatingActionButtonColorState(
        contentColor = HandyTheme.colors.iconBasicTertiary,
        disabledContentColor = HandyTheme.colors.iconBasicDisabled,
        bgColor = HandyTheme.colors.buttonFabSecondaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonFabSecondaryDisabled,
        shadowColor = ColorFabSecondaryShadow,
        borderColor = HandyTheme.colors.lineBasicLight
    )
}

@Composable
private fun pressedFloatingActionButtonColorFor(color: Color): Color {
    return when (color) {
        HandyTheme.colors.buttonFabPrimaryEnabled -> HandyTheme.colors.buttonFabPrimaryPressed
        HandyTheme.colors.buttonFabSecondaryEnabled -> HandyTheme.colors.buttonFabSecondaryPressed
        else -> color
    }
}

@Immutable
class FloatingActionButtonColorState(
    val contentColor: Color = Color.Unspecified,
    val disabledContentColor: Color = Color.Unspecified,
    val bgColor: Color = Color.Transparent,
    val disabledBgColor: Color = Color.Transparent,
    val shadowColor: Color = Color.Transparent,
    val borderColor: Color = Color.Transparent,
    pressed: Boolean = false,
) {
    var pressed by mutableStateOf(pressed)
        internal set

    @Composable
    fun contentColor(enabled: Boolean): State<Color> =
        rememberUpdatedState(
            when {
                !enabled -> disabledContentColor
                pressed -> pressedFloatingActionButtonColorFor(contentColor)
                else -> contentColor
            }
        )

    @Composable
    fun backgroundColor(enabled: Boolean): State<Color> =
        rememberUpdatedState(
            when {
                !enabled -> disabledBgColor
                pressed -> pressedFloatingActionButtonColorFor(bgColor)
                else -> bgColor
            }
        )

    @Composable
    fun shadowColor(enabled: Boolean): State<Color> =
        rememberUpdatedState(
            when {
                !enabled -> Color.Transparent
                else -> shadowColor
            }
        )

    @Composable
    fun borderColor(): State<Color> =
        rememberUpdatedState(borderColor)
}

object FloatingActionButtonDefaults {
    val iconSize: IconSize = IconSize.M // 24.dp
    val FloatingActionButtonBorderSize = 1.dp
    val FloatingActionButtonShadowElevation = 6.dp
}