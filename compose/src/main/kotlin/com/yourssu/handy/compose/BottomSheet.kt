package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.button.BaseButton
import com.yourssu.handy.compose.button.ButtonColorState

sealed class BottomSheetType {
    data object NoButton : BottomSheetType()

    data class OneButton(
        val buttonText: String
    ) : BottomSheetType()

    data class TwoButton(
        val primaryButtonText: String,
        val secondaryButtonText: String
    ) : BottomSheetType()
}

// TODO: 주석 작성
@Composable
fun BottomSheet(
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
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
                .clip(RoundedCornerShape(24.dp))  // todo: Handy Radius로 바꾸기
                .background(HandyTheme.colors.bgBasicDefault)
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // TODO: Divider 컴포넌트 머지되면 적용하기
            Divider(
                modifier = Modifier
                    .width(32.dp)
                    .clip(CircleShape),
                dividerSize = DividerSize.FOUR,
                color = Color(0xFFB5B9C4)
            )
            Spacer(modifier = Modifier.height(32.dp))
            content()

            when (bottomSheetType) {
                is BottomSheetType.NoButton -> {}

                is BottomSheetType.OneButton -> {
                    OneButtonBottomSheet(buttonText = bottomSheetType.buttonText)
                }

                is BottomSheetType.TwoButton -> {
                    TwoButtonBottomSheet(
                        primaryButtonText = bottomSheetType.primaryButtonText,
                        secondaryButtonText = bottomSheetType.secondaryButtonText
                    )
                }
            }

        }
    }
}

@Composable
private fun OneButtonBottomSheet(
    modifier: Modifier = Modifier,
    buttonText: String
) {
    BaseButton( // TODO: 고민.. 버튼의 어디까지 열어둬야 하나?
        onClick = {},
        colors = ButtonColorState(
            bgColor = HandyTheme.colors.buttonBoxPrimaryEnabled
        ),
        modifier = modifier
    ) {
        Text(text = buttonText)
    }
}

@Composable
private fun TwoButtonBottomSheet(
    primaryButtonText: String,
    secondaryButtonText: String,
    modifier: Modifier = Modifier
) {

}

@Preview // todo : delete preview
@Composable
private fun TempBottomSheetPreview() {
    HandyTheme {
        BottomSheet(
            onDismiss = {},
            bottomSheetType = BottomSheetType.OneButton(buttonText = "TEXT")
        ) {
            Text("hi")
        }
    }
}

