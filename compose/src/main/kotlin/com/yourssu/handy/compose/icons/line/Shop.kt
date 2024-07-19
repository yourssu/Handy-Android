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
    Image(Shopline, null)
}

private var _Shopline: ImageVector? = null

public val Shopline: ImageVector
    get() {
        if (_Shopline != null) {
            return _Shopline!!
        }
        _Shopline = ImageVector.Builder(
            name = "Shopline",
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
                moveTo(20.2805f, 3.81992f)
                lineTo(21.9405f, 8.42992f)
                curveTo(22.3017f, 9.3226f, 22.2124f, 10.3343f, 21.7005f, 11.1499f)
                curveTo(21.2649f, 11.768f, 20.6347f, 12.2223f, 19.9105f, 12.4399f)
                verticalLineTo(19.2399f)
                curveTo(19.8947f, 20.0038f, 19.5761f, 20.7301f, 19.0247f, 21.259f)
                curveTo(18.4733f, 21.7879f, 17.7344f, 22.076f, 16.9705f, 22.0599f)
                horizontalLineTo(7.31049f)
                curveTo(6.5371f, 22.0896f, 5.7842f, 21.8078f, 5.2203f, 21.2778f)
                curveTo(4.6564f, 20.7477f, 4.3287f, 20.0136f, 4.3105f, 19.2399f)
                verticalLineTo(12.5399f)
                curveTo(3.6064f, 12.3787f, 2.9723f, 11.9968f, 2.5005f, 11.4499f)
                curveTo(1.8221f, 10.6031f, 1.6538f, 9.4559f, 2.0605f, 8.4499f)
                lineTo(3.71049f, 3.82992f)
                curveTo(4.0996f, 2.8446f, 5.0614f, 2.2061f, 6.1205f, 2.2299f)
                horizontalLineTo(17.8705f)
                curveTo(18.9279f, 2.2016f, 19.8905f, 2.8366f, 20.2805f, 3.8199f)
                close()
                moveTo(13.3519f, 20.4299f)
                horizontalLineTo(13.3605f)
                verticalLineTo(20.4599f)
                curveTo(13.3575f, 20.45f, 13.3546f, 20.44f, 13.3519f, 20.4299f)
                close()
                moveTo(13.3519f, 20.4299f)
                horizontalLineTo(10.8105f)
                curveTo(10.82f, 20.3535f, 10.82f, 20.2763f, 10.8105f, 20.1999f)
                verticalLineTo(18.0899f)
                curveTo(10.8279f, 17.7726f, 10.9747f, 17.4764f, 11.2167f, 17.2703f)
                curveTo(11.4586f, 17.0643f, 11.7745f, 16.9666f, 12.0905f, 16.9999f)
                curveTo(12.7189f, 16.9538f, 13.2674f, 17.422f, 13.3205f, 18.0499f)
                verticalLineTo(20.1899f)
                curveTo(13.3205f, 20.271f, 13.3311f, 20.3517f, 13.3519f, 20.4299f)
                close()
                moveTo(16.9205f, 20.4299f)
                horizontalLineTo(14.8105f)
                curveTo(14.82f, 20.3535f, 14.82f, 20.2763f, 14.8105f, 20.1999f)
                verticalLineTo(18.0899f)
                curveTo(14.7562f, 16.6174f, 13.5233f, 15.4649f, 12.0505f, 15.5099f)
                curveTo(10.5738f, 15.4593f, 9.3347f, 16.6134f, 9.2805f, 18.0899f)
                verticalLineTo(20.2299f)
                curveTo(9.271f, 20.3063f, 9.271f, 20.3835f, 9.2805f, 20.4599f)
                horizontalLineTo(7.26049f)
                curveTo(6.5239f, 20.4939f, 5.8982f, 19.9263f, 5.8605f, 19.1899f)
                verticalLineTo(12.5199f)
                curveTo(7.1929f, 12.3188f, 8.2629f, 11.3163f, 8.5505f, 9.9999f)
                curveTo(8.9027f, 11.597f, 10.3686f, 12.6975f, 12.0005f, 12.5899f)
                curveTo(13.603f, 12.6571f, 15.023f, 11.5657f, 15.3705f, 9.9999f)
                curveTo(15.6519f, 11.3992f, 16.8108f, 12.4528f, 18.2305f, 12.5999f)
                verticalLineTo(19.2399f)
                curveTo(18.1693f, 19.9214f, 17.6046f, 20.4473f, 16.9205f, 20.4599f)
                verticalLineTo(20.4299f)
                close()
                moveTo(18.9205f, 10.8399f)
                curveTo(19.4506f, 10.826f, 19.9418f, 10.5581f, 20.2405f, 10.1199f)
                verticalLineTo(10.1499f)
                curveTo(20.448f, 9.8003f, 20.474f, 9.3721f, 20.3105f, 8.9999f)
                lineTo(18.6605f, 4.44992f)
                curveTo(18.5141f, 4.1523f, 18.2011f, 3.9741f, 17.8705f, 3.9999f)
                horizontalLineTo(6.12049f)
                curveTo(5.8024f, 3.9708f, 5.4969f, 4.1314f, 5.3405f, 4.4099f)
                lineTo(3.69049f, 8.99992f)
                curveTo(3.476f, 9.4243f, 3.5145f, 9.9327f, 3.7905f, 10.3199f)
                curveTo(4.0397f, 10.6262f, 4.3984f, 10.8234f, 4.7905f, 10.8699f)
                curveTo(4.9167f, 10.8846f, 5.0442f, 10.8846f, 5.1705f, 10.8699f)
                curveTo(5.9399f, 10.9119f, 6.6349f, 10.4126f, 6.8405f, 9.6699f)
                curveTo(6.9931f, 8.8246f, 7.7217f, 8.2049f, 8.5805f, 8.1899f)
                curveTo(9.4486f, 8.1895f, 10.1873f, 8.8221f, 10.3205f, 9.6799f)
                curveTo(10.524f, 10.4272f, 11.228f, 10.9258f, 12.0005f, 10.8699f)
                curveTo(12.7793f, 10.9218f, 13.4831f, 10.4076f, 13.6705f, 9.6499f)
                curveTo(13.8151f, 8.7986f, 14.547f, 8.1718f, 15.4105f, 8.1599f)
                curveTo(16.2753f, 8.1587f, 17.0129f, 8.7861f, 17.1505f, 9.6399f)
                curveTo(17.3542f, 10.3927f, 18.0626f, 10.8957f, 18.8405f, 10.8399f)
                horizontalLineTo(18.9205f)
                close()
            }
        }.build()
        return _Shopline!!
    }

