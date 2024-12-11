package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.button.BoxButton
import com.yourssu.handy.compose.button.BoxButtonSize
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Close


/**
 * BaseButton : ripple 효과가 없는 Composable 함수 입니다.
 *
 * BoxButton, TextButton의 베이스가 됩니다.
 *
 * @param title Dialog 제목 text
 * @param description Dialog 안의 설명 text (optional)
 * @param subDescription Dialog 안의 추가 설명 text (optional)
 * @param positiveText 확인 버튼 text
 * @param onPositiveClick 확인 버튼 클릭 시 실행되는 함수
 **/
@Composable
fun OneButtonDialog(
    title: String,
    positiveText: String,
    onPositiveClick: () -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    description: String = "",
    subDescription: String = "",
) {
    Box(
        modifier = modifier
            .background(color = HandyTheme.colors.bgBasicDefault)
//            .width(196.dp)
            .padding(20.dp)
    ) {
        Column {
            Row {
                Text(
                    text = title,
                    style = HandyTypography.T1Sb20,
                    color = HandyTheme.colors.textBasicPrimary
                )

                Spacer(modifier = modifier.weight(1f))

                Icon(HandyIcons.Filled.Close, modifier.clickable { onDismiss })

            }
            Spacer(modifier = modifier.height(16.dp))

            Text(text = description)

            Spacer(modifier = modifier.height(20.dp))

            if (subDescription.isNotEmpty()) {
                Text(text = subDescription)
                Spacer(modifier = modifier.height(20.dp))
            }

            BoxButton(
                text = positiveText, onClick = onPositiveClick,
                sizeType = BoxButtonSize.XL,
            )
        }

    }

}


/**
 * BaseButton : ripple 효과가 없는 Composable 함수 입니다.
 *
 * BoxButton, TextButton의 베이스가 됩니다.
 *
 * @param title Dialog 제목 text
 * @param description Dialog 안의 설명 text
 * @param positiveText 확인 버튼 text
 * @param negativeText 취소 버튼 text
 * @param onPositiveClick 확인 버튼 클릭 시 실행되는 함수
 * @param onNegativeClick 취소 버튼 클릭 시 실행되는 함수
 **/
@Composable
fun TwoButtonDialog(
    title: String,
    description: String,
    positiveText: String,
    negativeText: String,
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit,
    modifier: Modifier = Modifier,
) {

}

@Preview
@Composable
private fun DialogPreview() {

    var showDialog by remember { mutableStateOf(true) }

    HandyTheme {
        Column {
            OneButtonDialog(
                title = "제목이 들어갑니다",
                description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
                positiveText = "버튼",
                onPositiveClick = {},
                onDismiss = { showDialog = false } // 다이얼로그 닫기
            )

            Spacer(modifier = Modifier.height(16.dp))

            OneButtonDialog(
                title = "제목이 들어갑니다",
                description = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
                subDescription = "내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다 내용이 들어갑니다",
                positiveText = "버튼",
                onPositiveClick = {},
                onDismiss = { showDialog = false } // 다이얼로그 닫기
            )
        }

    }
}