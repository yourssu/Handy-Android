package com.yourssu.handy.compose.atom

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.Text
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

@Composable
fun CheckBox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    sizeType: CheckBoxSize = CheckBoxSize.Medium,
    text: String = "",
    isDisabled: Boolean = false,
    contentColor: Color = HandyTheme.colors.checkBoxSelected
) {
    val icon = when {
        checked -> CheckCircleSelected
        isDisabled -> CheckCircleSelected
        else -> CheckCircleUnselected
    }

    val iconColor = when {
        checked -> contentColor
        isDisabled -> HandyTheme.colors.checkBoxDisabled
        else -> HandyTheme.colors.lineBasicMedium
    }

    val iconSize = sizeType.iconSize
    val typo = sizeType.typo

    Row(
        modifier = modifier
            .wrapContentWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            iconSize = iconSize,
            tint = iconColor
        )
        if (text.isNotEmpty()) Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = typo
        )
    }
}
