package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.*
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.*

enum class ChipSize(
    internal val chipHeight: Dp
) {
    Large(32.dp),
    Small(24.dp)
}

enum class ChipState {
    Unselected,
    Selected,
    Disabled
}

@Composable
fun Chip(
    modifier: Modifier = Modifier,
    text: String = "",
    chipState: ChipState = ChipState.Unselected,
    chipSize: ChipSize = ChipSize.Large,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    chipOnClick: (() -> Unit) = {},
    leadingIconOnClick: (() -> Unit) = {},
    trailingIconOnClick: (() -> Unit) = {}
) {

    val backgroundColor = when (chipState) {
        ChipState.Unselected -> ColorGray100
        ChipState.Selected -> ColorViolet100
        ChipState.Disabled -> ColorGray50
    }
    val textColor = when (chipState) {
        ChipState.Unselected -> ColorGray700
        ChipState.Selected -> ColorViolet500
        ChipState.Disabled -> ColorGray300
    }

    val textStyle: HandyTextStyle =
        if (chipState == ChipState.Selected) HandyTypography.B3Sb14 else HandyTypography.B3Rg14

    Box(
        modifier = modifier
            .wrapContentWidth(unbounded = true)
            .height(chipSize.chipHeight)
            .background(backgroundColor, shape = RoundedCornerShape(16.dp))
            .clickable(
                enabled = chipState != ChipState.Disabled,
                onClick = { chipOnClick() })
            .padding(horizontal = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            leadingIcon?.let {
                Icon(
                    leadingIcon,
                    tint = textColor,
                    iconSize = IconSize.XS,
                    modifier = Modifier.clickable(
                        enabled = chipState != ChipState.Disabled,
                        onClick = { leadingIconOnClick() },
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    )
                )
            }

            Text(
                text = if (text.length < 10) text else text.take(9) + "...",
                color = textColor,
                fontSize = 14.dp,
                style = textStyle
            )

            trailingIcon?.let {
                Icon(
                    trailingIcon,
                    tint = textColor,
                    iconSize = IconSize.XS,
                    modifier = Modifier.clickable(
                        enabled = chipState != ChipState.Disabled,
                        onClick = { trailingIconOnClick() },
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    )
                )
            }
        }
    }
}
