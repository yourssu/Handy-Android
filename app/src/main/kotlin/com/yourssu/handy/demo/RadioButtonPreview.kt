package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.radiobutton.RadioButton
import com.yourssu.handy.compose.radiobutton.RadioButtonSize

@Preview(showBackground = true)
@Composable
fun RadioButtonPreview() {
    Column {
        Row {
            Column {
                RadioButton(
                    checked = true,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Small,
                    text = "selected"
                )
                RadioButton(
                    checked = true,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Medium,
                    text = "selected"
                )
                RadioButton(
                    checked = true,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Large,
                    text = "selected"
                )
            }
            Column {
                RadioButton(
                    checked = false,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Small,
                    text = "unselected"
                )
                RadioButton(
                    checked = false,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Medium,
                    text = "unselected"
                )
                RadioButton(
                    checked = false,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Large,
                    text = "unselected"
                )
            }
        }
        Row {
            Column {
                RadioButton(
                    checked = true,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Small,
                    text = "selected",
                    contentColor = Color.Red
                )
                RadioButton(
                    checked = true,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Medium,
                    text = "selected",
                    contentColor = Color.Red
                )
                RadioButton(
                    checked = true,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Large,
                    text = "selected",
                    contentColor = Color.Red
                )
            }
            Column {
                RadioButton(
                    checked = false,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Small,
                    text = "disabled",
                    enabled = false,
                    contentColor = Color.Red
                )
                RadioButton(
                    checked = false,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Medium,
                    text = "disabled",
                    enabled = false,
                    contentColor = Color.Red
                )
                RadioButton(
                    checked = false,
                    onCheckedChange = {},
                    sizeType = RadioButtonSize.Large,
                    text = "disabled",
                    enabled = false,
                    contentColor = Color.Red
                )
            }
        }
    }
}