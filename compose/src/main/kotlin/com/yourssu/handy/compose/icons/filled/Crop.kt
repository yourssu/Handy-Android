package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _crop: ImageVector? = null

public val HandyIcons.Filled.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(15.5604f, 2.43994f)
                horizontalLineTo(8.44043f)
                curveTo(5.1267f, 2.4399f, 2.4404f, 5.1262f, 2.4404f, 8.4399f)
                verticalLineTo(15.5599f)
                curveTo(2.4404f, 18.8736f, 5.1267f, 21.5599f, 8.4404f, 21.5599f)
                horizontalLineTo(15.5604f)
                curveTo(18.8741f, 21.5599f, 21.5604f, 18.8736f, 21.5604f, 15.5599f)
                verticalLineTo(8.43994f)
                curveTo(21.5604f, 5.1262f, 18.8741f, 2.4399f, 15.5604f, 2.4399f)
                close()
                moveTo(5.36043f, 8.06994f)
                curveTo(5.3658f, 7.658f, 5.6985f, 7.3253f, 6.1104f, 7.3199f)
                horizontalLineTo(7.32043f)
                verticalLineTo(6.10994f)
                curveTo(7.3204f, 5.6957f, 7.6562f, 5.3599f, 8.0704f, 5.3599f)
                curveTo(8.4846f, 5.3599f, 8.8204f, 5.6957f, 8.8204f, 6.1099f)
                verticalLineTo(7.31994f)
                horizontalLineTo(13.7504f)
                curveTo(15.3663f, 7.3254f, 16.6749f, 8.634f, 16.6804f, 10.2499f)
                verticalLineTo(13.9999f)
                curveTo(16.6804f, 14.4142f, 16.3446f, 14.7499f, 15.9304f, 14.7499f)
                curveTo(15.5162f, 14.7499f, 15.1804f, 14.4142f, 15.1804f, 13.9999f)
                verticalLineTo(10.2499f)
                curveTo(15.175f, 9.4624f, 14.5379f, 8.8254f, 13.7504f, 8.8199f)
                horizontalLineTo(6.11043f)
                curveTo(5.6962f, 8.8199f, 5.3604f, 8.4842f, 5.3604f, 8.0699f)
                close()
                moveTo(16.6804f, 16.6799f)
                horizontalLineTo(17.8904f)
                verticalLineTo(16.6399f)
                curveTo(18.3046f, 16.6399f, 18.6404f, 16.3042f, 18.6404f, 15.8899f)
                curveTo(18.6404f, 15.4757f, 18.3046f, 15.1399f, 17.8904f, 15.1399f)
                horizontalLineTo(10.2504f)
                curveTo(9.4629f, 15.1345f, 8.8259f, 14.4974f, 8.8204f, 13.7099f)
                verticalLineTo(9.99994f)
                curveTo(8.8204f, 9.5857f, 8.4846f, 9.2499f, 8.0704f, 9.2499f)
                curveTo(7.6562f, 9.2499f, 7.3204f, 9.5857f, 7.3204f, 9.9999f)
                verticalLineTo(13.7499f)
                curveTo(7.3259f, 15.3659f, 8.6345f, 16.6745f, 10.2504f, 16.6799f)
                horizontalLineTo(15.1804f)
                verticalLineTo(17.8899f)
                curveTo(15.1804f, 18.3042f, 15.5162f, 18.6399f, 15.9304f, 18.6399f)
                curveTo(16.3446f, 18.6399f, 16.6804f, 18.3042f, 16.6804f, 17.8899f)
                verticalLineTo(16.6799f)
                close()
            }
        }
        return _crop!!
    }

