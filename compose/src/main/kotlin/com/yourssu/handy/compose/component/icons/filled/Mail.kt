package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _mail: ImageVector? = null

public val HandyIcons.Filled.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(6f, 4f)
                horizontalLineTo(18f)
                curveTo(20.2091f, 4f, 22f, 5.7909f, 22f, 8f)
                verticalLineTo(17f)
                curveTo(22f, 19.2091f, 20.2091f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(3.7909f, 21f, 2f, 19.2091f, 2f, 17f)
                verticalLineTo(8f)
                curveTo(2f, 5.7909f, 3.7909f, 4f, 6f, 4f)
                close()
                moveTo(13.4f, 13.55f)
                lineTo(19.74f, 8.85f)
                curveTo(20.0229f, 8.642f, 20.0854f, 8.2448f, 19.88f, 7.96f)
                curveTo(19.7821f, 7.824f, 19.6333f, 7.7335f, 19.4675f, 7.709f)
                curveTo(19.3017f, 7.6845f, 19.1331f, 7.7281f, 19f, 7.83f)
                lineTo(12.59f, 12.5f)
                curveTo(12.4296f, 12.6681f, 12.2074f, 12.7633f, 11.975f, 12.7633f)
                curveTo(11.7426f, 12.7633f, 11.5204f, 12.6681f, 11.36f, 12.5f)
                lineTo(5f, 7.83f)
                curveTo(4.8676f, 7.7313f, 4.7013f, 7.6896f, 4.538f, 7.714f)
                curveTo(4.3746f, 7.7384f, 4.2278f, 7.8269f, 4.13f, 7.96f)
                curveTo(3.9224f, 8.2422f, 3.9804f, 8.6389f, 4.26f, 8.85f)
                lineTo(10.56f, 13.5f)
                curveTo(10.952f, 13.8719f, 11.4697f, 14.0825f, 12.01f, 14.09f)
                curveTo(12.5245f, 14.0899f, 13.0204f, 13.8973f, 13.4f, 13.55f)
                close()
            }
        }
        return _mail!!
    }

