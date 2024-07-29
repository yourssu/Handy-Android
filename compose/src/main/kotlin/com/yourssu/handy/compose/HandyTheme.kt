package com.yourssu.handy.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.yourssu.handy.compose.foundation.ColorScheme
import com.yourssu.handy.compose.foundation.LocalColorScheme
import com.yourssu.handy.compose.foundation.LocalContentColor
import com.yourssu.handy.compose.foundation.darkColorScheme
import com.yourssu.handy.compose.foundation.lightColorScheme

@Composable
fun HandyTheme(
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (isDarkMode) {
        darkColorScheme
    } else {
        lightColorScheme
    }
    CompositionLocalProvider(
        LocalColorScheme provides colors,
        LocalContentColor provides colors.textBasicPrimary,
    ) {
        content()
    }
}

object HandyTheme {
    val colors: ColorScheme
        @Composable
        get() = LocalColorScheme.current
}