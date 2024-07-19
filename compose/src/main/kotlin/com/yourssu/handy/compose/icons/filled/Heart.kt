package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Heartfilled, null)
}

private var _Heartfilled: ImageVector? = null

public val Heartfilled: ImageVector
    get() {
        if (_Heartfilled != null) {
            return _Heartfilled!!
        }
        _Heartfilled = ImageVector.Builder(
            name = "Heartfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(22.1f, 9.1f)
                curveTo(22f, 5.7f, 19.3f, 3f, 15.9f, 3f)
                curveTo(14.8f, 3f, 13.1f, 3.8f, 12.4f, 5.1f)
                curveTo(12.3f, 5.4f, 11.9f, 5.4f, 11.8f, 5.1f)
                curveTo(11f, 3.9f, 9.4f, 3.1f, 8.2f, 3.1f)
                curveTo(4.9f, 3.1f, 2.1f, 5.8f, 2f, 9.1f)
                verticalLineTo(9.3f)
                curveTo(2f, 11f, 2.7f, 12.6f, 3.9f, 13.8f)
                curveTo(3.9f, 13.8f, 3.9f, 13.8f, 3.9f, 13.9f)
                curveTo(4f, 14f, 8.8f, 18.2f, 11f, 20.1f)
                curveTo(11.6f, 20.6f, 12.5f, 20.6f, 13.1f, 20.1f)
                curveTo(15.3f, 18.2f, 20f, 14f, 20.2f, 13.9f)
                curveTo(20.2f, 13.9f, 20.2f, 13.9f, 20.2f, 13.8f)
                curveTo(21.4f, 12.7f, 22.1f, 11.1f, 22.1f, 9.3f)
                verticalLineTo(9.1f)
                close()
            }
        }.build()
        return _Heartfilled!!
    }

