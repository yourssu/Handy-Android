package com.yourssu.handy.demo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Surface
import com.yourssu.handy.compose.Text

@Preview
@Composable
fun SurfacePreview() {
    HandyTheme {
        Surface(
            modifier = Modifier.size(100.dp),
            selected = true,
            onClick = { /*TODO*/ },
            rounding = 20.dp,
            backgroundColor = HandyTheme.colors.bgBrandPrimary,
            border = BorderStroke(2.dp, HandyTheme.colors.textStatusNegative),
            contentColor = HandyTheme.colors.bgBrandSecondary
        ) {
            Text(text = "SurfaceTest", modifier = Modifier.padding(8.dp))
        }
    }
}
