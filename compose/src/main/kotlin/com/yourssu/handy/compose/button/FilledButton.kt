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


enum class FilledButtonType {
    Primary,
    Secondary,
    Outlined;
}

enum class FilledButtonSize {
    XXS,
    XS,
    S,
    M,
    L,
    XL;
}

/**
 * FilledButton : Box(Filled) 형태의 Button 입니다.
 * type : Primary, Secondary, Outlined
 * size : XXS, XS, S, M, L, XL
 *
 * @param onClick Button 클릭 시 실행되는 함수
 * @param text Button 내부 text
 * @param leftIcon Button 왼쪽에 표시되는 Icon
 * @param rightIcon Button 오른쪽에 표시되는 Icon
 * @param enabled Button 활성화 여부, default true
 * @param sizeType Button 사이즈
 * @param buttonType Button 타입 (Primary, Secondary, Outlined)
 * @param interactionSource Button 상호작용 소스
 * @param horizontalPadding Button 내부 content padding
 **/

@Composable
fun FilledButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    enabled: Boolean = true,
    sizeType: FilledButtonSize = FilledButtonSize.M,
    buttonType: FilledButtonType = FilledButtonType.Primary,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    horizontalPadding: Dp = filledButtonSizeStateBySize(size = sizeType).horizontalPadding,
) {
    val roundingDp = filledButtonSizeStateBySize(size = sizeType).round
    val (typo, iconSize, height) = filledButtonSizeStateBySize(size = sizeType)

    BaseButton(
        onClick = onClick,
        colors = filledButtonColorByType(
            type = buttonType,
        ),
        modifier = modifier.height(height),
        enabled = enabled,
        showBorder = (buttonType == FilledButtonType.Outlined),
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
private fun filledButtonColorByType(
    type: FilledButtonType,
): ButtonColorState = when (type) {
    FilledButtonType.Primary -> ButtonColorState(
        contentColor = HandyTheme.colors.textBasicWhite,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
        bgColor = HandyTheme.colors.buttonFilledPrimaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonFilledPrimaryDisabled,
    )

    FilledButtonType.Secondary -> ButtonColorState(
        contentColor = HandyTheme.colors.textBrandSecondary,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
        bgColor = HandyTheme.colors.buttonFilledSecondaryEnabled,
        disabledBgColor = HandyTheme.colors.buttonFilledSecondaryDisabled,
    )

    FilledButtonType.Outlined -> ButtonColorState(
        bgColor = HandyTheme.colors.buttonOutlinedEnabled,
        contentColor = HandyTheme.colors.textBasicPrimary,
        disabledBgColor = HandyTheme.colors.buttonOutlinedDisabled,
        disabledContentColor = HandyTheme.colors.textBasicDisabled,
    )
}

private fun filledButtonSizeStateBySize(
    size: FilledButtonSize,
): ButtonStyleProperties = when (size) {
    FilledButtonSize.XL -> ButtonStyleProperties(
        typo = HandyTypography.B1Sb16,
        iconSize = IconSize.S,
        height = 56.dp,
        horizontalPadding = 20.dp,
        round = 16.dp
    )

    FilledButtonSize.L -> ButtonStyleProperties(
        typo = HandyTypography.B1Sb16,
        iconSize = IconSize.S,
        height = 52.dp,
        horizontalPadding = 20.dp,
        round = 16.dp
    )

    FilledButtonSize.M -> ButtonStyleProperties(
        typo = HandyTypography.B1Sb16,
        iconSize = IconSize.S,
        height = 48.dp,
        horizontalPadding = 16.dp,
        round = 14.dp
    )

    FilledButtonSize.S -> ButtonStyleProperties(
        typo = HandyTypography.B3Sb14,
        iconSize = IconSize.XS,
        height = 40.dp,
        horizontalPadding = 16.dp,
        round = 12.dp
    )

    FilledButtonSize.XS -> ButtonStyleProperties(
        typo = HandyTypography.B5Sb12,
        iconSize = IconSize.XXS,
        height = 32.dp,
        horizontalPadding = 8.dp,
        round = 10.dp
    )

    FilledButtonSize.XXS -> ButtonStyleProperties(
        typo = HandyTypography.B5Sb12,
        iconSize = IconSize.XXS,
        height = 24.dp,
        horizontalPadding = 8.dp,
        round = 8.dp
    )
}