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
    enabled: Boolean = true,
) {
    val icon = when {
        checked -> R.drawable.ic_checkcircle_filled
        !enabled -> R.drawable.ic_checkcircle_disabled
        else -> R.drawable.ic_checkcircle_line
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
                tint = Color.Unspecified,
                iconSize = iconSize,
            )
            if (text.isNotEmpty()) Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = text,
                style = typo
            )
        }
    }
}
