package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.DialogDefaults.dialogInsidePadding
import com.yourssu.handy.compose.DialogDefaults.dialogPadding
import com.yourssu.handy.compose.DialogDefaults.dialogTwoButtonInsidePadding
import com.yourssu.handy.compose.DialogDefaults.dialogWidth
import com.yourssu.handy.compose.button.BoxButton
import com.yourssu.handy.compose.button.BoxButtonSize
import com.yourssu.handy.compose.button.BoxButtonType
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Close


/**
 * OneButtonDialog : 선택 버튼이 하나 있는 Dialog 입니다.
 *
 * @param title Dialog 제목 text
 * @param description Dialog 안의 설명 text (optional)
 * @param content Dialog 안의 content. 주로 이미지가 들어감(optional)
 * @param positiveText 확인 버튼 text
 * @param onPositiveClick 확인 버튼 클릭 시 실행되는 함수
 * @param onDismiss 닫기(X) 버튼 클릭시 실행되는 함수
 **/
@Composable
fun OneButtonDialog(
    title: String,
    positiveText: String,
    onPositiveClick: () -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    description: String = "",
    content: @Composable (() -> Unit)? = null,
) {
    Box(
        modifier = modifier
            .background(
                color = HandyTheme.colors.bgBasicDefault,
                shape = RoundedCornerShape(16.dp) //todo Radius.XL 어떻게 활용하는지 모르겠음
            )
            .width(dialogWidth)
            .padding(dialogPadding),
    ) {
        Column {
            Row(
                modifier = modifier.fillMaxWidth(), // Row가 부모의 가로 너비를 가득 채움
                horizontalArrangement = Arrangement.Center // 가로축 가운데 정렬
            ) {
                Text(
                    text = title,
                    style = HandyTypography.T1Sb20,
                    color = HandyTheme.colors.textBasicPrimary
                )

                Spacer(modifier = modifier.weight(1f))

                Icon(HandyIcons.Filled.Close, modifier.clickable { onDismiss() })

            }
            Spacer(modifier = modifier.height(dialogInsidePadding))

            Text(text = description)

            Spacer(modifier = modifier.height(dialogPadding))

            if (content != null) {
                Box(
                    modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = dialogPadding)
                ) {
                    content()
                }
            }

            BoxButton(
                modifier = modifier.fillMaxWidth(),
                text = positiveText, onClick = onPositiveClick,
                sizeType = BoxButtonSize.L,
            )
        }
    }
}


/**
 * TwoButtonDialog : 버튼이 두개 았는 다이알로그 입니다.
 *
 * @param title Dialog 제목 text
 * @param description Dialog 안의 설명 text
 * @param positiveText 확인 버튼 text
 * @param negativeText 취소 버튼 text
 * @param onPositiveClick 확인 버튼 클릭 시 실행되는 함수
 * @param onNegativeClick 취소 버튼 클릭 시 실행되는 함수
 * @param onDismiss 닫기(X) 버튼 클릭시 실행되는 함수
 **/
@Composable
fun TwoButtonDialog(
    title: String,
    description: String,
    positiveText: String,
    negativeText: String,
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable (() -> Unit)? = null,
) {
    Box(
        modifier = modifier
            .background(
                color = HandyTheme.colors.bgBasicDefault,
                shape = RoundedCornerShape(16.dp)
            ) //todo Radius.XL 어떻게 활용하는지 모르겠음
            .width(dialogWidth)
            .padding(dialogPadding),
    ) {
        Column {
            Row(
                modifier = modifier.fillMaxWidth(), // Row가 부모의 가로 너비를 가득 채움
                horizontalArrangement = Arrangement.Center // 가로축 가운데 정렬
            ) {
                Text(
                    text = title,
                    style = HandyTypography.T1Sb20,
                    color = HandyTheme.colors.textBasicPrimary
                )

                Spacer(modifier = modifier.weight(1f))

                Icon(HandyIcons.Filled.Close, modifier.clickable { onDismiss })

            }
            Spacer(modifier = modifier.height(dialogInsidePadding))

            Text(text = description)

            Spacer(modifier = modifier.height(dialogPadding))

            if (content != null) {
                Box(
                    modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = dialogPadding)
                ) {
                    content()
                }
            }

            Row(
                modifier = modifier.align(Alignment.CenterHorizontally)
            ) {
                BoxButton(
                    modifier = modifier.weight(1f), // 버튼이 균등한 너비를 차지하도록 설정
                    text = positiveText,
                    onClick = onPositiveClick,
                    sizeType = BoxButtonSize.L,
                    buttonType = BoxButtonType.Secondary
                )

                Spacer(modifier = modifier.width(dialogTwoButtonInsidePadding))

                BoxButton(
                    modifier = modifier.weight(1f), // 버튼이 균등한 너비를 차지하도록 설정
                    text = negativeText,
                    onClick = onNegativeClick,
                    sizeType = BoxButtonSize.L,
                )
            }
        }
    }
}

object DialogDefaults {
    val dialogWidth = 296.dp
    val dialogPadding = 20.dp
    val dialogInsidePadding = 16.dp
    val dialogTwoButtonInsidePadding = 8.dp
}