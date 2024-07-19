package com.yourssu.handy.compose.icons.filled


private var _Arrowschevronupfilled: ImageVector? = null

public val Arrowschevronupfilled: ImageVector
    get() {
        if (_Arrowschevronupfilled != null) {
            return _Arrowschevronupfilled!!
        }
        _Arrowschevronupfilled = ImageVector.Builder(
            name = "Arrowschevronupfilled",
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
                moveTo(20.4208f, 17.5787f)
                curveTo(20.0166f, 17.5787f, 19.6124f, 17.425f, 19.304f, 17.1166f)
                lineTo(11.9998f, 9.81132f)
                lineTo(4.69553f, 17.1166f)
                curveTo(4.0787f, 17.7324f, 3.0787f, 17.7324f, 2.4618f, 17.1166f)
                curveTo(1.846f, 16.4998f, 1.846f, 15.4997f, 2.4618f, 14.8829f)
                lineTo(10.8829f, 6.46184f)
                curveTo(11.4997f, 5.846f, 12.4998f, 5.846f, 13.1166f, 6.4618f)
                lineTo(21.5377f, 14.8829f)
                curveTo(22.1534f, 15.4997f, 22.1534f, 16.4998f, 21.5377f, 17.1166f)
                curveTo(21.2292f, 17.425f, 20.825f, 17.5787f, 20.4208f, 17.5787f)
                close()
            }
        }.build()
        return _Arrowschevronupfilled!!
    }

