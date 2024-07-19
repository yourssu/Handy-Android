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
    Image(Worldline, null)
}

private var _Worldline: ImageVector? = null

public val Worldline: ImageVector
    get() {
        if (_Worldline != null) {
            return _Worldline!!
        }
        _Worldline = ImageVector.Builder(
            name = "Worldline",
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
                moveTo(2.72934f, 7.88227f)
                curveTo(4.2091f, 4.3177f, 7.6908f, 1.996f, 11.5503f, 2f)
                curveTo(14.0795f, 2f, 16.505f, 3.0054f, 18.2925f, 4.7948f)
                curveTo(20.0801f, 6.5842f, 21.0829f, 9.0108f, 21.0803f, 11.54f)
                curveTo(21.0803f, 15.3995f, 18.7548f, 18.8787f, 15.1888f, 20.3548f)
                curveTo(11.6227f, 21.8308f, 7.5186f, 21.0128f, 4.7909f, 18.2823f)
                curveTo(2.0633f, 15.5518f, 1.2496f, 11.4468f, 2.7293f, 7.8823f)
                close()
                moveTo(19.0303f, 14.44f)
                curveTo(19.3794f, 13.5133f, 19.5557f, 12.5303f, 19.5503f, 11.54f)
                curveTo(19.5727f, 9.7187f, 18.973f, 7.9443f, 17.8503f, 6.51f)
                curveTo(17.4003f, 7.26f, 16.5503f, 8.38f, 15.5003f, 8.38f)
                curveTo(15.0963f, 8.3475f, 14.6898f, 8.3882f, 14.3003f, 8.5f)
                verticalLineTo(8.61001f)
                curveTo(14.3003f, 8.79f, 14.7903f, 9.28f, 15.0503f, 9.54f)
                curveTo(15.6978f, 10.0228f, 16.129f, 10.7414f, 16.2503f, 11.54f)
                curveTo(16.2503f, 13.14f, 16.4103f, 13.63f, 16.5503f, 13.75f)
                curveTo(17.4148f, 13.8118f, 18.2581f, 14.0465f, 19.0303f, 14.44f)
                close()
                moveTo(3.55027f, 11.54f)
                curveTo(3.5412f, 9.761f, 4.1253f, 8.0298f, 5.2103f, 6.62f)
                curveTo(5.4936f, 7.1368f, 6.0411f, 7.4529f, 6.6303f, 7.44f)
                curveTo(7.4394f, 7.848f, 8.1546f, 8.4202f, 8.7303f, 9.12f)
                curveTo(8.3067f, 9.3804f, 7.9228f, 9.7004f, 7.5903f, 10.07f)
                curveTo(7.5594f, 10.0997f, 7.5258f, 10.1325f, 7.4902f, 10.1671f)
                curveTo(7.2143f, 10.4358f, 6.8186f, 10.8211f, 6.6503f, 10.83f)
                curveTo(6.1873f, 10.816f, 5.7391f, 10.9938f, 5.4116f, 11.3213f)
                curveTo(5.0841f, 11.6488f, 4.9063f, 12.097f, 4.9203f, 12.56f)
                curveTo(4.9217f, 12.6746f, 4.9491f, 12.7874f, 5.0003f, 12.89f)
                lineTo(5.90027f, 14.69f)
                curveTo(5.9118f, 15.7253f, 6.0769f, 16.7532f, 6.3903f, 17.74f)
                curveTo(4.566f, 16.2005f, 3.5246f, 13.9269f, 3.5503f, 11.54f)
                close()
                moveTo(8.82028f, 19.06f)
                curveTo(9.6954f, 19.3776f, 10.6193f, 19.5401f, 11.5503f, 19.54f)
                verticalLineTo(19.57f)
                curveTo(14.3025f, 19.5885f, 16.871f, 18.1909f, 18.3503f, 15.87f)
                curveTo(17.7471f, 15.5779f, 17.1031f, 15.379f, 16.4403f, 15.28f)
                curveTo(14.7103f, 15.28f, 14.7103f, 12.8f, 14.7103f, 11.6f)
                curveTo(14.7103f, 11.4188f, 14.2645f, 10.9737f, 13.989f, 10.6987f)
                curveTo(13.9757f, 10.6854f, 13.9627f, 10.6725f, 13.9503f, 10.66f)
                curveTo(13.3073f, 10.1746f, 12.8801f, 9.4566f, 12.7603f, 8.66f)
                curveTo(12.7603f, 6.93f, 14.5203f, 6.93f, 15.4603f, 6.93f)
                curveTo(15.7203f, 6.92f, 16.3403f, 6.18f, 16.7203f, 5.44f)
                curveTo(13.755f, 2.9299f, 9.415f, 2.913f, 6.4303f, 5.4f)
                curveTo(6.4454f, 5.486f, 6.4454f, 5.574f, 6.4303f, 5.66f)
                curveTo(6.4403f, 5.9f, 6.5503f, 5.9f, 6.6603f, 5.9f)
                curveTo(7.8603f, 5.9f, 10.5503f, 8.34f, 10.5903f, 9.48f)
                curveTo(10.5919f, 9.7371f, 10.4834f, 9.9826f, 10.2924f, 10.1545f)
                curveTo(10.1013f, 10.3265f, 9.8458f, 10.4086f, 9.5903f, 10.38f)
                curveTo(9.4103f, 10.39f, 8.9203f, 10.88f, 8.6603f, 11.14f)
                curveTo(8.1738f, 11.7835f, 7.457f, 12.2136f, 6.6603f, 12.34f)
                curveTo(6.5803f, 12.34f, 6.4603f, 12.34f, 6.4603f, 12.44f)
                lineTo(7.33028f, 14.11f)
                curveTo(7.3815f, 14.2126f, 7.4088f, 14.3254f, 7.4103f, 14.44f)
                curveTo(7.4103f, 15.53f, 7.6503f, 17.3f, 8.1703f, 17.83f)
                curveTo(8.5331f, 18.1443f, 8.765f, 18.5832f, 8.8203f, 19.06f)
                close()
            }
        }.build()
        return _Worldline!!
    }

