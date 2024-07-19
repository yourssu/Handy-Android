package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Arrowrotatefilled: ImageVector? = null

public val Arrowrotatefilled: ImageVector
    get() {
        if (_Arrowrotatefilled != null) {
            return _Arrowrotatefilled!!
        }
        _Arrowrotatefilled = ImageVector.Builder(
            name = "Arrowrotatefilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12f, 5.20996f)
                curveTo(6.56f, 5.21f, 2.46f, 7.54f, 2.46f, 10.63f)
                curveTo(2.46f, 13.2f, 5.29f, 15.24f, 9.36f, 15.86f)
                lineTo(8.99996f, 16.23f)
                curveTo(8.4205f, 16.8178f, 8.4205f, 17.7621f, 9f, 18.35f)
                curveTo(9.589f, 18.936f, 10.5409f, 18.936f, 11.13f, 18.35f)
                lineTo(13.86f, 15.62f)
                curveTo(14.4449f, 15.0343f, 14.4449f, 14.0856f, 13.86f, 13.5f)
                lineTo(11.13f, 10.77f)
                curveTo(10.8483f, 10.486f, 10.4649f, 10.3263f, 10.065f, 10.3263f)
                curveTo(9.665f, 10.3263f, 9.2816f, 10.486f, 9f, 10.77f)
                curveTo(8.4845f, 11.2986f, 8.4375f, 12.1264f, 8.89f, 12.71f)
                curveTo(6.73f, 12.2f, 5.48f, 11.24f, 5.48f, 10.63f)
                curveTo(5.46f, 9.78f, 8f, 8.21f, 12f, 8.21f)
                curveTo(16f, 8.21f, 18.54f, 9.78f, 18.54f, 10.63f)
                curveTo(18.54f, 11.15f, 17.59f, 11.99f, 15.83f, 12.53f)
                curveTo(15.2828f, 12.6563f, 14.8521f, 13.0777f, 14.7137f, 13.6219f)
                curveTo(14.5754f, 14.1662f, 14.7526f, 14.7421f, 15.1729f, 15.1144f)
                curveTo(15.5933f, 15.4867f, 16.1864f, 15.5931f, 16.71f, 15.39f)
                curveTo(19.71f, 14.47f, 21.54f, 12.69f, 21.54f, 10.63f)
                curveTo(21.54f, 7.54f, 17.44f, 5.21f, 12f, 5.21f)
                close()
            }
        }.build()
        return _Arrowrotatefilled!!
    }

