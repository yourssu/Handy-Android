package com.yourssu.handy.compose.component.radiobutton

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.theme.HandyTheme
import com.yourssu.handy.compose.icons.Icon
import com.yourssu.handy.compose.icons.IconSize
import com.yourssu.handy.compose.R
import com.yourssu.handy.compose.foundation.Surface
import com.yourssu.handy.compose.text.Text
import com.yourssu.handy.compose.foundation.ColorGray300
import com.yourssu.handy.compose.foundation.HandyTextStyle
import com.yourssu.handy.compose.foundation.HandyTypography

sealed class RadioButtonSize(
    val typo: HandyTextStyle,
    val iconSize: IconSize,
) {
    data object Small : RadioButtonSize(typo = HandyTypography.B5Rg12, iconSize = IconSize.XS)
    data object Medium : RadioButtonSize(typo = HandyTypography.B3Rg14, iconSize = IconSize.S)
    data object Large : RadioButtonSize(typo = HandyTypography.B1Rg16, iconSize = IconSize.M)
}

/**
 * 단일 선택을 나타낼 수 있는 [RadioButton]입니다.
 *
 * @param checked RadioButton의 선택 유무
 * @param onCheckedChange RadioButton의 선택 상태가 변경될 때 호출되는 함수
 * @param modifier RadioButton에 대한 선택적 Modifier
 * @param sizeType RadioButton의 크기에 따른 텍스트의 타이포, 아이콘 사이즈 설정. 기본값은 Medium
 * @param text RadioButton 옆에 표시되는 텍스트
 * @param enabled RadioButton의 활성화 유무
 * @param contentColor RadioButton의 아이콘 색상
 */
@Composable
fun RadioButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    sizeType: RadioButtonSize = RadioButtonSize.Medium,
    text: String = "",
    enabled: Boolean = true,
    contentColor: Color = HandyTheme.colors.buttonRadioSelected
) {
    val icon = when {
        checked -> R.drawable.ic_radiobutton_selected
        !enabled -> R.drawable.ic_radiobutton_disabled
        else -> R.drawable.ic_radiobutton_unselected
    }

    val iconColor = when {
        checked -> contentColor
        !enabled -> HandyTheme.colors.buttonRadioUnselected
        else -> HandyTheme.colors.buttonRadioUnselected
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
                    color = if (enabled) Color.Unspecified else ColorGray300
                )
            }
        }
    }
}
