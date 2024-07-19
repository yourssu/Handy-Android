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
    Image(Volumeline, null)
}

private var _Volumeline: ImageVector? = null

public val Volumeline: ImageVector
    get() {
        if (_Volumeline != null) {
            return _Volumeline!!
        }
        _Volumeline = ImageVector.Builder(
            name = "Volumeline",
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
                moveTo(16.5102f, 3.88003f)
                curveTo(16.8742f, 3.6371f, 17.3025f, 3.5083f, 17.7402f, 3.51f)
                curveTo(18.3366f, 3.4965f, 18.9132f, 3.7248f, 19.3389f, 4.1429f)
                curveTo(19.7645f, 4.561f, 20.003f, 5.1334f, 20.0002f, 5.73f)
                verticalLineTo(18.27f)
                curveTo(20.0039f, 19.0992f, 19.5473f, 19.8621f, 18.8146f, 20.2504f)
                curveTo(18.082f, 20.6388f, 17.1943f, 20.5886f, 16.5102f, 20.12f)
                lineTo(10.1102f, 15.85f)
                curveTo(9.7441f, 15.6022f, 9.3122f, 15.4698f, 8.8702f, 15.47f)
                horizontalLineTo(7.14016f)
                curveTo(6.5496f, 15.4727f, 5.9824f, 15.24f, 5.5639f, 14.8234f)
                curveTo(5.1454f, 14.4067f, 4.9101f, 13.8405f, 4.9102f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(4.9101f, 10.1595f, 5.1454f, 9.5933f, 5.5639f, 9.1767f)
                curveTo(5.9824f, 8.7601f, 6.5496f, 8.5274f, 7.1402f, 8.53f)
                horizontalLineTo(8.87016f)
                curveTo(9.3122f, 8.5302f, 9.7441f, 8.3979f, 10.1102f, 8.15f)
                lineTo(16.5102f, 3.88003f)
                close()
                moveTo(17.7402f, 18.99f)
                curveTo(18.1395f, 18.9901f, 18.4647f, 18.6693f, 18.4702f, 18.27f)
                verticalLineTo(5.73003f)
                curveTo(18.4647f, 5.3308f, 18.1395f, 5.01f, 17.7402f, 5.01f)
                curveTo(17.5982f, 5.0114f, 17.4594f, 5.053f, 17.3402f, 5.13f)
                lineTo(10.9402f, 9.40003f)
                curveTo(10.3247f, 9.8004f, 9.6043f, 10.0093f, 8.8702f, 10f)
                horizontalLineTo(7.14015f)
                curveTo(6.9376f, 9.9995f, 6.7439f, 10.0833f, 6.6055f, 10.2312f)
                curveTo(6.467f, 10.3791f, 6.3963f, 10.5779f, 6.4101f, 10.78f)
                verticalLineTo(13.28f)
                curveTo(6.4156f, 13.6793f, 6.7409f, 14.0001f, 7.1402f, 14f)
                horizontalLineTo(8.87015f)
                curveTo(9.6043f, 13.9908f, 10.3247f, 14.1996f, 10.9402f, 14.6f)
                lineTo(17.3402f, 18.87f)
                curveTo(17.4594f, 18.9471f, 17.5982f, 18.9887f, 17.7402f, 18.99f)
                close()
            }
        }.build()
        return _Volumeline!!
    }

