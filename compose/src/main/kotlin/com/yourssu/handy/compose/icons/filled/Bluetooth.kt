package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Bluetoothfilled: ImageVector? = null

public val Bluetoothfilled: ImageVector
    get() {
        if (_Bluetoothfilled != null) {
            return _Bluetoothfilled!!
        }
        _Bluetoothfilled = ImageVector.Builder(
            name = "Bluetoothfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12.56f, 17.5f)
                lineTo(15.71f, 15.14f)
                lineTo(12.56f, 13.23f)
                verticalLineTo(17.5f)
                close()
            }
            handyPath {
                moveTo(12.56f, 10.77f)
                lineTo(15.71f, 8.86f)
                lineTo(12.56f, 6.5f)
                verticalLineTo(10.77f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                curveTo(20.2091f, 2f, 22f, 3.7909f, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 20.2091f, 20.2091f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(3.7909f, 22f, 2f, 20.2091f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 3.7909f, 3.7909f, 2f, 6f, 2f)
                close()
                moveTo(17.3123f, 15.1026f)
                curveTo(17.2881f, 14.6453f, 17.0354f, 14.2309f, 16.64f, 14f)
                lineTo(13.42f, 12f)
                lineTo(16.63f, 10.05f)
                curveTo(17.0267f, 9.8209f, 17.2814f, 9.4074f, 17.3076f, 8.9501f)
                curveTo(17.3338f, 8.4927f, 17.1279f, 8.0529f, 16.76f, 7.78f)
                lineTo(13.25f, 5.14f)
                curveTo(12.8343f, 4.8294f, 12.2788f, 4.7803f, 11.8151f, 5.0133f)
                curveTo(11.3514f, 5.2462f, 11.0591f, 5.7211f, 11.06f, 6.24f)
                verticalLineTo(10.61f)
                lineTo(7.83f, 8.61f)
                curveTo(7.5996f, 8.4707f, 7.3123f, 8.4649f, 7.0764f, 8.5947f)
                curveTo(6.8405f, 8.7247f, 6.6919f, 8.9705f, 6.6864f, 9.2398f)
                curveTo(6.681f, 9.509f, 6.8196f, 9.7607f, 7.05f, 9.9f)
                lineTo(10.53f, 12f)
                lineTo(7.05f, 14.14f)
                curveTo(6.6938f, 14.3554f, 6.5796f, 14.8188f, 6.795f, 15.175f)
                curveTo(7.0104f, 15.5312f, 7.4738f, 15.6454f, 7.83f, 15.43f)
                lineTo(11.06f, 13.43f)
                verticalLineTo(17.81f)
                curveTo(11.0615f, 18.3277f, 11.3505f, 18.8016f, 11.81f, 19.04f)
                curveTo(12.0044f, 19.1301f, 12.2157f, 19.1779f, 12.43f, 19.18f)
                curveTo(12.7251f, 19.1793f, 13.0123f, 19.0848f, 13.25f, 18.91f)
                lineTo(16.76f, 16.27f)
                curveTo(17.1289f, 15.9987f, 17.3365f, 15.5599f, 17.3123f, 15.1026f)
                close()
            }
        }.build()
        return _Bluetoothfilled!!
    }

