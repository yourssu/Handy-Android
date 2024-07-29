package com.yourssu.handy.compose.states

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.foundation.HandyTextStyle

@Immutable
data class ButtonSizeState(
    val typo: HandyTextStyle = HandyTextStyle.Default,
    val iconSize: IconSize = IconSize.S,
    val betweenSpace: Dp = 0.dp
)