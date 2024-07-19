import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Chatline, null)
}

private var _Chatline: ImageVector? = null

public val Chatline: ImageVector
    get() {
        if (_Chatline != null) {
            return _Chatline!!
        }
        _Chatline = ImageVector.Builder(
            name = "Chatline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(6.24f, 2.00222f)
                horizontalLineTo(16.74f)
                curveTo(18.1118f, 1.9619f, 19.4428f, 2.4719f, 20.4365f, 3.4186f)
                curveTo(21.4301f, 4.3653f, 22.0039f, 5.67f, 22.03f, 7.0422f)
                verticalLineTo(14.6322f)
                curveTo(21.9483f, 17.4531f, 19.6116f, 19.6827f, 16.79f, 19.6322f)
                horizontalLineTo(15.17f)
                curveTo(14.7628f, 19.6333f, 14.3775f, 19.8168f, 14.12f, 20.1322f)
                lineTo(12.59f, 22.0822f)
                curveTo(12.3337f, 22.3994f, 11.9478f, 22.5837f, 11.54f, 22.5837f)
                curveTo(11.1322f, 22.5837f, 10.7463f, 22.3994f, 10.49f, 22.0822f)
                lineTo(8.91f, 20.0922f)
                curveTo(8.6525f, 19.7768f, 8.2672f, 19.5933f, 7.86f, 19.5922f)
                horizontalLineTo(6.24f)
                curveTo(3.4184f, 19.6427f, 1.0817f, 17.4131f, 1f, 14.5922f)
                verticalLineTo(7.00222f)
                curveTo(1.0764f, 4.179f, 3.4163f, 1.9462f, 6.24f, 2.0022f)
                close()
                moveTo(16.75f, 18.1322f)
                curveTo(18.7585f, 18.1827f, 20.4301f, 16.6004f, 20.49f, 14.5922f)
                verticalLineTo(7.04222f)
                curveTo(20.4301f, 5.03f, 18.7523f, 3.4462f, 16.74f, 3.5022f)
                horizontalLineTo(6.24f)
                curveTo(4.2277f, 3.4462f, 2.5499f, 5.03f, 2.49f, 7.0422f)
                verticalLineTo(14.5922f)
                curveTo(2.5499f, 16.6044f, 4.2277f, 18.1883f, 6.24f, 18.1322f)
                horizontalLineTo(7.86f)
                curveTo(8.7271f, 18.1324f, 9.5473f, 18.5259f, 10.09f, 19.2022f)
                lineTo(11.49f, 20.9822f)
                lineTo(12.89f, 19.2022f)
                curveTo(13.4327f, 18.5259f, 14.2529f, 18.1324f, 15.12f, 18.1322f)
                horizontalLineTo(16.75f)
                close()
            }
            handyPath {
                moveTo(7.74f, 8.96222f)
                curveTo(7.3258f, 8.9622f, 6.99f, 9.298f, 6.99f, 9.7122f)
                verticalLineTo(12.1122f)
                curveTo(6.99f, 12.5264f, 7.3258f, 12.8622f, 7.74f, 12.8622f)
                curveTo(8.1542f, 12.8622f, 8.49f, 12.5264f, 8.49f, 12.1122f)
                verticalLineTo(9.71222f)
                curveTo(8.49f, 9.298f, 8.1542f, 8.9622f, 7.74f, 8.9622f)
                close()
            }
            handyPath {
                moveTo(11.49f, 8.96222f)
                curveTo(11.0758f, 8.9622f, 10.74f, 9.298f, 10.74f, 9.7122f)
                verticalLineTo(12.1122f)
                curveTo(10.74f, 12.5264f, 11.0758f, 12.8622f, 11.49f, 12.8622f)
                curveTo(11.9042f, 12.8622f, 12.24f, 12.5264f, 12.24f, 12.1122f)
                verticalLineTo(9.71222f)
                curveTo(12.24f, 9.298f, 11.9042f, 8.9622f, 11.49f, 8.9622f)
                close()
            }
            handyPath {
                moveTo(15.24f, 8.96222f)
                curveTo(14.8258f, 8.9622f, 14.49f, 9.298f, 14.49f, 9.7122f)
                verticalLineTo(12.1122f)
                curveTo(14.49f, 12.5264f, 14.8258f, 12.8622f, 15.24f, 12.8622f)
                curveTo(15.6542f, 12.8622f, 15.99f, 12.5264f, 15.99f, 12.1122f)
                verticalLineTo(9.71222f)
                curveTo(15.99f, 9.298f, 15.6542f, 8.9622f, 15.24f, 8.9622f)
                close()
            }
        }.build()
        return _Chatline!!
    }

