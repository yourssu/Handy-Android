import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Instagramline, null)
}

private var _Instagramline: ImageVector? = null

public val Instagramline: ImageVector
    get() {
        if (_Instagramline != null) {
            return _Instagramline!!
        }
        _Instagramline = ImageVector.Builder(
            name = "Instagramline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(8f, 2f)
                horizontalLineTo(15.7f)
                curveTo(19.0137f, 2f, 21.7f, 4.6863f, 21.7f, 8f)
                verticalLineTo(15.7f)
                curveTo(21.7f, 19.0137f, 19.0137f, 21.7f, 15.7f, 21.7f)
                horizontalLineTo(8f)
                curveTo(4.6863f, 21.7f, 2f, 19.0137f, 2f, 15.7f)
                verticalLineTo(8f)
                curveTo(2f, 4.6863f, 4.6863f, 2f, 8f, 2f)
                close()
                moveTo(20.2f, 8f)
                curveTo(20.1945f, 5.517f, 18.183f, 3.5055f, 15.7f, 3.5f)
                horizontalLineTo(8f)
                curveTo(5.517f, 3.5055f, 3.5055f, 5.517f, 3.5f, 8f)
                verticalLineTo(15.7f)
                curveTo(3.5055f, 18.183f, 5.517f, 20.1945f, 8f, 20.2f)
                horizontalLineTo(15.7f)
                curveTo(18.183f, 20.1945f, 20.1945f, 18.183f, 20.2f, 15.7f)
                verticalLineTo(8f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(7.55f, 11.85f)
                curveTo(7.5555f, 9.4775f, 9.4775f, 7.5555f, 11.85f, 7.55f)
                curveTo(14.2225f, 7.5555f, 16.1445f, 9.4775f, 16.15f, 11.85f)
                curveTo(16.15f, 14.2248f, 14.2248f, 16.15f, 11.85f, 16.15f)
                curveTo(9.4752f, 16.15f, 7.55f, 14.2248f, 7.55f, 11.85f)
                close()
                moveTo(14.65f, 11.85f)
                curveTo(14.65f, 10.3036f, 13.3964f, 9.05f, 11.85f, 9.05f)
                curveTo(10.3059f, 9.0555f, 9.0555f, 10.3059f, 9.05f, 11.85f)
                curveTo(9.05f, 13.3964f, 10.3036f, 14.65f, 11.85f, 14.65f)
                curveTo(13.3964f, 14.65f, 14.65f, 13.3964f, 14.65f, 11.85f)
                close()
            }
            handyPath {
                moveTo(15.51f, 6.505f)
                curveTo(15.51f, 5.9058f, 15.9958f, 5.42f, 16.595f, 5.42f)
                curveTo(17.1942f, 5.42f, 17.68f, 5.9058f, 17.68f, 6.505f)
                curveTo(17.68f, 7.1042f, 17.1942f, 7.59f, 16.595f, 7.59f)
                curveTo(15.9958f, 7.59f, 15.51f, 7.1042f, 15.51f, 6.505f)
                close()
            }
        }.build()
        return _Instagramline!!
    }

