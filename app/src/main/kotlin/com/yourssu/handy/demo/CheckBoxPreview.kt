package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.checkbox.CheckBox
import com.yourssu.handy.compose.checkbox.CheckBoxSize
import com.yourssu.handy.compose.theme.HandyTheme

@Preview(showBackground = true)
@Composable
private fun CheckBoxPreview() {
    HandyTheme {
        Column {
            Row {
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
                        sizeType = CheckBoxSize.Medium,
                        text = "selected"
                    )
                    CheckBox(
                        checked = true,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Large,
                        text = "selected"
                    )
                }
                Column {
                    CheckBox(
                        checked = false,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Small,
                        text = "selected"
                    )
                    CheckBox(
                        checked = false,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Medium,
                        text = "selected"
                    )
                    CheckBox(
                        checked = false,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Large,
                        text = "selected"
                    )
                }
            }
            Row {
                Column {
                    CheckBox(
                        checked = true,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Small,
                        text = "selected",
                        contentColor = Color.Red
                    )
                    CheckBox(
                        checked = true,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Medium,
                        text = "selected",
                        contentColor = Color.Red
                    )
                    CheckBox(
                        checked = true,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Large,
                        text = "selected",
                        contentColor = Color.Red
                    )
                }
                Column {
                    CheckBox(
                        checked = false,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Small,
                        text = "selected",
                        contentColor = Color.Red
                    )
                    CheckBox(
                        checked = false,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Medium,
                        text = "selected",
                        contentColor = Color.Red
                    )
                    CheckBox(
                        checked = false,
                        onCheckedChange = {},
                        sizeType = CheckBoxSize.Large,
                        text = "selected",
                        contentColor = Color.Red
                    )
                }
            }
        }
    }
}