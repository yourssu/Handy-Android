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
    Image(Imacline, null)
}

private var _Imacline: ImageVector? = null

public val Imacline: ImageVector
    get() {
        if (_Imacline != null) {
            return _Imacline!!
        }
        _Imacline = ImageVector.Builder(
            name = "Imacline",
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
                moveTo(18.4995f, 4.41992f)
                horizontalLineTo(5.49954f)
                curveTo(3.7712f, 4.501f, 2.4317f, 5.961f, 2.4995f, 7.6899f)
                verticalLineTo(13.1499f)
                curveTo(2.4317f, 14.8789f, 3.7712f, 16.3389f, 5.4995f, 16.4199f)
                horizontalLineTo(9.23954f)
                curveTo(9.1371f, 17.058f, 8.9832f, 17.6867f, 8.7795f, 18.2999f)
                lineTo(8.43954f, 19.2399f)
                curveTo(8.3373f, 19.4909f, 8.3594f, 19.7754f, 8.4991f, 20.0077f)
                curveTo(8.6389f, 20.2399f, 8.8799f, 20.3927f, 9.1495f, 20.4199f)
                horizontalLineTo(14.8495f)
                curveTo(15.1192f, 20.3927f, 15.3602f, 20.2399f, 15.4999f, 20.0077f)
                curveTo(15.6397f, 19.7754f, 15.6618f, 19.4909f, 15.5595f, 19.2399f)
                lineTo(15.2195f, 18.2999f)
                curveTo(15.0158f, 17.6867f, 14.862f, 17.058f, 14.7595f, 16.4199f)
                horizontalLineTo(18.4995f)
                curveTo(20.2279f, 16.3389f, 21.5674f, 14.8789f, 21.4995f, 13.1499f)
                verticalLineTo(7.68992f)
                curveTo(21.5674f, 5.961f, 20.2279f, 4.501f, 18.4995f, 4.4199f)
                close()
                moveTo(10.1495f, 18.9199f)
                verticalLineTo(18.7999f)
                curveTo(10.3663f, 18.1877f, 10.5336f, 17.559f, 10.6495f, 16.9199f)
                horizontalLineTo(13.2695f)
                curveTo(13.3902f, 17.5579f, 13.5573f, 18.1863f, 13.7695f, 18.7999f)
                verticalLineTo(18.9199f)
                horizontalLineTo(10.1495f)
                close()
                moveTo(18.4995f, 14.9199f)
                curveTo(19.3973f, 14.8353f, 20.0633f, 14.0494f, 19.9995f, 13.1499f)
                verticalLineTo(7.68992f)
                curveTo(20.0633f, 6.7904f, 19.3973f, 6.0046f, 18.4995f, 5.9199f)
                horizontalLineTo(5.49954f)
                curveTo(4.6018f, 6.0046f, 3.9358f, 6.7904f, 3.9995f, 7.6899f)
                verticalLineTo(13.1499f)
                curveTo(3.9358f, 14.0494f, 4.6018f, 14.8353f, 5.4995f, 14.9199f)
                horizontalLineTo(18.4995f)
                close()
            }
        }.build()
        return _Imacline!!
    }

