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
    Image(Bookmarkline, null)
}

private var _Bookmarkline: ImageVector? = null

public val Bookmarkline: ImageVector
    get() {
        if (_Bookmarkline != null) {
            return _Bookmarkline!!
        }
        _Bookmarkline = ImageVector.Builder(
            name = "Bookmarkline",
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
                moveTo(8.37574f, 3.00434f)
                horizontalLineTo(15.6242f)
                curveTo(16.4759f, 2.9608f, 17.3105f, 3.2462f, 17.9438f, 3.7975f)
                curveTo(18.5771f, 4.3488f, 18.9571f, 5.1208f, 19f, 5.943f)
                verticalLineTo(19.9964f)
                curveTo(19.0012f, 20.2778f, 18.8794f, 20.5467f, 18.6645f, 20.737f)
                curveTo(18.4497f, 20.9273f, 18.1617f, 21.0213f, 17.8713f, 20.9959f)
                curveTo(17.6168f, 20.996f, 17.3694f, 20.9152f, 17.1671f, 20.766f)
                lineTo(12.6834f, 17.4776f)
                curveTo(12.26f, 17.1711f, 11.6778f, 17.1711f, 11.2544f, 17.4776f)
                lineTo(6.81213f, 20.766f)
                curveTo(6.6156f, 20.9111f, 6.3761f, 20.9916f, 6.1287f, 20.9959f)
                curveTo(5.8383f, 21.0213f, 5.5503f, 20.9273f, 5.3355f, 20.737f)
                curveTo(5.1206f, 20.5467f, 4.9988f, 20.2778f, 5f, 19.9964f)
                verticalLineTo(5.94297f)
                curveTo(5.0428f, 5.1208f, 5.4229f, 4.3488f, 6.0562f, 3.7975f)
                curveTo(6.6895f, 3.2462f, 7.5241f, 2.9608f, 8.3757f, 3.0043f)
                close()
                moveTo(13.6464f, 16.2881f)
                lineTo(17.426f, 19.0868f)
                lineTo(17.4053f, 5.94297f)
                curveTo(17.3073f, 5.0715f, 16.5087f, 4.4336f, 15.6035f, 4.5036f)
                horizontalLineTo(8.35503f)
                curveTo(7.4498f, 4.4336f, 6.6513f, 5.0715f, 6.5533f, 5.943f)
                verticalLineTo(19.0868f)
                lineTo(10.3328f, 16.2881f)
                curveTo(11.3115f, 15.5683f, 12.6678f, 15.5683f, 13.6464f, 16.2881f)
                close()
            }
        }.build()
        return _Bookmarkline!!
    }

