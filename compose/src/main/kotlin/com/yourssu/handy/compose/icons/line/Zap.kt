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
    Image(Zapline, null)
}

private var _Zapline: ImageVector? = null

public val Zapline: ImageVector
    get() {
        if (_Zapline != null) {
            return _Zapline!!
        }
        _Zapline = ImageVector.Builder(
            name = "Zapline",
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
                moveTo(10.908f, 5f)
                curveTo(11.2649f, 4.3818f, 11.9242f, 4.0007f, 12.638f, 4f)
                lineTo(12.648f, 4.02f)
                curveTo(13.7525f, 4.02f, 14.648f, 4.9154f, 14.648f, 6.02f)
                verticalLineTo(10.13f)
                horizontalLineTo(16.688f)
                curveTo(17.4268f, 10.1277f, 18.1068f, 10.5329f, 18.4563f, 11.1838f)
                curveTo(18.8058f, 11.8348f, 18.768f, 12.6254f, 18.358f, 13.24f)
                lineTo(13.808f, 20.1f)
                curveTo(13.3177f, 20.8295f, 12.4086f, 21.1535f, 11.5675f, 20.8984f)
                curveTo(10.7264f, 20.6433f, 10.1504f, 19.869f, 10.148f, 18.99f)
                verticalLineTo(16.14f)
                horizontalLineTo(8.00796f)
                curveTo(7.292f, 16.1428f, 6.6292f, 15.7628f, 6.2699f, 15.1435f)
                curveTo(5.9107f, 14.5241f, 5.91f, 13.76f, 6.268f, 13.14f)
                lineTo(10.908f, 5f)
                close()
                moveTo(12.998f, 5.64286f)
                curveTo(12.9021f, 5.5488f, 12.7723f, 5.4973f, 12.638f, 5.5f)
                curveTo(12.4549f, 5.5006f, 12.2881f, 5.6053f, 12.208f, 5.77f)
                lineTo(7.56796f, 13.89f)
                curveTo(7.4831f, 14.0451f, 7.4864f, 14.2335f, 7.5768f, 14.3855f)
                curveTo(7.6672f, 14.5375f, 7.8311f, 14.6305f, 8.008f, 14.63f)
                horizontalLineTo(10.648f)
                curveTo(11.2002f, 14.63f, 11.648f, 15.0777f, 11.648f, 15.63f)
                verticalLineTo(18.98f)
                curveTo(11.6506f, 19.1972f, 11.7932f, 19.3879f, 12.0009f, 19.4518f)
                curveTo(12.2085f, 19.5156f, 12.4336f, 19.4382f, 12.558f, 19.26f)
                lineTo(17.128f, 12.39f)
                curveTo(17.2321f, 12.2359f, 17.2422f, 12.0367f, 17.154f, 11.8729f)
                curveTo(17.0658f, 11.7091f, 16.894f, 11.6079f, 16.708f, 11.61f)
                horizontalLineTo(14.148f)
                curveTo(13.5957f, 11.61f, 13.148f, 11.1623f, 13.148f, 10.61f)
                verticalLineTo(6f)
                curveTo(13.148f, 5.8656f, 13.0939f, 5.7369f, 12.998f, 5.6429f)
                close()
            }
        }.build()
        return _Zapline!!
    }

