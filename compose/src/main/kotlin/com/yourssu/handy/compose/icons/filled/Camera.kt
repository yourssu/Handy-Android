package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Camerafilled: ImageVector? = null

public val Camerafilled: ImageVector
    get() {
        if (_Camerafilled != null) {
            return _Camerafilled!!
        }
        _Camerafilled = ImageVector.Builder(
            name = "Camerafilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.93f, 12.78f)
                curveTo(14.93f, 14.1607f, 13.8107f, 15.28f, 12.43f, 15.28f)
                curveTo(11.0493f, 15.28f, 9.93f, 14.1607f, 9.93f, 12.78f)
                curveTo(9.93f, 11.3993f, 11.0493f, 10.28f, 12.43f, 10.28f)
                curveTo(13.8107f, 10.28f, 14.93f, 11.3993f, 14.93f, 12.78f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(17.94f, 5.00001f)
                horizontalLineTo(7.06f)
                curveTo(5.9841f, 4.9974f, 4.9514f, 5.4229f, 4.1898f, 6.1827f)
                curveTo(3.4281f, 6.9425f, 3f, 7.9741f, 3f, 9.05f)
                verticalLineTo(15.95f)
                curveTo(3f, 17.0259f, 3.4281f, 18.0575f, 4.1898f, 18.8173f)
                curveTo(4.9514f, 19.5771f, 5.9841f, 20.0027f, 7.06f, 20f)
                horizontalLineTo(17.94f)
                curveTo(19.0159f, 20.0027f, 20.0486f, 19.5771f, 20.8102f, 18.8173f)
                curveTo(21.5719f, 18.0575f, 22f, 17.0259f, 22f, 15.95f)
                verticalLineTo(9.05001f)
                curveTo(22f, 7.9741f, 21.5719f, 6.9425f, 20.8102f, 6.1827f)
                curveTo(20.0486f, 5.4229f, 19.0159f, 4.9974f, 17.94f, 5f)
                close()
                moveTo(12.43f, 16.78f)
                curveTo(10.2209f, 16.78f, 8.43f, 14.9892f, 8.43f, 12.78f)
                curveTo(8.43f, 10.5709f, 10.2209f, 8.78f, 12.43f, 8.78f)
                curveTo(14.6391f, 8.78f, 16.43f, 10.5709f, 16.43f, 12.78f)
                curveTo(16.43f, 13.8409f, 16.0086f, 14.8583f, 15.2584f, 15.6084f)
                curveTo(14.5083f, 16.3586f, 13.4909f, 16.78f, 12.43f, 16.78f)
                close()
                moveTo(17.93f, 9.78001f)
                curveTo(18.2061f, 9.78f, 18.43f, 9.5562f, 18.43f, 9.28f)
                verticalLineTo(8.28001f)
                curveTo(18.43f, 8.0039f, 18.2061f, 7.78f, 17.93f, 7.78f)
                horizontalLineTo(16.93f)
                curveTo(16.6539f, 7.78f, 16.43f, 8.0039f, 16.43f, 8.28f)
                verticalLineTo(9.28001f)
                curveTo(16.43f, 9.5562f, 16.6539f, 9.78f, 16.93f, 9.78f)
                horizontalLineTo(17.93f)
                close()
            }
        }.build()
        return _Camerafilled!!
    }

