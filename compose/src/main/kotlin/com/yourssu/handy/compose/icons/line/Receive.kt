import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Receiveline, null)
}

private var _Receiveline: ImageVector? = null

public val Receiveline: ImageVector
    get() {
        if (_Receiveline != null) {
            return _Receiveline!!
        }
        _Receiveline = ImageVector.Builder(
            name = "Receiveline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(16.5793f, 4.5f)
                horizontalLineTo(6.57934f)
                curveTo(6.1651f, 4.5f, 5.8293f, 4.1642f, 5.8293f, 3.75f)
                curveTo(5.8293f, 3.3358f, 6.1651f, 3f, 6.5793f, 3f)
                horizontalLineTo(16.5793f)
                curveTo(16.9936f, 3f, 17.3293f, 3.3358f, 17.3293f, 3.75f)
                curveTo(17.3293f, 4.1642f, 16.9936f, 4.5f, 16.5793f, 4.5f)
                close()
            }
            handyPath {
                moveTo(17.4093f, 13.2564f)
                curveTo(17.6089f, 13.2564f, 17.8001f, 13.3371f, 17.9393f, 13.48f)
                curveTo(18.2318f, 13.7728f, 18.2318f, 14.2472f, 17.9393f, 14.54f)
                lineTo(12.1093f, 20.36f)
                curveTo(11.8165f, 20.6525f, 11.3422f, 20.6525f, 11.0493f, 20.36f)
                lineTo(5.21934f, 14.54f)
                curveTo(4.9269f, 14.2472f, 4.9269f, 13.7728f, 5.2193f, 13.48f)
                curveTo(5.3586f, 13.3371f, 5.5498f, 13.2564f, 5.7493f, 13.2564f)
                curveTo(5.9489f, 13.2564f, 6.14f, 13.3371f, 6.2793f, 13.48f)
                lineTo(10.8293f, 18.02f)
                verticalLineTo(6.8f)
                curveTo(10.8293f, 6.3858f, 11.1651f, 6.05f, 11.5793f, 6.05f)
                curveTo(11.9936f, 6.05f, 12.3293f, 6.3858f, 12.3293f, 6.8f)
                verticalLineTo(18.02f)
                lineTo(16.8793f, 13.48f)
                curveTo(17.0186f, 13.3371f, 17.2098f, 13.2564f, 17.4093f, 13.2564f)
                close()
            }
        }.build()
        return _Receiveline!!
    }

