package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Listfilled, null)
}

private var _Listfilled: ImageVector? = null

public val Listfilled: ImageVector
    get() {
        if (_Listfilled != null) {
            return _Listfilled!!
        }
        _Listfilled = ImageVector.Builder(
            name = "Listfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(15.62f, 11f)
                horizontalLineTo(6f)
                curveTo(5.4477f, 11f, 5f, 10.5523f, 5f, 10f)
                curveTo(5f, 9.4477f, 5.4477f, 9f, 6f, 9f)
                horizontalLineTo(15.62f)
                curveTo(16.1723f, 9f, 16.62f, 9.4477f, 16.62f, 10f)
                curveTo(16.62f, 10.5523f, 16.1723f, 11f, 15.62f, 11f)
                close()
            }
            handyPath {
                moveTo(6f, 14f)
                horizontalLineTo(18.82f)
                curveTo(19.3723f, 14f, 19.82f, 14.4477f, 19.82f, 15f)
                curveTo(19.82f, 15.5523f, 19.3723f, 16f, 18.82f, 16f)
                horizontalLineTo(6f)
                curveTo(5.4477f, 16f, 5f, 15.5523f, 5f, 15f)
                curveTo(5f, 14.4477f, 5.4477f, 14f, 6f, 14f)
                close()
            }
        }.build()
        return _Listfilled!!
    }

