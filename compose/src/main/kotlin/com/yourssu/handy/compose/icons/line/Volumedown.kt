import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Volumedownline, null)
}

private var _Volumedownline: ImageVector? = null

public val Volumedownline: ImageVector
    get() {
        if (_Volumedownline != null) {
            return _Volumedownline!!
        }
        _Volumedownline = ImageVector.Builder(
            name = "Volumedownline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(22.14f, 11.25f)
                horizontalLineTo(17.3f)
                curveTo(16.8858f, 11.25f, 16.55f, 11.5858f, 16.55f, 12f)
                curveTo(16.55f, 12.4142f, 16.8858f, 12.75f, 17.3f, 12.75f)
                horizontalLineTo(22.14f)
                curveTo(22.5542f, 12.75f, 22.89f, 12.4142f, 22.89f, 12f)
                curveTo(22.89f, 11.5858f, 22.5542f, 11.25f, 22.14f, 11.25f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(12.6f, 4.54998f)
                curveTo(12.9328f, 4.322f, 13.3267f, 4.2f, 13.73f, 4.2f)
                curveTo(14.2761f, 4.1862f, 14.804f, 4.3964f, 15.1912f, 4.7817f)
                curveTo(15.5783f, 5.167f, 15.7911f, 5.6939f, 15.78f, 6.24f)
                verticalLineTo(17.68f)
                curveTo(15.8063f, 18.443f, 15.3958f, 19.1544f, 14.7221f, 19.5136f)
                curveTo(14.0483f, 19.8728f, 13.2289f, 19.8171f, 12.61f, 19.37f)
                lineTo(6.73f, 15.45f)
                curveTo(6.3941f, 15.2299f, 6.0016f, 15.1118f, 5.6f, 15.11f)
                horizontalLineTo(4f)
                curveTo(2.8954f, 15.11f, 2f, 14.2145f, 2f, 13.11f)
                verticalLineTo(10.81f)
                curveTo(2f, 9.7054f, 2.8954f, 8.81f, 4f, 8.81f)
                horizontalLineTo(5.59f)
                curveTo(5.9916f, 8.8081f, 6.3841f, 8.69f, 6.72f, 8.47f)
                lineTo(12.6f, 4.54998f)
                close()
                moveTo(13.73f, 18.3f)
                curveTo(14.0282f, 18.3f, 14.27f, 18.0582f, 14.27f, 17.76f)
                lineTo(14.32f, 6.23998f)
                curveTo(14.32f, 5.9417f, 14.0782f, 5.7f, 13.78f, 5.7f)
                curveTo(13.6734f, 5.7003f, 13.5692f, 5.7315f, 13.48f, 5.79f)
                lineTo(7.6f, 9.71998f)
                curveTo(7.0066f, 10.1107f, 6.3104f, 10.3161f, 5.6f, 10.31f)
                horizontalLineTo(4f)
                curveTo(3.7018f, 10.31f, 3.46f, 10.5517f, 3.46f, 10.85f)
                verticalLineTo(13.15f)
                curveTo(3.46f, 13.4482f, 3.7018f, 13.69f, 4f, 13.69f)
                horizontalLineTo(5.55f)
                curveTo(6.2604f, 13.6838f, 6.9566f, 13.8892f, 7.55f, 14.28f)
                lineTo(13.43f, 18.21f)
                curveTo(13.5192f, 18.2684f, 13.6234f, 18.2997f, 13.73f, 18.3f)
                close()
            }
        }.build()
        return _Volumedownline!!
    }

