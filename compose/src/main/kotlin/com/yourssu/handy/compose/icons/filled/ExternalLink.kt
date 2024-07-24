package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _externalLink: ImageVector? = null

public val HandyIcons.Filled.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) {
            return _externalLink!!
        }
        _externalLink = handyIcon(name = "Filled.ExternalLink") {
            handyPath {
                moveTo(17.34f, 7.04f)
                lineTo(13.1f, 11.28f)
                curveTo(12.8072f, 11.5725f, 12.3328f, 11.5725f, 12.04f, 11.28f)
                curveTo(11.7475f, 10.9872f, 11.7475f, 10.5128f, 12.04f, 10.22f)
                lineTo(16.28f, 5.98f)
                curveTo(15.5612f, 5.4867f, 14.7117f, 5.2187f, 13.84f, 5.21f)
                horizontalLineTo(7.33f)
                curveTo(4.9503f, 5.2099f, 3.0165f, 7.1303f, 3f, 9.51f)
                verticalLineTo(15.99f)
                curveTo(3f, 18.3814f, 4.9386f, 20.32f, 7.33f, 20.32f)
                horizontalLineTo(13.81f)
                curveTo(16.2014f, 20.32f, 18.14f, 18.3814f, 18.14f, 15.99f)
                verticalLineTo(9.54f)
                curveTo(18.1384f, 8.644f, 17.8589f, 7.7705f, 17.34f, 7.04f)
                close()
            }
            handyPath {
                moveTo(20.26f, 3.46f)
                curveTo(20.1878f, 3.277f, 20.043f, 3.1322f, 19.86f, 3.06f)
                curveTo(19.7683f, 3.0209f, 19.6697f, 3.0005f, 19.57f, 3f)
                horizontalLineTo(14.57f)
                curveTo(14.1558f, 3f, 13.82f, 3.3358f, 13.82f, 3.75f)
                curveTo(13.82f, 4.1642f, 14.1558f, 4.5f, 14.57f, 4.5f)
                horizontalLineTo(17.76f)
                lineTo(16.29f, 5.97f)
                curveTo(16.7007f, 6.2608f, 17.0591f, 6.6193f, 17.35f, 7.03f)
                lineTo(18.82f, 5.56f)
                verticalLineTo(8.75f)
                curveTo(18.82f, 9.1642f, 19.1558f, 9.5f, 19.57f, 9.5f)
                curveTo(19.9842f, 9.5f, 20.32f, 9.1642f, 20.32f, 8.75f)
                verticalLineTo(3.75f)
                curveTo(20.3195f, 3.6503f, 20.2991f, 3.5517f, 20.26f, 3.46f)
                close()
            }
        }
        return _externalLink!!
    }

