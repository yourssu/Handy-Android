package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _retryRefresh: ImageVector? = null

public val HandyIcons.Filled.RetryRefresh: ImageVector
    get() {
        if (_retryRefresh != null) {
            return _retryRefresh!!
        }
        _retryRefresh = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(7.56f, 2f)
                horizontalLineTo(16.44f)
                curveTo(19.5107f, 2f, 22f, 4.4893f, 22f, 7.56f)
                verticalLineTo(16.44f)
                curveTo(22f, 19.5107f, 19.5107f, 22f, 16.44f, 22f)
                horizontalLineTo(7.56f)
                curveTo(4.4893f, 22f, 2f, 19.5107f, 2f, 16.44f)
                verticalLineTo(7.56f)
                curveTo(2f, 4.4893f, 4.4893f, 2f, 7.56f, 2f)
                close()
                moveTo(5.70855f, 15.2052f)
                curveTo(6.7227f, 17.7946f, 9.2191f, 19.4988f, 12f, 19.5f)
                curveTo(15.4889f, 19.4774f, 18.3874f, 16.8034f, 18.6907f, 13.3277f)
                curveTo(18.9939f, 9.852f, 16.6022f, 6.7164f, 13.17f, 6.09f)
                lineTo(13.33f, 5.92f)
                curveTo(13.6558f, 5.5969f, 13.6581f, 5.0709f, 13.335f, 4.745f)
                curveTo(13.0119f, 4.4192f, 12.4858f, 4.4169f, 12.16f, 4.74f)
                lineTo(10.67f, 6.22f)
                curveTo(10.5099f, 6.3745f, 10.4195f, 6.5875f, 10.4195f, 6.81f)
                curveTo(10.4195f, 7.0325f, 10.5099f, 7.2455f, 10.67f, 7.4f)
                lineTo(12.16f, 8.89f)
                curveTo(12.3151f, 9.0419f, 12.5229f, 9.128f, 12.74f, 9.13f)
                curveTo(12.9599f, 9.1275f, 13.1707f, 9.0417f, 13.33f, 8.89f)
                curveTo(13.5909f, 8.621f, 13.6361f, 8.2093f, 13.44f, 7.89f)
                curveTo(15.6704f, 8.5557f, 17.1711f, 10.6421f, 17.0928f, 12.9683f)
                curveTo(17.0145f, 15.2946f, 15.3769f, 17.2754f, 13.1068f, 17.7896f)
                curveTo(10.8368f, 18.3039f, 8.5055f, 17.2222f, 7.4323f, 15.1567f)
                curveTo(6.3592f, 13.0913f, 6.8142f, 10.5619f, 8.54f, 9f)
                curveTo(8.8769f, 8.688f, 8.897f, 8.1619f, 8.585f, 7.825f)
                curveTo(8.273f, 7.4881f, 7.7469f, 7.468f, 7.41f, 7.78f)
                curveTo(5.3696f, 9.6695f, 4.6944f, 12.6157f, 5.7085f, 15.2052f)
                close()
            }
        }
        return _retryRefresh!!
    }

