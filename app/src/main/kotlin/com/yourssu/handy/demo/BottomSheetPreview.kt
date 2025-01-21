package com.yourssu.handy.demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.BottomSheet
import com.yourssu.handy.compose.BottomSheetType
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.SheetValue
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.rememberModalBottomSheetState

@Preview(showBackground = true)
@Composable
private fun OneShortBottomSheetPreview() {
    HandyTheme {
        val sheetState = rememberModalBottomSheetState(
            initialValue = SheetValue.Expanded
        )
        BottomSheet(
            onDismissRequest = {},
            sheetState = sheetState,
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
private fun OneLongBottomSheetPreview() {
    HandyTheme {
        val sheetState = rememberModalBottomSheetState(
            initialValue = SheetValue.Expanded
        )
        BottomSheet(
            onDismissRequest = {},
            sheetState = sheetState,
            bottomSheetType = BottomSheetType.OneButton(
                buttonText = "TEXT"
            )
        ) {
            Text("one button\none button\none button\none button\none button\none button\none button\none button")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TwoShortBottomSheetPreview() {
    HandyTheme {
        val sheetState = rememberModalBottomSheetState(
            initialValue = SheetValue.Expanded
        )
        BottomSheet(
            onDismissRequest = {},
            sheetState = sheetState,
            bottomSheetType = BottomSheetType.TwoButton(
                firstButtonText = "LEFT",
                secondButtonText = "RIGHT"
            )
        ) {
            Text("two button")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TwoLongBottomSheetPreview() {
    HandyTheme {
        val sheetState = rememberModalBottomSheetState(
            initialValue = SheetValue.Expanded
        )
        BottomSheet(
            onDismissRequest = {},
            sheetState = sheetState,
            bottomSheetType = BottomSheetType.TwoButton(
                firstButtonText = "LEFT",
                secondButtonText = "RIGHT"
            )
        ) {
            Text("two button\ntwo button\ntwo button\ntwo button\ntwo button\ntwo button\ntwo button\ntwo button")
        }
    }
}