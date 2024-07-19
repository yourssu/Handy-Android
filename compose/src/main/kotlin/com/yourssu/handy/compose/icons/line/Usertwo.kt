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
    Image(Usertwoline, null)
}

private var _Usertwoline: ImageVector? = null

public val Usertwoline: ImageVector
    get() {
        if (_Usertwoline != null) {
            return _Usertwoline!!
        }
        _Usertwoline = ImageVector.Builder(
            name = "Usertwoline",
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
                moveTo(21.7401f, 14.7399f)
                lineTo(21.8801f, 15.4299f)
                curveTo(22.0326f, 16.0194f, 21.9082f, 16.6462f, 21.5423f, 17.1328f)
                curveTo(21.1764f, 17.6194f, 20.6087f, 17.9128f, 20.0001f, 17.9299f)
                horizontalLineTo(16.1901f)
                curveTo(16.191f, 19.5485f, 14.9078f, 20.876f, 13.2901f, 20.9299f)
                horizontalLineTo(5.00011f)
                curveTo(4.0846f, 20.9148f, 3.2262f, 20.4824f, 2.6691f, 19.7558f)
                curveTo(2.112f, 19.0292f, 1.9172f, 18.088f, 2.1401f, 17.1999f)
                lineTo(2.35011f, 16.1999f)
                curveTo(2.5943f, 14.8224f, 3.7812f, 13.8116f, 5.1801f, 13.7899f)
                horizontalLineTo(13.1201f)
                curveTo(13.4745f, 13.3664f, 13.9979f, 13.1212f, 14.5501f, 13.1199f)
                horizontalLineTo(19.8401f)
                curveTo(20.7741f, 13.1497f, 21.563f, 13.8224f, 21.7401f, 14.7399f)
                close()
                moveTo(19.9801f, 16.4199f)
                curveTo(20.1021f, 16.4154f, 20.2157f, 16.3568f, 20.2901f, 16.2599f)
                curveTo(20.4209f, 16.128f, 20.4868f, 15.945f, 20.4701f, 15.7599f)
                lineTo(20.3301f, 15.0699f)
                curveTo(20.303f, 14.8464f, 20.1242f, 14.6718f, 19.9001f, 14.6499f)
                horizontalLineTo(14.6101f)
                curveTo(14.495f, 14.6507f, 14.3872f, 14.7065f, 14.3201f, 14.7999f)
                curveTo(14.0333f, 15.1302f, 13.6175f, 15.3199f, 13.1801f, 15.3199f)
                horizontalLineTo(5.2401f)
                curveTo(4.5555f, 15.3366f, 3.9819f, 15.8428f, 3.8801f, 16.5199f)
                lineTo(3.6701f, 17.5199f)
                curveTo(3.5675f, 18.0125f, 3.6884f, 18.5251f, 4.0001f, 18.9199f)
                curveTo(4.2436f, 19.227f, 4.6085f, 19.4132f, 5.0001f, 19.4299f)
                horizontalLineTo(13.2601f)
                curveTo(14.0649f, 19.3765f, 14.6834f, 18.6962f, 14.6601f, 17.8899f)
                curveTo(14.6764f, 17.0733f, 15.3433f, 16.4198f, 16.1601f, 16.4199f)
                horizontalLineTo(19.9801f)
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
                moveTo(13.1001f, 7.99995f)
                curveTo(13.1001f, 10.2091f, 11.3092f, 11.9999f, 9.1001f, 11.9999f)
                curveTo(6.891f, 11.9999f, 5.1001f, 10.2091f, 5.1001f, 8f)
                verticalLineTo(6.42995f)
                curveTo(5.1001f, 4.5743f, 6.6044f, 3.0699f, 8.4601f, 3.0699f)
                horizontalLineTo(9.7701f)
                curveTo(11.6141f, 3.0864f, 13.1002f, 4.5859f, 13.1001f, 6.4299f)
                verticalLineTo(7.99995f)
                close()
                moveTo(8.4601f, 4.56995f)
                curveTo(7.4329f, 4.57f, 6.6001f, 5.4027f, 6.6001f, 6.4299f)
                lineTo(6.6301f, 7.99995f)
                curveTo(6.7897f, 9.2591f, 7.8609f, 10.2031f, 9.1301f, 10.2031f)
                curveTo(10.3993f, 10.2031f, 11.4705f, 9.2591f, 11.6301f, 8f)
                verticalLineTo(6.42995f)
                curveTo(11.6301f, 5.4027f, 10.7974f, 4.57f, 9.7701f, 4.57f)
                horizontalLineTo(8.4601f)
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
                moveTo(20.6801f, 8.24995f)
                curveTo(20.6801f, 9.9068f, 19.337f, 11.2499f, 17.6801f, 11.2499f)
                curveTo(16.0233f, 11.2499f, 14.6801f, 9.9068f, 14.6801f, 8.25f)
                verticalLineTo(7.09995f)
                curveTo(14.6799f, 5.7237f, 15.784f, 4.6018f, 17.1601f, 4.58f)
                horizontalLineTo(18.1601f)
                curveTo(19.5519f, 4.58f, 20.6801f, 5.7082f, 20.6801f, 7.0999f)
                verticalLineTo(8.24995f)
                close()
                moveTo(17.1801f, 6.09995f)
                curveTo(16.6278f, 6.0999f, 16.1801f, 6.5477f, 16.1801f, 7.0999f)
                verticalLineTo(8.24995f)
                curveTo(16.1801f, 9.0784f, 16.8517f, 9.75f, 17.6801f, 9.75f)
                curveTo(18.5085f, 9.75f, 19.1801f, 9.0784f, 19.1801f, 8.25f)
                verticalLineTo(7.09995f)
                curveTo(19.1801f, 6.5477f, 18.7324f, 6.0999f, 18.1801f, 6.0999f)
                horizontalLineTo(17.1801f)
                close()
            }
        }.build()
        return _Usertwoline!!
    }

