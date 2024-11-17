package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _alertTriangle: ImageVector? = null

public val HandyIcons.Line.AlertTriangle: ImageVector
    get() {
        if (_alertTriangle != null) {
            return _alertTriangle!!
        }
        _alertTriangle = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(8.19093f, 5.08011f)
                curveTo(8.8779f, 3.7974f, 10.2158f, 2.9977f, 11.6709f, 3.0001f)
                curveTo(13.1518f, 2.989f, 14.5176f, 3.7969f, 15.2209f, 5.1001f)
                lineTo(20.8609f, 15.5401f)
                curveTo(21.53f, 16.7797f, 21.4978f, 18.2798f, 20.7761f, 19.4895f)
                curveTo(20.0544f, 20.6992f, 18.7496f, 21.4401f, 17.3409f, 21.4401f)
                horizontalLineTo(6.00093f)
                curveTo(4.5881f, 21.4404f, 3.2799f, 20.6954f, 2.5593f, 19.4801f)
                curveTo(1.8388f, 18.2648f, 1.8128f, 16.7596f, 2.4909f, 15.5201f)
                lineTo(8.19093f, 5.08011f)
                close()
                moveTo(13.8709f, 5.81011f)
                curveTo(13.4371f, 4.9994f, 12.5904f, 4.4952f, 11.6709f, 4.5001f)
                curveTo(10.765f, 4.5064f, 9.9339f, 5.0043f, 9.5009f, 5.8001f)
                lineTo(3.81093f, 16.2201f)
                curveTo(3.3859f, 16.9928f, 3.4013f, 17.9326f, 3.8514f, 18.691f)
                curveTo(4.3015f, 19.4493f, 5.1191f, 19.913f, 6.0009f, 19.9101f)
                horizontalLineTo(17.3409f)
                curveTo(18.2196f, 19.9048f, 19.0315f, 19.4403f, 19.4815f, 18.6855f)
                curveTo(19.9315f, 17.9308f, 19.954f, 16.9957f, 19.5409f, 16.2201f)
                lineTo(13.8709f, 5.81011f)
                close()
            }
            handyPath {
                moveTo(11.6709f, 15.0002f)
                curveTo(11.2567f, 15.0002f, 10.9209f, 15.336f, 10.9209f, 15.7502f)
                curveTo(10.9209f, 16.1644f, 11.2567f, 16.5002f, 11.6709f, 16.5002f)
                curveTo(11.8707f, 16.5029f, 12.063f, 16.4248f, 12.2043f, 16.2836f)
                curveTo(12.3455f, 16.1423f, 12.4236f, 15.95f, 12.4209f, 15.7502f)
                curveTo(12.4209f, 15.5522f, 12.3416f, 15.3625f, 12.2007f, 15.2234f)
                curveTo(12.0597f, 15.0843f, 11.8689f, 15.0075f, 11.6709f, 15.0102f)
                verticalLineTo(15.0002f)
                close()
            }
            handyPath {
                moveTo(11.6709f, 13.6302f)
                curveTo(11.259f, 13.6248f, 10.9263f, 13.2922f, 10.9209f, 12.8802f)
                verticalLineTo(9.78022f)
                curveTo(10.9209f, 9.366f, 11.2567f, 9.0302f, 11.6709f, 9.0302f)
                curveTo(12.0851f, 9.0302f, 12.4209f, 9.366f, 12.4209f, 9.7802f)
                verticalLineTo(12.8802f)
                curveTo(12.4209f, 13.2944f, 12.0851f, 13.6302f, 11.6709f, 13.6302f)
                close()
            }
        }
        return _alertTriangle!!
    }
