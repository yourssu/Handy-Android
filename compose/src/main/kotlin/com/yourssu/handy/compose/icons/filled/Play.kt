package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Playfilled, null)
}

private var _Playfilled: ImageVector? = null

public val Playfilled: ImageVector
    get() {
        if (_Playfilled != null) {
            return _Playfilled!!
        }
        _Playfilled = ImageVector.Builder(
            name = "Playfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(17.1199f, 9.40005f)
                lineTo(9.87988f, 5.22005f)
                curveTo(8.9529f, 4.6849f, 7.811f, 4.6841f, 6.8834f, 5.218f)
                curveTo(5.9557f, 5.7519f, 5.3828f, 6.7397f, 5.3799f, 7.8101f)
                verticalLineTo(16.19f)
                curveTo(5.3828f, 17.2604f, 5.9557f, 18.2481f, 6.8834f, 18.7821f)
                curveTo(7.811f, 19.316f, 8.9529f, 19.3152f, 9.8799f, 18.78f)
                lineTo(17.1199f, 14.6f)
                curveTo(18.05f, 14.0647f, 18.6232f, 13.0732f, 18.6232f, 12f)
                curveTo(18.6232f, 10.9269f, 18.05f, 9.9354f, 17.1199f, 9.4001f)
                close()
            }
        }.build()
        return _Playfilled!!
    }

