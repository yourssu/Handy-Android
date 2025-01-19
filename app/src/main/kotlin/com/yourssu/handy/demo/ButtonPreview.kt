package com.yourssu.handy.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.button.FilledButton
import com.yourssu.handy.compose.button.FilledButtonSize
import com.yourssu.handy.compose.button.FilledButtonType
import com.yourssu.handy.compose.button.TextButton
import com.yourssu.handy.compose.button.TextButtonSize
import com.yourssu.handy.compose.button.TextButtonType
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.Add
import com.yourssu.handy.compose.icons.line.ExternalLink

@Preview
@Composable
private fun FilledButtonPreview() {
    HandyTheme {
        Column(
            modifier = Modifier.background(White),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    FilledButton(
                        onClick = {},
                        text = "isDisabled",
                        enabled = false,
                        sizeType = FilledButtonSize.XL,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XL Button",
                        sizeType = FilledButtonSize.XL,
                    )

                    FilledButton(
                        onClick = {},
                        text = "L Button",
                        sizeType = FilledButtonSize.L,
                    )

                    FilledButton(
                        onClick = {},
                        text = "M Button",
                        sizeType = FilledButtonSize.M,
                    )

                    FilledButton(
                        onClick = {},
                        text = "S Button",
                        sizeType = FilledButtonSize.S,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XS Button",
                        sizeType = FilledButtonSize.XS,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XXS Button",
                        sizeType = FilledButtonSize.XXS,
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)

                ) {
                    FilledButton(
                        onClick = {},
                        buttonType = FilledButtonType.Secondary,
                        text = "isDisabled",
                        enabled = false,
                        sizeType = FilledButtonSize.XL,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XL Button",
                        buttonType = FilledButtonType.Secondary,
                        sizeType = FilledButtonSize.XL,
                    )

                    FilledButton(
                        onClick = {},
                        text = "L Button",
                        buttonType = FilledButtonType.Secondary,
                        sizeType = FilledButtonSize.L,
                    )

                    FilledButton(
                        onClick = {},
                        text = "M Button",
                        buttonType = FilledButtonType.Secondary,
                        sizeType = FilledButtonSize.M,
                    )

                    FilledButton(
                        onClick = {},
                        text = "S Button",
                        buttonType = FilledButtonType.Secondary,
                        sizeType = FilledButtonSize.S,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XS Button",
                        buttonType = FilledButtonType.Secondary,
                        sizeType = FilledButtonSize.XS,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XXS Button",
                        buttonType = FilledButtonType.Secondary,
                        sizeType = FilledButtonSize.XXS,
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    FilledButton(
                        onClick = {},
                        buttonType = FilledButtonType.Outlined,
                        text = "isDisabled",
                        enabled = false,
                        sizeType = FilledButtonSize.XL,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XL Button",
                        buttonType = FilledButtonType.Outlined,
                        sizeType = FilledButtonSize.XL,
                    )

                    FilledButton(
                        onClick = {},
                        text = "L Button",
                        buttonType = FilledButtonType.Outlined,
                        sizeType = FilledButtonSize.L,
                    )

                    FilledButton(
                        onClick = {},
                        text = "M Button",
                        buttonType = FilledButtonType.Outlined,
                        sizeType = FilledButtonSize.M,
                    )

                    FilledButton(
                        onClick = {},
                        text = "S Button",
                        buttonType = FilledButtonType.Outlined,
                        sizeType = FilledButtonSize.S,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XS Button",
                        buttonType = FilledButtonType.Outlined,
                        sizeType = FilledButtonSize.XS,
                    )

                    FilledButton(
                        onClick = {},
                        text = "XXS Button",
                        buttonType = FilledButtonType.Outlined,
                        sizeType = FilledButtonSize.XXS,
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                    enabled = false,
                )

                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    rightIcon = HandyIcons.Line.Add,
                    enabled = false,
                )
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                    enabled = false,
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                )

                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    rightIcon = HandyIcons.Line.Add,
                )
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    buttonType = FilledButtonType.Secondary,
                    leftIcon = HandyIcons.Line.Add,
                )

                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    buttonType = FilledButtonType.Secondary,
                    rightIcon = HandyIcons.Line.Add,
                )
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    buttonType = FilledButtonType.Secondary,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ){
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    buttonType = FilledButtonType.Outlined,
                    leftIcon = HandyIcons.Line.Add,
                )

                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    buttonType = FilledButtonType.Outlined,
                    rightIcon = HandyIcons.Line.Add,
                )
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.S,
                    buttonType = FilledButtonType.Outlined,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                FilledButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = FilledButtonSize.M,
                    leftIcon = HandyIcons.Line.Add,
                    horizontalPadding = 100.dp
                )
            }
        }
    }
}

@Composable
@Preview
fun TextButtonPreview() {
    HandyTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)

                ) {
                    TextButton(
                        onClick = {},
                        text = "L Button",
                        enabled = false,
                        sizeType = TextButtonSize.L,
                        buttonType = TextButtonType.Primary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                    TextButton(
                        onClick = {},
                        text = "L Button",
                        sizeType = TextButtonSize.L,
                        buttonType = TextButtonType.Primary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                    TextButton(
                        onClick = {},
                        text = "M Button",
                        sizeType = TextButtonSize.M,
                        buttonType = TextButtonType.Primary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                    TextButton(
                        onClick = {},
                        text = "S Button",
                        sizeType = TextButtonSize.S,
                        buttonType = TextButtonType.Primary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    TextButton(
                        onClick = {},
                        text = "L Button",
                        enabled = false,
                        sizeType = TextButtonSize.L,
                        buttonType = TextButtonType.Secondary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                    TextButton(
                        onClick = {},
                        text = "L Button",
                        sizeType = TextButtonSize.L,
                        buttonType = TextButtonType.Secondary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                    TextButton(
                        onClick = {},
                        text = "M Button",
                        sizeType = TextButtonSize.M,
                        buttonType = TextButtonType.Secondary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                    TextButton(
                        onClick = {},
                        text = "S Button",
                        sizeType = TextButtonSize.S,
                        buttonType = TextButtonType.Secondary,
                        leftIcon = HandyIcons.Line.ExternalLink,
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ){
                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Primary,
                )

                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Primary,
                    leftIcon = HandyIcons.Line.ExternalLink,
                )

                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Primary,
                    rightIcon = HandyIcons.Line.ExternalLink,
                )

                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Primary,
                    leftIcon = HandyIcons.Line.ExternalLink,
                    rightIcon = HandyIcons.Line.ExternalLink,
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Secondary,
                )

                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Secondary,
                    leftIcon = HandyIcons.Line.ExternalLink,
                )

                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Secondary,
                    rightIcon = HandyIcons.Line.ExternalLink,
                )

                TextButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = TextButtonSize.M,
                    buttonType = TextButtonType.Secondary,
                    leftIcon = HandyIcons.Line.ExternalLink,
                    rightIcon = HandyIcons.Line.ExternalLink,
                )
            }
        }
    }
}
