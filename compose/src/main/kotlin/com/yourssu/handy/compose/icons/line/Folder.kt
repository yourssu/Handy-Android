import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Folderline, null)
}

private var _Folderline: ImageVector? = null

public val Folderline: ImageVector
    get() {
        if (_Folderline != null) {
            return _Folderline!!
        }
        _Folderline = ImageVector.Builder(
            name = "Folderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.40099f, 2.00001f)
                horizontalLineTo(10.3716f)
                curveTo(12.0947f, 2f, 13.4914f, 3.5034f, 13.4914f, 5.3579f)
                curveTo(13.4914f, 5.4137f, 13.5121f, 5.4673f, 13.5487f, 5.5068f)
                curveTo(13.5854f, 5.5462f, 13.6352f, 5.5684f, 13.687f, 5.5684f)
                horizontalLineTo(17.599f)
                curveTo(20.0274f, 5.5742f, 21.9946f, 7.6916f, 22f, 10.3053f)
                verticalLineTo(17.2632f)
                curveTo(21.9946f, 19.8768f, 20.0274f, 21.9942f, 17.599f, 22f)
                horizontalLineTo(6.40099f)
                curveTo(3.9704f, 22f, 2f, 19.8792f, 2f, 17.2632f)
                verticalLineTo(6.73685f)
                curveTo(1.9974f, 5.4797f, 2.4602f, 4.2732f, 3.2862f, 3.3843f)
                curveTo(4.1121f, 2.4954f, 5.233f, 1.9972f, 6.401f, 2f)
                close()
                moveTo(11.9951f, 5.3579f)
                curveTo(11.9951f, 4.3754f, 11.2551f, 3.579f, 10.3423f, 3.579f)
                horizontalLineTo(6.40099f)
                curveTo(4.7806f, 3.579f, 3.467f, 4.9928f, 3.467f, 6.7368f)
                verticalLineTo(17.2632f)
                curveTo(3.467f, 19.0072f, 4.7806f, 20.4211f, 6.401f, 20.4211f)
                horizontalLineTo(17.5697f)
                curveTo(19.1901f, 20.4211f, 20.5037f, 19.0072f, 20.5037f, 17.2632f)
                verticalLineTo(10.3053f)
                curveTo(20.5037f, 8.5612f, 19.1901f, 7.1474f, 17.5697f, 7.1474f)
                horizontalLineTo(13.6577f)
                curveTo(12.7395f, 7.1474f, 11.9951f, 6.3462f, 11.9951f, 5.3579f)
                close()
            }
        }.build()
        return _Folderline!!
    }

