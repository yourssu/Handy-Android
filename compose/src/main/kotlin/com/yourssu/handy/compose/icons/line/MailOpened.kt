package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _mailOpened: ImageVector? = null

public val HandyIcons.Line.MailOpened: ImageVector
    get() {
        if (_mailOpened != null) {
            return _mailOpened!!
        }
        _mailOpened = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(13.29f, 2.54291f)
                lineTo(20.14f, 7.35291f)
                curveTo(21.205f, 8.1014f, 21.8392f, 9.3212f, 21.84f, 10.6229f)
                verticalLineTo(17.7529f)
                curveTo(21.8374f, 18.8854f, 21.3849f, 19.9704f, 20.5823f, 20.7693f)
                curveTo(19.7796f, 21.5682f, 18.6925f, 22.0156f, 17.56f, 22.0129f)
                horizontalLineTo(6.28f)
                curveTo(5.1475f, 22.0156f, 4.0604f, 21.5682f, 3.2577f, 20.7693f)
                curveTo(2.4551f, 19.9704f, 2.0027f, 18.8854f, 2f, 17.7529f)
                verticalLineTo(10.6229f)
                curveTo(2.0008f, 9.3212f, 2.635f, 8.1014f, 3.7f, 7.3529f)
                lineTo(10.55f, 2.54291f)
                curveTo(11.3199f, 1.819f, 12.5201f, 1.819f, 13.29f, 2.5429f)
                close()
                moveTo(19.5216f, 19.7087f)
                curveTo(20.043f, 19.1911f, 20.3374f, 18.4876f, 20.34f, 17.7529f)
                verticalLineTo(10.6229f)
                curveTo(20.326f, 9.8253f, 19.9322f, 9.0823f, 19.28f, 8.6229f)
                lineTo(12.43f, 3.81291f)
                lineTo(12.32f, 3.73291f)
                curveTo(12.2147f, 3.6254f, 12.0705f, 3.5648f, 11.92f, 3.5648f)
                curveTo(11.7695f, 3.5648f, 11.6253f, 3.6254f, 11.52f, 3.7329f)
                lineTo(11.41f, 3.81291f)
                lineTo(4.56f, 8.62291f)
                curveTo(3.9078f, 9.0823f, 3.514f, 9.8253f, 3.5f, 10.6229f)
                verticalLineTo(17.7529f)
                curveTo(3.5027f, 18.4876f, 3.797f, 19.1911f, 4.3184f, 19.7087f)
                curveTo(4.8397f, 20.2263f, 5.5454f, 20.5156f, 6.28f, 20.5129f)
                horizontalLineTo(17.56f)
                curveTo(18.2947f, 20.5156f, 19.0003f, 20.2263f, 19.5216f, 19.7087f)
                close()
            }
            handyPath {
                moveTo(17.99f, 11.0129f)
                lineTo(12.45f, 14.8829f)
                curveTo(12.286f, 15.047f, 12.0608f, 15.1349f, 11.829f, 15.1254f)
                curveTo(11.5973f, 15.1159f, 11.38f, 15.0098f, 11.23f, 14.8329f)
                lineTo(5.85f, 11.0129f)
                curveTo(5.6339f, 10.826f, 5.3304f, 10.7781f, 5.0672f, 10.8894f)
                curveTo(4.8041f, 11.0007f, 4.627f, 11.2519f, 4.6106f, 11.5372f)
                curveTo(4.5942f, 11.8224f, 4.7413f, 12.0922f, 4.99f, 12.2329f)
                lineTo(10.29f, 16.0129f)
                curveTo(10.7246f, 16.4175f, 11.2962f, 16.6426f, 11.89f, 16.6429f)
                curveTo(12.4484f, 16.6288f, 12.9808f, 16.4037f, 13.38f, 16.0129f)
                lineTo(18.85f, 12.1929f)
                curveTo(19.1645f, 11.9602f, 19.2472f, 11.5248f, 19.04f, 11.1929f)
                curveTo(18.7977f, 10.8566f, 18.3305f, 10.7765f, 17.99f, 11.0129f)
                close()
            }
        }
        return _mailOpened!!
    }

