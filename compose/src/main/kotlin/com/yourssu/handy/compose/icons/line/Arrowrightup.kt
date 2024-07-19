import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowrightupline, null)
}

private var _Arrowrightupline: ImageVector? = null

public val Arrowrightupline: ImageVector
    get() {
        if (_Arrowrightupline != null) {
            return _Arrowrightupline!!
        }
        _Arrowrightupline = ImageVector.Builder(
            name = "Arrowrightupline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(6.22438f, 17.9287f)
                curveTo(6.3659f, 18.0667f, 6.5568f, 18.1423f, 6.7544f, 18.1387f)
                curveTo(6.9514f, 18.1391f, 7.1411f, 18.064f, 7.2844f, 17.9287f)
                lineTo(16.6144f, 8.58994f)
                verticalLineTo(16.6487f)
                curveTo(16.6144f, 17.0629f, 16.9502f, 17.3987f, 17.3644f, 17.3987f)
                curveTo(17.5658f, 17.4042f, 17.7608f, 17.3273f, 17.9042f, 17.1857f)
                curveTo(18.0477f, 17.0442f, 18.1272f, 16.8502f, 18.1244f, 16.6487f)
                verticalLineTo(6.9165f)
                curveTo(18.1504f, 6.8024f, 18.1498f, 6.6819f, 18.1198f, 6.5644f)
                curveTo(18.0519f, 6.2987f, 17.8444f, 6.0912f, 17.5787f, 6.0233f)
                curveTo(17.4612f, 5.9934f, 17.3407f, 5.9928f, 17.2266f, 6.0187f)
                horizontalLineTo(7.49438f)
                curveTo(7.0802f, 6.0187f, 6.7444f, 6.3545f, 6.7444f, 6.7687f)
                curveTo(6.7444f, 7.1829f, 7.0802f, 7.5187f, 7.4944f, 7.5187f)
                horizontalLineTo(15.5644f)
                lineTo(6.22438f, 16.8587f)
                curveTo(6.0808f, 16.9997f, 6f, 17.1925f, 6f, 17.3937f)
                curveTo(6f, 17.5949f, 6.0808f, 17.7877f, 6.2244f, 17.9287f)
                close()
            }
        }.build()
        return _Arrowrightupline!!
    }

