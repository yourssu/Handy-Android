package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _user: ImageVector? = null

public val HandyIcons.Filled.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = handyIcon {
            handyPath {
                moveTo(16.6396f, 22f)
                horizontalLineTo(7.35961f)
                curveTo(6.3488f, 21.9633f, 5.4072f, 21.477f, 4.7919f, 20.6742f)
                curveTo(4.1767f, 19.8713f, 3.9522f, 18.8356f, 4.1796f, 17.85f)
                lineTo(4.41961f, 16.71f)
                curveTo(4.6956f, 15.1668f, 6.0222f, 14.0327f, 7.5896f, 14f)
                horizontalLineTo(16.4096f)
                curveTo(17.977f, 14.0327f, 19.3036f, 15.1668f, 19.5796f, 16.71f)
                lineTo(19.8196f, 17.85f)
                curveTo(20.047f, 18.8356f, 19.8225f, 19.8713f, 19.2073f, 20.6742f)
                curveTo(18.592f, 21.477f, 17.6504f, 21.9633f, 16.6396f, 22f)
                close()
            }
            handyPath {
                moveTo(12.4996f, 12f)
                horizontalLineTo(11.4996f)
                curveTo(9.2905f, 12f, 7.4996f, 10.2092f, 7.4996f, 8f)
                verticalLineTo(5.36001f)
                curveTo(7.4969f, 4.4681f, 7.8501f, 3.6119f, 8.4808f, 2.9812f)
                curveTo(9.1115f, 2.3505f, 9.9677f, 1.9973f, 10.8596f, 2f)
                horizontalLineTo(13.1396f)
                curveTo(14.0315f, 1.9973f, 14.8877f, 2.3505f, 15.5184f, 2.9812f)
                curveTo(16.1491f, 3.6119f, 16.5023f, 4.4681f, 16.4996f, 5.36f)
                verticalLineTo(8.00001f)
                curveTo(16.4996f, 9.0609f, 16.0782f, 10.0783f, 15.328f, 10.8284f)
                curveTo(14.5779f, 11.5786f, 13.5605f, 12f, 12.4996f, 12f)
                close()
            }
        }
        return _user!!
    }

