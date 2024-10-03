package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.ErrorSnackBar
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.InfoSnackBar

@Preview(showBackground = true)
@Composable
fun InfoSnackBarPreview() {
    HandyTheme {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            InfoSnackBar(
                text = "한 줄짜리 정보성 메세지가 들어갑니다."
            )
            Spacer(modifier = Modifier.height(10.dp))
            InfoSnackBar(
                text = "줄 수가 두 줄 이상이 되는 스낵바 메시지입니다.\n좌측 정렬을 해주세요."
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ErrorSnackBarPreview() {
    HandyTheme {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            ErrorSnackBar(
                text = "에러 메세지가 들어갑니다",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(10.dp))
            ErrorSnackBar(
                text = "두 줄 이상의 에러 메세지가 들어갈 경우\n 아이콘은 모두 위로 정렬해주세요.",
                onClick = {}
            )
        }
    }
}