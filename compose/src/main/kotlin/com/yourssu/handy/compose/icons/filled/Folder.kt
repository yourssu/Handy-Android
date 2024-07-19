package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Folderfilled, null)
}

private var _Folderfilled: ImageVector? = null

public val Folderfilled: ImageVector
    get() {
        if (_Folderfilled != null) {
            return _Folderfilled!!
        }
        _Folderfilled = ImageVector.Builder(
            name = "Folderfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(21.9999f, 9.99536f)
                verticalLineTo(18.2457f)
                curveTo(21.9999f, 20.3191f, 20.4583f, 22f, 18.5567f, 22f)
                horizontalLineTo(5.44312f)
                curveTo(3.5415f, 22f, 2f, 20.3191f, 2f, 18.2457f)
                verticalLineTo(5.75435f)
                curveTo(2f, 3.6809f, 3.5415f, 2f, 5.4431f, 2f)
                horizontalLineTo(10.0552f)
                curveTo(11.1292f, 2f, 11.9999f, 2.9494f, 11.9999f, 4.1205f)
                curveTo(12.0173f, 5.278f, 12.8829f, 6.2064f, 13.9447f, 6.2063f)
                horizontalLineTo(18.5567f)
                curveTo(19.4755f, 6.2062f, 20.3561f, 6.6065f, 21.0027f, 7.3181f)
                curveTo(21.6494f, 8.0297f, 22.0084f, 8.9936f, 21.9999f, 9.9954f)
                close()
            }
        }.build()
        return _Folderfilled!!
    }

