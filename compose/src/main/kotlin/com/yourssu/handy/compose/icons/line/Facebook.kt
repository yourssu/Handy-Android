import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Facebookline, null)
}

private var _Facebookline: ImageVector? = null

public val Facebookline: ImageVector
    get() {
        if (_Facebookline != null) {
            return _Facebookline!!
        }
        _Facebookline = ImageVector.Builder(
            name = "Facebookline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.06f, 9.91f)
                horizontalLineTo(15.06f)
                curveTo(15.189f, 9.91f, 15.3127f, 9.8581f, 15.403f, 9.7659f)
                curveTo(15.4933f, 9.6737f, 15.5427f, 9.549f, 15.54f, 9.42f)
                verticalLineTo(7.82f)
                curveTo(15.5409f, 7.5698f, 15.3494f, 7.3609f, 15.1f, 7.34f)
                curveTo(15.1f, 7.34f, 14.39f, 7.28f, 13.52f, 7.28f)
                curveTo(11.38f, 7.28f, 10.2f, 8.55f, 10.2f, 10.85f)
                verticalLineTo(12.62f)
                horizontalLineTo(8.22999f)
                curveTo(8.1019f, 12.6172f, 7.9782f, 12.6669f, 7.8875f, 12.7576f)
                curveTo(7.7969f, 12.8482f, 7.7472f, 12.9719f, 7.75f, 13.1f)
                verticalLineTo(14.56f)
                curveTo(7.7472f, 14.6881f, 7.7969f, 14.8118f, 7.8875f, 14.9024f)
                curveTo(7.9782f, 14.9931f, 8.1019f, 15.0428f, 8.23f, 15.04f)
                horizontalLineTo(10.17f)
                verticalLineTo(20.7f)
                horizontalLineTo(13.09f)
                verticalLineTo(15.04f)
                horizontalLineTo(14.85f)
                curveTo(15.0917f, 15.0375f, 15.2955f, 14.8592f, 15.33f, 14.62f)
                lineTo(15.51f, 13.16f)
                curveTo(15.5283f, 13.0218f, 15.4844f, 12.8826f, 15.39f, 12.78f)
                curveTo(15.2984f, 12.6776f, 15.1674f, 12.6194f, 15.03f, 12.62f)
                horizontalLineTo(13.09f)
                verticalLineTo(10.91f)
                curveTo(13.0897f, 10.3692f, 13.5195f, 9.9262f, 14.06f, 9.91f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(2f, 11.91f)
                curveTo(2f, 6.4369f, 6.4369f, 2f, 11.91f, 2f)
                curveTo(14.5383f, 2f, 17.0589f, 3.0441f, 18.9174f, 4.9026f)
                curveTo(20.7759f, 6.7611f, 21.82f, 9.2817f, 21.82f, 11.91f)
                curveTo(21.82f, 17.3831f, 17.3831f, 21.82f, 11.91f, 21.82f)
                curveTo(6.4369f, 21.82f, 2f, 17.3831f, 2f, 11.91f)
                close()
                moveTo(20.32f, 11.91f)
                curveTo(20.32f, 7.2653f, 16.5547f, 3.5f, 11.91f, 3.5f)
                curveTo(7.2698f, 3.511f, 3.511f, 7.2698f, 3.5f, 11.91f)
                curveTo(3.5f, 16.5547f, 7.2653f, 20.32f, 11.91f, 20.32f)
                curveTo(16.5547f, 20.32f, 20.32f, 16.5547f, 20.32f, 11.91f)
                close()
            }
        }.build()
        return _Facebookline!!
    }

