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
    Image(Musicnoteline, null)
}

private var _Musicnoteline: ImageVector? = null

public val Musicnoteline: ImageVector
    get() {
        if (_Musicnoteline != null) {
            return _Musicnoteline!!
        }
        _Musicnoteline = ImageVector.Builder(
            name = "Musicnoteline",
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
                moveTo(19.6399f, 6.87998f)
                curveTo(19.6258f, 5.929f, 19.1332f, 5.0492f, 18.3299f, 4.54f)
                curveTo(17.2657f, 3.8371f, 15.9251f, 3.6989f, 14.7399f, 4.17f)
                lineTo(10.1899f, 5.99998f)
                curveTo(9.0345f, 6.4072f, 8.2427f, 7.476f, 8.1899f, 8.7f)
                verticalLineTo(16f)
                curveTo(7.7989f, 15.7915f, 7.363f, 15.6816f, 6.9199f, 15.68f)
                curveTo(5.379f, 15.68f, 4.1299f, 16.9291f, 4.1299f, 18.47f)
                curveTo(4.1299f, 20.0109f, 5.379f, 21.26f, 6.9199f, 21.26f)
                curveTo(8.4608f, 21.26f, 9.7099f, 20.0109f, 9.7099f, 18.47f)
                verticalLineTo(8.67998f)
                curveTo(9.7653f, 8.0711f, 10.1846f, 7.5568f, 10.7699f, 7.38f)
                lineTo(15.3099f, 5.56998f)
                curveTo(16.034f, 5.2798f, 16.8538f, 5.3581f, 17.5099f, 5.78f)
                curveTo(17.8947f, 6.017f, 18.1379f, 6.4285f, 18.1599f, 6.88f)
                verticalLineTo(14.14f)
                curveTo(17.759f, 13.9281f, 17.3133f, 13.815f, 16.8599f, 13.81f)
                curveTo(15.3337f, 13.8007f, 14.0834f, 15.0194f, 14.0535f, 16.5453f)
                curveTo(14.0235f, 18.0711f, 15.2252f, 19.3379f, 16.7505f, 19.3884f)
                curveTo(18.2759f, 19.4389f, 19.5587f, 18.2545f, 19.6299f, 16.73f)
                curveTo(19.6346f, 16.6834f, 19.6346f, 16.6365f, 19.6299f, 16.59f)
                lineTo(19.6399f, 6.87998f)
                close()
                moveTo(6.91988f, 19.75f)
                curveTo(6.2156f, 19.7595f, 5.6339f, 19.2025f, 5.6129f, 18.4985f)
                curveTo(5.592f, 17.7945f, 6.1395f, 17.2038f, 6.8431f, 17.1715f)
                curveTo(7.5467f, 17.1391f, 8.1461f, 17.677f, 8.1899f, 18.38f)
                verticalLineTo(18.55f)
                curveTo(8.1527f, 19.2239f, 7.5948f, 19.751f, 6.9199f, 19.75f)
                close()
                moveTo(15.641f, 17.0906f)
                curveTo(15.8438f, 17.5723f, 16.3172f, 17.884f, 16.8399f, 17.88f)
                curveTo(17.1811f, 17.88f, 17.5082f, 17.7438f, 17.7485f, 17.5015f)
                curveTo(17.9889f, 17.2593f, 18.1225f, 16.9312f, 18.1199f, 16.59f)
                curveTo(18.1199f, 16.0673f, 17.8045f, 15.5963f, 17.3212f, 15.3972f)
                curveTo(16.8379f, 15.1982f, 16.2823f, 15.3104f, 15.9142f, 15.6814f)
                curveTo(15.546f, 16.0524f, 15.4382f, 16.6089f, 15.641f, 17.0906f)
                close()
            }
        }.build()
        return _Musicnoteline!!
    }

