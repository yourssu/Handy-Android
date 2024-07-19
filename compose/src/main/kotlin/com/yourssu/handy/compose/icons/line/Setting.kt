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
    Image(Settingline, null)
}

private var _Settingline: ImageVector? = null

public val Settingline: ImageVector
    get() {
        if (_Settingline != null) {
            return _Settingline!!
        }
        _Settingline = ImageVector.Builder(
            name = "Settingline",
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
                moveTo(19.2264f, 8.73077f)
                curveTo(19.4169f, 9.1949f, 19.8683f, 9.4985f, 20.37f, 9.5f)
                curveTo(21.0509f, 9.5055f, 21.6f, 10.0591f, 21.6f, 10.74f)
                verticalLineTo(12.88f)
                curveTo(21.6f, 13.5648f, 21.0448f, 14.12f, 20.36f, 14.12f)
                curveTo(19.8583f, 14.1215f, 19.4069f, 14.4251f, 19.2164f, 14.8892f)
                curveTo(19.026f, 15.3534f, 19.134f, 15.8865f, 19.49f, 16.24f)
                curveTo(19.9676f, 16.7295f, 19.9676f, 17.5105f, 19.49f, 18f)
                lineTo(17.99f, 19.5f)
                curveTo(17.5005f, 19.9776f, 16.7194f, 19.9776f, 16.23f, 19.5f)
                curveTo(16.0042f, 19.2608f, 15.6889f, 19.1267f, 15.36f, 19.13f)
                curveTo(15.0294f, 19.1273f, 14.7114f, 19.2568f, 14.4767f, 19.4896f)
                curveTo(14.242f, 19.7225f, 14.11f, 20.0394f, 14.11f, 20.37f)
                curveTo(14.11f, 21.0548f, 13.5548f, 21.61f, 12.87f, 21.61f)
                horizontalLineTo(10.73f)
                curveTo(10.0452f, 21.61f, 9.49f, 21.0548f, 9.49f, 20.37f)
                curveTo(9.49f, 20.0394f, 9.358f, 19.7225f, 9.1233f, 19.4896f)
                curveTo(8.8886f, 19.2568f, 8.5706f, 19.1273f, 8.24f, 19.13f)
                curveTo(7.9111f, 19.1267f, 7.5958f, 19.2608f, 7.37f, 19.5f)
                curveTo(6.8806f, 19.9776f, 6.0995f, 19.9776f, 5.61f, 19.5f)
                lineTo(4.11f, 18f)
                curveTo(3.6324f, 17.5105f, 3.6324f, 16.7295f, 4.11f, 16.24f)
                curveTo(4.4661f, 15.8865f, 4.574f, 15.3534f, 4.3835f, 14.8892f)
                curveTo(4.1931f, 14.4251f, 3.7417f, 14.1215f, 3.24f, 14.12f)
                curveTo(2.9111f, 14.12f, 2.5957f, 13.9894f, 2.3632f, 13.7568f)
                curveTo(2.1306f, 13.5243f, 2f, 13.2089f, 2f, 12.88f)
                verticalLineTo(10.74f)
                curveTo(2f, 10.0552f, 2.5552f, 9.5f, 3.24f, 9.5f)
                curveTo(3.7417f, 9.4985f, 4.1931f, 9.1949f, 4.3835f, 8.7308f)
                curveTo(4.574f, 8.2666f, 4.4661f, 7.7335f, 4.11f, 7.38f)
                curveTo(3.6324f, 6.8906f, 3.6324f, 6.1094f, 4.11f, 5.62f)
                lineTo(5.61f, 4.12f)
                curveTo(6.0995f, 3.6424f, 6.8806f, 3.6424f, 7.37f, 4.12f)
                curveTo(7.5958f, 4.3592f, 7.9111f, 4.4933f, 8.24f, 4.49f)
                curveTo(8.5723f, 4.4927f, 8.8918f, 4.3619f, 9.1268f, 4.1269f)
                curveTo(9.3619f, 3.8918f, 9.4927f, 3.5723f, 9.49f, 3.24f)
                curveTo(9.49f, 2.5552f, 10.0452f, 2f, 10.73f, 2f)
                horizontalLineTo(12.88f)
                curveTo(13.5648f, 2f, 14.12f, 2.5552f, 14.12f, 3.24f)
                curveTo(14.1173f, 3.5723f, 14.2481f, 3.8918f, 14.4831f, 4.1269f)
                curveTo(14.7182f, 4.3619f, 15.0377f, 4.4927f, 15.37f, 4.49f)
                curveTo(15.6989f, 4.4933f, 16.0142f, 4.3592f, 16.24f, 4.12f)
                curveTo(16.7294f, 3.6424f, 17.5105f, 3.6424f, 18f, 4.12f)
                lineTo(19.5f, 5.62f)
                curveTo(19.9776f, 6.1094f, 19.9776f, 6.8906f, 19.5f, 7.38f)
                curveTo(19.144f, 7.7335f, 19.036f, 8.2666f, 19.2264f, 8.7308f)
                close()
                moveTo(17.8f, 14.31f)
                curveTo(18.1904f, 13.3582f, 19.0843f, 12.7081f, 20.11f, 12.63f)
                lineTo(20.08f, 10.99f)
                curveTo(19.0654f, 10.901f, 18.1855f, 10.2527f, 17.8f, 9.31f)
                curveTo(17.4224f, 8.3651f, 17.5953f, 7.289f, 18.25f, 6.51f)
                lineTo(17.1f, 5.36f)
                curveTo(16.6123f, 5.7684f, 15.9961f, 5.9915f, 15.36f, 5.99f)
                curveTo(13.9429f, 5.9865f, 12.7586f, 4.9104f, 12.62f, 3.5f)
                horizontalLineTo(10.98f)
                curveTo(10.8458f, 4.9126f, 9.659f, 5.9912f, 8.24f, 5.99f)
                curveTo(7.6039f, 5.9915f, 6.9877f, 5.7684f, 6.5f, 5.36f)
                lineTo(5.38f, 6.51f)
                curveTo(6.0245f, 7.295f, 6.1859f, 8.3705f, 5.8f, 9.31f)
                curveTo(5.4145f, 10.2527f, 4.5346f, 10.901f, 3.52f, 10.99f)
                verticalLineTo(12.63f)
                curveTo(4.5346f, 12.719f, 5.4145f, 13.3673f, 5.8f, 14.31f)
                curveTo(6.1776f, 15.2549f, 6.0047f, 16.331f, 5.35f, 17.11f)
                lineTo(6.5f, 18.26f)
                curveTo(6.9877f, 17.8516f, 7.6039f, 17.6285f, 8.24f, 17.63f)
                curveTo(9.6571f, 17.6335f, 10.8414f, 18.7096f, 10.98f, 20.12f)
                horizontalLineTo(12.62f)
                curveTo(12.745f, 18.7029f, 13.9374f, 17.6193f, 15.36f, 17.63f)
                curveTo(15.9961f, 17.6285f, 16.6123f, 17.8516f, 17.1f, 18.26f)
                lineTo(18.22f, 17.11f)
                curveTo(17.5755f, 16.325f, 17.4141f, 15.2495f, 17.8f, 14.31f)
                close()
            }
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
                moveTo(8.34f, 11.81f)
                curveTo(8.34f, 9.8991f, 9.8891f, 8.35f, 11.8f, 8.35f)
                curveTo(12.7176f, 8.35f, 13.5977f, 8.7145f, 14.2466f, 9.3634f)
                curveTo(14.8955f, 10.0123f, 15.26f, 10.8924f, 15.26f, 11.81f)
                curveTo(15.26f, 13.7209f, 13.7109f, 15.27f, 11.8f, 15.27f)
                curveTo(9.8891f, 15.27f, 8.34f, 13.7209f, 8.34f, 11.81f)
                close()
                moveTo(9.8f, 11.81f)
                curveTo(9.8f, 12.9146f, 10.6954f, 13.81f, 11.8f, 13.81f)
                curveTo(12.9046f, 13.81f, 13.8f, 12.9146f, 13.8f, 11.81f)
                curveTo(13.8f, 10.7054f, 12.9046f, 9.81f, 11.8f, 9.81f)
                curveTo(10.6954f, 9.81f, 9.8f, 10.7054f, 9.8f, 11.81f)
                close()
            }
        }.build()
        return _Settingline!!
    }

