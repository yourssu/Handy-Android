package com.yourssu.handy.compose.atom

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.R

sealed class CheckBoxSize(val iconSize: Dp) {
    data object Small : CheckBoxSize(16.dp)
    data object Medium : CheckBoxSize(20.dp)
    data object Large : CheckBoxSize(24.dp)
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

    val iconSize = sizeType.iconSize

    Row(
        modifier = modifier
            .wrapContentWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // TODO : Icon
        BasicText(
            text = text,
            modifier = Modifier.padding(start = 8.dp)
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
                sizeType = CheckBoxSize.Medium,
                text = "selected"
            )
            CheckBox(
                checked = false,
                onCheckedChange = {},
                sizeType = CheckBoxSize.Medium,
                text = "unselected"
            )
            CheckBox(
                checked = false,
                isDisabled = true,
                onCheckedChange = {},
                sizeType = CheckBoxSize.Medium,
                text = "disabled"
            )
        }
    }
}