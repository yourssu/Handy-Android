import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

import com.yourssu.handy.compose.icons.handyPath
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
    Image(Keyboardfilled, null)
}

private var _Keyboardfilled: ImageVector? = null

public val Keyboardfilled: ImageVector
    get() {
        if (_Keyboardfilled != null) {
            return _Keyboardfilled!!
        }
        _Keyboardfilled = ImageVector.Builder(
            name = "Keyboardfilled",
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
                moveTo(4.85714f, 4f)
                horizontalLineTo(19.1429f)
                curveTo(20.7208f, 4f, 22f, 5.3431f, 22f, 7f)
                verticalLineTo(17f)
                curveTo(22f, 18.6569f, 20.7208f, 20f, 19.1429f, 20f)
                horizontalLineTo(4.85714f)
                curveTo(3.2792f, 20f, 2f, 18.6569f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 5.3431f, 3.2792f, 4f, 4.8571f, 4f)
                close()
                moveTo(13.8955f, 7f)
                curveTo(13.3695f, 7f, 12.9431f, 7.4477f, 12.9431f, 8f)
                curveTo(12.9431f, 8.5523f, 13.3695f, 9f, 13.8955f, 9f)
                curveTo(14.4214f, 9f, 14.8478f, 8.5523f, 14.8478f, 8f)
                curveTo(14.8478f, 7.4477f, 14.4214f, 7f, 13.8955f, 7f)
                close()
                moveTo(12.9431f, 12f)
                curveTo(12.9431f, 11.4477f, 13.3695f, 11f, 13.8955f, 11f)
                curveTo(14.4214f, 11f, 14.8478f, 11.4477f, 14.8478f, 12f)
                curveTo(14.8478f, 12.5523f, 14.4214f, 13f, 13.8955f, 13f)
                curveTo(13.3695f, 13f, 12.9431f, 12.5523f, 12.9431f, 12f)
                close()
                moveTo(10.0859f, 7f)
                curveTo(9.56f, 7f, 9.1336f, 7.4477f, 9.1336f, 8f)
                curveTo(9.1336f, 8.5523f, 9.56f, 9f, 10.0859f, 9f)
                curveTo(10.6119f, 9f, 11.0383f, 8.5523f, 11.0383f, 8f)
                curveTo(11.0383f, 7.4477f, 10.6119f, 7f, 10.0859f, 7f)
                close()
                moveTo(9.13356f, 12f)
                curveTo(9.1336f, 11.4477f, 9.56f, 11f, 10.0859f, 11f)
                curveTo(10.6119f, 11f, 11.0383f, 11.4477f, 11.0383f, 12f)
                curveTo(11.0383f, 12.5523f, 10.6119f, 13f, 10.0859f, 13f)
                curveTo(9.56f, 13f, 9.1336f, 12.5523f, 9.1336f, 12f)
                close()
                moveTo(6.27641f, 13f)
                curveTo(6.8024f, 13f, 7.2288f, 12.5523f, 7.2288f, 12f)
                curveTo(7.2288f, 11.4477f, 6.8024f, 11f, 6.2764f, 11f)
                curveTo(5.7504f, 11f, 5.324f, 11.4477f, 5.324f, 12f)
                curveTo(5.324f, 12.5523f, 5.7504f, 13f, 6.2764f, 13f)
                close()
                moveTo(7.22879f, 8f)
                curveTo(7.2288f, 8.5523f, 6.8024f, 9f, 6.2764f, 9f)
                curveTo(5.7504f, 9f, 5.324f, 8.5523f, 5.324f, 8f)
                curveTo(5.324f, 7.4477f, 5.7504f, 7f, 6.2764f, 7f)
                curveTo(6.8024f, 7f, 7.2288f, 7.4477f, 7.2288f, 8f)
                close()
                moveTo(15.324f, 17f)
                curveTo(15.85f, 17f, 16.2764f, 16.5523f, 16.2764f, 16f)
                horizontalLineTo(16.3145f)
                curveTo(16.3145f, 15.4477f, 15.8881f, 15f, 15.3621f, 15f)
                horizontalLineTo(8.61923f)
                curveTo(8.0932f, 15f, 7.6669f, 15.4477f, 7.6669f, 16f)
                curveTo(7.6669f, 16.5523f, 8.0932f, 17f, 8.6192f, 17f)
                horizontalLineTo(15.324f)
                close()
                moveTo(18.6574f, 12f)
                curveTo(18.6574f, 12.5523f, 18.231f, 13f, 17.705f, 13f)
                curveTo(17.179f, 13f, 16.7526f, 12.5523f, 16.7526f, 12f)
                curveTo(16.7526f, 11.4477f, 17.179f, 11f, 17.705f, 11f)
                curveTo(18.231f, 11f, 18.6574f, 11.4477f, 18.6574f, 12f)
                close()
                moveTo(17.705f, 9f)
                curveTo(18.231f, 9f, 18.6574f, 8.5523f, 18.6574f, 8f)
                curveTo(18.6574f, 7.4477f, 18.231f, 7f, 17.705f, 7f)
                curveTo(17.179f, 7f, 16.7526f, 7.4477f, 16.7526f, 8f)
                curveTo(16.7526f, 8.5523f, 17.179f, 9f, 17.705f, 9f)
                close()
            }
        }.build()
        return _Keyboardfilled!!
    }

