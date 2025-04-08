package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.ArrowsChevronRight
import com.yourssu.handy.compose.icons.line.User

@Composable
@Preview
fun ListPreview() {
    HandyTheme {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            com.yourssu.handy.compose.list.List(
                headline = "Enable List Title",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
            )

            com.yourssu.handy.compose.list.List(
                headline = "Disable List Title",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
                enabled = false
            )

            com.yourssu.handy.compose.list.List(
                headline = "Loooooooooong Titleeeeeeeeeeeeeeeeeeeeeeeeeee",
                onClick = {},
                leadingIcon = HandyIcons.Line.User,
                trailingIcon = HandyIcons.Line.ArrowsChevronRight,
            )

            com.yourssu.handy.compose.list.List(
                headline = "Default Title",
                onClick = {},
            )
        }
    }
}