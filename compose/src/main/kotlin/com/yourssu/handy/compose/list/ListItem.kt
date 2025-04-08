package com.yourssu.handy.compose.list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.ArrowsChevronRight
import com.yourssu.handy.compose.icons.line.User
import org.w3c.dom.Text

@Composable
fun ListItem(
    headline: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    containerColor: Color = HandyTheme.colors.listEnabled,
    pressedContainerColor: Color = HandyTheme.colors.listPressed,
    headlineColor: Color = HandyTheme.colors.textBasicPrimary,
    leadingIconColor: Color = HandyTheme.colors.iconBasicPrimary,
    tailingIconColor: Color = HandyTheme.colors.iconBasicTertiary,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val pressed by interactionSource.collectIsPressedAsState()

    val backgroundColor = determineContainerColor(enabled, pressed, containerColor, pressedContainerColor)

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(64.dp)
            .clickable(
                onClick = onClick,
                enabled = enabled,
                interactionSource = interactionSource,
                indication = null
            )
            .background(backgroundColor),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = modifier.padding(horizontal = 16.dp, vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            leadingIcon?.let {
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = "leadingIcon",
                    tint = determineContentColor(enabled, leadingIconColor),
                )
            }

            Text(
                text = headline,
                color = determineContentColor(enabled, headlineColor),
                modifier = modifier.padding(horizontal = 16.dp),
                overflow = TextOverflow.Ellipsis,
            )
        }

        trailingIcon?.let {
            Icon(
                imageVector = trailingIcon,
                contentDescription = "trailingIcon",
                tint = determineContentColor(enabled, tailingIconColor),
                modifier = modifier.padding(end = 16.dp, bottom = 20.dp, top = 20.dp)
            )
        }
    }
}

@Composable
fun determineContainerColor(
    enabled: Boolean,
    pressed: Boolean,
    containerColor: Color,
    pressedContainerColor: Color
): Color {
    return when {
        !enabled -> HandyTheme.colors.listDisabled
        pressed -> pressedContainerColor
        else -> containerColor
    }
}

@Composable
fun determineContentColor(
    enabled: Boolean,
    contentColor: Color
): Color {
    return when {
        !enabled -> HandyTheme.colors.textBasicDisabled
        else -> contentColor
    }
}

@Composable
@Preview
fun ListItemPreview() {
    HandyTheme {
        Column(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            ListItem(
                headline = "Title",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
            )

            ListItem(
                headline = "Title",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
                enabled = false
            )

            ListItem(
                headline = "Titleeeeeeeeeeeeeeeeeeeeeeee",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
                containerColor = HandyTheme.colors.textBrandPrimary,
                tailingIconColor = HandyTheme.colors.textStatusNegative,
                headlineColor = HandyTheme.colors.textBasicWhite,
                leadingIconColor = HandyTheme.colors.iconBasicTertiary
            )

            ListItem(
                headline = "Titleeeeeeeeeeeeeeeeeeeeeeee",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
                containerColor = HandyTheme.colors.textBrandPrimary,
                tailingIconColor = HandyTheme.colors.textStatusNegative,
                headlineColor = HandyTheme.colors.textBasicWhite,
                leadingIconColor = HandyTheme.colors.iconBasicTertiary,
                pressedContainerColor = HandyTheme.colors.iconBasicTertiary
            )

            ListItem(
                headline = "Titleeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
                containerColor = HandyTheme.colors.textBrandPrimary,
                tailingIconColor = HandyTheme.colors.textStatusNegative,
                headlineColor = HandyTheme.colors.textBasicWhite,
                leadingIconColor = HandyTheme.colors.iconBasicTertiary,
                pressedContainerColor = HandyTheme.colors.iconBasicTertiary
            )
        }
    }
}