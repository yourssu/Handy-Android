package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _filterBar: ImageVector? = null

public val HandyIcons.Filled.FilterBar: ImageVector
    get() {
        if (_filterBar != null) {
            return _filterBar!!
        }
        _filterBar = handyIcon {
            handyPath {
                moveTo(10f, 7.39034f)
                horizontalLineTo(4f)
                curveTo(3.4477f, 7.3903f, 3f, 7.8381f, 3f, 8.3903f)
                curveTo(3f, 8.9426f, 3.4477f, 9.3903f, 4f, 9.3903f)
                horizontalLineTo(10f)
                curveTo(10.5523f, 9.3903f, 11f, 8.9426f, 11f, 8.3903f)
                curveTo(11f, 7.8381f, 10.5523f, 7.3903f, 10f, 7.3903f)
                close()
            }
            handyPath {
                moveTo(8f, 14.1603f)
                curveTo(7.154f, 14.1578f, 6.3794f, 14.6342f, 6f, 15.3903f)
                horizontalLineTo(4f)
                curveTo(3.4477f, 15.3903f, 3f, 15.8381f, 3f, 16.3903f)
                curveTo(3f, 16.9426f, 3.4477f, 17.3903f, 4f, 17.3903f)
                horizontalLineTo(6f)
                curveTo(6.4954f, 18.3599f, 7.6208f, 18.8271f, 8.6572f, 18.4934f)
                curveTo(9.6936f, 18.1598f, 10.335f, 17.1238f, 10.1718f, 16.0473f)
                curveTo(10.0085f, 14.9709f, 9.0887f, 14.1717f, 8f, 14.1603f)
                close()
            }
            handyPath {
                moveTo(13.72f, 10.4603f)
                curveTo(14.4939f, 10.4592f, 15.2108f, 10.0533f, 15.61f, 9.3903f)
                horizontalLineTo(20f)
                curveTo(20.5523f, 9.3903f, 21f, 8.9426f, 21f, 8.3903f)
                curveTo(21f, 7.8381f, 20.5523f, 7.3903f, 20f, 7.3903f)
                horizontalLineTo(15.78f)
                curveTo(15.3575f, 6.3513f, 14.229f, 5.7878f, 13.1446f, 6.0743f)
                curveTo(12.0601f, 6.3609f, 11.3573f, 7.4083f, 11.5032f, 8.5204f)
                curveTo(11.6491f, 9.6326f, 12.5984f, 10.4632f, 13.72f, 10.4603f)
                close()
            }
            handyPath {
                moveTo(20f, 15.3903f)
                horizontalLineTo(12f)
                curveTo(11.4477f, 15.3903f, 11f, 15.8381f, 11f, 16.3903f)
                curveTo(11f, 16.9426f, 11.4477f, 17.3903f, 12f, 17.3903f)
                horizontalLineTo(20f)
                curveTo(20.5523f, 17.3903f, 21f, 16.9426f, 21f, 16.3903f)
                curveTo(21f, 15.8381f, 20.5523f, 15.3903f, 20f, 15.3903f)
                close()
            }
        }
        return _filterBar!!
    }

