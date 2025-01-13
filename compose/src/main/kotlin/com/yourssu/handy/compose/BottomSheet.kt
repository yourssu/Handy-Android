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

enum class BottomSheetSize {
    SMALL, MEDIUM, LARGE
}

@Composable
fun BottomSheet(
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
    bottomSheetSize: BottomSheetSize = BottomSheetSize.SMALL,
    handleBarVisibility: Boolean = true,
    content: @Composable () -> Unit = {}
) {
    // todo: Scrim 삭제
    Box(
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
                // todo: Handy Radius로 바꾸기
                .clip(RoundedCornerShape(24.dp))
                .background(HandyTheme.colors.bgBasicDefault)
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (handleBarVisibility) {
                // TODO: Divider 컴포넌트 머지되면 적용하기
                Divider(
                    modifier = Modifier
                        .width(32.dp)
                        .clip(CircleShape),
                    dividerSize = DividerSize.FOUR,
                    color = Color(0xFFB5B9C4)
                )
                Spacer(modifier = Modifier.height(32.dp))
            }
            content()
        }
    }
}

@Preview
@Composable
fun TempBottomSheetPreview() {
    HandyTheme {
        BottomSheet(
            handleBarVisibility = true,
            onDismiss = {},
        ) {
            Text("hi")
        }
    }
}

