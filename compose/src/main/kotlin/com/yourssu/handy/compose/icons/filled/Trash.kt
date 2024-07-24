import androidx.compose.runtime.Composable

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
    Image(Trashfilled, null)
}

private var _Trashfilled: ImageVector? = null

public val Trashfilled: ImageVector
    get() {
        if (_Trashfilled != null) {
            return _Trashfilled!!
        }
        _Trashfilled = ImageVector.Builder(
            name = "Trashfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(18.75f, 5f)
                horizontalLineTo(16.08f)
                lineTo(14.87f, 3.68f)
                curveTo(14.4271f, 3.2446f, 13.8311f, 3.0004f, 13.21f, 3f)
                horizontalLineTo(10.29f)
                curveTo(9.6582f, 3.0053f, 9.0541f, 3.2606f, 8.61f, 3.71f)
                lineTo(7.42f, 5f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 5f, 4f, 5.3358f, 4f, 5.75f)
                curveTo(4f, 6.1642f, 4.3358f, 6.5f, 4.75f, 6.5f)
                horizontalLineTo(18.75f)
                curveTo(19.1642f, 6.5f, 19.5f, 6.1642f, 19.5f, 5.75f)
                curveTo(19.5f, 5.3358f, 19.1642f, 5f, 18.75f, 5f)
                close()
                moveTo(9.69f, 4.74f)
                curveTo(9.8496f, 4.5814f, 10.065f, 4.4916f, 10.29f, 4.49f)
                horizontalLineTo(13.21f)
                curveTo(13.4257f, 4.4894f, 13.6334f, 4.5717f, 13.79f, 4.72f)
                lineTo(14.04f, 4.99f)
                horizontalLineTo(9.46f)
                lineTo(9.69f, 4.74f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(4.23f, 9.52f)
                verticalLineTo(17f)
                curveTo(4.23f, 19.4632f, 6.2268f, 21.46f, 8.69f, 21.46f)
                horizontalLineTo(14.81f)
                curveTo(17.2732f, 21.46f, 19.27f, 19.4632f, 19.27f, 17f)
                verticalLineTo(9.52f)
                curveTo(19.27f, 8.4154f, 18.3746f, 7.52f, 17.27f, 7.52f)
                horizontalLineTo(6.27f)
                curveTo(5.7327f, 7.5092f, 5.2136f, 7.7152f, 4.8299f, 8.0915f)
                curveTo(4.4461f, 8.4677f, 4.2299f, 8.9826f, 4.23f, 9.52f)
                close()
                moveTo(9.5f, 13.05f)
                curveTo(9.5f, 13.4642f, 9.1642f, 13.8f, 8.75f, 13.8f)
                curveTo(8.3358f, 13.8f, 8f, 13.4642f, 8f, 13.05f)
                verticalLineTo(10.68f)
                curveTo(8f, 10.2658f, 8.3358f, 9.93f, 8.75f, 9.93f)
                curveTo(9.1642f, 9.93f, 9.5f, 10.2658f, 9.5f, 10.68f)
                verticalLineTo(13.05f)
                close()
                moveTo(11.75f, 17.75f)
                curveTo(12.1642f, 17.75f, 12.5f, 17.4142f, 12.5f, 17f)
                verticalLineTo(10.68f)
                curveTo(12.5f, 10.2658f, 12.1642f, 9.93f, 11.75f, 9.93f)
                curveTo(11.3358f, 9.93f, 11f, 10.2658f, 11f, 10.68f)
                verticalLineTo(17f)
                curveTo(11f, 17.4142f, 11.3358f, 17.75f, 11.75f, 17.75f)
                close()
                moveTo(15.5f, 13.05f)
                curveTo(15.5f, 13.4642f, 15.1642f, 13.8f, 14.75f, 13.8f)
                curveTo(14.3358f, 13.8f, 14f, 13.4642f, 14f, 13.05f)
                verticalLineTo(10.68f)
                curveTo(14f, 10.2658f, 14.3358f, 9.93f, 14.75f, 9.93f)
                curveTo(15.1642f, 9.93f, 15.5f, 10.2658f, 15.5f, 10.68f)
                verticalLineTo(13.05f)
                close()
            }
        }.build()
        return _Trashfilled!!
    }

