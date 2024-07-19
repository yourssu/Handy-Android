package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Facebookfilled, null)
}

private var _Facebookfilled: ImageVector? = null

public val Facebookfilled: ImageVector
    get() {
        if (_Facebookfilled != null) {
            return _Facebookfilled!!
        }
        _Facebookfilled = ImageVector.Builder(
            name = "Facebookfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(21.8208f, 11.9181f)
                curveTo(21.8205f, 16.9329f, 18.0705f, 21.1554f, 13.0908f, 21.7481f)
                verticalLineTo(15.0481f)
                horizontalLineTo(14.8508f)
                curveTo(15.0975f, 15.0494f, 15.3051f, 14.8635f, 15.3308f, 14.6181f)
                lineTo(15.5208f, 13.1681f)
                curveTo(15.534f, 13.0304f, 15.4907f, 12.8932f, 15.4008f, 12.7881f)
                curveTo(15.3088f, 12.6793f, 15.1733f, 12.617f, 15.0308f, 12.6181f)
                horizontalLineTo(13.0908f)
                verticalLineTo(10.9181f)
                curveTo(13.0908f, 10.3658f, 13.5385f, 9.9181f, 14.0908f, 9.9181f)
                horizontalLineTo(15.0908f)
                curveTo(15.2198f, 9.9208f, 15.3445f, 9.8714f, 15.4367f, 9.7811f)
                curveTo(15.5289f, 9.6908f, 15.5808f, 9.5671f, 15.5808f, 9.4381f)
                verticalLineTo(7.82809f)
                curveTo(15.5776f, 7.5776f, 15.3895f, 7.3681f, 15.1408f, 7.3381f)
                curveTo(15.1408f, 7.3381f, 14.4208f, 7.2781f, 13.5608f, 7.2781f)
                curveTo(11.4208f, 7.2781f, 10.2408f, 8.5481f, 10.2408f, 10.8581f)
                verticalLineTo(12.6181f)
                horizontalLineTo(8.24081f)
                curveTo(7.9702f, 12.6181f, 7.7508f, 12.8375f, 7.7508f, 13.1081f)
                verticalLineTo(14.5581f)
                curveTo(7.7508f, 14.8287f, 7.9702f, 15.0481f, 8.2408f, 15.0481f)
                horizontalLineTo(10.1808f)
                verticalLineTo(21.6681f)
                curveTo(5.0123f, 20.7517f, 1.4548f, 15.9641f, 2.0688f, 10.751f)
                curveTo(2.6829f, 5.5379f, 7.2553f, 1.7079f, 12.4953f, 2.0175f)
                curveTo(17.7353f, 2.3271f, 21.825f, 6.669f, 21.8208f, 11.9181f)
                close()
            }
        }.build()
        return _Facebookfilled!!
    }

