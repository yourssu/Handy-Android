package com.yourssu.handy.compose.button

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.foundation.HandyTypography

enum class TextButtonType {
    Primary,
    Secondary;
}

enum class TextButtonSize {
    S,
    M,
    L;
}

/**
 * BaseButton : ripple 효과가 없는 Composable 함수 입니다.
 *
 * BoxButton, TextButton의 베이스가 됩니다.
 *
 * @param onClick Button 클릭 시 실행되는 함수
 * @param text Button 내부 text
 * @param leftIcon Button 왼쪽에 표시되는 Icon
 * @param rightIcon Button 오른쪽에 표시되는 Icon
 * @param enabled Button 활성화 여부 default true
 * @param sizeType Button 사이즈
 * @param buttonType Button 타입 (Primary, Secondary)
 * @param interactionSource Button 상호작용 소스
 **/
@Composable
fun TextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    sizeType: TextButtonSize = TextButtonSize.M,
    enabled: Boolean = false,
    buttonType: TextButtonType = TextButtonType.Primary,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val roundingDp = textButtonSizeStateBySize(size = sizeType).round
    val (typo, iconSize, height, horizontalPadding) = textButtonSizeStateBySize(size = sizeType)

    BaseButton(
        onClick = onClick,
        colors = textButtonColorByType(
            type = buttonType,
        ),
        modifier = Modifier
            .then(modifier)
            .height(height),
        enabled = enabled,
        interactionSource = interactionSource,
        rounding = roundingDp,
        contentPadding = PaddingValues(
            horizontal = horizontalPadding,
        ),
    ) {
        leftIcon?.let {
            Icon(
                imageVector = leftIcon,
                iconSize = iconSize,
                modifier = Modifier.padding(end = 4.dp)
            )
        }

        Text(
            text = text,
            style = typo,
        )

        rightIcon?.let {
            Icon(
                imageVector = rightIcon,
                iconSize = iconSize,
                modifier = Modifier.padding(start = 4.dp)
            )
        }
    }
}


@Composable
private fun textButtonColorByType(
    type: TextButtonType,
): ButtonColorState = when (type) {
    TextButtonType.Primary -> ButtonColorState(
        bgColor = HandyTheme.colors.buttonTextPrimaryEnabled,
        contentColor = HandyTheme.colors.textBrandPrimary,
        disabledBgColor = HandyTheme.colors.buttonTextPrimaryEnabled,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
    )

    TextButtonType.Secondary -> ButtonColorState(
        bgColor = HandyTheme.colors.buttonTextSecondaryEnabled,
        contentColor = HandyTheme.colors.textBasicTertiary,
        disabledBgColor = HandyTheme.colors.buttonTextSecondaryDisabled,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
    )
}


@Composable
private fun textButtonSizeStateBySize(
    size: TextButtonSize,
): ButtonStyleProperties = when (size) {
    TextButtonSize.L -> ButtonStyleProperties(
        typo = HandyTypography.B3Sb14,
        iconSize = IconSize.S,
        height = 36.dp,
        horizontalPadding = 8.dp,
        round = 8.dp
    )

    TextButtonSize.M -> ButtonStyleProperties(
        typo = HandyTypography.B3Sb14,
        iconSize = IconSize.XS,
        height = 32.dp,
        horizontalPadding = 8.dp,
        round = 8.dp
    )

    TextButtonSize.S -> ButtonStyleProperties(
        typo = HandyTypography.B5Sb12,
        iconSize = IconSize.XXS,
        height = 24.dp,
        horizontalPadding = 6.dp,
        round = 8.dp
    )

}