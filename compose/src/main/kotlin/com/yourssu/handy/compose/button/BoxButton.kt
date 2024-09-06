package com.yourssu.handy.compose.button

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.foundation.HandyTypography


enum class BoxButtonType {
    Primary,
    Secondary,
    Tertiary;
}

enum class BoxButtonSize {
    XXS,
    XS,
    S,
    M,
    L,
    XL;
}

/**
 * BoxButton : Box 형태의 Button 입니다.
 * type : Primary, Secondary, Tertiary
 * size : XXS, XS, S, M, L, XL
 *
 * @param onClick Button 클릭 시 실행되는 함수
 * @param text Button 내부 text
 * @param leftIcon Button 왼쪽에 표시되는 Icon
 * @param rightIcon Button 오른쪽에 표시되는 Icon
 * @param isDisabled Button 비활성화 여부
 * @param sizeType Button 사이즈
 * @param buttonType Button 타입 (Primary, Secondary, Tertiary)
 * @param interactionSource Button 상호작용 소스
 * @param horizontalPadding Button 내부 content padding
 **/

@Composable
fun BoxButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    isDisabled: Boolean = false,
    sizeType: BoxButtonSize = BoxButtonSize.M,
    buttonType: BoxButtonType = BoxButtonType.Primary,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    horizontalPadding: Dp = boxButtonSizeStateBySize(size = sizeType).horizontalPadding,
) {
    val roundingDp = boxButtonSizeStateBySize(size = sizeType).round
    val (typo, iconSize, height) = boxButtonSizeStateBySize(size = sizeType)

    BaseButton(
        onClick = onClick,
        colors = boxButtonColorByType(
            type = buttonType,
        ),
        modifier = Modifier.height(height),
        enabled = !isDisabled,
        showBorder = (buttonType == BoxButtonType.Tertiary),
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
private fun boxButtonColorByType(
    type: BoxButtonType,
): ButtonColorState = when (type) {
    BoxButtonType.Primary -> ButtonColorState(
        contentColor = HandyTheme.colors.textBasicWhite,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
        bgColor = HandyTheme.colors.buttonBoxPrimaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonBoxPrimaryDisabled,
    )

    BoxButtonType.Secondary -> ButtonColorState(
        contentColor = HandyTheme.colors.textBrandSecondary,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
        bgColor = HandyTheme.colors.buttonBoxSecondaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonBoxSecondaryDisabled,
    )

    BoxButtonType.Tertiary -> ButtonColorState(
        bgColor = HandyTheme.colors.buttonBoxTertiaryEnabled,
        contentColor = HandyTheme.colors.textBasicPrimary,
        disabledBgColor = HandyTheme.colors.buttonBoxTertiaryDisabled,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
    )
}

private fun boxButtonSizeStateBySize(
    size: BoxButtonSize,
): ButtonSizeState = when (size) {
    BoxButtonSize.XL -> ButtonSizeState(
        typo = HandyTypography.B1Sb16,
        iconSize = IconSize.S,
        height = 56.dp,
        horizontalPadding = 20.dp,
        round = 16.dp
    )

    BoxButtonSize.L -> ButtonSizeState(
        typo = HandyTypography.B1Sb16,
        iconSize = IconSize.S,
        height = 52.dp,
        horizontalPadding = 20.dp,
        round = 16.dp
    )

    BoxButtonSize.M -> ButtonSizeState(
        typo = HandyTypography.B1Sb16,
        iconSize = IconSize.S,
        height = 48.dp,
        horizontalPadding = 16.dp,
        round = 14.dp
    )

    BoxButtonSize.S -> ButtonSizeState(
        typo = HandyTypography.B3Sb14,
        iconSize = IconSize.XS,
        height = 40.dp,
        horizontalPadding = 16.dp,
        round = 12.dp
    )

    BoxButtonSize.XS -> ButtonSizeState(
        typo = HandyTypography.B5Sb12,
        iconSize = IconSize.XXS,
        height = 32.dp,
        horizontalPadding = 8.dp,
        round = 10.dp
    )

    BoxButtonSize.XXS -> ButtonSizeState(
        typo = HandyTypography.B5Sb12,
        iconSize = IconSize.XXS,
        height = 24.dp,
        horizontalPadding = 8.dp,
        round = 8.dp
    )
}