package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Figmafilled, null)
}

private var _Figmafilled: ImageVector? = null

public val Figmafilled: ImageVector
    get() {
        if (_Figmafilled != null) {
            return _Figmafilled!!
        }
        _Figmafilled = ImageVector.Builder(
            name = "Figmafilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(15f, 9f)
                curveTo(13.4182f, 8.9965f, 12.1054f, 10.2217f, 12f, 11.8f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                curveTo(16.6569f, 9f, 18f, 7.6569f, 18f, 6f)
                curveTo(18f, 4.3431f, 16.6569f, 3f, 15f, 3f)
                horizontalLineTo(9f)
                curveTo(7.3431f, 3f, 6f, 4.3431f, 6f, 6f)
                curveTo(6f, 7.6569f, 7.3431f, 9f, 9f, 9f)
                curveTo(7.3431f, 9f, 6f, 10.3431f, 6f, 12f)
                curveTo(6f, 13.6569f, 7.3431f, 15f, 9f, 15f)
                curveTo(7.3431f, 15f, 6f, 16.3431f, 6f, 18f)
                curveTo(6f, 19.6569f, 7.3431f, 21f, 9f, 21f)
                curveTo(10.6569f, 21f, 12f, 19.6569f, 12f, 18f)
                verticalLineTo(12.2f)
                curveTo(12.1087f, 13.8264f, 13.4961f, 15.0684f, 15.1245f, 14.9971f)
                curveTo(16.7529f, 14.9259f, 18.0265f, 13.5674f, 17.9927f, 11.9377f)
                curveTo(17.9588f, 10.3081f, 16.63f, 9.0036f, 15f, 9f)
                close()
            }
        }.build()
        return _Figmafilled!!
    }

