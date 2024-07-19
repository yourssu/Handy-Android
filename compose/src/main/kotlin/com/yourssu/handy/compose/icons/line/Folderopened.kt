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
    Image(Folderopenedline, null)
}

private var _Folderopenedline: ImageVector? = null

public val Folderopenedline: ImageVector
    get() {
        if (_Folderopenedline != null) {
            return _Folderopenedline!!
        }
        _Folderopenedline = ImageVector.Builder(
            name = "Folderopenedline",
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
                moveTo(21.46f, 10.23f)
                curveTo(21.4704f, 10.1537f, 21.4704f, 10.0763f, 21.46f, 10f)
                curveTo(21.46f, 8.067f, 19.893f, 6.5f, 17.96f, 6.5f)
                horizontalLineTo(13.5f)
                curveTo(12.9477f, 6.5f, 12.5f, 6.0523f, 12.5f, 5.5f)
                curveTo(12.5f, 4.837f, 12.2366f, 4.2011f, 11.7678f, 3.7322f)
                curveTo(11.2989f, 3.2634f, 10.663f, 3f, 10f, 3f)
                horizontalLineTo(5.75f)
                curveTo(3.6789f, 3f, 2f, 4.6789f, 2f, 6.75f)
                verticalLineTo(18.02f)
                curveTo(2.0164f, 19.5287f, 3.2412f, 20.7446f, 4.75f, 20.75f)
                horizontalLineTo(17.41f)
                curveTo(18.5438f, 20.7449f, 19.5592f, 20.0468f, 19.97f, 18.99f)
                lineTo(22.06f, 12.49f)
                curveTo(22.2048f, 11.685f, 21.985f, 10.8572f, 21.46f, 10.23f)
                close()
                moveTo(3.5f, 6.75f)
                curveTo(3.5f, 5.5074f, 4.5074f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(10f)
                curveTo(10.5523f, 4.5f, 11f, 4.9477f, 11f, 5.5f)
                curveTo(11.0055f, 6.8784f, 12.1216f, 7.9945f, 13.5f, 8f)
                horizontalLineTo(18f)
                curveTo(18.8308f, 7.9999f, 19.5751f, 8.5134f, 19.87f, 9.29f)
                curveTo(19.697f, 9.275f, 19.523f, 9.275f, 19.35f, 9.29f)
                horizontalLineTo(7.15f)
                curveTo(5.9978f, 9.2903f, 4.968f, 10.0088f, 4.57f, 11.09f)
                lineTo(3.5f, 13.87f)
                verticalLineTo(6.75f)
                close()
                moveTo(17.41f, 19.25f)
                curveTo(17.9167f, 19.2494f, 18.372f, 18.9405f, 18.56f, 18.47f)
                lineTo(20.64f, 12.12f)
                curveTo(20.6779f, 11.7831f, 20.5727f, 11.4457f, 20.35f, 11.19f)
                curveTo(20.1009f, 10.8989f, 19.7329f, 10.737f, 19.35f, 10.75f)
                horizontalLineTo(7.15f)
                curveTo(6.6241f, 10.7503f, 6.1536f, 11.0772f, 5.97f, 11.57f)
                lineTo(3.5f, 18.12f)
                curveTo(3.5665f, 18.7609f, 4.1057f, 19.2483f, 4.75f, 19.25f)
                horizontalLineTo(17.41f)
                close()
            }
        }.build()
        return _Folderopenedline!!
    }

