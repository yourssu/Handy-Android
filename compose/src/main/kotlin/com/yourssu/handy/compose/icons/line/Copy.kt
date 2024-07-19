import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Copyline, null)
}

private var _Copyline: ImageVector? = null

public val Copyline: ImageVector
    get() {
        if (_Copyline != null) {
            return _Copyline!!
        }
        _Copyline = ImageVector.Builder(
            name = "Copyline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(16.5f, 4.5f)
                verticalLineTo(12.5f)
                curveTo(16.5f, 14.7091f, 14.7091f, 16.5f, 12.5f, 16.5f)
                horizontalLineTo(4.5f)
                curveTo(2.2909f, 16.5f, 0.5f, 14.7091f, 0.5f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(0.5f, 2.2909f, 2.2909f, 0.5f, 4.5f, 0.5f)
                horizontalLineTo(12.5f)
                curveTo(14.7091f, 0.5f, 16.5f, 2.2909f, 16.5f, 4.5f)
                close()
                moveTo(2f, 4.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.163f, 2.2634f, 13.7989f, 2.7322f, 14.2678f)
                curveTo(3.2011f, 14.7366f, 3.837f, 15f, 4.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 15f, 15f, 13.8807f, 15f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(15f, 3.1193f, 13.8807f, 2f, 12.5f, 2f)
                horizontalLineTo(4.5f)
                curveTo(3.1193f, 2f, 2f, 3.1193f, 2f, 4.5f)
                close()
            }
            handyPath {
                moveTo(19.5f, 6.75f)
                curveTo(19.088f, 6.7554f, 18.7554f, 7.088f, 18.75f, 7.5f)
                verticalLineTo(15.5f)
                curveTo(18.7445f, 17.2926f, 17.2926f, 18.7445f, 15.5f, 18.75f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 18.75f, 6.75f, 19.0858f, 6.75f, 19.5f)
                curveTo(6.75f, 19.9142f, 7.0858f, 20.25f, 7.5f, 20.25f)
                horizontalLineTo(15.5f)
                curveTo(18.1234f, 20.25f, 20.25f, 18.1234f, 20.25f, 15.5f)
                verticalLineTo(7.5f)
                curveTo(20.2446f, 7.088f, 19.912f, 6.7554f, 19.5f, 6.75f)
                close()
            }
        }.build()
        return _Copyline!!
    }

