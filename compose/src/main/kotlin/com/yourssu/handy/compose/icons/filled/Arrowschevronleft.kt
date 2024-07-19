package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Arrowschevronleftfilled: ImageVector? = null

public val Arrowschevronleftfilled: ImageVector
    get() {
        if (_Arrowschevronleftfilled != null) {
            return _Arrowschevronleftfilled!!
        }
        _Arrowschevronleftfilled = ImageVector.Builder(
            name = "Arrowschevronleftfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(15.9999f, 21.5f)
                curveTo(15.6025f, 21.4986f, 15.2216f, 21.3405f, 14.9399f, 21.06f)
                lineTo(6.93993f, 13.06f)
                curveTo(6.6566f, 12.7801f, 6.4971f, 12.3983f, 6.4971f, 12f)
                curveTo(6.4971f, 11.6017f, 6.6566f, 11.2199f, 6.9399f, 10.94f)
                lineTo(14.9399f, 2.94f)
                curveTo(15.3139f, 2.5387f, 15.877f, 2.3735f, 16.4085f, 2.5092f)
                curveTo(16.94f, 2.645f, 17.355f, 3.06f, 17.4907f, 3.5914f)
                curveTo(17.6264f, 4.1229f, 17.4612f, 4.6861f, 17.0599f, 5.06f)
                lineTo(10.1199f, 12f)
                lineTo(17.0599f, 18.94f)
                curveTo(17.3433f, 19.2199f, 17.5028f, 19.6017f, 17.5028f, 20f)
                curveTo(17.5028f, 20.3983f, 17.3433f, 20.7801f, 17.0599f, 21.06f)
                curveTo(16.7783f, 21.3405f, 16.3974f, 21.4986f, 15.9999f, 21.5f)
                close()
            }
        }.build()
        return _Arrowschevronleftfilled!!
    }

