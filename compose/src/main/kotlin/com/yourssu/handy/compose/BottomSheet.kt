package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.button.BaseButton
import com.yourssu.handy.compose.button.ButtonColorState
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.foundation.Radius

sealed class BottomSheetType {
    data object NoButton : BottomSheetType()

    data class OneButton(
        val buttonText: String
    ) : BottomSheetType()

    data class TwoButton(
        val firstButtonText: String,
        val secondaryButtonText: String
    ) : BottomSheetType()
}

// TODO: 주석 작성
@Composable
fun BottomSheet(
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
    onOneButtonClick: () -> Unit = {}, // todo: 한번에 관리하고싶다.
    onFirstButtonClick: () -> Unit = {},
    onSecondButtonClick: () -> Unit = {},
    bottomSheetType: BottomSheetType = BottomSheetType.NoButton,
    content: @Composable () -> Unit = {}
) {
    Box(
        // todo: Scrim 삭제
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF25262C).copy(alpha = 0.65f))
            .clickable { onDismiss() },
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 34.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(24.dp))
                .background(HandyTheme.colors.bgBasicDefault)
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Divider(  // TODO: Divider 컴포넌트 머지되면 적용하기
                modifier = Modifier
                    .width(32.dp)
                    .clip(CircleShape),
                dividerSize = DividerSize.FOUR,
                color = Color(0xFFB5B9C4)
            )
            Spacer(modifier = Modifier.height(32.dp))
            content()
            Spacer(modifier = Modifier.height(16.dp))

            when (bottomSheetType) {
                is BottomSheetType.NoButton -> {}

                is BottomSheetType.OneButton -> {
                    OneButtonBottomSheet(
                        buttonText = bottomSheetType.buttonText,
                        onClick = onOneButtonClick
                    )
                }

                is BottomSheetType.TwoButton -> {
                    TwoButtonBottomSheet(
                        firstButtonText = bottomSheetType.firstButtonText,
                        secondaryButtonText = bottomSheetType.secondaryButtonText,
                        onFirstButtonClick = onFirstButtonClick,
                        onSecondButtonClick = onSecondButtonClick
                    )
                }
            }

        }
    }
}

@Composable
private fun OneButtonBottomSheet(
    buttonText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    BaseButton( // todo: 고민.. 버튼의 어디까지 열어둬야 하나?
        onClick = onClick,
        colors = ButtonColorState(
            bgColor = HandyTheme.colors.buttonBoxPrimaryEnabled
        ),
        modifier = modifier.fillMaxWidth(),
        rounding = Radius.XL.dp
    ) {
        Text(
            text = buttonText,
            style = HandyTypography.B1Sb16,
            color = HandyTheme.colors.textBasicWhite
        )
    }
}

@Composable
private fun TwoButtonBottomSheet(
    firstButtonText: String,
    secondaryButtonText: String,
    modifier: Modifier = Modifier,
    onFirstButtonClick: () -> Unit,
    onSecondButtonClick: () -> Unit
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        BaseButton(
            onClick = onFirstButtonClick,
            colors = ButtonColorState(bgColor = HandyTheme.colors.buttonBoxSecondaryEnabled),
            modifier = Modifier.weight(1f),
            rounding = Radius.XL.dp
        ) {
            Text(
                text = firstButtonText,
                style = HandyTypography.B1Sb16,
                color = HandyTheme.colors.textBrandSecondary
            )
        }
        BaseButton(
            onClick = onSecondButtonClick,
            colors = ButtonColorState(bgColor = HandyTheme.colors.buttonBoxPrimaryEnabled),
            modifier = Modifier.weight(1f),
            rounding = Radius.XL.dp
        ) {
            Text(
                text = secondaryButtonText,
                style = HandyTypography.B1Sb16,
                color = HandyTheme.colors.textBasicWhite
            )
        }
    }
}
