import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Playline, null)
}

private var _Playline: ImageVector? = null

public val Playline: ImageVector
    get() {
        if (_Playline != null) {
            return _Playline!!
        }
        _Playline = ImageVector.Builder(
            name = "Playline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.1104f, 5.50996f)
                lineTo(17.3604f, 9.69996f)
                curveTo(18.2856f, 10.2367f, 18.855f, 11.2254f, 18.855f, 12.295f)
                curveTo(18.855f, 13.3646f, 18.2856f, 14.3533f, 17.3604f, 14.89f)
                lineTo(10.1104f, 19.08f)
                curveTo(9.1819f, 19.616f, 8.0379f, 19.6158f, 7.1095f, 19.0795f)
                curveTo(6.1812f, 18.5431f, 5.6097f, 17.5521f, 5.6104f, 16.48f)
                verticalLineTo(8.10996f)
                curveTo(5.6097f, 7.0378f, 6.1812f, 6.0468f, 7.1095f, 5.5104f)
                curveTo(8.0379f, 4.9741f, 9.1819f, 4.9739f, 10.1104f, 5.51f)
                close()
                moveTo(9.21036f, 17.52f)
                lineTo(16.4604f, 13.34f)
                curveTo(16.8334f, 13.127f, 17.0627f, 12.7295f, 17.0604f, 12.3f)
                curveTo(17.0642f, 11.8674f, 16.835f, 11.4662f, 16.4604f, 11.25f)
                lineTo(9.21036f, 7.06996f)
                curveTo(9.029f, 6.961f, 8.8219f, 6.9023f, 8.6104f, 6.9f)
                curveTo(7.9421f, 6.9f, 7.4004f, 7.4417f, 7.4004f, 8.11f)
                verticalLineTo(16.48f)
                curveTo(7.4004f, 16.8009f, 7.5278f, 17.1086f, 7.7548f, 17.3356f)
                curveTo(7.9817f, 17.5625f, 8.2894f, 17.69f, 8.6104f, 17.69f)
                curveTo(8.8219f, 17.6876f, 9.029f, 17.629f, 9.2104f, 17.52f)
                close()
            }
        }.build()
        return _Playline!!
    }

