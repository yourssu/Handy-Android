package com.yourssu.handy.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.button.BoxButton
import com.yourssu.handy.compose.button.BoxButtonType
import com.yourssu.handy.compose.button.BoxButtonSize
import com.yourssu.handy.compose.button.TextButton
import com.yourssu.handy.compose.button.TextButtonSize
import com.yourssu.handy.compose.button.TextButtonType
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.Add
import com.yourssu.handy.compose.icons.line.ArrowsChevronLeft
import com.yourssu.handy.compose.icons.line.ExternalLink


@Preview
@Composable
private fun BoxButtonPreview() {
    HandyTheme {
        Column(modifier = Modifier.background(White)) {
            Row {
                Column {

                    BoxButton(
                        onClick = {},
                        text = "isDisabled",
                        isDisabled = true,
                        sizeType = BoxButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XL Button",
                        sizeType = BoxButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "L Button",
                        sizeType = BoxButtonSize.L,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "M Button",
                        sizeType = BoxButtonSize.M,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "S Button",
                        sizeType = BoxButtonSize.S,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XS Button",
                        sizeType = BoxButtonSize.XS,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XXS Button",
                        sizeType = BoxButtonSize.XXS,
                    )
                }
                Column {
                    BoxButton(
                        onClick = {},
                        buttonType = BoxButtonType.Secondary,
                        text = "isDisabled",
                        isDisabled = true,
                        sizeType = BoxButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XL Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = BoxButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "L Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = BoxButtonSize.L,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "M Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = BoxButtonSize.M,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "S Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = BoxButtonSize.S,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XS Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = BoxButtonSize.XS,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XXS Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = BoxButtonSize.XXS,
                    )
                }
                Column {
                    BoxButton(
                        onClick = {},
                        buttonType = BoxButtonType.Tertiary,
                        text = "isDisabled",
                        isDisabled = true,
                        sizeType = BoxButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XL Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = BoxButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "L Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = BoxButtonSize.L,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "M Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = BoxButtonSize.M,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "S Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = BoxButtonSize.S,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XS Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = BoxButtonSize.XS,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XXS Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = BoxButtonSize.XXS,
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                )

                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    rightIcon = HandyIcons.Line.Add,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    buttonType = BoxButtonType.Secondary,
                    leftIcon = HandyIcons.Line.Add,
                )

                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    buttonType = BoxButtonType.Secondary,
                    rightIcon = HandyIcons.Line.Add,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    buttonType = BoxButtonType.Secondary,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    buttonType = BoxButtonType.Tertiary,
                    leftIcon = HandyIcons.Line.Add,
                )

                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    buttonType = BoxButtonType.Tertiary,
                    rightIcon = HandyIcons.Line.Add,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.S,
                    buttonType = BoxButtonType.Tertiary,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = BoxButtonSize.M,
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
        Column {
            Row {
                Column {
                    TextButton(
                        onClick = {},
                        text = "L Button",
                        isDisabled = true,
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
                Column {
                    TextButton(
                        onClick = {},
                        text = "L Button",
                        isDisabled = true,
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
            Spacer(modifier = Modifier.height(20.dp))
            Row {
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
            Row {
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
