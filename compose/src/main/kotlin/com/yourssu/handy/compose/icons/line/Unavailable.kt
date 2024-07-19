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
    Image(Unavailableline, null)
}

private var _Unavailableline: ImageVector? = null

public val Unavailableline: ImageVector
    get() {
        if (_Unavailableline != null) {
            return _Unavailableline!!
        }
        _Unavailableline = ImageVector.Builder(
            name = "Unavailableline",
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
                moveTo(12f, 2f)
                curveTo(6.4771f, 2f, 2f, 6.4771f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.4771f, 22f, 12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                curveTo(22f, 9.3478f, 20.9464f, 6.8043f, 19.0711f, 4.9289f)
                curveTo(17.1957f, 3.0536f, 14.6522f, 2f, 12f, 2f)
                close()
                moveTo(3.5f, 12f)
                curveTo(3.4903f, 8.6179f, 5.4912f, 5.5534f, 8.5916f, 4.202f)
                curveTo(11.692f, 2.8506f, 15.299f, 3.4707f, 17.77f, 5.78f)
                lineTo(5.77f, 17.78f)
                curveTo(4.3054f, 16.2124f, 3.4936f, 14.1453f, 3.5f, 12f)
                close()
                moveTo(6.9f, 18.78f)
                curveTo(8.3667f, 19.8945f, 10.1578f, 20.4986f, 12f, 20.5f)
                curveTo(15.2228f, 20.5077f, 18.1714f, 18.6878f, 19.6093f, 15.8035f)
                curveTo(21.0472f, 12.9192f, 20.7259f, 9.4691f, 18.78f, 6.9f)
                lineTo(6.9f, 18.78f)
                close()
            }
        }.build()
        return _Unavailableline!!
    }

