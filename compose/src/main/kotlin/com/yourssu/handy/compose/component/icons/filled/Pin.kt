package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _pin: ImageVector? = null

public val HandyIcons.Filled.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = handyIcon {
            handyPath {
                moveTo(19.3493f, 9.1637f)
                lineTo(14.7993f, 4.6137f)
                curveTo(13.9667f, 3.7954f, 12.632f, 3.7954f, 11.7993f, 4.6137f)
                lineTo(8.96934f, 7.4037f)
                curveTo(8.8084f, 7.5654f, 8.6227f, 7.7004f, 8.4193f, 7.8037f)
                lineTo(5.34934f, 9.3437f)
                curveTo(4.7325f, 9.6504f, 4.301f, 10.2352f, 4.19f, 10.9151f)
                curveTo(4.079f, 11.595f, 4.3021f, 12.2868f, 4.7893f, 12.7737f)
                lineTo(7.45934f, 15.4437f)
                lineTo(4.21934f, 18.6837f)
                curveTo(3.9269f, 18.9765f, 3.9269f, 19.4509f, 4.2193f, 19.7437f)
                curveTo(4.3622f, 19.8809f, 4.5513f, 19.9594f, 4.7493f, 19.9637f)
                curveTo(4.9482f, 19.9635f, 5.1388f, 19.8844f, 5.2793f, 19.7437f)
                lineTo(8.51934f, 16.5037f)
                lineTo(11.1893f, 19.1737f)
                curveTo(11.6763f, 19.661f, 12.368f, 19.8841f, 13.0479f, 19.7731f)
                curveTo(13.7278f, 19.6621f, 14.3127f, 19.2306f, 14.6193f, 18.6137f)
                lineTo(16.1593f, 15.5237f)
                curveTo(16.2627f, 15.3203f, 16.3977f, 15.1346f, 16.5593f, 14.9737f)
                lineTo(19.3493f, 12.1837f)
                curveTo(20.1808f, 11.3487f, 20.1808f, 9.9987f, 19.3493f, 9.1637f)
                close()
            }
        }
        return _pin!!
    }

