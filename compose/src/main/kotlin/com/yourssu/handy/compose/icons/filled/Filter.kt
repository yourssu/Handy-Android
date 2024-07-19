package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Filterfilled, null)
}

private var _Filterfilled: ImageVector? = null

public val Filterfilled: ImageVector
    get() {
        if (_Filterfilled != null) {
            return _Filterfilled!!
        }
        _Filterfilled = ImageVector.Builder(
            name = "Filterfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(4.89887f, 2f)
                horizontalLineTo(19.0789f)
                curveTo(20.2514f, 2.0005f, 21.3083f, 2.7071f, 21.757f, 3.7904f)
                curveTo(22.2056f, 4.8737f, 21.9577f, 6.1206f, 21.1289f, 6.95f)
                lineTo(16.3589f, 11.72f)
                curveTo(15.8215f, 12.2721f, 15.5172f, 13.0097f, 15.5089f, 13.78f)
                verticalLineTo(18.17f)
                curveTo(15.5073f, 19.0824f, 15.0779f, 19.9413f, 14.3489f, 20.49f)
                lineTo(13.1089f, 21.43f)
                curveTo(12.2287f, 22.0902f, 11.0507f, 22.1954f, 10.0675f, 21.7016f)
                curveTo(9.0842f, 21.2079f, 8.4651f, 20.2002f, 8.4689f, 19.1f)
                verticalLineTo(13.78f)
                curveTo(8.4605f, 13.0097f, 8.1562f, 12.2721f, 7.6189f, 11.72f)
                lineTo(2.84887f, 6.95f)
                curveTo(2.02f, 6.1206f, 1.7721f, 4.8737f, 2.2208f, 3.7904f)
                curveTo(2.6694f, 2.7071f, 3.7263f, 2.0005f, 4.8989f, 2f)
                close()
            }
        }.build()
        return _Filterfilled!!
    }

