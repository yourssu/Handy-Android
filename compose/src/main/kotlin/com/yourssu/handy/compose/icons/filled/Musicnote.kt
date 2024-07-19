package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Musicnotefilled, null)
}

private var _Musicnotefilled: ImageVector? = null

public val Musicnotefilled: ImageVector
    get() {
        if (_Musicnotefilled != null) {
            return _Musicnotefilled!!
        }
        _Musicnotefilled = ImageVector.Builder(
            name = "Musicnotefilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(19.75f, 6.29997f)
                curveTo(19.7192f, 5.3642f, 19.2291f, 4.5038f, 18.44f, 4f)
                curveTo(17.3724f, 3.3053f, 16.0343f, 3.1711f, 14.85f, 3.64f)
                lineTo(10.3f, 5.40997f)
                curveTo(9.1446f, 5.8172f, 8.3529f, 6.886f, 8.3f, 8.11f)
                verticalLineTo(15.43f)
                curveTo(7.9001f, 15.2167f, 7.4532f, 15.1067f, 7f, 15.11f)
                curveTo(5.8707f, 15.11f, 4.8527f, 15.7908f, 4.4215f, 16.8346f)
                curveTo(3.9902f, 17.8784f, 4.2307f, 19.0792f, 5.0308f, 19.8763f)
                curveTo(5.8308f, 20.6735f, 7.0324f, 20.9097f, 8.0747f, 20.4747f)
                curveTo(9.1169f, 20.0397f, 9.7941f, 19.0193f, 9.79f, 17.89f)
                curveTo(9.7943f, 17.8367f, 9.7943f, 17.7832f, 9.79f, 17.73f)
                verticalLineTo(8.10997f)
                curveTo(9.8484f, 7.4969f, 10.2709f, 6.9795f, 10.86f, 6.8f)
                lineTo(15.4f, 4.99997f)
                curveTo(16.1264f, 4.7178f, 16.9439f, 4.7995f, 17.6f, 5.22f)
                curveTo(17.9846f, 5.4525f, 18.2283f, 5.8611f, 18.25f, 6.31f)
                verticalLineTo(13.58f)
                curveTo(17.8516f, 13.3605f, 17.4049f, 13.2436f, 16.95f, 13.24f)
                curveTo(15.4252f, 13.231f, 14.1757f, 14.4478f, 14.1441f, 15.9722f)
                curveTo(14.1126f, 17.4967f, 15.3108f, 18.7641f, 16.8347f, 18.8182f)
                curveTo(18.3585f, 18.8722f, 19.6435f, 17.6929f, 19.72f, 16.17f)
                curveTo(19.7247f, 16.1234f, 19.7247f, 16.0765f, 19.72f, 16.03f)
                lineTo(19.75f, 6.29997f)
                close()
            }
        }.build()
        return _Musicnotefilled!!
    }

