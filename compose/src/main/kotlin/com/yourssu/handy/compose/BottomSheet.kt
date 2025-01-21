package com.yourssu.handy.compose

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.yourssu.handy.compose.BottomSheetDefaults.DragHandle
import com.yourssu.handy.compose.SheetValue.Hidden
import com.yourssu.handy.compose.button.BaseButton
import com.yourssu.handy.compose.button.ButtonColorState
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.foundation.Radius
import kotlinx.coroutines.launch

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
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BottomSheet(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    sheetState: SheetState = rememberModalBottomSheetState(),
    onOneButtonClick: () -> Unit = {}, // todo: 한번에 관리하고싶다.
    onFirstButtonClick: () -> Unit = {},
    onSecondButtonClick: () -> Unit = {},
    bottomSheetType: BottomSheetType = BottomSheetType.NoButton,
    content: @Composable () -> Unit = {}
) {
    val density = LocalDensity.current
    SideEffect {
        sheetState.density = density
    }
    val scope = rememberCoroutineScope()
    val animateToDismiss: () -> Unit = {
        scope.launch { sheetState.hide() }.invokeOnCompletion {
            if (!sheetState.isVisible) {
                onDismissRequest()
            }
        }
    }

    Popup(
        onDismissRequest = {
            scope.launch { sheetState.hide() }.invokeOnCompletion { onDismissRequest() }
        }
    ) {
        BoxWithConstraints(Modifier.fillMaxSize()) {
            val fullHeight = constraints.maxHeight
            Scrim(
                color = Color(0xFF25262C).copy(alpha = 0.65f),
                onDismissRequest = animateToDismiss,
                visible = sheetState.currentValue != Hidden
            )
            Surface(
                modifier = modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 34.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .offset {
                        IntOffset(
                            x = 0,
                            y = sheetState
                                .requireOffset()
                                .toInt()
                        )
                    }
                    .anchoredDraggable(
                        state = sheetState.anchoredDraggableState,
                        orientation = Orientation.Vertical,
                    )
                    .modalBottomSheetAnchors(
                        sheetState = sheetState,
                        fullHeight = fullHeight.toFloat()
                    )
            ) {
                Column(
                    modifier = Modifier
                        .background(HandyTheme.colors.bgBasicDefault)
                        .align(Alignment.BottomCenter)
                        .padding(horizontal = 16.dp)
                        .padding(bottom = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    DragHandle() // todo: box
                    Spacer(modifier = Modifier.height(16.dp))
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
    if (sheetState.hasExpandedState) {
        LaunchedEffect(sheetState) {
            if (sheetState.currentValue != SheetValue.Expanded) {
                sheetState.show()
            }
        }
    }
    Log.d("LYB", "sheet = ${sheetState.currentValue}")
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
            bgColor = HandyTheme.colors.buttonFilledPrimaryEnabled
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
            colors = ButtonColorState(bgColor = HandyTheme.colors.buttonFilledSecondaryEnabled),
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
            colors = ButtonColorState(bgColor = HandyTheme.colors.buttonFilledPrimaryEnabled),
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

