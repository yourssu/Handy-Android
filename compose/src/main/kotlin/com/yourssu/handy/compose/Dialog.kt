package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.yourssu.handy.compose.DialogDefaults.dialogButtonSpacing
import com.yourssu.handy.compose.DialogDefaults.dialogPadding
import com.yourssu.handy.compose.DialogDefaults.dialogTextInsidePadding
import com.yourssu.handy.compose.DialogDefaults.dialogWidth
import com.yourssu.handy.compose.button.BoxButton
import com.yourssu.handy.compose.button.BoxButtonSize
import com.yourssu.handy.compose.button.BoxButtonType
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.foundation.Radius
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Close


/**
 * OneButtonDialog : 선택 버튼이 하나 있는 Dialog 입니다.
 *
 * @param title Dialog 제목 text
 * @param positiveText 확인 버튼 text
 * @param onPositiveClick 확인 버튼 클릭 시 실행되는 함수
 * @param onDismiss 닫기(X) 버튼 클릭시 실행되는 함수
 * @param description Dialog 안의 설명 text (optional)
 * @param content Dialog 안의 content. 주로 이미지가 들어감(optional)
 **/
@Composable
fun OneButtonDialog(
    title: String,
    positiveText: String,
    onPositiveClick: () -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    description: String?,
    content: @Composable (() -> Unit)? = null,
) {
        Box(
            modifier = modifier
                .background(
                    color = HandyTheme.colors.bgBasicDefault,
                    shape = RoundedCornerShape(Radius.XL.dp)
                )
                .width(dialogWidth)
                .padding(dialogPadding),
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        text = title,
                        style = HandyTypography.T1Sb20,
                        color = HandyTheme.colors.textBasicPrimary,
                        maxLines = 3,
                        modifier = Modifier
                            .weight(1f)
                    )

                    Icon(
                        imageVector = HandyIcons.Filled.Close,
                        contentDescription = "Close",
                        modifier = Modifier.clickable { onDismiss() }
                    )
                }

                Spacer(modifier = Modifier.height(dialogTextInsidePadding))

                if (description != null) {
                    Text(text = description)
                }

                Spacer(modifier = Modifier.height(dialogPadding))

                if (content != null) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = dialogPadding)
                    ) {
                        content()
                    }
                }

                BoxButton(
                    modifier = Modifier.fillMaxWidth(),
                    text = positiveText,
                    onClick = { onPositiveClick() },
                    sizeType = BoxButtonSize.L,
                )
            }
    }
}



/**
 * TwoButtonDialog : 버튼이 두개 있는 다이알로그 입니다.
 *
 * @param title Dialog 제목 text
 * @param positiveText 확인 버튼 text
 * @param negativeText 취소 버튼 text
 * @param onPositiveClick 확인 버튼 클릭 시 실행되는 함수
 * @param onNegativeClick 취소 버튼 클릭 시 실행되는 함수
 * @param onDismiss 닫기(X) 버튼 클릭시 실행되는 함수
 * @param description Dialog 안의 설명 text (optional)
 * @param content Dialog 안의 content. 주로 이미지가 들어감(optional)
 **/
@Composable
fun TwoButtonDialog(
    title: String,
    positiveText: String,
    negativeText: String,
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    description: String?,
    content: @Composable (() -> Unit)? = null,
) {
        Box(
            modifier = modifier
                .background(
                    color = HandyTheme.colors.bgBasicDefault,
                    shape = RoundedCornerShape(Radius.XL.dp)
                )
                .width(dialogWidth)
                .padding(dialogPadding),
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        text = title,
                        style = HandyTypography.T1Sb20,
                        color = HandyTheme.colors.textBasicPrimary,
                        maxLines = 3,
                        modifier = Modifier
                            .weight(1f)
                    )

                    Icon(
                        imageVector = HandyIcons.Filled.Close,
                        contentDescription = "Close",
                        modifier = Modifier.clickable { onDismiss() }
                    )
                }

                Spacer(modifier = Modifier.height(dialogTextInsidePadding))

                if (description != null) {
                    Text(text = description)
                }

                Spacer(modifier = Modifier.height(dialogPadding))

                if (content != null) {
                    Box(
                        Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = dialogPadding)
                    ) {
                        content()
                    }
                }

                Row(
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    BoxButton(
                        modifier = Modifier.weight(1f),
                        text = negativeText,
                        onClick = { onNegativeClick() },
                        sizeType = BoxButtonSize.L,
                        buttonType = BoxButtonType.Secondary
                    )

                    Spacer(modifier = Modifier.width(dialogButtonSpacing))

                    BoxButton(
                        modifier = Modifier.weight(1f),
                        text = positiveText,
                        onClick = { onPositiveClick() },
                        sizeType = BoxButtonSize.L,
                    )
                }
            }
        }

}

object DialogDefaults {
    val dialogWidth = 296.dp
    val dialogPadding = 20.dp
    val dialogTextInsidePadding = 16.dp
    val dialogButtonSpacing = 8.dp
}