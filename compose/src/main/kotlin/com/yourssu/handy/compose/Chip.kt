package com.yourssu.handy.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.HandyTextStyle
import com.yourssu.handy.compose.foundation.HandyTypography

enum class ChipSize(val height: Dp) {
    Small(24.dp),
    Medium(32.dp)
}

/**
 * 컨텐츠를 필터링할 수 있는 [Chip]입니다.
 *
 * @param text Chip 내부 텍스트
 * @param sizeType Chip 사이즈 설정 : Small, Medium(Default)
 * @param checked Chip의 선택 여부
 * @param onCheckedChange Chip의 선택 상태가 변경이 필요할 때 호출되는 함수
 * @param leadingIcon Chip 내부 텍스트의 왼쪽에 표시되는 아이콘
 * @param trailingIcon Chip 내부 텍스트의 오른쪽에 표시되는 아이콘
 * @param leadingIconOnClick Chip 내부 leadingIcon 클릭 시 호출되는 함수
 * @param trailingIconOnClick Chip 내부 trailingIcon 클릭 시 호출되는 함수
 * @param enabled Chip의 활성화 여부
 */
@Composable
fun Chip(
    text: String,
    modifier: Modifier = Modifier,
    sizeType: ChipSize = ChipSize.Medium,
    checked: Boolean = false,
    onCheckedChange: (Boolean) -> Unit = {},
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    leadingIconOnClick: () -> Unit = {},
    trailingIconOnClick: () -> Unit = {},
    enabled: Boolean = true,
) {
    val height = sizeType.height
    val iconSize = ChipDefaults.iconSize
    val horizontalPadding = ChipDefaults.horizontalPadding
    val round = ChipDefaults.round

    val typo = ChipStyles.getTypography(checked)
    val backgroundColor = ChipStyles.getBackgroundColor(checked, enabled)
    val contentColor = ChipStyles.getContentColor(checked, enabled)

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
            leadingIcon?.let {
                Icon(
                    imageVector = leadingIcon,
                    iconSize = iconSize,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            enabled = enabled,
                            onClick = leadingIconOnClick
                        )
                )
            }

            Text(
                text = if (text.length < 10) text else text.take(9) + "...",
                style = typo
            )

            trailingIcon?.let {
                Icon(
                    imageVector = trailingIcon,
                    iconSize = iconSize,
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            enabled = enabled,
                            onClick = trailingIconOnClick
                        )
                )
            }
        }
    }
}


/**
 * 컨텐츠를 선택할 수 있는 [Chip]입니다.
 *
 * @param text Chip 내부 텍스트
 * @param sizeType Chip 사이즈 설정 : Small, Medium(Default)
 * @param onClick Chip이 클릭될 때 호출되는 함수
 * @param leadingIcon Chip 내부 텍스트의 왼쪽에 표시되는 아이콘
 * @param trailingIcon Chip 내부 텍스트의 오른쪽에 표시되는 아이콘
 * @param leadingIconOnClick Chip 내부 leadingIcon 클릭 시 호출되는 함수
 * @param trailingIconOnClick Chip 내부 trailingIcon 클릭 시 호출되는 함수
 * @param enabled Chip의 활성화 여부
 */
@Composable
fun Chip(
    text: String,
    modifier: Modifier = Modifier,
    sizeType: ChipSize = ChipSize.Medium,
    onClick: () -> Unit = {},
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    leadingIconOnClick: () -> Unit = {},
    trailingIconOnClick: () -> Unit = {},
    enabled: Boolean = true,
) {
    val height = sizeType.height
    val iconSize = ChipDefaults.iconSize
    val horizontalPadding = ChipDefaults.horizontalPadding
    val round = ChipDefaults.round

    val typo = ChipStyles.getTypography(false)
    val backgroundColor = ChipStyles.getBackgroundColor(false, enabled)
    val contentColor = ChipStyles.getContentColor(false, enabled)

    Surface(
        onClick = onClick,
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
            leadingIcon?.let {
                Icon(
                    imageVector = leadingIcon,
                    iconSize = iconSize,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            enabled = enabled,
                            onClick = leadingIconOnClick
                        )
                )
            }

            Text(
                text = if (text.length < 10) text else text.take(9) + "...",
                style = typo
            )

            trailingIcon?.let {
                Icon(
                    imageVector = trailingIcon,
                    iconSize = iconSize,
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            enabled = enabled,
                            onClick = trailingIconOnClick
                        )
                )
            }
        }
    }
}

object ChipDefaults {
    val iconSize = IconSize.XS
    val horizontalPadding = 12.dp
    val round = 40.dp
}

object ChipStyles {
    fun getTypography(checked: Boolean): HandyTextStyle {
        return if (checked) HandyTypography.B3Sb14 else HandyTypography.B3Rg14
    }

    @Composable
    fun getBackgroundColor(checked: Boolean, enabled: Boolean): Color = when {
        checked -> HandyTheme.colors.chipSelected
        !enabled -> HandyTheme.colors.chipDisabled
        else -> HandyTheme.colors.chipUnselected
    }

    @Composable
    fun getContentColor(checked: Boolean, enabled: Boolean): Color = when {
        checked -> HandyTheme.colors.textBrandPrimary
        !enabled -> HandyTheme.colors.textBasicDisabled
        else -> HandyTheme.colors.textBasicSecondary
    }
}