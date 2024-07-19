package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Zapfilled, null)
}

private var _Zapfilled: ImageVector? = null

public val Zapfilled: ImageVector
    get() {
        if (_Zapfilled != null) {
            return _Zapfilled!!
        }
        _Zapfilled = ImageVector.Builder(
            name = "Zapfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(11.6045f, 3.50708f)
                lineTo(6.15445f, 13.0571f)
                curveTo(5.948f, 13.4103f, 5.9486f, 13.8476f, 6.156f, 14.2003f)
                curveTo(6.3635f, 14.553f, 6.7454f, 14.7659f, 7.1544f, 14.7571f)
                horizontalLineTo(10.0145f)
                curveTo(10.3822f, 14.7544f, 10.7358f, 14.8986f, 10.9967f, 15.1577f)
                curveTo(11.2577f, 15.4168f, 11.4045f, 15.7693f, 11.4045f, 16.1371f)
                verticalLineTo(19.7471f)
                curveTo(11.4078f, 20.1856f, 11.6966f, 20.5708f, 12.1166f, 20.697f)
                curveTo(12.5366f, 20.8233f, 12.9899f, 20.6611f, 13.2345f, 20.2971f)
                lineTo(18.5145f, 12.3771f)
                curveTo(18.7455f, 12.0286f, 18.7673f, 11.5816f, 18.5712f, 11.2123f)
                curveTo(18.3751f, 10.8431f, 17.9926f, 10.6108f, 17.5745f, 10.6071f)
                horizontalLineTo(14.8545f)
                curveTo(14.0923f, 10.6071f, 13.4745f, 9.9892f, 13.4745f, 9.2271f)
                verticalLineTo(4.00708f)
                curveTo(13.4776f, 3.5517f, 13.1727f, 3.1517f, 12.7328f, 3.034f)
                curveTo(12.2928f, 2.9164f, 11.829f, 3.1109f, 11.6045f, 3.5071f)
                close()
            }
        }.build()
        return _Zapfilled!!
    }

