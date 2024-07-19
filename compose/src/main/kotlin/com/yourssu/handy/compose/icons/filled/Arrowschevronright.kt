package com.yourssu.handy.compose.icons.filled


private var _Arrowschevronrightfilled: ImageVector? = null

public val Arrowschevronrightfilled: ImageVector
    get() {
        if (_Arrowschevronrightfilled != null) {
            return _Arrowschevronrightfilled!!
        }
        _Arrowschevronrightfilled = ImageVector.Builder(
            name = "Arrowschevronrightfilled",
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
                moveTo(6.20996f, 20.2104f)
                curveTo(6.21f, 19.8062f, 6.3636f, 19.402f, 6.6721f, 19.0936f)
                lineTo(13.9773f, 11.7894f)
                lineTo(6.67207f, 4.48514f)
                curveTo(6.0563f, 3.8683f, 6.0563f, 2.8683f, 6.6721f, 2.2515f)
                curveTo(7.2889f, 1.6357f, 8.2889f, 1.6357f, 8.9057f, 2.2515f)
                lineTo(17.3268f, 10.6725f)
                curveTo(17.9426f, 11.2894f, 17.9426f, 12.2894f, 17.3268f, 12.9062f)
                lineTo(8.90575f, 21.3273f)
                curveTo(8.2889f, 21.9431f, 7.2889f, 21.9431f, 6.6721f, 21.3273f)
                curveTo(6.3636f, 21.0188f, 6.21f, 20.6146f, 6.21f, 20.2104f)
                close()
            }
        }.build()
        return _Arrowschevronrightfilled!!
    }

