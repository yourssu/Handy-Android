package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _download: ImageVector? = null

public val HandyIcons.Line.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = handyIcon {
            handyPath {
                moveTo(11.3104f, 16.54f)
                lineTo(7.58037f, 12.82f)
                curveTo(7.4222f, 12.6624f, 7.3333f, 12.4483f, 7.3333f, 12.225f)
                curveTo(7.3333f, 12.0017f, 7.4222f, 11.7876f, 7.5804f, 11.63f)
                curveTo(7.913f, 11.3113f, 8.4377f, 11.3113f, 8.7704f, 11.63f)
                lineTo(11.0604f, 13.93f)
                verticalLineTo(3.84f)
                curveTo(11.0604f, 3.3761f, 11.4364f, 3f, 11.9004f, 3f)
                curveTo(12.3643f, 3f, 12.7404f, 3.3761f, 12.7404f, 3.84f)
                verticalLineTo(13.93f)
                lineTo(15.0304f, 11.63f)
                curveTo(15.363f, 11.3113f, 15.8877f, 11.3113f, 16.2204f, 11.63f)
                curveTo(16.3785f, 11.7876f, 16.4674f, 12.0017f, 16.4674f, 12.225f)
                curveTo(16.4674f, 12.4483f, 16.3785f, 12.6624f, 16.2204f, 12.82f)
                lineTo(12.4904f, 16.54f)
                curveTo(12.3364f, 16.7009f, 12.123f, 16.7913f, 11.9004f, 16.79f)
                curveTo(11.6772f, 16.7937f, 11.4629f, 16.7029f, 11.3104f, 16.54f)
                close()
            }
            handyPath {
                moveTo(17.1204f, 8.42f)
                horizontalLineTo(18.3304f)
                curveTo(20.8466f, 8.4747f, 22.845f, 10.5536f, 22.8004f, 13.07f)
                verticalLineTo(16.88f)
                curveTo(22.845f, 19.3964f, 20.8466f, 21.4753f, 18.3304f, 21.53f)
                lineTo(5.47038f, 21.45f)
                curveTo(2.9541f, 21.3953f, 0.9557f, 19.3164f, 1.0004f, 16.8f)
                verticalLineTo(12.99f)
                curveTo(0.9709f, 11.7762f, 1.4256f, 10.6005f, 2.2643f, 9.7225f)
                curveTo(3.1029f, 8.8444f, 4.2565f, 8.3362f, 5.4704f, 8.31f)
                horizontalLineTo(6.68038f)
                curveTo(7.1443f, 8.31f, 7.5204f, 8.6861f, 7.5204f, 9.15f)
                curveTo(7.5204f, 9.6139f, 7.1443f, 9.99f, 6.6804f, 9.99f)
                horizontalLineTo(5.47038f)
                curveTo(4.701f, 10.0134f, 3.9731f, 10.3437f, 3.4489f, 10.9074f)
                curveTo(2.9247f, 11.471f, 2.6479f, 12.221f, 2.6804f, 12.99f)
                verticalLineTo(16.77f)
                curveTo(2.6479f, 17.539f, 2.9247f, 18.289f, 3.4489f, 18.8526f)
                curveTo(3.9731f, 19.4163f, 4.701f, 19.7466f, 5.4704f, 19.77f)
                lineTo(18.3304f, 19.91f)
                curveTo(19.0997f, 19.8866f, 19.8277f, 19.5563f, 20.3519f, 18.9926f)
                curveTo(20.876f, 18.429f, 21.1528f, 17.679f, 21.1204f, 16.91f)
                verticalLineTo(13.1f)
                curveTo(21.1528f, 12.331f, 20.876f, 11.581f, 20.3519f, 11.0174f)
                curveTo(19.8277f, 10.4537f, 19.0997f, 10.1234f, 18.3304f, 10.1f)
                horizontalLineTo(17.1204f)
                curveTo(16.6565f, 10.1f, 16.2804f, 9.7239f, 16.2804f, 9.26f)
                curveTo(16.2804f, 8.7961f, 16.6565f, 8.42f, 17.1204f, 8.42f)
                close()
            }
        }
        return _download!!
    }

