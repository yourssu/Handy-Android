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
    Image(Userline, null)
}

private var _Userline: ImageVector? = null

public val Userline: ImageVector
    get() {
        if (_Userline != null) {
            return _Userline!!
        }
        _Userline = ImageVector.Builder(
            name = "Userline",
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
                moveTo(19.5796f, 16.71f)
                lineTo(19.8196f, 17.85f)
                curveTo(20.047f, 18.8356f, 19.8225f, 19.8713f, 19.2073f, 20.6742f)
                curveTo(18.592f, 21.4771f, 17.6504f, 21.9633f, 16.6396f, 22f)
                horizontalLineTo(7.35961f)
                curveTo(6.3488f, 21.9633f, 5.4072f, 21.4771f, 4.7919f, 20.6742f)
                curveTo(4.1767f, 19.8713f, 3.9522f, 18.8356f, 4.1796f, 17.85f)
                lineTo(4.41961f, 16.71f)
                curveTo(4.6956f, 15.1668f, 6.0222f, 14.0327f, 7.5896f, 14f)
                horizontalLineTo(16.4096f)
                curveTo(17.977f, 14.0327f, 19.3036f, 15.1668f, 19.5796f, 16.71f)
                close()
                moveTo(16.6396f, 20.49f)
                curveTo(17.1474f, 20.4841f, 17.6253f, 20.2489f, 17.9396f, 19.85f)
                verticalLineTo(19.86f)
                curveTo(18.3253f, 19.3762f, 18.4756f, 18.7458f, 18.3496f, 18.14f)
                lineTo(18.1096f, 17f)
                curveTo(17.9764f, 16.1552f, 17.2642f, 15.5226f, 16.4096f, 15.49f)
                horizontalLineTo(7.58961f)
                curveTo(6.735f, 15.5226f, 6.0228f, 16.1552f, 5.8896f, 17f)
                lineTo(5.64961f, 18.14f)
                curveTo(5.5268f, 18.7426f, 5.6769f, 19.3687f, 6.0596f, 19.85f)
                curveTo(6.3739f, 20.2489f, 6.8518f, 20.4841f, 7.3596f, 20.49f)
                horizontalLineTo(16.6396f)
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
                moveTo(12.4996f, 12f)
                horizontalLineTo(11.4996f)
                curveTo(9.2904f, 12f, 7.4996f, 10.2092f, 7.4996f, 8f)
                verticalLineTo(5.36001f)
                curveTo(7.4969f, 4.4681f, 7.8501f, 3.6119f, 8.4808f, 2.9812f)
                curveTo(9.1115f, 2.3505f, 9.9677f, 1.9973f, 10.8596f, 2f)
                horizontalLineTo(13.1396f)
                curveTo(14.0315f, 1.9973f, 14.8877f, 2.3505f, 15.5184f, 2.9812f)
                curveTo(16.1491f, 3.6119f, 16.5023f, 4.4681f, 16.4996f, 5.36f)
                verticalLineTo(8.00001f)
                curveTo(16.4996f, 10.2092f, 14.7087f, 12f, 12.4996f, 12f)
                close()
                moveTo(10.8596f, 3.50002f)
                curveTo(9.8323f, 3.5f, 8.9996f, 4.3328f, 8.9996f, 5.36f)
                verticalLineTo(8.00001f)
                curveTo(8.9996f, 9.3807f, 10.1189f, 10.5f, 11.4996f, 10.5f)
                horizontalLineTo(12.4996f)
                curveTo(13.8803f, 10.5f, 14.9996f, 9.3807f, 14.9996f, 8f)
                verticalLineTo(5.36001f)
                curveTo(14.9996f, 4.8667f, 14.8036f, 4.3936f, 14.4548f, 4.0448f)
                curveTo(14.106f, 3.696f, 13.6329f, 3.5f, 13.1396f, 3.5f)
                horizontalLineTo(10.8596f)
                close()
            }
        }.build()
        return _Userline!!
    }

