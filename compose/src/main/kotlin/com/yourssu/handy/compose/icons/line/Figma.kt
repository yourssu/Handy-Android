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
    Image(Figmaline, null)
}

private var _Figmaline: ImageVector? = null

public val Figmaline: ImageVector
    get() {
        if (_Figmaline != null) {
            return _Figmaline!!
        }
        _Figmaline = ImageVector.Builder(
            name = "Figmaline",
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
                moveTo(18.3119f, 4.56678f)
                curveTo(18.8192f, 6.1024f, 18.2821f, 7.7901f, 16.9805f, 8.75f)
                curveTo(18.2969f, 9.7025f, 18.8477f, 11.396f, 18.3435f, 12.9407f)
                curveTo(17.8392f, 14.4853f, 16.3953f, 15.5277f, 14.7705f, 15.52f)
                curveTo(13.956f, 15.5187f, 13.1649f, 15.2479f, 12.5205f, 14.75f)
                verticalLineTo(17.75f)
                curveTo(12.5205f, 19.5135f, 11.2918f, 21.0387f, 9.5687f, 21.4141f)
                curveTo(7.8456f, 21.7894f, 6.0938f, 20.9135f, 5.3603f, 19.3099f)
                curveTo(4.6268f, 17.7062f, 5.1097f, 15.8081f, 6.5205f, 14.75f)
                curveTo(5.5648f, 14.0493f, 5.0001f, 12.9351f, 5.0001f, 11.75f)
                curveTo(5.0001f, 10.5649f, 5.5648f, 9.4508f, 6.5205f, 8.75f)
                curveTo(5.2189f, 7.7901f, 4.6817f, 6.1024f, 5.189f, 4.5668f)
                curveTo(5.6963f, 3.0312f, 7.1332f, 1.9956f, 8.7505f, 2f)
                horizontalLineTo(14.7505f)
                curveTo(16.3677f, 1.9956f, 17.8046f, 3.0312f, 18.3119f, 4.5668f)
                close()
                moveTo(14.7505f, 8.00001f)
                curveTo(15.9853f, 7.989f, 16.9805f, 6.9849f, 16.9805f, 5.75f)
                horizontalLineTo(17.0005f)
                curveTo(17.0005f, 4.5074f, 15.9931f, 3.5f, 14.7505f, 3.5f)
                horizontalLineTo(12.5005f)
                verticalLineTo(8.00001f)
                horizontalLineTo(14.7505f)
                close()
                moveTo(6.50047f, 5.75001f)
                curveTo(6.5005f, 4.5074f, 7.5078f, 3.5f, 8.7505f, 3.5f)
                horizontalLineTo(11.0005f)
                verticalLineTo(8.00001f)
                horizontalLineTo(8.75047f)
                curveTo(7.5078f, 8f, 6.5005f, 6.9927f, 6.5005f, 5.75f)
                close()
                moveTo(8.75047f, 9.50001f)
                curveTo(7.5078f, 9.5f, 6.5005f, 10.5074f, 6.5005f, 11.75f)
                curveTo(6.5005f, 12.9927f, 7.5078f, 14f, 8.7505f, 14f)
                horizontalLineTo(11.0005f)
                verticalLineTo(9.50001f)
                horizontalLineTo(8.75047f)
                close()
                moveTo(11.0005f, 17.75f)
                curveTo(11.0005f, 18.9927f, 9.9931f, 20f, 8.7505f, 20f)
                curveTo(7.5078f, 20f, 6.5005f, 18.9927f, 6.5005f, 17.75f)
                curveTo(6.5005f, 16.5074f, 7.5078f, 15.5f, 8.7505f, 15.5f)
                horizontalLineTo(11.0005f)
                verticalLineTo(17.75f)
                close()
                moveTo(12.5005f, 11.75f)
                curveTo(12.5005f, 12.9927f, 13.5078f, 14f, 14.7505f, 14f)
                curveTo(15.9931f, 14f, 17.0005f, 12.9927f, 17.0005f, 11.75f)
                curveTo(17.0005f, 10.5074f, 15.9931f, 9.5f, 14.7505f, 9.5f)
                curveTo(13.5078f, 9.5f, 12.5005f, 10.5074f, 12.5005f, 11.75f)
                close()
            }
        }.build()
        return _Figmaline!!
    }

