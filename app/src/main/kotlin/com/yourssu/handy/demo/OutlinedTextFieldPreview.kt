package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Cancel
import com.yourssu.handy.compose.textfield.OutlinedTextField

@Preview
@Composable
fun OutlinedTextFieldPreview() {
    HandyTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            val (text, onValueChange) = remember { mutableStateOf("") }
            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                onValueChange = onValueChange,
            )

            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                isError = true,
                onValueChange = onValueChange,
            )

            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                enabled = false,
                onValueChange = onValueChange,
            )

            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                enabled = false,
                onValueChange = onValueChange,
            )
        }
    }
}