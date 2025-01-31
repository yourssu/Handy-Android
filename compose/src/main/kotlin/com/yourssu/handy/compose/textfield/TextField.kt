package com.yourssu.handy.compose.textfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.foundation.HandyTypography
@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textLabel: String? = null,
    helperText: String? = null,
    placeholder: String? = null,
    trailingIcon: ImageVector? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    isSingleLine: Boolean = true,
    onClickTrailingIcon: () -> Unit = {}
) {

    val helperTextColor = when {
        isError -> HandyTheme.colors.lineStatusNegative
        else -> HandyTheme.colors.textBasicTertiary
    }

    Column(
        modifier = modifier
    ) {
        textLabel?.let {
            Text(
                text = it,
                style = HandyTypography.B5Rg12,
                color = HandyTheme.colors.textBasicTertiary,
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = placeholder,
            trailingIcon = trailingIcon,
            enabled = enabled,
            isError = isError,
            isSingleLine = isSingleLine,
            onClickTrailingIcon = onClickTrailingIcon
        )

        Spacer(modifier = Modifier.height(4.dp))

        helperText?.let {
            Text(
                text = it,
                style = HandyTypography.B5Rg12,
                color = helperTextColor,
            )
        }
    }
}