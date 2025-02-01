package com.yourssu.handy.compose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
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
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.yourssu.handy.compose.BottomSheetDefaults.DragHandle
import com.yourssu.handy.compose.BottomSheetDefaults.contentMinHeight
import com.yourssu.handy.compose.BottomSheetDefaults.contentPadding
import com.yourssu.handy.compose.BottomSheetDefaults.surfaceBottomPadding
import com.yourssu.handy.compose.BottomSheetDefaults.surfaceHorizontalPadding
import com.yourssu.handy.compose.BottomSheetType.OneButton
import com.yourssu.handy.compose.BottomSheetType.TwoButton
import com.yourssu.handy.compose.SheetValue.Hidden
import com.yourssu.handy.compose.button.BaseButton
import com.yourssu.handy.compose.button.ButtonColorState
import com.yourssu.handy.compose.foundation.ColorGray080
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.foundation.Radius
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch

/**
 * BottomSheet의 타입을 나타냅니다.
 *
 * [OneButton] : 하단에 버튼 한 개 표시
 * [TwoButton] : 하단에 버튼 두 개 표시
 */
sealed class BottomSheetType {
    data class OneButton(
        val buttonText: String
    ) : BottomSheetType()

    data class TwoButton(
        val firstButtonText: String,
        val secondButtonText: String
    ) : BottomSheetType()
}

/**
 * 바텀시트의 UI를 나타내는 함수입니다.
 *
 * @param onDismissRequest 바텀시트가 닫힐 때 호출되는 함수
 * @param bottomSheetType 바텀시트의 [BottomSheetType] 타입을 결정
 * @param modifier Modifier 수정자
 * @param sheetState 바텀시트의 상태를 나타내는 객체
 * @param onOneButtonClick [BottomSheetType.OneButton]의 버튼 클릭 시 호출되는 함수
 * @param onFirstButtonClick [BottomSheetType.TwoButton]의 첫 번째 버튼 클릭 시 호출되는 함수
 * @param onSecondButtonClick [BottomSheetType.TwoButton]의 두 번째 버튼 클릭 시 호출되는 함수
 * @param content 바텀시트 내부에 표시될 내용을 결정
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BottomSheet(
    onDismissRequest: () -> Unit,
    bottomSheetType: BottomSheetType,
    modifier: Modifier = Modifier,
    sheetState: SheetState = rememberModalBottomSheetState(),
    onOneButtonClick: () -> Unit = {},
    onFirstButtonClick: () -> Unit = {},
    onSecondButtonClick: () -> Unit = {},
    content: @Composable () -> Unit
) {
    val density = LocalDensity.current
    SideEffect {
        sheetState.density = density
    }
    val scope = rememberCoroutineScope()
    val animateToDismiss: () -> Unit = {
        scope.launch { sheetState.hide() }.invokeOnCompletion {
            if (!sheetState.isVisible) onDismissRequest()
        }
    }

    LaunchedEffect(sheetState) {
        snapshotFlow { sheetState.currentValue }
            .drop(1)
            .distinctUntilChanged()
            .filter { it == Hidden }
            .collect {
                scope.launch { sheetState.hide() }.invokeOnCompletion { onDismissRequest() }
            }
    }

    Popup {
        BoxWithConstraints(Modifier.fillMaxSize()) {
            val fullHeight = constraints.maxHeight
            Scrim(
                color = ColorGray080,
                onDismissRequest = animateToDismiss,
                visible = sheetState.targetValue != Hidden
            )
            Surface(
                modifier = modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(horizontal = surfaceHorizontalPadding)
                    .padding(bottom = surfaceBottomPadding)
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
                    ),
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .background(HandyTheme.colors.bgBasicDefault)
                        .align(Alignment.BottomCenter)
                        .padding(horizontal = contentPadding)
                        .padding(bottom = contentPadding),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .defaultMinSize(minHeight = contentMinHeight),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        DragHandle()
                        Spacer(modifier = Modifier.height(contentPadding))
                        content()
                        Spacer(modifier = Modifier.height(contentPadding))
                    }
                    Column {
                        when (bottomSheetType) {
                            is OneButton -> {
                                OneButtonBottomSheet(
                                    buttonText = bottomSheetType.buttonText,
                                    onClick = onOneButtonClick
                                )
                            }

                            is TwoButton -> {
                                TwoButtonBottomSheet(
                                    firstButtonText = bottomSheetType.firstButtonText,
                                    secondButtonText = bottomSheetType.secondButtonText,
                                    onFirstButtonClick = onFirstButtonClick,
                                    onSecondButtonClick = onSecondButtonClick
                                )
                            }
                        }
                    }
                }
            }
        }
    }
    if (sheetState.hasExpandedState) {
        LaunchedEffect(sheetState) {
            sheetState.show()
        }
    }
}

/**
 * 하단에 버튼이 하나만 표시될 때 사용하는 함수입니다.
 *
 * @param buttonText 버튼에 표시될 텍스트
 * @param onClick 버튼 클릭 시 호출되는 함수
 * @param modifier Modifier 수정자
 */
@Composable
private fun OneButtonBottomSheet(
    buttonText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    BaseButton(
        onClick = onClick,
        colors = ButtonColorState(bgColor = HandyTheme.colors.buttonFilledPrimaryEnabled),
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

/**
 * 하단에 버튼이 두 개일 때 표시될 때 사용하는 함수입니다.
 *
 * @param firstButtonText 첫 번째 버튼에 표시될 텍스트
 * @param secondButtonText 두 번째 버튼에 표시될 텍스트
 * @param onFirstButtonClick 첫 번째 버튼 클릭 시 호출되는 함수
 * @param onSecondButtonClick 두 번째 버튼 클릭 시 호출되는 함수
 * @param modifier Modifier 수정자
 */
@Composable
private fun TwoButtonBottomSheet(
    firstButtonText: String,
    secondButtonText: String,
    onFirstButtonClick: () -> Unit,
    onSecondButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
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
                text = secondButtonText,
                style = HandyTypography.B1Sb16,
                color = HandyTheme.colors.textBasicWhite
            )
        }
    }
}
