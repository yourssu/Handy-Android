package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.Divider
import com.yourssu.handy.compose.DividerSize
import com.yourssu.handy.compose.Text

@Preview
@Composable
fun DividerExample() {
    Column {
        Text("Section 1")
        Divider(dividerSize = DividerSize.TWO, width = 100.dp)
        Text("Section 2")
        Divider(dividerSize = DividerSize.EIGHT)
    }
}
