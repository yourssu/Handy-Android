package com.yourssu.handy.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Indication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.isContainer
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.LocalContentColor


/**
 * Surface : 어떠한 상호작용도 없는 기본적인 Surface 입니다. 비상호작용적인 UI 요소로 사용됩니다.
 *
 * @param rounding : Surface의 모서리의 둥글기
 * @param shape : Surface의 전체 모양. 기본값 RectangleShape
 * @param backgroundColor : Surface의 배경 색상. 기본값 bgBasicDefault(#0xFFFFFFFF)
 * @param contentColor : Surface의 내부 content 색상
 * @param border : Surface의 테두리 굵기
 * @param content : Surface의 내부 content
 *
 **/

@Composable
fun Surface(
    modifier: Modifier = Modifier,
    rounding: Dp? = null,
    shape: Shape = rounding?.let { RoundedCornerShape(it) } ?: RectangleShape,
    backgroundColor: Color = HandyTheme.colors.bgBasicDefault,
    contentColor: Color = LocalContentColor.current,
    border: BorderStroke? = null,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor,
    ) {
        Box(
            modifier = modifier
                .surface(
                    shape = shape,
                    backgroundColor = backgroundColor,
                    border = border,
                )
                .semantics(mergeDescendants = false) {
                    @Suppress("DEPRECATION")
                    isContainer = true
                }
                .pointerInput(Unit) {},
            propagateMinConstraints = true,
        ) {
            content()
        }
    }
}


/**
 * Clickable Surface : 클릭 가능한 Surface 입니다.
 *
 * button, card 같은 클릭 이벤트가 필요한 곳에서 사용합니다.
 *
 * @param onClick Surface 클릭 시 실행되는 함수
 * @param enabled Surface 클릭 가능 여부
 * @param rounding Surface 모서리의 둥글기
 * @param shape Surface 전체 모양. 기본값 : RectangleShape
 * @param backgroundColor Surface 배경 색상. 기본값 : bgBasicDefault(#0xFFFFFFFF)
 * @param contentColor Surface 내부 content 색상
 * @param border Surface 테두리 굵기
 * @param content Surface 내부 content
 **/
@Composable
fun Surface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    rounding: Dp? = null,
    shape: Shape = rounding?.let { RoundedCornerShape(it) } ?: RectangleShape,
    backgroundColor: Color = HandyTheme.colors.bgBasicDefault,
    contentColor: Color = LocalContentColor.current,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource()},
    indication: Indication? = null,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor,
    ) {
        Box(
            modifier = modifier
                .surface(
                    shape = shape,
                    backgroundColor = backgroundColor,
                    border = border,
                )
                .clickable(
                    interactionSource = interactionSource,
                    indication = indication,
                    enabled = enabled,
                    onClick = onClick,
                ),
            propagateMinConstraints = true,
        ) {
            content()
        }
    }
}

@Composable
fun Surface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    rounding: Dp? = null,
    shape: Shape = rounding?.let { RoundedCornerShape(it) } ?: RectangleShape,
    backgroundColor: Color = HandyTheme.colors.bgBasicDefault,
    contentColor: Color = LocalContentColor.current,
    border: BorderStroke? = null,
    shadowColor: Color = Color.Transparent,
    shadowElevation: Dp = 0.dp,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor,
    ) {
        Box(
            modifier = modifier
                .shadow(
                    elevation = shadowElevation,
                    shape = shape,
                    clip = false,
                    ambientColor = shadowColor,
                    spotColor = shadowColor
                )
                .surface(
                    shape = shape,
                    backgroundColor = backgroundColor,
                    border = border,
                )
                .clickable(
                    interactionSource = interactionSource,
                    indication = indication,
                    enabled = enabled,
                    onClick = onClick,
                ),
            propagateMinConstraints = true,
        ) {
            content()
        }
    }
}

/**
 * Selectable Surface : 선택이 가능한 Surface 입니다.
 *
 * selected 상태와 onClick 콜백이 필요한 RadioButton 같은 곳에서 사용합니다.
 *
 * @param selected Surface 선택 여부
 * @param onClick Surface 클릭 시 실행되는 함수
 * @param enabled Surface 클릭 가능 여부
 * @param rounding Surface 모서리의 둥글기
 * @param shape Surface 전체 모양. 기본값 : RectangleShape
 * @param backgroundColor Surface 배경 색상. 기본값 : bgBasicDefault(#0xFFFFFFFF)
 * @param contentColor Surface 내부 content 색상
 * @param border Surface 테두리 굵기
 * @param interactionSource Surface 상호작용 소스
 * @param content Surface 내부 content
 **/
@Composable
fun Surface(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    rounding: Dp? = null,
    shape: Shape = rounding?.let { RoundedCornerShape(it) } ?: RectangleShape,
    backgroundColor: Color = HandyTheme.colors.bgBasicDefault,
    contentColor: Color = LocalContentColor.current,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource()},
    indication: Indication? = null,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor,
    ) {
        @Suppress("DEPRECATION_ERROR")
        Box(
            modifier = modifier
                .surface(
                    shape = shape,
                    backgroundColor = backgroundColor,
                    border = border,
                )
                .selectable(
                    interactionSource = interactionSource,
                    indication = indication,
                    selected = selected,
                    onClick = onClick,
                    enabled = enabled,
                ),
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}

/**
 * Toggleable Surface : 토글 기능이 있는 Surface 입니다.
 *
 * checked 상태와 onCheckedChange 콜백이 필요한 checkBox 또는 Toggle 같은 곳에서 사용합니다.
 *
 * @param checked : Surface 체크 여부
 * @param onCheckedChange : Surface 체크 상태 변경 시 실행되는 함수
 * @param enabled : Surface 클릭 가능 여부
 * @param rounding : Surface 모서리의 둥글기
 * @param shape : Surface 전체 모양. 기본값 : RectangleShape
 * @param backgroundColor : Surface 배경 색상. 기본값 : bgBasicDefault(#0xFFFFFFFF)
 * @param contentColor : Surface 내부 content 색상
 * @param border : Surface 테두리 굵기
 * @param interactionSource : Surface 상호작용 소스
 * @param content : Surface 내부 content
 **/

@Composable
fun Surface(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    rounding: Dp? = null,
    shape: Shape = rounding?.let { RoundedCornerShape(it) } ?: RectangleShape,
    backgroundColor: Color = HandyTheme.colors.bgBasicDefault,
    contentColor: Color = LocalContentColor.current,
    border: BorderStroke? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    indication: Indication? = null,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor,
    ) {
        @Suppress("DEPRECATION_ERROR")
        Box(
            modifier = modifier
                .surface(
                    shape = shape,
                    backgroundColor = backgroundColor,
                    border = border,
                )
                .toggleable(
                    interactionSource = interactionSource,
                    indication = indication,
                    value = checked,
                    enabled = enabled,
                    onValueChange = onCheckedChange
                ),
            propagateMinConstraints = true
        ) {
            content()
        }
    }
}

@Stable
private fun Modifier.surface(
    shape: Shape,
    backgroundColor: Color,
    border: BorderStroke?,
) = this
    .then(if (border != null) Modifier.border(border, shape) else Modifier)
    .background(color = backgroundColor, shape = shape)
    .clip(shape)
