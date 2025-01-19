package com.yourssu.handy.demo.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Text
import com.yourssu.handy.compose.foundation.HandyTypography

@Composable
fun TextArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String? = null,
    helperText: String? = null,
    maxCharacters: Int = Int.MAX_VALUE,
    enabled: Boolean = true,
    isError: Boolean = false,
) {
    val textHelperColor = when {
        isError -> HandyTheme.colors.lineStatusNegative
        else -> HandyTheme.colors.textBasicTertiary
    }

    Column(
        modifier = modifier
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = {
                onValueChange(it)
            },
            placeholder = placeholder,
            enabled = enabled,
            isError = isError,
            isSingleLine = false,
            modifier = Modifier
        )

        helperText?.let {
            Text(
                text = it,
                style = HandyTypography.B5Rg12,
                color = textHelperColor,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

@Preview
@Composable
fun TextAreaPreview() {
    HandyTheme {
        Column(
            modifier = Modifier.wrapContentSize().padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            val (text, onValueChange) = remember {
                androidx.compose.runtime.mutableStateOf(
                    "inputText inputText asdaasdas inputText inputText asdaasdas inputText inputText asdaasdas"
                )
            }

            TextArea(
                value = text,
                onValueChange = onValueChange,
                placeholder = "Placeholder",
                helperText = "Helper Text",
                maxCharacters = 20,
                enabled = true,
            )
        }
    }
}
