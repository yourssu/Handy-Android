package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _share: ImageVector? = null

public val HandyIcons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = handyIcon {
            handyPath {
                moveTo(16.2385f, 15.5943f)
                curveTo(15.4946f, 15.131f, 14.5639f, 15.0856f, 13.7785f, 15.4743f)
                lineTo(10.7785f, 12.4743f)
                curveTo(11.0007f, 11.9676f, 11.0499f, 11.4018f, 10.9185f, 10.8643f)
                curveTo(10.8962f, 10.7895f, 10.8694f, 10.716f, 10.8385f, 10.6443f)
                lineTo(13.7785f, 7.70433f)
                curveTo(14.8794f, 8.2471f, 16.2117f, 7.903f, 16.912f, 6.895f)
                curveTo(17.6122f, 5.887f, 17.4698f, 4.5183f, 16.5771f, 3.6761f)
                curveTo(15.6843f, 2.8338f, 14.3096f, 2.7713f, 13.3441f, 3.5291f)
                curveTo(12.3786f, 4.2869f, 12.1126f, 5.6369f, 12.7185f, 6.7043f)
                lineTo(9.9485f, 9.43433f)
                curveTo(9.0054f, 8.7639f, 7.7254f, 8.8284f, 6.8544f, 9.5901f)
                curveTo(5.9833f, 10.3519f, 5.7489f, 11.6118f, 6.2876f, 12.6359f)
                curveTo(6.8263f, 13.66f, 7.9973f, 14.1806f, 9.1185f, 13.8943f)
                curveTo(9.3515f, 13.8259f, 9.5737f, 13.7249f, 9.7785f, 13.5943f)
                lineTo(12.7785f, 16.5943f)
                curveTo(12.1624f, 17.7989f, 12.6209f, 19.2751f, 13.811f, 19.9186f)
                curveTo(15.0012f, 20.5621f, 16.4875f, 20.1375f, 17.158f, 18.9623f)
                curveTo(17.8286f, 17.7871f, 17.438f, 16.2916f, 16.2785f, 15.5943f)
                horizontalLineTo(16.2385f)
                close()
            }
        }
        return _share!!
    }

