package com.yourssu.handy.demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.BottomSheet
import com.yourssu.handy.compose.BottomSheetType
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Text

@Preview(showBackground = true)
@Composable
fun NoBottomSheetPreview() {
    HandyTheme {
        BottomSheet(
            onDismiss = {}
        ) {
            Text("no button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OneBottomSheetPreview() {
    HandyTheme {
        BottomSheet(
            onDismiss = {},
            bottomSheetType = BottomSheetType.OneButton(
                buttonText = "TEXT"
            )
        ) {
            Text("one button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TwoBottomSheetPreview() {
    HandyTheme {
        BottomSheet(
            onDismiss = {},
            bottomSheetType = BottomSheetType.TwoButton(
                firstButtonText = "LEFT",
                secondaryButtonText = "RIGHT"
            )
        ) {
            Text("two button")
        }
    }
}