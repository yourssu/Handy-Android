import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Expandline, null)
}

private var _Expandline: ImageVector? = null

public val Expandline: ImageVector
    get() {
        if (_Expandline != null) {
            return _Expandline!!
        }
        _Expandline = ImageVector.Builder(
            name = "Expandline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(18.6943f, 2f)
                horizontalLineTo(14.8848f)
                curveTo(14.4339f, 2f, 14.0685f, 2.3655f, 14.0685f, 2.8163f)
                curveTo(14.0685f, 3.2672f, 14.4339f, 3.6326f, 14.8848f, 3.6326f)
                horizontalLineTo(18.6943f)
                curveTo(19.4457f, 3.6326f, 20.0548f, 4.2418f, 20.0548f, 4.9932f)
                verticalLineTo(8.80272f)
                curveTo(20.0548f, 9.2536f, 20.4203f, 9.619f, 20.8712f, 9.619f)
                curveTo(21.322f, 9.619f, 21.6875f, 9.2536f, 21.6875f, 8.8027f)
                verticalLineTo(4.9932f)
                curveTo(21.6875f, 3.3401f, 20.3474f, 2f, 18.6943f, 2f)
                close()
            }
            handyPath {
                moveTo(4.6807f, 20.3673f)
                horizontalLineTo(8.49022f)
                curveTo(8.9411f, 20.3673f, 9.3065f, 20.7328f, 9.3065f, 21.1837f)
                curveTo(9.3065f, 21.6345f, 8.9411f, 22f, 8.4902f, 22f)
                horizontalLineTo(4.6807f)
                curveTo(3.0276f, 22f, 1.6875f, 20.6599f, 1.6875f, 19.0068f)
                verticalLineTo(15.1973f)
                curveTo(1.6875f, 14.9056f, 1.8431f, 14.6361f, 2.0957f, 14.4903f)
                curveTo(2.3482f, 14.3445f, 2.6594f, 14.3445f, 2.912f, 14.4903f)
                curveTo(3.1646f, 14.6361f, 3.3201f, 14.9056f, 3.3201f, 15.1973f)
                verticalLineTo(19.0068f)
                curveTo(3.3201f, 19.7582f, 3.9293f, 20.3673f, 4.6807f, 20.3673f)
                close()
            }
            handyPath {
                moveTo(20.0548f, 15.1984f)
                curveTo(20.0548f, 14.747f, 20.4203f, 14.381f, 20.8712f, 14.381f)
                curveTo(21.3178f, 14.3809f, 21.6815f, 14.7403f, 21.6875f, 15.1875f)
                verticalLineTo(19.0025f)
                curveTo(21.6875f, 20.658f, 20.3474f, 22f, 18.6943f, 22f)
                horizontalLineTo(14.8848f)
                curveTo(14.4339f, 22f, 14.0685f, 21.634f, 14.0685f, 21.1825f)
                curveTo(14.0685f, 20.731f, 14.4339f, 20.365f, 14.8848f, 20.365f)
                horizontalLineTo(18.6943f)
                curveTo(19.4457f, 20.365f, 20.0548f, 19.755f, 20.0548f, 19.0025f)
                verticalLineTo(15.1984f)
                close()
            }
            handyPath {
                moveTo(4.6807f, 2f)
                horizontalLineTo(8.49022f)
                curveTo(8.9411f, 2f, 9.3065f, 2.3655f, 9.3065f, 2.8163f)
                curveTo(9.3065f, 3.2672f, 8.9411f, 3.6326f, 8.4902f, 3.6326f)
                horizontalLineTo(4.6807f)
                curveTo(3.9293f, 3.6326f, 3.3201f, 4.2418f, 3.3201f, 4.9932f)
                verticalLineTo(8.80272f)
                curveTo(3.3201f, 9.2536f, 2.9547f, 9.619f, 2.5038f, 9.619f)
                curveTo(2.053f, 9.619f, 1.6875f, 9.2536f, 1.6875f, 8.8027f)
                verticalLineTo(4.9932f)
                curveTo(1.6875f, 3.3401f, 3.0276f, 2f, 4.6807f, 2f)
                close()
            }
        }.build()
        return _Expandline!!
    }

