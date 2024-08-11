package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.CheckBox
import com.yourssu.handy.compose.CheckBoxSize
import com.yourssu.handy.compose.HandyTheme

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
                checked = true,
                onCheckedChange = {},
                text = "selected",
                contentColor = HandyTheme.colors.buttonFabPrimaryPressed
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