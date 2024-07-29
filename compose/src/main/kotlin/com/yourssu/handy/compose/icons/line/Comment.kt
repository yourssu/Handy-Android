package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _comment: ImageVector? = null

public val HandyIcons.Line.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(6.44226f, 2f)
                horizontalLineTo(17.5623f)
                curveTo(20.0954f, 2.0869f, 22.0809f, 4.2066f, 22.0023f, 6.74f)
                verticalLineTo(13.26f)
                curveTo(22.0399f, 14.4835f, 21.5883f, 15.6716f, 20.7475f, 16.5612f)
                curveTo(19.9067f, 17.4508f, 18.746f, 17.9686f, 17.5223f, 18f)
                horizontalLineTo(8.00226f)
                curveTo(7.3434f, 18.0136f, 6.7187f, 18.2953f, 6.2723f, 18.78f)
                lineTo(3.90226f, 21.31f)
                curveTo(3.7015f, 21.529f, 3.4193f, 21.6556f, 3.1223f, 21.66f)
                curveTo(2.8154f, 21.6522f, 2.5245f, 21.522f, 2.3141f, 21.2985f)
                curveTo(2.1038f, 21.075f, 1.9915f, 20.7767f, 2.0023f, 20.47f)
                verticalLineTo(6.74f)
                curveTo(1.9236f, 4.2066f, 3.9091f, 2.0869f, 6.4423f, 2f)
                close()
                moveTo(17.5623f, 16.5f)
                curveTo(19.2672f, 16.4137f, 20.5815f, 14.9653f, 20.5023f, 13.26f)
                verticalLineTo(6.74f)
                curveTo(20.5815f, 5.0347f, 19.2672f, 3.5863f, 17.5623f, 3.5f)
                horizontalLineTo(6.44225f)
                curveTo(4.7373f, 3.5863f, 3.423f, 5.0347f, 3.5023f, 6.74f)
                verticalLineTo(19.54f)
                lineTo(5.13225f, 17.76f)
                curveTo(5.8777f, 16.9671f, 6.914f, 16.5121f, 8.0023f, 16.5f)
                horizontalLineTo(17.5623f)
                close()
            }
            handyPath {
                moveTo(8.25225f, 8.75f)
                horizontalLineTo(13.2523f)
                curveTo(13.6665f, 8.75f, 14.0023f, 8.4142f, 14.0023f, 8f)
                curveTo(14.0023f, 7.5858f, 13.6665f, 7.25f, 13.2523f, 7.25f)
                horizontalLineTo(8.25225f)
                curveTo(7.838f, 7.25f, 7.5023f, 7.5858f, 7.5023f, 8f)
                curveTo(7.5023f, 8.4142f, 7.838f, 8.75f, 8.2523f, 8.75f)
                close()
            }
            handyPath {
                moveTo(15.7523f, 11.25f)
                horizontalLineTo(8.25225f)
                curveTo(7.838f, 11.25f, 7.5023f, 11.5858f, 7.5023f, 12f)
                curveTo(7.5023f, 12.4142f, 7.838f, 12.75f, 8.2523f, 12.75f)
                horizontalLineTo(15.7523f)
                curveTo(16.1665f, 12.75f, 16.5023f, 12.4142f, 16.5023f, 12f)
                curveTo(16.5023f, 11.5858f, 16.1665f, 11.25f, 15.7523f, 11.25f)
                close()
            }
        }
        return _comment!!
    }

