package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Useraddfilled, null)
}

private var _Useraddfilled: ImageVector? = null

public val Useraddfilled: ImageVector
    get() {
        if (_Useraddfilled != null) {
            return _Useraddfilled!!
        }
        _Useraddfilled = ImageVector.Builder(
            name = "Useraddfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.65f, 22f)
                horizontalLineTo(5.35999f)
                curveTo(4.3495f, 21.9639f, 3.4083f, 21.4774f, 2.7946f, 20.6739f)
                curveTo(2.1808f, 19.8704f, 1.959f, 18.8344f, 2.19f, 17.85f)
                lineTo(2.41999f, 16.71f)
                curveTo(2.696f, 15.1668f, 4.0226f, 14.0327f, 5.59f, 14f)
                horizontalLineTo(14.41f)
                curveTo(15.9797f, 14.0319f, 17.3096f, 15.1652f, 17.59f, 16.71f)
                lineTo(17.82f, 17.85f)
                curveTo(18.0472f, 18.834f, 17.8239f, 19.8679f, 17.2109f, 20.6704f)
                curveTo(16.5979f, 21.4729f, 15.659f, 21.9604f, 14.65f, 22f)
                close()
            }
            handyPath {
                moveTo(10.5f, 12f)
                horizontalLineTo(9.49999f)
                curveTo(7.2908f, 12f, 5.5f, 10.2092f, 5.5f, 8f)
                verticalLineTo(5.36001f)
                curveTo(5.5f, 3.5043f, 7.0043f, 2f, 8.86f, 2f)
                horizontalLineTo(11.14f)
                curveTo(12.0319f, 1.9973f, 12.8881f, 2.3505f, 13.5188f, 2.9812f)
                curveTo(14.1495f, 3.6119f, 14.5027f, 4.4681f, 14.5f, 5.36f)
                verticalLineTo(8.00001f)
                curveTo(14.5f, 10.2092f, 12.7091f, 12f, 10.5f, 12f)
                close()
            }
            handyPath {
                moveTo(21f, 6.25002f)
                horizontalLineTo(19.63f)
                verticalLineTo(4.88002f)
                curveTo(19.63f, 4.4658f, 19.2942f, 4.13f, 18.88f, 4.13f)
                curveTo(18.4658f, 4.13f, 18.13f, 4.4658f, 18.13f, 4.88f)
                verticalLineTo(6.25002f)
                horizontalLineTo(16.77f)
                curveTo(16.3558f, 6.25f, 16.02f, 6.5858f, 16.02f, 7f)
                curveTo(16.02f, 7.4142f, 16.3558f, 7.75f, 16.77f, 7.75f)
                horizontalLineTo(18.13f)
                verticalLineTo(9.12002f)
                curveTo(18.13f, 9.5342f, 18.4658f, 9.87f, 18.88f, 9.87f)
                curveTo(19.2942f, 9.87f, 19.63f, 9.5342f, 19.63f, 9.12f)
                verticalLineTo(7.75002f)
                horizontalLineTo(21f)
                curveTo(21.4142f, 7.75f, 21.75f, 7.4142f, 21.75f, 7f)
                curveTo(21.75f, 6.5858f, 21.4142f, 6.25f, 21f, 6.25f)
                close()
            }
        }.build()
        return _Useraddfilled!!
    }

