package com.yourssu.handy.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Surface

@Composable
internal fun BaseButton(
    onClick: () -> Unit,
    colors: ButtonColorState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    showBorder: Boolean = false,
    rounding: Dp = 8.dp,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    minWidth: Dp = ButtonDefaults.MinWidth,
    minHeight: Dp = ButtonDefaults.MinHeight,
    content: @Composable RowScope.() -> Unit,
) {
    val localPressed by interactionSource.collectIsPressedAsState()
    val buttonColors = colors.apply { pressed = localPressed }
    val contentColor by buttonColors.contentColor(enabled)

    Surface(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        rounding = rounding,
        border = if (showBorder) BorderStroke(1.dp, HandyTheme.colors.lineBasicMedium) else null,
        backgroundColor = buttonColors.backgroundColor(enabled).value,
        contentColor = contentColor,
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = Modifier
                .defaultMinSize(
                    minWidth = minWidth,
                    minHeight = minHeight,
                )
                .padding(contentPadding),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            content = content,
        )
    }
}

object ButtonDefaults {
    private val ButtonHorizontalPadding = 20.dp
    private val ButtonVerticalPadding = 16.dp

    val ContentPadding = PaddingValues(
        horizontal = ButtonHorizontalPadding,
        vertical = ButtonVerticalPadding,
    )

    val MinWidth = 64.dp
    val MinHeight = 36.dp
}
