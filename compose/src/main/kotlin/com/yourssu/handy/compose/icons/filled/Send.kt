package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Sendfilled, null)
}

private var _Sendfilled: ImageVector? = null

public val Sendfilled: ImageVector
    get() {
        if (_Sendfilled != null) {
            return _Sendfilled!!
        }
        _Sendfilled = ImageVector.Builder(
            name = "Sendfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12.6911f, 3.29079f)
                lineTo(18.6853f, 9.12079f)
                curveTo(19.0926f, 9.5025f, 19.1063f, 10.1326f, 18.7161f, 10.5308f)
                curveTo(18.5231f, 10.7201f, 18.2603f, 10.8266f, 17.9861f, 10.8266f)
                curveTo(17.712f, 10.8266f, 17.4492f, 10.7201f, 17.2561f, 10.5308f)
                lineTo(12.9893f, 6.41079f)
                verticalLineTo(17.0408f)
                curveTo(12.9893f, 17.5931f, 12.5289f, 18.0408f, 11.9611f, 18.0408f)
                curveTo(11.3933f, 18.0408f, 10.9329f, 17.5931f, 10.9329f, 17.0408f)
                verticalLineTo(6.41079f)
                lineTo(6.69694f, 10.5308f)
                curveTo(6.289f, 10.8706f, 5.6809f, 10.8477f, 5.3011f, 10.4784f)
                curveTo(4.9214f, 10.109f, 4.8979f, 9.5175f, 5.2472f, 9.1208f)
                lineTo(11.2414f, 3.29079f)
                curveTo(11.6424f, 2.9031f, 12.2901f, 2.9031f, 12.6911f, 3.2908f)
                close()
            }
            handyPath {
                moveTo(6.82031f, 19.0408f)
                horizontalLineTo(17.1019f)
                curveTo(17.6697f, 19.0408f, 18.1301f, 19.4885f, 18.1301f, 20.0408f)
                curveTo(18.1301f, 20.5931f, 17.6697f, 21.0408f, 17.1019f, 21.0408f)
                horizontalLineTo(6.82031f)
                curveTo(6.2525f, 21.0408f, 5.7922f, 20.5931f, 5.7922f, 20.0408f)
                curveTo(5.7922f, 19.4885f, 6.2525f, 19.0408f, 6.8203f, 19.0408f)
                close()
            }
        }.build()
        return _Sendfilled!!
    }

