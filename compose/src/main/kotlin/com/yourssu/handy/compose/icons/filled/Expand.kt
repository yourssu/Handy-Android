package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Expandfilled, null)
}

private var _Expandfilled: ImageVector? = null

public val Expandfilled: ImageVector
    get() {
        if (_Expandfilled != null) {
            return _Expandfilled!!
        }
        _Expandfilled = ImageVector.Builder(
            name = "Expandfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(8.5f, 20f)
                horizontalLineTo(5f)
                curveTo(4.4477f, 20f, 4f, 19.5523f, 4f, 19f)
                verticalLineTo(15.5f)
                curveTo(4f, 14.9477f, 3.5523f, 14.5f, 3f, 14.5f)
                curveTo(2.4477f, 14.5f, 2f, 14.9477f, 2f, 15.5f)
                verticalLineTo(19f)
                curveTo(2f, 20.6569f, 3.3432f, 22f, 5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(9.0523f, 22f, 9.5f, 21.5523f, 9.5f, 21f)
                curveTo(9.5f, 20.4477f, 9.0523f, 20f, 8.5f, 20f)
                close()
            }
            handyPath {
                moveTo(21f, 14.5f)
                curveTo(20.4477f, 14.5f, 20f, 14.9477f, 20f, 15.5f)
                verticalLineTo(19f)
                curveTo(20f, 19.5523f, 19.5523f, 20f, 19f, 20f)
                horizontalLineTo(15.5f)
                curveTo(14.9477f, 20f, 14.5f, 20.4477f, 14.5f, 21f)
                curveTo(14.5f, 21.5523f, 14.9477f, 22f, 15.5f, 22f)
                horizontalLineTo(19f)
                curveTo(20.6569f, 22f, 22f, 20.6569f, 22f, 19f)
                verticalLineTo(15.5f)
                curveTo(22f, 14.9477f, 21.5523f, 14.5f, 21f, 14.5f)
                close()
            }
            handyPath {
                moveTo(19f, 2f)
                horizontalLineTo(15.5f)
                curveTo(14.9477f, 2f, 14.5f, 2.4477f, 14.5f, 3f)
                curveTo(14.5f, 3.5523f, 14.9477f, 4f, 15.5f, 4f)
                horizontalLineTo(19f)
                curveTo(19.5523f, 4f, 20f, 4.4477f, 20f, 5f)
                verticalLineTo(8.5f)
                curveTo(20f, 9.0523f, 20.4477f, 9.5f, 21f, 9.5f)
                curveTo(21.5523f, 9.5f, 22f, 9.0523f, 22f, 8.5f)
                verticalLineTo(5f)
                curveTo(22f, 3.3432f, 20.6569f, 2f, 19f, 2f)
                close()
            }
            handyPath {
                moveTo(8.5f, 2f)
                horizontalLineTo(5f)
                curveTo(3.3432f, 2f, 2f, 3.3432f, 2f, 5f)
                verticalLineTo(8.5f)
                curveTo(2f, 9.0523f, 2.4477f, 9.5f, 3f, 9.5f)
                curveTo(3.5523f, 9.5f, 4f, 9.0523f, 4f, 8.5f)
                verticalLineTo(5f)
                curveTo(4f, 4.4477f, 4.4477f, 4f, 5f, 4f)
                horizontalLineTo(8.5f)
                curveTo(9.0523f, 4f, 9.5f, 3.5523f, 9.5f, 3f)
                curveTo(9.5f, 2.4477f, 9.0523f, 2f, 8.5f, 2f)
                close()
            }
        }.build()
        return _Expandfilled!!
    }

