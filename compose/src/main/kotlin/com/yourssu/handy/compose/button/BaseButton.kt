package com.yourssu.handy.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Surface

/**
 * BaseButton : ripple 효과가 없는 Composable 함수 입니다.
 *
 * FilledButton, TextButton의 베이스가 됩니다.
 *
 * @param onClick Button 클릭 시 실행되는 함수
 * @param colors Button 색상 상태
 * @param enabled Surface 클릭 가능 여부
 * @param showBorder Button 테두리 표시 여부
 * @param rounding Button 모서리의 둥글기
 * @param contentPadding Button 내부 content padding
 * @param interactionSource Button 상호작용 소스
 * @param minWidth Button 최소 너비
 * @param minHeight Button 최소 높이
 * @param content Button 내부 content
 **/
@Composable
internal fun BaseButton(
    onClick: () -> Unit,
    colors: ButtonColorState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    showBorder: Boolean = false,
    rounding: Dp = 8.dp,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val localPressed by interactionSource.collectIsPressedAsState()
    val buttonColors = colors.apply { pressed = localPressed }
    val contentColor by buttonColors.contentColor(enabled)

    Surface(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        rounding = rounding,
        border = if (showBorder) BorderStroke(1.dp, HandyTheme.colors.lineBasicMedium) else null,
        backgroundColor = buttonColors.backgroundColor(enabled).value,
        contentColor = contentColor,
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = Modifier.padding(contentPadding),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            content = content,
        )
    }
}

object ButtonDefaults {
    private val ButtonHorizontalPadding = 20.dp
    private val ButtonVerticalPadding = 14.dp

    val ContentPadding = PaddingValues(
        horizontal = ButtonHorizontalPadding,
        vertical = ButtonVerticalPadding,
    )
}
