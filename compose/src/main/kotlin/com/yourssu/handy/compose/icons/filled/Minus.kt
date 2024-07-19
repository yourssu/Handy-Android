package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Minusfilled, null)
}

private var _Minusfilled: ImageVector? = null

public val Minusfilled: ImageVector
    get() {
        if (_Minusfilled != null) {
            return _Minusfilled!!
        }
        _Minusfilled = ImageVector.Builder(
            name = "Minusfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.5f, 11f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 11f, 3f, 11.6716f, 3f, 12.5f)
                curveTo(3f, 13.3284f, 3.6716f, 14f, 4.5f, 14f)
                horizontalLineTo(20.5f)
                curveTo(21.3284f, 14f, 22f, 13.3284f, 22f, 12.5f)
                curveTo(22f, 11.6716f, 21.3284f, 11f, 20.5f, 11f)
                close()
            }
        }.build()
        return _Minusfilled!!
    }

