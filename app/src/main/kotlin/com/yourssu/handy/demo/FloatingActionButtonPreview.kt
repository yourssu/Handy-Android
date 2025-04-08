package com.yourssu.handy.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.FloatingActionButton
import com.yourssu.handy.compose.FloatingActionButtonSize
import com.yourssu.handy.compose.FloatingActionButtonType
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.ArrowsChevronUp
import com.yourssu.handy.compose.icons.line.ExternalLink

@Composable
@Preview
fun FloatingActionButtonPreview() {
    HandyTheme {
        Column(
            modifier = Modifier
                .background(Color.White)
                .wrapContentSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ArrowsChevronUp,
                        sizeType = FloatingActionButtonSize.S,
                        floatingActionButtonType = FloatingActionButtonType.Primary
                    )
                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ExternalLink,
                        sizeType = FloatingActionButtonSize.S,
                        floatingActionButtonType = FloatingActionButtonType.Primary,
                        enabled = false
                    )
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ExternalLink,
                        sizeType = FloatingActionButtonSize.S,
                        floatingActionButtonType = FloatingActionButtonType.Secondary,
                    )

                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ExternalLink,
                        sizeType = FloatingActionButtonSize.S,
                        floatingActionButtonType = FloatingActionButtonType.Secondary,
                        enabled = false
                    )
                }
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ExternalLink,
                        sizeType = FloatingActionButtonSize.L,
                        floatingActionButtonType = FloatingActionButtonType.Primary
                    )

                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ExternalLink,
                        sizeType = FloatingActionButtonSize.L,
                        floatingActionButtonType = FloatingActionButtonType.Primary,
                        enabled = false
                    )
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ExternalLink,
                        sizeType = FloatingActionButtonSize.L,
                        floatingActionButtonType = FloatingActionButtonType.Secondary,
                    )

                    FloatingActionButton(
                        onClick = {},
                        icon = HandyIcons.Line.ExternalLink,
                        sizeType = FloatingActionButtonSize.L,
                        floatingActionButtonType = FloatingActionButtonType.Secondary,
                        enabled = false
                    )
                }
            }
        }
    }
}