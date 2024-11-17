package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _filterBar: ImageVector? = null

public val HandyIcons.Line.FilterBar: ImageVector
    get() {
        if (_filterBar != null) {
            return _filterBar!!
        }
        _filterBar = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(13.7691f, 10.6179f)
                curveTo(14.6701f, 10.5963f, 15.4749f, 10.0491f, 15.8263f, 9.2193f)
                curveTo(15.9013f, 9.2509f, 15.9815f, 9.2683f, 16.0629f, 9.2707f)
                horizontalLineTo(20.1771f)
                curveTo(20.6032f, 9.2707f, 20.9486f, 8.9253f, 20.9486f, 8.4993f)
                curveTo(20.9486f, 8.0734f, 20.6032f, 7.728f, 20.1771f, 7.728f)
                horizontalLineTo(16.1143f)
                curveTo(16.0699f, 7.7222f, 16.025f, 7.7222f, 15.9806f, 7.728f)
                curveTo(15.686f, 6.5706f, 14.5523f, 5.833f, 13.3746f, 6.0325f)
                curveTo(12.1969f, 6.232f, 11.3695f, 7.3017f, 11.4726f, 8.4916f)
                curveTo(11.5756f, 9.6814f, 12.5747f, 10.593f, 13.7691f, 10.5871f)
                verticalLineTo(10.6179f)
                close()
                moveTo(13.7691f, 7.58404f)
                curveTo(14.1838f, 7.584f, 14.52f, 7.9202f, 14.52f, 8.3348f)
                curveTo(14.52f, 8.7494f, 14.1838f, 9.0856f, 13.7691f, 9.0856f)
                curveTo(13.3545f, 9.0856f, 13.0183f, 8.7494f, 13.0183f, 8.3348f)
                curveTo(13.0183f, 7.9202f, 13.3545f, 7.584f, 13.7691f, 7.584f)
                close()
            }
            handyPath {
                moveTo(3.77143f, 7.72802f)
                horizontalLineTo(9.94286f)
                curveTo(10.3689f, 7.728f, 10.7143f, 8.0734f, 10.7143f, 8.4993f)
                curveTo(10.7143f, 8.9253f, 10.3689f, 9.2707f, 9.9429f, 9.2707f)
                horizontalLineTo(3.77143f)
                curveTo(3.3454f, 9.2707f, 3f, 8.9253f, 3f, 8.4993f)
                curveTo(3f, 8.0734f, 3.3454f, 7.728f, 3.7714f, 7.728f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(5.736f, 15.9555f)
                curveTo(6.0582f, 15.0444f, 6.9192f, 14.4347f, 7.8857f, 14.4334f)
                verticalLineTo(14.4128f)
                curveTo(9.0488f, 14.4114f, 10.029f, 15.2806f, 10.1663f, 16.4354f)
                curveTo(10.3037f, 17.5902f, 9.5548f, 18.6651f, 8.4237f, 18.9364f)
                curveTo(7.2927f, 19.2077f, 6.1376f, 18.5896f, 5.736f, 17.4981f)
                horizontalLineTo(3.77143f)
                curveTo(3.3454f, 17.4981f, 3f, 17.1528f, 3f, 16.7268f)
                curveTo(3f, 16.3008f, 3.3454f, 15.9555f, 3.7714f, 15.9555f)
                horizontalLineTo(5.736f)
                close()
                moveTo(7.1361f, 16.7809f)
                curveTo(7.1432f, 17.19f, 7.4765f, 17.5181f, 7.8857f, 17.5187f)
                verticalLineTo(17.4776f)
                curveTo(8.3004f, 17.4776f, 8.6366f, 17.1414f, 8.6366f, 16.7268f)
                curveTo(8.6142f, 16.3183f, 8.2687f, 16.0029f, 7.8598f, 16.0177f)
                curveTo(7.4509f, 16.0324f, 7.129f, 16.3718f, 7.1361f, 16.7809f)
                close()
            }
            handyPath {
                moveTo(12f, 15.9555f)
                horizontalLineTo(20.2286f)
                curveTo(20.6546f, 15.9555f, 21f, 16.3008f, 21f, 16.7268f)
                curveTo(21f, 17.1528f, 20.6546f, 17.4981f, 20.2286f, 17.4981f)
                horizontalLineTo(12f)
                curveTo(11.574f, 17.4981f, 11.2286f, 17.1528f, 11.2286f, 16.7268f)
                curveTo(11.2286f, 16.3008f, 11.574f, 15.9555f, 12f, 15.9555f)
                close()
            }
        }
        return _filterBar!!
    }

