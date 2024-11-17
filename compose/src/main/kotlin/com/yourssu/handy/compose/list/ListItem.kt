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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.ArrowsChevronRight
import com.yourssu.handy.compose.icons.line.User

@Composable
fun ListItem(
    headline: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    headlineColor: Color = HandyTheme.colors.textBasicPrimary,
    enabled: Boolean = true,
    leadingIcon: ImageVector? = null,
    leadingIconColor: Color = HandyTheme.colors.iconBasicPrimary,
    trailingIcon: ImageVector? = null,
    tailingIconColor: Color = HandyTheme.colors.iconBasicTertiary,
    containerColor: Color = HandyTheme.colors.listEnabled,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val pressed by interactionSource.collectIsPressedAsState()

    val backgroundColor = determineBackgroundColor(enabled, pressed, containerColor)

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
        Row {
            leadingIcon?.let {
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = "leadingIcon",
                    tint = if (enabled) leadingIconColor else HandyTheme.colors.iconBasicDisabledStrong,
                    modifier = modifier.padding(start = 16.dp, top = 20.dp, bottom = 20.dp)
                )
            }

            Text(
                text = headline,
                color = if (enabled) headlineColor else HandyTheme.colors.textBasicDisabled,
                modifier = modifier.padding(start = 16.dp, top = 20.dp, bottom = 20.dp)
            )

        }

        trailingIcon?.let {
            Icon(
                imageVector = trailingIcon,
                contentDescription = "trailingIcon",
                tint = if (enabled) tailingIconColor else HandyTheme.colors.iconBasicDisabledStrong,
                modifier = modifier.padding(end = 16.dp, top = 20.dp, bottom = 20.dp)
            )
        }
    }
}

@Composable
fun determineBackgroundColor(
    enabled: Boolean,
    pressed: Boolean,
    containerColor: Color
): Color {
    return when {
        !enabled -> HandyTheme.colors.listDisabled
        pressed -> HandyTheme.colors.listPressed
        else -> containerColor
    }
}

@Composable
@Preview
fun ListItemPreview() {
    HandyTheme {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(20.dp),
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
        }
    }
}