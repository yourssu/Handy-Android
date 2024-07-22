package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _alarm: ImageVector? = null

public val HandyIcons.Filled.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = handyIcon(name = "Filled.Alarm") {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(2.6572f, 13.352f)
                curveTo(2.6572f, 8.3814f, 6.6866f, 4.352f, 11.6572f, 4.352f)
                curveTo(16.6278f, 4.352f, 20.6572f, 8.3814f, 20.6572f, 13.352f)
                curveTo(20.6572f, 18.3225f, 16.6278f, 22.352f, 11.6572f, 22.352f)
                curveTo(6.6866f, 22.352f, 2.6572f, 18.3225f, 2.6572f, 13.352f)
                close()
                moveTo(11.6572f, 18.102f)
                curveTo(12.0714f, 18.102f, 12.4072f, 17.7662f, 12.4072f, 17.352f)
                verticalLineTo(12.942f)
                curveTo(12.407f, 12.7431f, 12.3279f, 12.5525f, 12.1872f, 12.412f)
                lineTo(9.3072f, 9.54198f)
                curveTo(9.1679f, 9.399f, 8.9768f, 9.3184f, 8.7772f, 9.3184f)
                curveTo(8.5776f, 9.3184f, 8.3865f, 9.399f, 8.2472f, 9.542f)
                curveTo(7.9547f, 9.8348f, 7.9547f, 10.3092f, 8.2472f, 10.602f)
                lineTo(10.9072f, 13.252f)
                verticalLineTo(17.352f)
                curveTo(10.9072f, 17.7662f, 11.243f, 18.102f, 11.6572f, 18.102f)
                close()
            }
            handyPath {
                moveTo(21.1872f, 5.85198f)
                curveTo(19.9546f, 4.2035f, 18.3141f, 2.9043f, 16.4272f, 2.082f)
                curveTo(16.2448f, 1.9951f, 16.0348f, 1.9865f, 15.846f, 2.0583f)
                curveTo(15.6571f, 2.13f, 15.5058f, 2.2759f, 15.4272f, 2.462f)
                curveTo(15.3438f, 2.646f, 15.3381f, 2.8559f, 15.4116f, 3.0441f)
                curveTo(15.485f, 3.2324f, 15.6312f, 3.383f, 15.8172f, 3.462f)
                curveTo(17.4642f, 4.1866f, 18.8968f, 5.3231f, 19.9772f, 6.762f)
                curveTo(20.1188f, 6.9508f, 20.3411f, 7.062f, 20.5772f, 7.062f)
                curveTo(20.7396f, 7.0627f, 20.8977f, 7.01f, 21.0272f, 6.912f)
                curveTo(21.1908f, 6.794f, 21.3f, 6.6151f, 21.3301f, 6.4156f)
                curveTo(21.3602f, 6.2162f, 21.3087f, 6.013f, 21.1872f, 5.852f)
                close()
            }
            handyPath {
                moveTo(3.3272f, 6.75198f)
                curveTo(4.4076f, 5.3131f, 5.8402f, 4.1766f, 7.4872f, 3.452f)
                curveTo(7.6732f, 3.373f, 7.8194f, 3.2224f, 7.8929f, 3.0341f)
                curveTo(7.9663f, 2.8459f, 7.9606f, 2.636f, 7.8772f, 2.452f)
                curveTo(7.7986f, 2.2659f, 7.6473f, 2.12f, 7.4584f, 2.0483f)
                curveTo(7.2696f, 1.9765f, 7.0596f, 1.9851f, 6.8772f, 2.072f)
                curveTo(4.9928f, 2.8986f, 3.3558f, 4.2012f, 2.1272f, 5.852f)
                curveTo(1.9112f, 6.174f, 1.9762f, 6.6075f, 2.2772f, 6.852f)
                curveTo(2.4067f, 6.95f, 2.5648f, 7.0027f, 2.7272f, 7.002f)
                curveTo(2.9548f, 7.0141f, 3.1756f, 6.9222f, 3.3272f, 6.752f)
                close()
            }
        }
        return _alarm!!
    }
