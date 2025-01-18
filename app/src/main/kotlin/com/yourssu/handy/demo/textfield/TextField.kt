package com.yourssu.handy.demo.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.foundation.HandyTypography
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Cancel
import com.yourssu.handy.compose.Text as Text1

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
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState().value

    val borderColor = when {
        !enabled -> HandyTheme.colors.bgBasicLight
        isError -> HandyTheme.colors.lineStatusNegative
        isFocused -> HandyTheme.colors.lineStatusPositive
        else -> HandyTheme.colors.bgBasicLight
    }

    val cursorColor = when {
        isError && isFocused -> HandyTheme.colors.lineStatusNegative
        isFocused -> HandyTheme.colors.lineStatusPositive
        else -> HandyTheme.colors.textBasicPrimary
    }

    val textColor = when {
        !enabled -> HandyTheme.colors.textBasicDisabled
        else -> HandyTheme.colors.textBasicPrimary
    }

    val placeholderTextColor = when {
        !enabled -> HandyTheme.colors.textBasicDisabled
        else -> HandyTheme.colors.textBasicTertiary
    }

    val helperTextColor =
        if (isError) HandyTheme.colors.lineStatusNegative else HandyTheme.colors.textBasicTertiary

    Column(
        modifier = modifier
    ) {
        textLabel?.let {
            Text1(
                text = it,
                style = HandyTypography.B5Rg12,
                color = HandyTheme.colors.textBasicTertiary,
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier
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
                        Text1(
                            text = placeholder,
                            style = HandyTypography.B1Rg16,
                            color = placeholderTextColor
                        )
                    }
                    innerTextField()
                }
            )

            Spacer(modifier = Modifier.width(12.dp))

            trailingIcon?.let {
                Icon(
                    imageVector = trailingIcon,
                    contentDescription = null,
                    tint = HandyTheme.colors.iconBasicTertiary,
                )
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        helperText?.let {
            Text1(
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
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
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