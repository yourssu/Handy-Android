import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Heartline, null)
}

private var _Heartline: ImageVector? = null

public val Heartline: ImageVector
    get() {
        if (_Heartline != null) {
            return _Heartline!!
        }
        _Heartline = ImageVector.Builder(
            name = "Heartline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12.1f, 20.8f)
                curveTo(11.6f, 20.8f, 11f, 20.6f, 10.6f, 20.2f)
                curveTo(4.1f, 14.5f, 4f, 14.4f, 4f, 14.3f)
                lineTo(3.9f, 14.2f)
                curveTo(2.7f, 13f, 2f, 11.3f, 2f, 9.6f)
                verticalLineTo(9.4f)
                curveTo(2.1f, 5.8f, 5f, 3f, 8.6f, 3f)
                curveTo(9.7f, 3f, 11.2f, 3.6f, 12.1f, 4.8f)
                curveTo(13f, 3.6f, 14.6f, 3f, 15.7f, 3f)
                curveTo(19.3f, 3f, 22.1f, 5.8f, 22.3f, 9.4f)
                verticalLineTo(9.6f)
                curveTo(22.3f, 11.4f, 21.6f, 13f, 20.4f, 14.3f)
                lineTo(20.3f, 14.4f)
                curveTo(20.2f, 14.5f, 19.4f, 15.2f, 13.7f, 20.3f)
                curveTo(13.2f, 20.6f, 12.7f, 20.8f, 12.1f, 20.8f)
                close()
                moveTo(5.5f, 14f)
                curveTo(5.9f, 14.4f, 7.9f, 15.8f, 11.6f, 19f)
                curveTo(11.9f, 19.3f, 12.3f, 19.3f, 12.6f, 19f)
                curveTo(16.4f, 15.6f, 18.6f, 13.7f, 19.1f, 13.3f)
                lineTo(19.2f, 13.2f)
                curveTo(20.2f, 12.2f, 20.7f, 10.9f, 20.7f, 9.6f)
                verticalLineTo(9.4f)
                curveTo(20.6f, 6.6f, 18.4f, 4.5f, 15.6f, 4.5f)
                curveTo(14.9f, 4.5f, 13.5f, 5f, 13f, 6.1f)
                curveTo(12.8f, 6.5f, 12.4f, 6.7f, 12f, 6.7f)
                curveTo(11.6f, 6.7f, 11.2f, 6.5f, 11f, 6.1f)
                curveTo(10.5f, 5.1f, 9.2f, 4.5f, 8.4f, 4.5f)
                curveTo(5.7f, 4.5f, 3.4f, 6.7f, 3.3f, 9.4f)
                verticalLineTo(9.7f)
                curveTo(3.3f, 11f, 3.9f, 12.3f, 4.8f, 13.2f)
                lineTo(5.5f, 14f)
                close()
            }
        }.build()
        return _Heartline!!
    }

