package com.yourssu.handy.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.Icon
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Add
import com.yourssu.handy.compose.icons.line.Add

@Composable
fun IconPreview() {
    Row(Modifier.background(Color.White)) {
        Column {
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.XXS)
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.XS)
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.S)
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.M)
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.L)
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.XL)
            Icon(HandyIcons.Filled.Add, iconSize = IconSize.XXL)
        }
        Column {
            Icon(HandyIcons.Line.Add, iconSize = IconSize.XXS)
            Icon(HandyIcons.Line.Add, iconSize = IconSize.XS)
            Icon(HandyIcons.Line.Add, iconSize = IconSize.S)
            Icon(HandyIcons.Line.Add, iconSize = IconSize.M)
            Icon(HandyIcons.Line.Add, iconSize = IconSize.L)
            Icon(HandyIcons.Line.Add, iconSize = IconSize.XL)
            Icon(HandyIcons.Line.Add, iconSize = IconSize.XXL)
        }
    }
}

@Preview
@Composable
private fun Preview() {
    IconPreview()
}