package com.yourssu.handy.compose.atom

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.CheckCircleSelected
import com.yourssu.handy.compose.states.ButtonSizeState

enum class CheckBoxSize {
    SMALL, MEDIUM, LARGE
}

@Stable
@Composable
private fun checkBoxSizeStateBySize(
    size: CheckBoxSize
): ButtonSizeState = when (size) {
    CheckBoxSize.SMALL -> ButtonSizeState(
        typo = HandyTypography.B5Rg12,
        iconSize = IconSize.XS,
        betweenSpace = 8.dp
    )

    CheckBoxSize.MEDIUM -> ButtonSizeState(
        typo = HandyTypography.B3Rg14,
        iconSize = IconSize.S,
        betweenSpace = 8.dp
    )

    CheckBoxSize.LARGE -> ButtonSizeState(
        typo = HandyTypography.B1Rg16,
        iconSize = IconSize.M,
        betweenSpace = 8.dp
    )
}

@Stable
@Composable
private fun checkBoxColor(
    contentColor: Color,
    checked: Boolean,
    isDisabled: Boolean
): Color = when {
    checked -> contentColor
    isDisabled -> HandyTheme.colors.checkBoxDisabled
    else -> HandyTheme.colors.checkBoxUnselected
}

@Composable
fun CheckBox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    sizeType: CheckBoxSize,
    modifier: Modifier = Modifier,
    text: String = "",
    isDisabled: Boolean = false,
    contentColor: Color = HandyTheme.colors.checkBoxSelected
) {
    val icon = when {
        checked -> HandyIcons.Filled.CheckCircleSelected
        isDisabled -> HandyIcons.Filled.CheckCircleSelected
        else -> HandyIcons.Filled.CheckCircleSelected
    }

    val iconColor = checkBoxColor(
        contentColor = contentColor,
        checked = checked,
        isDisabled = isDisabled
    )

    val sizeState = checkBoxSizeStateBySize(size = sizeType)
    val iconSize = sizeState.iconSize
    val typo = sizeState.typo
    val betweenSpace = sizeState.betweenSpace

    Row(
        modifier = modifier
            .wrapContentWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            iconSize = iconSize,
            tint = iconColor
        )
        Spacer(modifier = Modifier.width(betweenSpace))
        Text(
            text = text,
            style = typo
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CheckBoxPreview() {
    HandyTheme {
        Column {
            CheckBox(
                checked = true,
                onCheckedChange = {},
                sizeType = CheckBoxSize.MEDIUM,
                text = "selected"
            )
            CheckBox(
                checked = false,
                onCheckedChange = {},
                sizeType = CheckBoxSize.MEDIUM,
                text = "unselected"
            )
            CheckBox(
                checked = false,
                isDisabled = true,
                onCheckedChange = {},
                sizeType = CheckBoxSize.MEDIUM,
                text = "disabled"
            )
        }
    }
}