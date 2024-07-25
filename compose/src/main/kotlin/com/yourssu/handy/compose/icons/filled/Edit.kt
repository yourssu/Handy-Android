package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _edit: ImageVector? = null

public val HandyIcons.Filled.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = handyIcon {
            handyPath {
                moveTo(13.2398f, 15.6201f)
                lineTo(9.82976f, 16.3501f)
                curveTo(9.6968f, 16.3648f, 9.5627f, 16.3648f, 9.4298f, 16.3501f)
                curveTo(8.9567f, 16.3542f, 8.5022f, 16.1666f, 8.1698f, 15.8301f)
                curveTo(7.7425f, 15.3919f, 7.5657f, 14.7673f, 7.6998f, 14.1701f)
                lineTo(8.42976f, 10.7701f)
                curveTo(8.5848f, 10.1016f, 8.9325f, 9.4932f, 9.4298f, 9.0201f)
                lineTo(15.1298f, 3.32014f)
                horizontalLineTo(6.12976f)
                curveTo(5.0144f, 3.3066f, 3.9408f, 3.7437f, 3.152f, 4.5324f)
                curveTo(2.3633f, 5.3211f, 1.9262f, 6.3948f, 1.9398f, 7.5101f)
                verticalLineTo(17.8601f)
                curveTo(1.9398f, 20.1466f, 3.7933f, 22.0001f, 6.0798f, 22.0001f)
                horizontalLineTo(16.4398f)
                curveTo(18.7262f, 22.0001f, 20.5798f, 20.1466f, 20.5798f, 17.8601f)
                verticalLineTo(9.07014f)
                lineTo(14.9998f, 14.6601f)
                curveTo(14.5193f, 15.1449f, 13.9075f, 15.4786f, 13.2398f, 15.6201f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(16.7698f, 3.11014f)
                curveTo(17.9271f, 1.7824f, 19.9365f, 1.6309f, 21.2798f, 2.7701f)
                curveTo(21.8428f, 3.4184f, 22.1236f, 4.2647f, 22.0597f, 5.121f)
                curveTo(21.9959f, 5.9772f, 21.5927f, 6.7725f, 20.9398f, 7.3301f)
                lineTo(14.2698f, 14.0001f)
                curveTo(13.918f, 14.3329f, 13.4765f, 14.5554f, 12.9998f, 14.6401f)
                lineTo(9.61976f, 15.4001f)
                curveTo(9.3417f, 15.4812f, 9.0416f, 15.3993f, 8.8432f, 15.1883f)
                curveTo(8.6448f, 14.9772f, 8.5817f, 14.6727f, 8.6798f, 14.4001f)
                lineTo(9.40976f, 11.0001f)
                curveTo(9.5213f, 10.537f, 9.7603f, 10.1144f, 10.0998f, 9.7801f)
                lineTo(16.7698f, 3.11014f)
                close()
                moveTo(17.1798f, 7.77014f)
                lineTo(19.4198f, 5.53014f)
                curveTo(19.6951f, 5.2346f, 19.687f, 4.7741f, 19.4014f, 4.4885f)
                curveTo(19.1158f, 4.2029f, 18.6553f, 4.1948f, 18.3598f, 4.4701f)
                lineTo(16.1198f, 6.71014f)
                curveTo(15.8273f, 7.003f, 15.8273f, 7.4773f, 16.1198f, 7.7701f)
                curveTo(16.4126f, 8.0626f, 16.8869f, 8.0626f, 17.1798f, 7.7701f)
                close()
            }
        }
        return _edit!!
    }

