package com.yourssu.handy.compose.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.foundation.HandyTextStyle

@Immutable
class ButtonColorState(
    val contentColor: Color = Color.Unspecified,
    val disabledContentColor: Color = Color.Unspecified,
    val bgColor: Color = Color.Transparent,
    val disabledBgColor: Color = Color.Transparent,
    val shadowColor: Color = Color.Transparent,
    pressed: Boolean = false,
) {
    var pressed by mutableStateOf(pressed)
        internal set

    @Composable
    fun contentColor(enabled: Boolean): State<Color> =
        rememberUpdatedState(
            when {
                !enabled -> disabledContentColor
                pressed -> pressedColorFor(contentColor)
                else -> contentColor
            }
        )

    @Composable
    fun backgroundColor(enabled: Boolean): State<Color> =
        rememberUpdatedState(
            when {
                !enabled -> disabledBgColor
                pressed -> pressedColorFor(bgColor)
                else -> bgColor
            }
        )
}

@Composable
private fun pressedColorFor(color: Color): Color {
    return when (color) {
        HandyTheme.colors.buttonFilledPrimaryEnabled -> HandyTheme.colors.buttonFilledPrimaryPressed
        HandyTheme.colors.buttonFilledSecondaryEnabled -> HandyTheme.colors.buttonFilledSecondaryPressed
        HandyTheme.colors.buttonOutlinedEnabled -> HandyTheme.colors.buttonOutlinedPressed
        HandyTheme.colors.buttonTextPrimaryEnabled -> HandyTheme.colors.buttonTextPrimaryPressed
        HandyTheme.colors.buttonTextSecondaryEnabled -> HandyTheme.colors.buttonTextSecondaryPressed
        else -> color
    }
}

@Immutable
data class ButtonStyleProperties(
    val typo: HandyTextStyle = HandyTextStyle.Default,
    val iconSize: IconSize = IconSize.S,
    val height: Dp = 0.dp,
    val horizontalPadding: Dp = 0.dp,
    val betweenSpace: Dp = 0.dp,
    val round: Dp = 0.dp,
)
