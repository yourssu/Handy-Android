package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _kebab: ImageVector? = null

public val HandyIcons.Filled.Kebab: ImageVector
    get() {
        if (_kebab != null) {
            return _kebab!!
        }
        _kebab = handyIcon {
            group {
                handyPath {
                    moveTo(12f, 19.269f)
                    curveTo(11.5875f, 19.269f, 11.2344f, 19.1221f, 10.9408f, 18.8282f)
                    curveTo(10.6469f, 18.5346f, 10.5f, 18.1815f, 10.5f, 17.769f)
                    curveTo(10.5f, 17.3565f, 10.6469f, 17.0033f, 10.9408f, 16.7095f)
                    curveTo(11.2344f, 16.4158f, 11.5875f, 16.269f, 12f, 16.269f)
                    curveTo(12.4125f, 16.269f, 12.7656f, 16.4158f, 13.0592f, 16.7095f)
                    curveTo(13.3531f, 17.0033f, 13.5f, 17.3565f, 13.5f, 17.769f)
                    curveTo(13.5f, 18.1815f, 13.3531f, 18.5346f, 13.0592f, 18.8282f)
                    curveTo(12.7656f, 19.1221f, 12.4125f, 19.269f, 12f, 19.269f)
                    close()
                    moveTo(12f, 13.4997f)
                    curveTo(11.5875f, 13.4997f, 11.2344f, 13.3528f, 10.9408f, 13.059f)
                    curveTo(10.6469f, 12.7653f, 10.5f, 12.4122f, 10.5f, 11.9997f)
                    curveTo(10.5f, 11.5872f, 10.6469f, 11.2341f, 10.9408f, 10.9405f)
                    curveTo(11.2344f, 10.6466f, 11.5875f, 10.4997f, 12f, 10.4997f)
                    curveTo(12.4125f, 10.4997f, 12.7656f, 10.6466f, 13.0592f, 10.9405f)
                    curveTo(13.3531f, 11.2341f, 13.5f, 11.5872f, 13.5f, 11.9997f)
                    curveTo(13.5f, 12.4122f, 13.3531f, 12.7653f, 13.0592f, 13.059f)
                    curveTo(12.7656f, 13.3528f, 12.4125f, 13.4997f, 12f, 13.4997f)
                    close()
                    moveTo(12f, 7.73047f)
                    curveTo(11.5875f, 7.7305f, 11.2344f, 7.5836f, 10.9408f, 7.29f)
                    curveTo(10.6469f, 6.9961f, 10.5f, 6.643f, 10.5f, 6.2305f)
                    curveTo(10.5f, 5.818f, 10.6469f, 5.4649f, 10.9408f, 5.1712f)
                    curveTo(11.2344f, 4.8774f, 11.5875f, 4.7305f, 12f, 4.7305f)
                    curveTo(12.4125f, 4.7305f, 12.7656f, 4.8774f, 13.0592f, 5.1712f)
                    curveTo(13.3531f, 5.4649f, 13.5f, 5.818f, 13.5f, 6.2305f)
                    curveTo(13.5f, 6.643f, 13.3531f, 6.9961f, 13.0592f, 7.29f)
                    curveTo(12.7656f, 7.5836f, 12.4125f, 7.7305f, 12f, 7.7305f)
                    close()
                }
            }
        }
        return _kebab!!
    }

