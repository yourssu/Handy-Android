package com.yourssu.handy.compose.atom

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.R
import com.yourssu.handy.compose.base.Icon
import com.yourssu.handy.compose.base.IconSize

enum class CheckBoxSize {
    SMALL,
    MEDIUM,
    LARGE
}

@Stable
@Composable
private fun checkBoxSizeStateBySize(
    size: CheckBoxSize
): IconSize = when (size) {
    CheckBoxSize.SMALL -> IconSize.Small
    CheckBoxSize.MEDIUM -> IconSize.Medium
    CheckBoxSize.LARGE -> IconSize.Large
}

@Stable
@Composable
private fun checkBoxColor(
    checked: Boolean,
    isDisabled: Boolean
): Color = when {
    isDisabled -> HandyTheme.colors.checkBoxDisabled
    checked -> HandyTheme.colors.checkBoxSelected
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

    ) {
    val icon = when {
        checked -> R.drawable.ic_checkcircle_selected
        isDisabled -> R.drawable.ic_checkcircle_disabled
        else -> R.drawable.ic_checkcircle_unselected
    }

    val contentColor = checkBoxColor(checked = checked, isDisabled = isDisabled)

    val iconSize = checkBoxSizeStateBySize(size = sizeType)

    Row(
        modifier = modifier
            .wrapContentWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            id = icon,
            modifier = Modifier,
            iconSize = iconSize,
            tint = contentColor
        )
        Spacer(modifier = Modifier.width(8.dp))
        BasicText(
            text = text,
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun CheckBoxPreview() {
    HandyTheme {
        CheckBox(
            checked = false,
            onCheckedChange = {},
            sizeType = CheckBoxSize.MEDIUM,
            text = "hello"
        )
    }
}