import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(MeatballFilled, null)
}

private var _MeatballFilled: ImageVector? = null

public val MeatballFilled: ImageVector
    get() {
        if (_MeatballFilled != null) {
            return _MeatballFilled!!
        }
        _MeatballFilled = ImageVector.Builder(
            name = "MeatballFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF1C1B1F)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(6.23047f, 13.5f)
                    curveTo(5.818f, 13.5f, 5.4649f, 13.3531f, 5.1712f, 13.0592f)
                    curveTo(4.8774f, 12.7656f, 4.7305f, 12.4125f, 4.7305f, 12f)
                    curveTo(4.7305f, 11.5875f, 4.8774f, 11.2344f, 5.1712f, 10.9408f)
                    curveTo(5.4649f, 10.6469f, 5.818f, 10.5f, 6.2305f, 10.5f)
                    curveTo(6.643f, 10.5f, 6.9961f, 10.6469f, 7.29f, 10.9408f)
                    curveTo(7.5836f, 11.2344f, 7.7305f, 11.5875f, 7.7305f, 12f)
                    curveTo(7.7305f, 12.4125f, 7.5836f, 12.7656f, 7.29f, 13.0592f)
                    curveTo(6.9961f, 13.3531f, 6.643f, 13.5f, 6.2305f, 13.5f)
                    close()
                    moveTo(11.9997f, 13.5f)
                    curveTo(11.5872f, 13.5f, 11.2341f, 13.3531f, 10.9405f, 13.0592f)
                    curveTo(10.6466f, 12.7656f, 10.4997f, 12.4125f, 10.4997f, 12f)
                    curveTo(10.4997f, 11.5875f, 10.6466f, 11.2344f, 10.9405f, 10.9408f)
                    curveTo(11.2341f, 10.6469f, 11.5872f, 10.5f, 11.9997f, 10.5f)
                    curveTo(12.4122f, 10.5f, 12.7653f, 10.6469f, 13.059f, 10.9408f)
                    curveTo(13.3528f, 11.2344f, 13.4997f, 11.5875f, 13.4997f, 12f)
                    curveTo(13.4997f, 12.4125f, 13.3528f, 12.7656f, 13.059f, 13.0592f)
                    curveTo(12.7653f, 13.3531f, 12.4122f, 13.5f, 11.9997f, 13.5f)
                    close()
                    moveTo(17.769f, 13.5f)
                    curveTo(17.3565f, 13.5f, 17.0033f, 13.3531f, 16.7095f, 13.0592f)
                    curveTo(16.4158f, 12.7656f, 16.269f, 12.4125f, 16.269f, 12f)
                    curveTo(16.269f, 11.5875f, 16.4158f, 11.2344f, 16.7095f, 10.9408f)
                    curveTo(17.0033f, 10.6469f, 17.3565f, 10.5f, 17.769f, 10.5f)
                    curveTo(18.1815f, 10.5f, 18.5346f, 10.6469f, 18.8282f, 10.9408f)
                    curveTo(19.1221f, 11.2344f, 19.269f, 11.5875f, 19.269f, 12f)
                    curveTo(19.269f, 12.4125f, 19.1221f, 12.7656f, 18.8282f, 13.0592f)
                    curveTo(18.5346f, 13.3531f, 18.1815f, 13.5f, 17.769f, 13.5f)
                    close()
                }
            }
        }.build()
        return _MeatballFilled!!
    }

