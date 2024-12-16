package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.OneButtonDialog
import com.yourssu.handy.compose.TwoButtonDialog
import com.yourssu.handy.compose.button.BoxButton
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Add

@Preview
@Composable
private fun OneButtonDialogPreview1() {
    HandyTheme {
        OneButtonDialog(
            title = "제목이 들어갑니다",
            description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
            positiveText = "버튼",
            onPositiveClick = {},
            onDismiss = { }
        )
    }
}

@Preview
@Composable
private fun OneButtonDialogPreview2() {
    HandyTheme {
        OneButtonDialog(
            title = "보다 더 정확하게 분석하기 위해 다음 질문에 대해 대답해주세요.",
            description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
            positiveText = "버튼",
            onPositiveClick = {},
            onDismiss = { }
        )
    }
}

@Preview
@Composable
private fun OneButtonDialogPreview3() {
    HandyTheme {
        OneButtonDialog(
            title = "제목이 들어갑니다",
            description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
            positiveText = "버튼",
            onPositiveClick = {},
            onDismiss = { },
            content = { Icon(HandyIcons.Filled.Add) }
        )
    }
}

@Preview
@Composable
private fun TwoButtonDialogPreview1() {
    HandyTheme {
        TwoButtonDialog(
            title = "제목이 들어갑니다",
            description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
            positiveText = "버튼2",
            onPositiveClick = {},
            onDismiss = { },
            negativeText = "버튼1",
            onNegativeClick = {},
        )
    }
}

@Preview
@Composable
private fun TwoButtonDialogPreview2() {
    HandyTheme {
        TwoButtonDialog(
            title = "보다 더 정확하게 분석하기 위해 다음 질문에 대해 대답해주세요.",
            description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
            positiveText = "버튼2",
            onPositiveClick = {},
            onDismiss = { },
            negativeText = "버튼1",
            onNegativeClick = {},
        )
    }
}

@Preview
@Composable
private fun TwoButtonDialogPreview3() {
    HandyTheme {
        TwoButtonDialog(
            title = "제목이 들어갑니다",
            description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
            positiveText = "버튼2",
            onPositiveClick = {},
            onDismiss = {},
            negativeText = "버튼1",
            onNegativeClick = {},
            content = { Icon(HandyIcons.Filled.Add) }
        )
    }
}

@Preview
@Composable
private fun DialogOnScreenPreview() {

    var showOneButtonDialog by remember { mutableStateOf(false) }
    var showTwoButtonDialog by remember { mutableStateOf(false) }

    HandyTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            BoxButton(text = "원버튼 다이알로그", onClick = { showOneButtonDialog = true })
            Spacer(modifier = Modifier.height(10.dp))
            BoxButton(text = "투버튼 다이알로그", onClick = { showTwoButtonDialog = true })
        }

        if (showOneButtonDialog) {
            OneButtonDialog(
                title = "제목이 들어갑니다",
                description = "내용",
                positiveText = "버튼",
                onPositiveClick = { showOneButtonDialog = false },
                onDismiss = { showOneButtonDialog = false }
            )
        } else if (showTwoButtonDialog) {
            TwoButtonDialog(
                title = "제목이 들어갑니다",
                description = "내용",
                positiveText = "버튼",
                onPositiveClick = { showTwoButtonDialog = false },
                onDismiss = { showTwoButtonDialog = false },
                negativeText = "버튼",
                onNegativeClick = { showTwoButtonDialog = false }
            )
        }
    }
}