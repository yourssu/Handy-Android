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
    Image(Inboxline, null)
}

private var _Inboxline: ImageVector? = null

public val Inboxline: ImageVector
    get() {
        if (_Inboxline != null) {
            return _Inboxline!!
        }
        _Inboxline = ImageVector.Builder(
            name = "Inboxline",
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
                moveTo(21.2334f, 5.29f)
                curveTo(21.0342f, 4.0303f, 19.9865f, 3.0781f, 18.7134f, 3f)
                horizontalLineTo(5.40345f)
                curveTo(4.1304f, 3.0781f, 3.0827f, 4.0303f, 2.8834f, 5.29f)
                lineTo(2.01345f, 17.01f)
                curveTo(1.8335f, 19.45f, 3.4834f, 21.54f, 5.5735f, 21.54f)
                horizontalLineTo(18.3634f)
                curveTo(20.4234f, 21.54f, 22.0534f, 19.54f, 21.9134f, 17.1f)
                lineTo(21.2334f, 5.29f)
                close()
                moveTo(5.40345f, 4.54f)
                horizontalLineTo(18.7134f)
                curveTo(19.2257f, 4.6264f, 19.627f, 5.0278f, 19.7134f, 5.54f)
                lineTo(20.1334f, 12.7f)
                horizontalLineTo(16.8634f)
                curveTo(15.5508f, 12.7455f, 14.3719f, 13.516f, 13.8034f, 14.7f)
                curveTo(13.4484f, 15.4133f, 12.7202f, 15.8643f, 11.9234f, 15.8643f)
                curveTo(11.1267f, 15.8643f, 10.3985f, 15.4133f, 10.0434f, 14.7f)
                curveTo(9.4767f, 13.5144f, 8.2968f, 12.7432f, 6.9835f, 12.7f)
                horizontalLineTo(3.84345f)
                lineTo(4.37345f, 5.55f)
                curveTo(4.4626f, 5.0262f, 4.878f, 4.6189f, 5.4035f, 4.54f)
                close()
                moveTo(18.3634f, 20.04f)
                curveTo(18.8606f, 20.026f, 19.3303f, 19.8092f, 19.6634f, 19.44f)
                curveTo(20.1994f, 18.8266f, 20.463f, 18.0216f, 20.3934f, 17.21f)
                lineTo(20.2234f, 14.21f)
                horizontalLineTo(16.8434f)
                curveTo(16.0875f, 14.2614f, 15.4201f, 14.7217f, 15.1034f, 15.41f)
                curveTo(14.4943f, 16.6151f, 13.2588f, 17.375f, 11.9084f, 17.375f)
                curveTo(10.5581f, 17.375f, 9.3226f, 16.6151f, 8.7134f, 15.41f)
                curveTo(8.3933f, 14.7202f, 7.7223f, 14.26f, 6.9634f, 14.21f)
                horizontalLineTo(3.73345f)
                lineTo(3.51345f, 17.12f)
                curveTo(3.4389f, 17.9552f, 3.7059f, 18.785f, 4.2534f, 19.42f)
                curveTo(4.5878f, 19.8016f, 5.0663f, 20.0264f, 5.5735f, 20.04f)
                horizontalLineTo(18.3634f)
                close()
            }
        }.build()
        return _Inboxline!!
    }

