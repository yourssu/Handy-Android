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
    Image(Flagline, null)
}

private var _Flagline: ImageVector? = null

public val Flagline: ImageVector
    get() {
        if (_Flagline != null) {
            return _Flagline!!
        }
        _Flagline = ImageVector.Builder(
            name = "Flagline",
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
                moveTo(5f, 3.77f)
                curveTo(5.0054f, 3.358f, 5.338f, 3.0254f, 5.75f, 3.02f)
                lineTo(5.74f, 3f)
                curveTo(6.1542f, 3f, 6.49f, 3.3358f, 6.49f, 3.75f)
                verticalLineTo(4.07f)
                horizontalLineTo(12.75f)
                curveTo(13.6581f, 4.0188f, 14.4363f, 4.7121f, 14.49f, 5.62f)
                verticalLineTo(5.7f)
                curveTo(14.5437f, 6.6079f, 15.3219f, 7.3012f, 16.23f, 7.25f)
                horizontalLineTo(17.14f)
                curveTo(18.0427f, 7.1983f, 18.8207f, 7.8785f, 18.89f, 8.78f)
                verticalLineTo(14.08f)
                curveTo(18.8363f, 14.9879f, 18.0581f, 15.6812f, 17.15f, 15.63f)
                horizontalLineTo(11.15f)
                curveTo(10.2419f, 15.6812f, 9.4637f, 14.9879f, 9.41f, 14.08f)
                verticalLineTo(14.02f)
                curveTo(9.3563f, 13.1121f, 8.5781f, 12.4188f, 7.67f, 12.47f)
                horizontalLineTo(6.5f)
                verticalLineTo(20.77f)
                curveTo(6.5f, 21.1842f, 6.1642f, 21.52f, 5.75f, 21.52f)
                curveTo(5.3358f, 21.52f, 5f, 21.1842f, 5f, 20.77f)
                verticalLineTo(3.77f)
                close()
                moveTo(12.9f, 5.66f)
                curveTo(12.851f, 5.6458f, 12.799f, 5.6458f, 12.75f, 5.66f)
                verticalLineTo(5.68f)
                horizontalLineTo(6.59f)
                verticalLineTo(10.9f)
                horizontalLineTo(7.67f)
                curveTo(9.4185f, 10.8538f, 10.888f, 12.2038f, 10.99f, 13.95f)
                curveTo(11.0396f, 13.9588f, 11.0904f, 13.9588f, 11.14f, 13.95f)
                horizontalLineTo(17.14f)
                curveTo(17.1896f, 13.9588f, 17.2404f, 13.9588f, 17.29f, 13.95f)
                verticalLineTo(8.78f)
                curveTo(17.241f, 8.7658f, 17.189f, 8.7658f, 17.14f, 8.78f)
                horizontalLineTo(16.23f)
                curveTo(14.4517f, 8.8306f, 12.9652f, 7.4379f, 12.9f, 5.66f)
                close()
            }
        }.build()
        return _Flagline!!
    }

