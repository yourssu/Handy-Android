import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Mouseline, null)
}

private var _Mouseline: ImageVector? = null

public val Mouseline: ImageVector
    get() {
        if (_Mouseline != null) {
            return _Mouseline!!
        }
        _Mouseline = ImageVector.Builder(
            name = "Mouseline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(11.8f, 2.00001f)
                horizontalLineTo(12.2f)
                curveTo(14.0043f, 1.9973f, 15.7354f, 2.7129f, 17.0113f, 3.9887f)
                curveTo(18.2871f, 5.2646f, 19.0027f, 6.9957f, 19f, 8.8f)
                verticalLineTo(15.2f)
                curveTo(19.0027f, 17.0043f, 18.2871f, 18.7354f, 17.0113f, 20.0113f)
                curveTo(15.7354f, 21.2871f, 14.0043f, 22.0027f, 12.2f, 22f)
                horizontalLineTo(11.8f)
                curveTo(9.9957f, 22.0027f, 8.2646f, 21.2871f, 6.9887f, 20.0113f)
                curveTo(5.7129f, 18.7354f, 4.9973f, 17.0043f, 5f, 15.2f)
                verticalLineTo(8.80001f)
                curveTo(4.9973f, 6.9957f, 5.7129f, 5.2646f, 6.9887f, 3.9887f)
                curveTo(8.2646f, 2.7129f, 9.9957f, 1.9973f, 11.8f, 2f)
                close()
                moveTo(12.2f, 20.5f)
                curveTo(15.1248f, 20.4945f, 17.4945f, 18.1248f, 17.5f, 15.2f)
                verticalLineTo(8.80001f)
                curveTo(17.4945f, 5.8752f, 15.1248f, 3.5055f, 12.2f, 3.5f)
                horizontalLineTo(11.8f)
                curveTo(8.8752f, 3.5055f, 6.5055f, 5.8752f, 6.5f, 8.8f)
                verticalLineTo(15.2f)
                curveTo(6.5055f, 18.1248f, 8.8752f, 20.4945f, 11.8f, 20.5f)
                horizontalLineTo(12.2f)
                close()
            }
            handyPath {
                moveTo(12f, 6.25001f)
                curveTo(11.5881f, 6.2554f, 11.2554f, 6.588f, 11.25f, 7f)
                verticalLineTo(12f)
                curveTo(11.25f, 12.4142f, 11.5858f, 12.75f, 12f, 12.75f)
                curveTo(12.4142f, 12.75f, 12.75f, 12.4142f, 12.75f, 12f)
                verticalLineTo(7.00001f)
                curveTo(12.7446f, 6.588f, 12.412f, 6.2554f, 12f, 6.25f)
                close()
            }
        }.build()
        return _Mouseline!!
    }

