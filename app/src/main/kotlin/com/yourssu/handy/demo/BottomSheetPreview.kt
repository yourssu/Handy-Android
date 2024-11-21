package com.yourssu.handy.demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.BottomSheet
import com.yourssu.handy.compose.HandyTheme

@Preview(showBackground = true)
@Composable
fun BottomSheetPreview() {
    HandyTheme{
        BottomSheet()
    }
}