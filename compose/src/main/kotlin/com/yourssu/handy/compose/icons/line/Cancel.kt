package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _cancel: ImageVector? = null

public val HandyIcons.Line.Cancel: ImageVector
    get() {
        if (_cancel != null) {
            return _cancel!!
        }
        _cancel = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(4.53251f, 5.32491f)
                lineTo(5.32447f, 4.53295f)
                curveTo(9.011f, 0.8464f, 14.9881f, 0.8464f, 18.6746f, 4.5329f)
                lineTo(19.4666f, 5.32491f)
                curveTo(23.1532f, 9.0115f, 23.1532f, 14.9885f, 19.4666f, 18.6751f)
                lineTo(18.6746f, 19.467f)
                curveTo(14.9881f, 23.1536f, 9.011f, 23.1536f, 5.3245f, 19.467f)
                lineTo(4.53251f, 18.6751f)
                curveTo(0.846f, 14.9885f, 0.846f, 9.0115f, 4.5325f, 5.3249f)
                close()
                moveTo(18.4059f, 17.6144f)
                curveTo(21.474f, 14.5002f, 21.474f, 9.4998f, 18.4059f, 6.3856f)
                lineTo(17.614f, 5.59361f)
                curveTo(14.4997f, 2.5256f, 9.4994f, 2.5256f, 6.3851f, 5.5936f)
                lineTo(5.59317f, 6.38557f)
                curveTo(2.5251f, 9.4998f, 2.5251f, 14.5002f, 5.5932f, 17.6144f)
                lineTo(6.38513f, 18.4064f)
                curveTo(9.4994f, 21.4744f, 14.4997f, 21.4744f, 17.614f, 18.4064f)
                lineTo(18.4059f, 17.6144f)
                close()
            }
            handyPath {
                moveTo(14.2977f, 8.64124f)
                lineTo(11.9996f, 10.9393f)
                lineTo(9.70146f, 8.64124f)
                curveTo(9.4086f, 8.3483f, 8.9337f, 8.3483f, 8.6408f, 8.6412f)
                curveTo(8.3479f, 8.9341f, 8.3479f, 9.409f, 8.6408f, 9.7019f)
                lineTo(10.9389f, 12f)
                lineTo(8.6408f, 14.2981f)
                curveTo(8.3479f, 14.591f, 8.3479f, 15.0659f, 8.6408f, 15.3588f)
                curveTo(8.9337f, 15.6517f, 9.4086f, 15.6517f, 9.7015f, 15.3588f)
                lineTo(11.9996f, 13.0607f)
                lineTo(14.2977f, 15.3588f)
                curveTo(14.5905f, 15.6517f, 15.0654f, 15.6517f, 15.3583f, 15.3588f)
                curveTo(15.6512f, 15.0659f, 15.6512f, 14.591f, 15.3583f, 14.2981f)
                lineTo(13.0602f, 12f)
                lineTo(15.3583f, 9.7019f)
                curveTo(15.6512f, 9.409f, 15.6512f, 8.9341f, 15.3583f, 8.6412f)
                curveTo(15.0654f, 8.3483f, 14.5905f, 8.3483f, 14.2977f, 8.6412f)
                close()
            }
        }
        return _cancel!!
    }
