package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


private var _Alerttrianglefilled: ImageVector? = null

public val Alerttrianglefilled: ImageVector
    get() {
        if (_Alerttrianglefilled != null) {
            return _Alerttrianglefilled!!
        }
        _Alerttrianglefilled = ImageVector.Builder(
            name = "Alerttrianglefilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.8555f, 15.5035f)
                lineTo(15.2155f, 5.06351f)
                curveTo(14.511f, 3.7902f, 13.1706f, 3f, 11.7155f, 3f)
                curveTo(10.2603f, 3f, 8.92f, 3.7902f, 8.2155f, 5.0635f)
                lineTo(2.48548f, 15.4935f)
                curveTo(1.8123f, 16.7322f, 1.8409f, 18.2339f, 2.5608f, 19.4461f)
                curveTo(3.2807f, 20.6582f, 4.5856f, 21.4019f, 5.9955f, 21.4035f)
                horizontalLineTo(17.3355f)
                curveTo(18.7441f, 21.4035f, 20.0489f, 20.6626f, 20.7706f, 19.4529f)
                curveTo(21.4923f, 18.2432f, 21.5246f, 16.7431f, 20.8555f, 15.5035f)
                close()
                moveTo(10.8555f, 9.74351f)
                curveTo(10.8555f, 9.3293f, 11.1913f, 8.9935f, 11.6055f, 8.9935f)
                curveTo(12.0197f, 8.9935f, 12.3555f, 9.3293f, 12.3555f, 9.7435f)
                verticalLineTo(12.8335f)
                curveTo(12.3555f, 13.2477f, 12.0197f, 13.5835f, 11.6055f, 13.5835f)
                curveTo(11.1913f, 13.5835f, 10.8555f, 13.2477f, 10.8555f, 12.8335f)
                verticalLineTo(9.74351f)
                close()
                moveTo(11.6155f, 16.4935f)
                curveTo(12.0297f, 16.4935f, 12.3655f, 16.1577f, 12.3655f, 15.7435f)
                lineTo(12.3555f, 15.7335f)
                curveTo(12.3555f, 15.3248f, 12.0242f, 14.9935f, 11.6155f, 14.9935f)
                curveTo(11.2035f, 14.9989f, 10.8709f, 15.3315f, 10.8655f, 15.7435f)
                curveTo(10.8655f, 16.1577f, 11.2013f, 16.4935f, 11.6155f, 16.4935f)
                close()
            }
        }.build()
        return _Alerttrianglefilled!!
    }

