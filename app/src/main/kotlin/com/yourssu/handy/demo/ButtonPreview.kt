package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.button.BoxButton
import com.yourssu.handy.compose.button.BoxButtonType
import com.yourssu.handy.compose.button.ButtonSize
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.Add


@Preview
@Composable
private fun BoxButtonPreview() {
    HandyTheme {
        Column {
            Row {
                Column {
                    BoxButton(
                        onClick = {},
                        text = "XL Button",
                        sizeType = ButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "L Button",
                        sizeType = ButtonSize.L,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "M Button",
                        sizeType = ButtonSize.M,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "S Button",
                        sizeType = ButtonSize.S,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XS Button",
                        sizeType = ButtonSize.XS,
                    )

                    // XXS
                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XXS Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = ButtonSize.XXS,
                    )
                }
                Column {
                    BoxButton(
                        onClick = {},
                        text = "XL Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = ButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "L Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = ButtonSize.L,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "M Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = ButtonSize.M,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "S Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = ButtonSize.S,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XS Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = ButtonSize.XS,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XXS Button",
                        buttonType = BoxButtonType.Secondary,
                        sizeType = ButtonSize.XXS,
                    )
                }
                Column {
                    BoxButton(
                        onClick = {},
                        text = "XL Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = ButtonSize.XL,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "L Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = ButtonSize.L,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "M Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = ButtonSize.M,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "S Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = ButtonSize.S,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XS Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = ButtonSize.XS,
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    BoxButton(
                        onClick = {},
                        text = "XXS Button",
                        buttonType = BoxButtonType.Tertiary,
                        sizeType = ButtonSize.XXS,
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                )

                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
                    rightIcon = HandyIcons.Line.Add,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
                    leftIcon = HandyIcons.Line.Add,
                    rightIcon = HandyIcons.Line.Add,
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
                    buttonType = BoxButtonType.Secondary,
                    leftIcon = HandyIcons.Line.Add,
                )

                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
                    buttonType = BoxButtonType.Secondary,
                    rightIcon = HandyIcons.Line.Add,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
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
                    sizeType = ButtonSize.S,
                    buttonType = BoxButtonType.Tertiary,
                    leftIcon = HandyIcons.Line.Add,
                )

                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
                    buttonType = BoxButtonType.Tertiary,
                    rightIcon = HandyIcons.Line.Add,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BoxButton(
                    onClick = {},
                    text = "M Button",
                    sizeType = ButtonSize.S,
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
                    sizeType = ButtonSize.M,
                    leftIcon = HandyIcons.Line.Add,
                    horizontalPadding = 100.dp
                )
            }
        }
    }
}
