package com.yourssu.handy.compose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.BottomSheetDefaults.DragHandle
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
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    dragHandle: @Composable (() -> Unit)? = { DragHandle() },
    onOneButtonClick: () -> Unit = {}, // todo: 한번에 관리하고싶다.
    onFirstButtonClick: () -> Unit = {},
    onSecondButtonClick: () -> Unit = {},
    bottomSheetType: BottomSheetType = BottomSheetType.NoButton,
    content: @Composable () -> Unit = {}
) {
    val transitionState = remember { MutableTransitionState(false) }
    transitionState.targetState = true

    // Scrim()

    Box(
        // todo: Scrim 삭제
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF25262C).copy(alpha = 0.65f))
            // .clickable { onDismissRequest() },
            .clickable {
                transitionState.targetState = false // 애니메이션 종료
                onDismissRequest()
            }
    ) {
        AnimatedVisibility(
            visibleState = transitionState,
            enter = slideInVertically(initialOffsetY = { it }) + fadeIn(),
            exit = slideOutVertically(targetOffsetY = { it }) + fadeOut(),
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 34.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(HandyTheme.colors.bgBasicDefault)
                    // .align(Alignment.BottomCenter)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (dragHandle != null) {
                    DragHandle()
                }
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


@Composable
private fun Scrim(
    color: Color,
    onDismissRequest: () -> Unit,
    visible: Boolean
) {
    if (color.isSpecified) {
        val alpha by animateFloatAsState(
            targetValue = if (visible) 1f else 0f,
            animationSpec = TweenSpec()
        )
        val dismissSheet = if (visible) {
            Modifier
                .pointerInput(onDismissRequest) {
                    detectTapGestures {
                        onDismissRequest()
                    }
                }
                .clearAndSetSemantics {}
        } else {
            Modifier
        }
        Canvas(
            Modifier
                .fillMaxSize()
                .then(dismissSheet)
        ) {
            drawRect(color = color, alpha = alpha)
        }
    }
}