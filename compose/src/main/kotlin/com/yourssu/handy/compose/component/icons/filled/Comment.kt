package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _comment: ImageVector? = null

public val HandyIcons.Filled.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(17.5617f, 2f)
                horizontalLineTo(6.44174f)
                curveTo(3.9206f, 2.087f, 1.9399f, 4.1882f, 2.0017f, 6.71f)
                verticalLineTo(20.44f)
                curveTo(1.9759f, 20.9013f, 2.2386f, 21.3304f, 2.6612f, 21.5172f)
                curveTo(3.0838f, 21.7041f, 3.5779f, 21.6096f, 3.9017f, 21.28f)
                lineTo(6.27174f, 18.75f)
                curveTo(6.7233f, 18.2764f, 7.3474f, 18.0058f, 8.0017f, 18f)
                horizontalLineTo(17.5217f)
                curveTo(18.7508f, 17.9688f, 19.9163f, 17.4468f, 20.758f, 16.5507f)
                curveTo(21.5997f, 15.6545f, 22.0476f, 14.4586f, 22.0017f, 13.23f)
                verticalLineTo(6.71f)
                curveTo(22.0636f, 4.1882f, 20.0828f, 2.087f, 17.5617f, 2f)
                close()
                moveTo(8.25174f, 7.22f)
                horizontalLineTo(13.2517f)
                curveTo(13.666f, 7.22f, 14.0017f, 7.5558f, 14.0017f, 7.97f)
                curveTo(14.0017f, 8.3842f, 13.666f, 8.72f, 13.2517f, 8.72f)
                horizontalLineTo(8.25174f)
                curveTo(7.8375f, 8.72f, 7.5017f, 8.3842f, 7.5017f, 7.97f)
                curveTo(7.5017f, 7.5558f, 7.8375f, 7.22f, 8.2517f, 7.22f)
                close()
                moveTo(8.25174f, 12.72f)
                horizontalLineTo(15.7517f)
                curveTo(16.166f, 12.72f, 16.5017f, 12.3842f, 16.5017f, 11.97f)
                curveTo(16.5017f, 11.5558f, 16.166f, 11.22f, 15.7517f, 11.22f)
                horizontalLineTo(8.25174f)
                curveTo(7.8375f, 11.22f, 7.5017f, 11.5558f, 7.5017f, 11.97f)
                curveTo(7.5017f, 12.3842f, 7.8375f, 12.72f, 8.2517f, 12.72f)
                close()
            }
        }
        return _comment!!
    }

