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
    Image(Bluetoothline, null)
}

private var _Bluetoothline: ImageVector? = null

public val Bluetoothline: ImageVector
    get() {
        if (_Bluetoothline != null) {
            return _Bluetoothline!!
        }
        _Bluetoothline = ImageVector.Builder(
            name = "Bluetoothline",
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
                moveTo(12.9699f, 22.0955f)
                curveTo(12.0727f, 22.0739f, 11.3551f, 21.343f, 11.3499f, 20.4455f)
                verticalLineTo(13.5255f)
                lineTo(6.09994f, 16.6855f)
                curveTo(5.7531f, 16.8807f, 5.3141f, 16.7709f, 5.0999f, 16.4355f)
                curveTo(4.8993f, 16.0894f, 5.01f, 15.6464f, 5.3499f, 15.4355f)
                lineTo(10.8599f, 12.0455f)
                lineTo(5.34994f, 8.68546f)
                curveTo(5.01f, 8.4745f, 4.8993f, 8.0316f, 5.0999f, 7.6855f)
                curveTo(5.3141f, 7.35f, 5.7531f, 7.2402f, 6.0999f, 7.4355f)
                lineTo(11.3499f, 10.5655f)
                verticalLineTo(3.64546f)
                curveTo(11.347f, 3.0217f, 11.7003f, 2.451f, 12.2599f, 2.1755f)
                curveTo(12.8189f, 1.8958f, 13.4875f, 1.9538f, 13.9899f, 2.3255f)
                lineTo(19.1099f, 6.17547f)
                curveTo(19.5547f, 6.5032f, 19.8031f, 7.034f, 19.7699f, 7.5855f)
                curveTo(19.7371f, 8.1383f, 19.4292f, 8.6379f, 18.9499f, 8.9155f)
                lineTo(13.7599f, 12.0455f)
                lineTo(18.9299f, 15.1855f)
                curveTo(19.4043f, 15.4636f, 19.7077f, 15.9611f, 19.7379f, 16.5102f)
                curveTo(19.7681f, 17.0593f, 19.521f, 17.587f, 19.0799f, 17.9155f)
                lineTo(13.9599f, 21.7655f)
                curveTo(13.6747f, 21.9803f, 13.3271f, 22.0962f, 12.9699f, 22.0955f)
                close()
                moveTo(12.8199f, 13.2355f)
                verticalLineTo(20.4455f)
                curveTo(12.8186f, 20.5008f, 12.8499f, 20.5518f, 12.8999f, 20.5755f)
                curveTo(12.9488f, 20.6063f, 13.0111f, 20.6063f, 13.0599f, 20.5755f)
                lineTo(18.1799f, 16.7355f)
                curveTo(18.2223f, 16.7064f, 18.2453f, 16.6565f, 18.2399f, 16.6055f)
                curveTo(18.2445f, 16.5547f, 18.2164f, 16.5065f, 18.1699f, 16.4855f)
                lineTo(12.8199f, 13.2355f)
                close()
                moveTo(12.8999f, 3.49546f)
                horizontalLineTo(12.9699f)
                curveTo(13.0023f, 3.4961f, 13.0337f, 3.5066f, 13.0599f, 3.5255f)
                lineTo(18.1799f, 7.35546f)
                curveTo(18.2206f, 7.3813f, 18.2437f, 7.4274f, 18.2399f, 7.4755f)
                curveTo(18.2413f, 7.5308f, 18.21f, 7.5818f, 18.1599f, 7.6055f)
                lineTo(12.8199f, 10.8355f)
                verticalLineTo(3.62546f)
                curveTo(12.8186f, 3.5701f, 12.8499f, 3.5192f, 12.8999f, 3.4955f)
                close()
            }
        }.build()
        return _Bluetoothline!!
    }

