package com.yourssu.handy.compose.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Cancel

@Composable
fun OutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String? = null,
    trailingIcon: ImageVector? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    isSingleLine: Boolean = true,
    onClickTrailingIcon: () -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState().value

    val (borderColor, cursorColor, textColor, placeholderTextColor) = getTextFieldStyle(
        enabled,
        isError,
        isFocused
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(HandyTheme.colors.bgBasicLight)
            .border(1.dp, borderColor, RoundedCornerShape(12.dp))
            .padding(start = 16.dp, end = 12.dp, top = 12.dp, bottom = 12.dp)
    ) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            textStyle = HandyTypography.B1Rg16.toTextStyle().copy(color = textColor),
            enabled = enabled,
            singleLine = isSingleLine,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            interactionSource = interactionSource,
            cursorBrush = SolidColor(cursorColor),
            decorationBox = { innerTextField ->
                if (value.isEmpty() && placeholder != null) {
                    Text(
                        text = placeholder,
                        style = HandyTypography.B1Rg16,
                        color = placeholderTextColor
                    )
                }
                innerTextField()
            }
        )

        trailingIcon?.let {
            Icon(
                imageVector = trailingIcon,
                contentDescription = null,
                tint = HandyTheme.colors.iconBasicTertiary,
                modifier = Modifier
                    .clickable(
                        indication = null,
                        interactionSource = interactionSource,
                        onClick = onClickTrailingIcon
                    )
                    .padding(start = 12.dp)
            )
        }
    }
}

data class TextFieldStyle(
    val borderColor: Color,
    val cursorColor: Color,
    val textColor: Color,
    val placeholderTextColor: Color
)

@Composable
fun getTextFieldStyle(
    enabled: Boolean,
    isError: Boolean,
    isFocused: Boolean
): TextFieldStyle {
    return TextFieldStyle(
        borderColor = when {
            !enabled -> HandyTheme.colors.bgBasicLight
            isError -> HandyTheme.colors.lineStatusNegative
            isFocused -> HandyTheme.colors.lineStatusPositive
            else -> HandyTheme.colors.bgBasicLight
        },
        cursorColor = when {
            isError && isFocused -> HandyTheme.colors.lineStatusNegative
            isFocused -> HandyTheme.colors.lineStatusPositive
            else -> HandyTheme.colors.textBasicPrimary
        },
        textColor = if (!enabled) HandyTheme.colors.textBasicDisabled else HandyTheme.colors.textBasicPrimary,
        placeholderTextColor = if (!enabled) HandyTheme.colors.textBasicDisabled else HandyTheme.colors.textBasicTertiary
    )
}

@Preview
@Composable
fun OutlinedTextFieldPreview() {
    HandyTheme {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            val (text, onValueChange) = remember { androidx.compose.runtime.mutableStateOf("") }
            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                onValueChange = onValueChange,
            )

            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                isError = true,
                onValueChange = onValueChange,
            )

            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                trailingIcon = HandyIcons.Filled.Cancel,
                enabled = false,
                onValueChange = onValueChange,
            )

            OutlinedTextField(
                value = text,
                placeholder = "placeholder",
                enabled = false,
                onValueChange = onValueChange,
            )
        }
    }
}