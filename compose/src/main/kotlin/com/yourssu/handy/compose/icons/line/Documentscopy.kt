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
    Image(Documentscopyline, null)
}

private var _Documentscopyline: ImageVector? = null

public val Documentscopyline: ImageVector
    get() {
        if (_Documentscopyline != null) {
            return _Documentscopyline!!
        }
        _Documentscopyline = ImageVector.Builder(
            name = "Documentscopyline",
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
                moveTo(14.33f, 2.22f)
                lineTo(21.33f, 9.22f)
                curveTo(21.4535f, 9.3678f, 21.5145f, 9.5579f, 21.5f, 9.75f)
                verticalLineTo(15.11f)
                curveTo(21.5003f, 17.7007f, 19.4205f, 19.8117f, 16.83f, 19.85f)
                curveTo(16.1677f, 21.4836f, 14.5925f, 22.5626f, 12.83f, 22.59f)
                horizontalLineTo(7.38f)
                curveTo(4.9649f, 22.59f, 3.0055f, 20.6351f, 3f, 18.22f)
                verticalLineTo(9.14f)
                curveTo(3.0055f, 6.7233f, 4.9633f, 4.7655f, 7.38f, 4.76f)
                horizontalLineTo(7.81f)
                curveTo(8.5793f, 3.0866f, 10.2483f, 2.0104f, 12.09f, 2f)
                horizontalLineTo(13.8f)
                curveTo(13.9988f, 2.0002f, 14.1895f, 2.0793f, 14.33f, 2.22f)
                close()
                moveTo(18.96f, 8.93f)
                lineTo(14.69f, 4.66f)
                verticalLineTo(7.76f)
                curveTo(14.6954f, 8.4039f, 15.2161f, 8.9246f, 15.86f, 8.93f)
                horizontalLineTo(18.96f)
                close()
                moveTo(12.83f, 21.09f)
                horizontalLineTo(7.38f)
                curveTo(5.7933f, 21.09f, 4.5055f, 19.8067f, 4.5f, 18.22f)
                verticalLineTo(9.14f)
                curveTo(4.5f, 7.5494f, 5.7894f, 6.26f, 7.38f, 6.26f)
                verticalLineTo(15.11f)
                curveTo(7.38f, 17.7334f, 9.5067f, 19.86f, 12.13f, 19.86f)
                horizontalLineTo(15.23f)
                curveTo(14.6832f, 20.6424f, 13.7844f, 21.103f, 12.83f, 21.09f)
                close()
                moveTo(12.09f, 18.36f)
                horizontalLineTo(16.79f)
                curveTo(18.5849f, 18.36f, 20.04f, 16.9049f, 20.04f, 15.11f)
                verticalLineTo(10.58f)
                horizontalLineTo(15.81f)
                curveTo(14.2548f, 10.5745f, 12.9955f, 9.3152f, 12.99f, 7.76f)
                verticalLineTo(3.5f)
                horizontalLineTo(12.09f)
                curveTo(11.2237f, 3.5026f, 10.394f, 3.85f, 9.7842f, 4.4654f)
                curveTo(9.1744f, 5.0808f, 8.8347f, 5.9137f, 8.84f, 6.78f)
                verticalLineTo(15.11f)
                curveTo(8.8455f, 16.9026f, 10.2974f, 18.3545f, 12.09f, 18.36f)
                close()
            }
        }.build()
        return _Documentscopyline!!
    }

