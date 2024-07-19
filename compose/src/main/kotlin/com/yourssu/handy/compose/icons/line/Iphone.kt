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
    Image(Iphoneline, null)
}

private var _Iphoneline: ImageVector? = null

public val Iphoneline: ImageVector
    get() {
        if (_Iphoneline != null) {
            return _Iphoneline!!
        }
        _Iphoneline = ImageVector.Builder(
            name = "Iphoneline",
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
                moveTo(16.6383f, 2.00024f)
                horizontalLineTo(8.36167f)
                curveTo(7.0794f, 1.9821f, 6.0237f, 3.0039f, 6f, 4.2861f)
                verticalLineTo(20.2977f)
                curveTo(6.0237f, 21.5799f, 7.0794f, 22.6017f, 8.3617f, 22.5836f)
                horizontalLineTo(16.6383f)
                curveTo(17.9206f, 22.6017f, 18.9763f, 21.5799f, 19f, 20.2977f)
                verticalLineTo(4.28607f)
                curveTo(18.9763f, 3.0039f, 17.9206f, 1.9821f, 16.6383f, 2.0002f)
                close()
                moveTo(11.1458f, 3.62524f)
                horizontalLineTo(13.8542f)
                verticalLineTo(4.1669f)
                curveTo(13.8542f, 4.3165f, 13.7329f, 4.4377f, 13.5833f, 4.4377f)
                horizontalLineTo(11.4167f)
                curveTo(11.2671f, 4.4377f, 11.1458f, 4.3165f, 11.1458f, 4.1669f)
                verticalLineTo(3.62524f)
                close()
                moveTo(16.6383f, 20.9586f)
                curveTo(17.0234f, 20.9771f, 17.3517f, 20.6825f, 17.375f, 20.2977f)
                verticalLineTo(4.28607f)
                curveTo(17.3517f, 3.9013f, 17.0234f, 3.6067f, 16.6383f, 3.6252f)
                horizontalLineTo(15.4792f)
                verticalLineTo(4.1669f)
                curveTo(15.4792f, 4.6697f, 15.2794f, 5.1519f, 14.9239f, 5.5075f)
                curveTo(14.5684f, 5.863f, 14.0861f, 6.0627f, 13.5833f, 6.0627f)
                horizontalLineTo(11.4167f)
                curveTo(10.3696f, 6.0627f, 9.5208f, 5.2139f, 9.5208f, 4.1669f)
                verticalLineTo(3.62524f)
                horizontalLineTo(8.36167f)
                curveTo(7.9766f, 3.6067f, 7.6483f, 3.9013f, 7.625f, 4.2861f)
                verticalLineTo(20.2977f)
                curveTo(7.6483f, 20.6825f, 7.9766f, 20.9771f, 8.3617f, 20.9586f)
                horizontalLineTo(16.6383f)
                close()
            }
        }.build()
        return _Iphoneline!!
    }

