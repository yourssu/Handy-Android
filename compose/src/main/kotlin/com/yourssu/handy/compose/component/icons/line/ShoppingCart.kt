package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _shoppingCart: ImageVector? = null

public val HandyIcons.Line.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(3.46973f, 4.25f)
                horizontalLineTo(4.46973f)
                lineTo(4.51973f, 4.26f)
                curveTo(5.9059f, 4.2869f, 7.1171f, 5.2033f, 7.5197f, 6.53f)
                lineTo(7.71973f, 7.22f)
                horizontalLineTo(18.1497f)
                curveTo(19.0708f, 7.2242f, 19.9453f, 7.625f, 20.5497f, 8.32f)
                curveTo(21.1524f, 9.0194f, 21.4191f, 9.9474f, 21.2797f, 10.86f)
                lineTo(20.6797f, 15f)
                curveTo(20.4799f, 16.5869f, 19.1391f, 17.7825f, 17.5397f, 17.8f)
                horizontalLineTo(11.6597f)
                curveTo(10.255f, 17.7948f, 9.018f, 16.8741f, 8.6097f, 15.53f)
                lineTo(6.07973f, 7f)
                curveTo(5.886f, 6.2682f, 5.2267f, 5.7563f, 4.4697f, 5.75f)
                horizontalLineTo(3.46973f)
                curveTo(3.0555f, 5.75f, 2.7197f, 5.4142f, 2.7197f, 5f)
                curveTo(2.7197f, 4.5858f, 3.0555f, 4.25f, 3.4697f, 4.25f)
                close()
                moveTo(10.0497f, 15.05f)
                curveTo(10.262f, 15.762f, 10.9168f, 16.25f, 11.6597f, 16.25f)
                horizontalLineTo(17.5397f)
                curveTo(18.3674f, 16.241f, 19.0683f, 15.6372f, 19.1997f, 14.82f)
                lineTo(19.7997f, 10.67f)
                curveTo(19.8814f, 10.1869f, 19.7482f, 9.6923f, 19.435f, 9.3156f)
                curveTo(19.1217f, 8.9389f, 18.6596f, 8.7177f, 18.1697f, 8.71f)
                horizontalLineTo(8.16973f)
                lineTo(10.0497f, 15.05f)
                close()
            }
            handyPath {
                moveTo(11.4297f, 19f)
                curveTo(10.8774f, 19f, 10.4297f, 19.4477f, 10.4297f, 20f)
                curveTo(10.4297f, 20.5523f, 10.8774f, 21f, 11.4297f, 21f)
                curveTo(11.982f, 21f, 12.4297f, 20.5523f, 12.4297f, 20f)
                curveTo(12.4297f, 19.4477f, 11.982f, 19f, 11.4297f, 19f)
                close()
            }
            handyPath {
                moveTo(17.4297f, 19f)
                curveTo(16.8774f, 19f, 16.4297f, 19.4477f, 16.4297f, 20f)
                curveTo(16.4297f, 20.5523f, 16.8774f, 21f, 17.4297f, 21f)
                curveTo(17.982f, 21f, 18.4297f, 20.5523f, 18.4297f, 20f)
                curveTo(18.4297f, 19.4477f, 17.982f, 19f, 17.4297f, 19f)
                close()
            }
        }
        return _shoppingCart!!
    }

