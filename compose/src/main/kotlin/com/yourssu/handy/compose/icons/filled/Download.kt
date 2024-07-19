package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Downloadfilled, null)
}

private var _Downloadfilled: ImageVector? = null

public val Downloadfilled: ImageVector
    get() {
        if (_Downloadfilled != null) {
            return _Downloadfilled!!
        }
        _Downloadfilled = ImageVector.Builder(
            name = "Downloadfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(22.6611f, 13.33f)
                verticalLineTo(17.25f)
                curveTo(22.7058f, 19.3561f, 21.0371f, 21.1008f, 18.9311f, 21.15f)
                lineTo(5.73109f, 21.08f)
                curveTo(3.6235f, 21.0254f, 1.9563f, 19.2778f, 2.0011f, 17.17f)
                verticalLineTo(13.25f)
                curveTo(1.9769f, 12.2368f, 2.3564f, 11.2555f, 3.056f, 10.5222f)
                curveTo(3.7555f, 9.7889f, 4.7179f, 9.3636f, 5.7311f, 9.34f)
                horizontalLineTo(11.4711f)
                verticalLineTo(14.19f)
                lineTo(9.12109f, 11.86f)
                curveTo(8.9596f, 11.6976f, 8.7401f, 11.6062f, 8.5111f, 11.6062f)
                curveTo(8.2821f, 11.6062f, 8.0625f, 11.6976f, 7.9011f, 11.86f)
                curveTo(7.7335f, 12.0186f, 7.6386f, 12.2392f, 7.6386f, 12.47f)
                curveTo(7.6386f, 12.7008f, 7.7335f, 12.9214f, 7.9011f, 13.08f)
                lineTo(11.7211f, 16.9f)
                curveTo(12.0596f, 17.2329f, 12.6025f, 17.2329f, 12.9411f, 16.9f)
                lineTo(16.7611f, 13.08f)
                curveTo(16.9287f, 12.9214f, 17.0236f, 12.7008f, 17.0236f, 12.47f)
                curveTo(17.0236f, 12.2392f, 16.9287f, 12.0186f, 16.7611f, 11.86f)
                curveTo(16.5997f, 11.6976f, 16.3801f, 11.6062f, 16.1511f, 11.6062f)
                curveTo(15.9221f, 11.6062f, 15.7025f, 11.6976f, 15.5411f, 11.86f)
                lineTo(13.1911f, 14.22f)
                verticalLineTo(9.38f)
                horizontalLineTo(18.9311f)
                curveTo(19.9514f, 9.4034f, 20.92f, 9.8342f, 21.6207f, 10.5763f)
                curveTo(22.3214f, 11.3184f, 22.6961f, 12.31f, 22.6611f, 13.33f)
                close()
            }
            handyPath {
                moveTo(13.1911f, 3.86f)
                lineTo(13.1911f, 9.38f)
                horizontalLineTo(11.4711f)
                verticalLineTo(3.86f)
                curveTo(11.4711f, 3.385f, 11.8561f, 3f, 12.3311f, 3f)
                curveTo(12.8061f, 3f, 13.1911f, 3.385f, 13.1911f, 3.86f)
                close()
            }
        }.build()
        return _Downloadfilled!!
    }

