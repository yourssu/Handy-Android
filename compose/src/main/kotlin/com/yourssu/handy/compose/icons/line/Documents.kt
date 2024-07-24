import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Documentsline, null)
}

private var _Documentsline: ImageVector? = null

public val Documentsline: ImageVector
    get() {
        if (_Documentsline != null) {
            return _Documentsline!!
        }
        _Documentsline = ImageVector.Builder(
            name = "Documentsline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(19.53f, 9.44016f)
                lineTo(12.53f, 2.44016f)
                curveTo(12.3827f, 2.3139f, 12.194f, 2.2462f, 12f, 2.2502f)
                horizontalLineTo(9f)
                curveTo(6.3766f, 2.2502f, 4.25f, 4.3768f, 4.25f, 7.0002f)
                verticalLineTo(17.0002f)
                curveTo(4.25f, 19.6235f, 6.3766f, 21.7502f, 9f, 21.7502f)
                horizontalLineTo(15f)
                curveTo(17.6234f, 21.7502f, 19.75f, 19.6235f, 19.75f, 17.0002f)
                verticalLineTo(10.0002f)
                curveTo(19.7534f, 9.7918f, 19.6743f, 9.5905f, 19.53f, 9.4402f)
                close()
                moveTo(12.75f, 4.79016f)
                lineTo(17.21f, 9.25016f)
                horizontalLineTo(14f)
                curveTo(13.3096f, 9.2502f, 12.75f, 8.6905f, 12.75f, 8.0002f)
                verticalLineTo(4.79016f)
                close()
                moveTo(5.75f, 17.0002f)
                curveTo(5.7555f, 18.7928f, 7.2073f, 20.2447f, 9f, 20.2502f)
                horizontalLineTo(15f)
                curveTo(16.7926f, 20.2447f, 18.2445f, 18.7928f, 18.25f, 17.0002f)
                verticalLineTo(10.7502f)
                horizontalLineTo(14f)
                curveTo(12.4812f, 10.7502f, 11.25f, 9.5189f, 11.25f, 8.0002f)
                verticalLineTo(3.75016f)
                horizontalLineTo(9f)
                curveTo(7.2073f, 3.7557f, 5.7555f, 5.2075f, 5.75f, 7.0002f)
                verticalLineTo(17.0002f)
                close()
            }
        }.build()
        return _Documentsline!!
    }

