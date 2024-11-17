package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _unlock: ImageVector? = null

public val HandyIcons.Filled.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(8.55151f, 7.78202f)
                horizontalLineTo(14.6915f)
                curveTo(16.0885f, 7.7199f, 17.4413f, 8.2791f, 18.3867f, 9.3094f)
                curveTo(19.3321f, 10.3397f, 19.7732f, 11.7355f, 19.5915f, 13.122f)
                lineTo(18.6415f, 18.892f)
                curveTo(18.1849f, 21.2117f, 16.1251f, 22.8663f, 13.7615f, 22.812f)
                horizontalLineTo(9.88151f)
                curveTo(7.5179f, 22.8663f, 5.4582f, 21.2117f, 5.0015f, 18.892f)
                lineTo(4.05151f, 13.122f)
                curveTo(3.7244f, 10.9518f, 4.9827f, 8.8546f, 7.0515f, 8.122f)
                verticalLineTo(5.00202f)
                curveTo(7.051f, 4.1869f, 7.3821f, 3.4067f, 7.9687f, 2.8408f)
                curveTo(8.5554f, 2.275f, 9.347f, 1.9721f, 10.1615f, 2.002f)
                horizontalLineTo(13.4415f)
                curveTo(14.256f, 1.9721f, 15.0477f, 2.275f, 15.6343f, 2.8408f)
                curveTo(16.2209f, 3.4067f, 16.5521f, 4.1869f, 16.5515f, 5.002f)
                curveTo(16.5515f, 5.4162f, 16.2157f, 5.752f, 15.8015f, 5.752f)
                curveTo(15.3873f, 5.752f, 15.0515f, 5.4162f, 15.0515f, 5.002f)
                curveTo(15.0137f, 4.1497f, 14.294f, 3.4882f, 13.4415f, 3.522f)
                horizontalLineTo(10.1615f)
                curveTo(9.309f, 3.4882f, 8.5894f, 4.1497f, 8.5515f, 5.002f)
                verticalLineTo(7.78202f)
                close()
                moveTo(13.0115f, 16.552f)
                lineTo(12.8015f, 15.932f)
                curveTo(12.6883f, 15.5818f, 12.7766f, 15.1976f, 13.0315f, 14.932f)
                curveTo(13.5982f, 14.2588f, 13.541f, 13.2604f, 12.9013f, 12.6562f)
                curveTo(12.2615f, 12.052f, 11.2615f, 12.052f, 10.6217f, 12.6562f)
                curveTo(9.982f, 13.2604f, 9.9249f, 14.2588f, 10.4915f, 14.932f)
                curveTo(10.7464f, 15.1976f, 10.8347f, 15.5818f, 10.7215f, 15.932f)
                lineTo(10.5115f, 16.552f)
                curveTo(10.4194f, 16.8358f, 10.4675f, 17.1464f, 10.6411f, 17.3891f)
                curveTo(10.8147f, 17.6317f, 11.0932f, 17.7775f, 11.3915f, 17.782f)
                horizontalLineTo(12.1315f)
                curveTo(12.4298f, 17.7775f, 12.7083f, 17.6317f, 12.8819f, 17.3891f)
                curveTo(13.0555f, 17.1464f, 13.1036f, 16.8358f, 13.0115f, 16.552f)
                close()
            }
        }
        return _unlock!!
    }

