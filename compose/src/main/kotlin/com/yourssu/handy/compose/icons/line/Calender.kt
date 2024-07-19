import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Calenderline, null)
}

private var _Calenderline: ImageVector? = null

public val Calenderline: ImageVector
    get() {
        if (_Calenderline != null) {
            return _Calenderline!!
        }
        _Calenderline = ImageVector.Builder(
            name = "Calenderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(16.5f, 8.16f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 8.16f, 6.75f, 8.4958f, 6.75f, 8.91f)
                curveTo(6.75f, 9.3242f, 7.0858f, 9.66f, 7.5f, 9.66f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 9.66f, 17.25f, 9.3242f, 17.25f, 8.91f)
                curveTo(17.25f, 8.4958f, 16.9142f, 8.16f, 16.5f, 8.16f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(16.89f, 3.57f)
                horizontalLineTo(17f)
                curveTo(19.7614f, 3.57f, 22f, 5.8086f, 22f, 8.57f)
                verticalLineTo(17.57f)
                curveTo(22f, 20.3314f, 19.7614f, 22.57f, 17f, 22.57f)
                horizontalLineTo(7f)
                curveTo(5.6739f, 22.57f, 4.4021f, 22.0432f, 3.4645f, 21.1055f)
                curveTo(2.5268f, 20.1679f, 2f, 18.8961f, 2f, 17.57f)
                verticalLineTo(8.57f)
                curveTo(2f, 5.8086f, 4.2386f, 3.57f, 7f, 3.57f)
                horizontalLineTo(7.09f)
                verticalLineTo(1.75f)
                curveTo(7.09f, 1.3358f, 7.4258f, 1f, 7.84f, 1f)
                curveTo(8.2542f, 1f, 8.59f, 1.3358f, 8.59f, 1.75f)
                verticalLineTo(3.57f)
                horizontalLineTo(15.39f)
                verticalLineTo(1.75f)
                curveTo(15.39f, 1.3358f, 15.7258f, 1f, 16.14f, 1f)
                curveTo(16.5542f, 1f, 16.89f, 1.3358f, 16.89f, 1.75f)
                verticalLineTo(3.57f)
                close()
                moveTo(17f, 21.07f)
                curveTo(18.933f, 21.07f, 20.5f, 19.503f, 20.5f, 17.57f)
                verticalLineTo(8.57f)
                curveTo(20.5f, 6.637f, 18.933f, 5.07f, 17f, 5.07f)
                horizontalLineTo(7f)
                curveTo(5.067f, 5.07f, 3.5f, 6.637f, 3.5f, 8.57f)
                verticalLineTo(17.57f)
                curveTo(3.5f, 19.503f, 5.067f, 21.07f, 7f, 21.07f)
                horizontalLineTo(17f)
                close()
            }
        }.build()
        return _Calenderline!!
    }

