package com.yourssu.handy.compose.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Cancel

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


@Preview
@Composable
fun TextFieldPreview() {
    HandyTheme {
        Column(
            modifier = Modifier.wrapContentSize().padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            val (text, onValueChange) = remember { androidx.compose.runtime.mutableStateOf("") }
            TextField(
                value = text,
                textLabel = "Label",
                helperText = "Helper Text",
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                onValueChange = onValueChange
            )

            TextField(
                value = text,
                textLabel = "Label",
                helperText = "Helper Text",
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                isError = true,
                onValueChange = onValueChange
            )

            TextField(
                value = text,
                textLabel = "Label",
                helperText = "Helper Text",
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                enabled = false,
                onValueChange = onValueChange
            )
        }
    }
}