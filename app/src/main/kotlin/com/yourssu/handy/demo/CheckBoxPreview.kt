package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.CheckBox
import com.yourssu.handy.compose.CheckBoxSize

@Preview(showBackground = true)
@Composable
private fun CheckBoxPreview() {
    HandyTheme {
        Column {
            CheckBox(
                checked = true,
                onCheckedChange = {},
                sizeType = CheckBoxSize.Small,
                text = "selected"
            )
            CheckBox(
                checked = false,
                onCheckedChange = {},
                text = "unselected"
            )
            CheckBox(
                checked = false,
                enabled = false,
                onCheckedChange = {},
                sizeType = CheckBoxSize.Large,
                text = "disabled"
            )
        }
    }
}