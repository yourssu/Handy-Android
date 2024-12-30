package com.yourssu.handy.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.HandyTextStyle
import com.yourssu.handy.compose.foundation.HandyTypography

sealed class ChipSize(
    val height: Dp,
    val iconSize: IconSize = IconSize.XS,
    val horizontalPadding: Dp = 12.dp,
    val round: Dp = 40.dp
) {
    data object Small : ChipSize(height = 24.dp)
    data object Medium : ChipSize(height = 32.dp)
}

/**
 * 정보를 입력하거나 선택하여 컨텐츠를 필터링할 수 있는 [Chip]입니다.
 *
 * @param onCheckedChange Chip의 선택 상태가 변경될 때 호출되는 함수
 * @param text Chip 내부 텍스트
 * @param sizeType Chip 사이즈 설정 : Small, Medium(Default)
 * @param leftIcon Chip 내부 텍스트의 왼쪽에 표시되는 아이콘
 * @param rightIcon Chip 내부 텍스트의 오른쪽에 표시되는 아이콘
 * @param checked Chip의 선택 여부
 * @param enabled Chip의 활성화 여부
 */
@Composable
fun Chip(
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    sizeType: ChipSize = ChipSize.Medium,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    checked: Boolean = false,
    enabled: Boolean = true,
) {
    val iconSize = sizeType.iconSize
    val height = sizeType.height
    val horizontalPadding = sizeType.horizontalPadding
    val round = sizeType.round

    val typo = when {
        checked -> HandyTypography.B3Sb14
        else -> HandyTypography.B3Rg14
    }

    val backgroundColor = when {
        checked -> HandyTheme.colors.chipSelected
        !enabled -> HandyTheme.colors.chipDisabled
        else -> HandyTheme.colors.chipUnselected
    }

    val contentColor = when {
        checked -> HandyTheme.colors.textBrandPrimary
        !enabled -> HandyTheme.colors.textBasicDisabled
        else -> HandyTheme.colors.textBasicSecondary
    }

    Surface(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier.height(height),
        enabled = enabled,
        rounding = round,
        backgroundColor = backgroundColor,
        contentColor = contentColor
    ) {
        Row(
            modifier = Modifier.padding(horizontal = horizontalPadding),
            verticalAlignment = Alignment.CenterVertically
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
}