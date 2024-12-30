package com.yourssu.handy.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.Chip
import com.yourssu.handy.compose.ChipSize
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.line.Cancel
import com.yourssu.handy.compose.icons.line.Close
import com.yourssu.handy.compose.icons.line.Crop
import com.yourssu.handy.compose.icons.line.InfoCircle

@Preview
@Composable
fun ChipPreview() {
    HandyTheme {
        Column (
            modifier = Modifier
                .background(White)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Column (
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        checked = false
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        checked = true
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        enabled = false
                    )
                }

                Column (
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        leftIcon = HandyIcons.Line.InfoCircle,
                        rightIcon = HandyIcons.Line.Close,
                        checked = false
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        leftIcon = HandyIcons.Line.InfoCircle,
                        rightIcon = HandyIcons.Line.Close,
                        checked = true
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        leftIcon = HandyIcons.Line.InfoCircle,
                        rightIcon = HandyIcons.Line.Close,
                        enabled = false
                    )
                }
            }

            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Column (
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        sizeType = ChipSize.Small,
                        checked = false
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        sizeType = ChipSize.Small,
                        checked = true
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        sizeType = ChipSize.Small,
                        enabled = false
                    )
                }

                Column (
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        sizeType = ChipSize.Small,
                        leftIcon = HandyIcons.Line.InfoCircle,
                        rightIcon = HandyIcons.Line.Close,
                        checked = false
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        sizeType = ChipSize.Small,
                        leftIcon = HandyIcons.Line.InfoCircle,
                        rightIcon = HandyIcons.Line.Close,
                        checked = true
                    )

                    Chip(
                        onCheckedChange = {},
                        text = "Label",
                        sizeType = ChipSize.Small,
                        leftIcon = HandyIcons.Line.InfoCircle,
                        rightIcon = HandyIcons.Line.Close,
                        enabled = false
                    )
                }
            }
        }
    }
}