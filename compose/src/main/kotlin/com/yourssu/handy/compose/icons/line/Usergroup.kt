import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Usergroupline, null)
}

private var _Usergroupline: ImageVector? = null

public val Usergroupline: ImageVector
    get() {
        if (_Usergroupline != null) {
            return _Usergroupline!!
        }
        _Usergroupline = ImageVector.Builder(
            name = "Usergroupline",
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
                moveTo(15.9997f, 8.76003f)
                curveTo(15.9671f, 10.3934f, 14.6334f, 11.7004f, 12.9997f, 11.7f)
                curveTo(11.3855f, 11.6734f, 10.0818f, 10.3742f, 10.0497f, 8.76f)
                verticalLineTo(7.63003f)
                curveTo(10.0495f, 6.9644f, 10.318f, 6.3269f, 10.7943f, 5.8619f)
                curveTo(11.2705f, 5.3969f, 11.9143f, 5.1439f, 12.5797f, 5.16f)
                horizontalLineTo(13.5197f)
                curveTo(14.1765f, 5.1574f, 14.8074f, 5.4164f, 15.2727f, 5.8799f)
                curveTo(15.7381f, 6.3434f, 15.9997f, 6.9732f, 15.9997f, 7.63f)
                verticalLineTo(8.76003f)
                close()
                moveTo(12.5497f, 6.63003f)
                curveTo(11.9974f, 6.63f, 11.5497f, 7.0777f, 11.5497f, 7.63f)
                lineTo(11.5897f, 8.76003f)
                curveTo(11.5897f, 9.5608f, 12.2389f, 10.21f, 13.0397f, 10.21f)
                curveTo(13.8405f, 10.21f, 14.4897f, 9.5608f, 14.4897f, 8.76f)
                verticalLineTo(7.63003f)
                curveTo(14.4897f, 7.0777f, 14.042f, 6.63f, 13.4897f, 6.63f)
                horizontalLineTo(12.5497f)
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
                moveTo(23.4797f, 15.3f)
                lineTo(23.5897f, 16.86f)
                curveTo(23.7053f, 17.3483f, 23.5925f, 17.8625f, 23.2831f, 18.2575f)
                curveTo(22.9737f, 18.6525f, 22.5014f, 18.8853f, 21.9997f, 18.89f)
                horizontalLineTo(17.5097f)
                curveTo(17.118f, 19.3076f, 16.5722f, 19.5461f, 15.9997f, 19.55f)
                horizontalLineTo(9.99973f)
                curveTo(9.3983f, 19.5581f, 8.8226f, 19.3067f, 8.4197f, 18.86f)
                curveTo(8.3267f, 18.8704f, 8.2328f, 18.8704f, 8.1397f, 18.86f)
                horizontalLineTo(3.54973f)
                curveTo(3.0617f, 18.8416f, 2.6069f, 18.608f, 2.3077f, 18.2219f)
                curveTo(2.0086f, 17.8359f, 1.8958f, 17.3372f, 1.9997f, 16.86f)
                lineTo(2.14973f, 15.3f)
                curveTo(2.2957f, 14.5557f, 2.9413f, 14.0141f, 3.6997f, 14f)
                horizontalLineTo(7.99973f)
                curveTo(8.1792f, 13.9901f, 8.359f, 14.0138f, 8.5297f, 14.07f)
                curveTo(8.9134f, 13.5908f, 9.4959f, 13.3143f, 10.1097f, 13.32f)
                horizontalLineTo(15.8897f)
                curveTo(16.4677f, 13.3179f, 17.0183f, 13.5658f, 17.3997f, 14f)
                curveTo(17.4694f, 13.9902f, 17.5401f, 13.9902f, 17.6097f, 14f)
                horizontalLineTo(21.9297f)
                curveTo(22.6881f, 14.0141f, 23.3338f, 14.5557f, 23.4797f, 15.3f)
                close()
                moveTo(17.5497f, 17.36f)
                horizontalLineTo(22.0797f)
                curveTo(22.1103f, 17.3011f, 22.114f, 17.2318f, 22.0897f, 17.17f)
                verticalLineTo(16.97f)
                lineTo(21.9897f, 15.55f)
                lineTo(21.9297f, 15.47f)
                horizontalLineTo(17.3997f)
                curveTo(16.977f, 15.4716f, 16.5735f, 15.2934f, 16.2897f, 14.98f)
                curveTo(16.1905f, 14.8614f, 16.0444f, 14.792f, 15.8897f, 14.79f)
                horizontalLineTo(10.1097f)
                curveTo(9.9422f, 14.7922f, 9.7844f, 14.8692f, 9.6797f, 15f)
                curveTo(9.3943f, 15.3389f, 8.9728f, 15.5331f, 8.5297f, 15.53f)
                curveTo(8.3483f, 15.5309f, 8.1684f, 15.4969f, 7.9997f, 15.43f)
                horizontalLineTo(3.74973f)
                curveTo(3.6897f, 15.43f, 3.6897f, 15.45f, 3.6897f, 15.51f)
                lineTo(3.58973f, 16.93f)
                verticalLineTo(17.13f)
                curveTo(3.5623f, 17.1904f, 3.5623f, 17.2597f, 3.5897f, 17.32f)
                horizontalLineTo(8.17973f)
                curveTo(8.2862f, 17.3103f, 8.3933f, 17.3103f, 8.4997f, 17.32f)
                curveTo(8.9061f, 17.3276f, 9.2907f, 17.5053f, 9.5597f, 17.81f)
                curveTo(9.6701f, 17.9392f, 9.83f, 18.0155f, 9.9997f, 18.02f)
                horizontalLineTo(16.0397f)
                curveTo(16.2098f, 18.0167f, 16.3702f, 17.9402f, 16.4797f, 17.81f)
                curveTo(16.7609f, 17.5216f, 17.1469f, 17.3592f, 17.5497f, 17.36f)
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
                moveTo(21.9697f, 10.26f)
                curveTo(21.9697f, 11.4751f, 20.9848f, 12.46f, 19.7697f, 12.46f)
                curveTo(19.1845f, 12.4627f, 18.6224f, 12.2321f, 18.2076f, 11.8192f)
                curveTo(17.7929f, 11.4063f, 17.5597f, 10.8452f, 17.5597f, 10.26f)
                verticalLineTo(9.42003f)
                curveTo(17.5597f, 8.9294f, 17.7546f, 8.4588f, 18.1016f, 8.1119f)
                curveTo(18.4485f, 7.7649f, 18.9191f, 7.57f, 19.4097f, 7.57f)
                horizontalLineTo(20.1197f)
                curveTo(21.1415f, 7.57f, 21.9697f, 8.3983f, 21.9697f, 9.42f)
                verticalLineTo(10.26f)
                close()
                moveTo(19.1622f, 9.21254f)
                curveTo(19.0966f, 9.2782f, 19.0597f, 9.3672f, 19.0597f, 9.46f)
                verticalLineTo(10.3f)
                curveTo(19.1023f, 10.6571f, 19.4051f, 10.9259f, 19.7647f, 10.9259f)
                curveTo(20.1243f, 10.9259f, 20.4271f, 10.6571f, 20.4697f, 10.3f)
                verticalLineTo(9.46003f)
                curveTo(20.4697f, 9.2667f, 20.313f, 9.11f, 20.1197f, 9.11f)
                horizontalLineTo(19.4097f)
                curveTo(19.3169f, 9.11f, 19.2279f, 9.1469f, 19.1622f, 9.2125f)
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
                moveTo(7.42184f, 11.8192f)
                curveTo(7.0071f, 12.2321f, 6.4449f, 12.4627f, 5.8597f, 12.46f)
                curveTo(5.2763f, 12.46f, 4.7167f, 12.2282f, 4.3041f, 11.8157f)
                curveTo(3.8915f, 11.4031f, 3.6597f, 10.8435f, 3.6597f, 10.26f)
                verticalLineTo(9.42003f)
                curveTo(3.6597f, 8.3983f, 4.488f, 7.57f, 5.5097f, 7.57f)
                horizontalLineTo(6.21973f)
                curveTo(7.2415f, 7.57f, 8.0697f, 8.3983f, 8.0697f, 9.42f)
                verticalLineTo(10.26f)
                curveTo(8.0697f, 10.8452f, 7.8366f, 11.4063f, 7.4218f, 11.8192f)
                close()
                moveTo(5.50973f, 9.11003f)
                curveTo(5.3164f, 9.11f, 5.1597f, 9.2667f, 5.1597f, 9.46f)
                verticalLineTo(10.3f)
                curveTo(5.2023f, 10.6571f, 5.5052f, 10.9259f, 5.8647f, 10.9259f)
                curveTo(6.2243f, 10.9259f, 6.5271f, 10.6571f, 6.5697f, 10.3f)
                verticalLineTo(9.46003f)
                curveTo(6.5697f, 9.2667f, 6.413f, 9.11f, 6.2197f, 9.11f)
                horizontalLineTo(5.50973f)
                close()
            }
        }.build()
        return _Usergroupline!!
    }

