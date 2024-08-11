package com.yourssu.handy.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.ColorGray300
import com.yourssu.handy.compose.foundation.HandyTextStyle
import com.yourssu.handy.compose.foundation.HandyTypography

sealed class CheckBoxSize(
    val typo: HandyTextStyle,
    val iconSize: IconSize,
) {
    data object Small : CheckBoxSize(typo = HandyTypography.B5Rg12, iconSize = IconSize.XS)
    data object Medium : CheckBoxSize(typo = HandyTypography.B3Rg14, iconSize = IconSize.S)
    data object Large : CheckBoxSize(typo = HandyTypography.B1Rg16, iconSize = IconSize.M)
}

/**
 * 선택, 비선택, 비활성화 상태를 나타낼 수 있는 [CheckBox]입니다.
 *
 * @param checked CheckBox의 선택 유무
 * @param onCheckedChange CheckBox의 선택 상태가 변경될 때 호출되는 함수
 * @param modifier CheckBox에 대한 선택적 Modifier
 * @param sizeType CheckBox의 크기에 따른 텍스트의 타이포, 아이콘 사이즈 설정. 기본값은 Medium
 * @param text CheckBox 옆에 표시되는 텍스트
 * @param enabled CheckBox의 활성화 유무
 * @param contentColor CheckBox의 아이콘 색상
 */
@Composable
fun CheckBox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    sizeType: CheckBoxSize = CheckBoxSize.Medium,
    text: String = "",
    enabled: Boolean = true,
    contentColor: Color = HandyTheme.colors.checkBoxSelected
) {
    val icon = when {
        checked -> R.drawable.ic_checkcircle_filled
        !enabled -> R.drawable.ic_checkcircle_disabled
        else -> R.drawable.ic_checkcircle_line
    }

    val iconColor = when {
        checked -> contentColor
        !enabled -> HandyTheme.colors.checkBoxDisabled
        else -> HandyTheme.colors.lineBasicMedium
    }

    val iconSize = sizeType.iconSize
    val typo = sizeType.typo

    Surface(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = icon),
                tint = iconColor,
                iconSize = iconSize,
            )
            if (text.isNotEmpty()) {
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = text,
                    style = typo,
                    color = if(enabled) Color.Unspecified else ColorGray300
                )
            }
        }
    }
}
