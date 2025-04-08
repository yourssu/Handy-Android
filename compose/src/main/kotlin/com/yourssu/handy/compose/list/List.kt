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

@Composable
fun List(
    headline: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    headlineColor: Color = HandyTheme.colors.textBasicPrimary,
    leadingIconColor: Color = HandyTheme.colors.iconBasicPrimary,
    tailingIconColor: Color = HandyTheme.colors.iconBasicTertiary,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val pressed by interactionSource.collectIsPressedAsState()
    val backgroundColor = determineContainerColor(enabled, pressed)

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
        verticalAlignment = Alignment.CenterVertically,
    ) {
        leadingIcon?.let {
            Icon(
                imageVector = leadingIcon,
                contentDescription = "leadingIcon",
                tint = determineContentColor(enabled, leadingIconColor),
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        Text(
            text = headline,
            color = determineContentColor(enabled, headlineColor),
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .weight(1f),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )

        trailingIcon?.let {
            Icon(
                imageVector = trailingIcon,
                contentDescription = "trailingIcon",
                tint = determineContentColor(enabled, tailingIconColor),
                modifier = Modifier
                    .padding(end = 16.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
fun determineContainerColor(
    enabled: Boolean,
    pressed: Boolean,
): Color {
    return when {
        !enabled -> HandyTheme.colors.listDisabled
        pressed -> HandyTheme.colors.listPressed
        else -> HandyTheme.colors.listEnabled
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