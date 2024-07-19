package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Foldereditfilled, null)
}

private var _Foldereditfilled: ImageVector? = null

public val Foldereditfilled: ImageVector
    get() {
        if (_Foldereditfilled != null) {
            return _Foldereditfilled!!
        }
        _Foldereditfilled = ImageVector.Builder(
            name = "Foldereditfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(15.9083f, 15.1365f)
                lineTo(17.8898f, 13.1445f)
                curveTo(18.0858f, 12.9342f, 18.381f, 12.8476f, 18.6596f, 12.9187f)
                curveTo(18.9382f, 12.9899f, 19.1558f, 13.2074f, 19.2269f, 13.486f)
                curveTo(19.2981f, 13.7646f, 19.2115f, 14.0598f, 19.0011f, 14.2558f)
                lineTo(17.0196f, 16.2478f)
                curveTo(16.873f, 16.3963f, 16.6727f, 16.4794f, 16.464f, 16.4784f)
                curveTo(16.2545f, 16.4832f, 16.0528f, 16.3994f, 15.9083f, 16.2478f)
                curveTo(15.7584f, 16.1018f, 15.6739f, 15.9014f, 15.6739f, 15.6921f)
                curveTo(15.6739f, 15.4829f, 15.7584f, 15.2825f, 15.9083f, 15.1365f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(18.9487f, 6.19361f)
                horizontalLineTo(13.9268f)
                curveTo(12.7688f, 6.1936f, 11.83f, 5.2548f, 11.83f, 4.0968f)
                curveTo(11.83f, 2.9388f, 10.8912f, 2f, 9.7332f, 2f)
                horizontalLineTo(4.71136f)
                curveTo(2.6681f, 2.0057f, 1.0115f, 3.6576f, 1f, 5.7009f)
                verticalLineTo(18.1244f)
                curveTo(0.9972f, 19.1096f, 1.3873f, 20.0552f, 2.084f, 20.7518f)
                curveTo(2.7806f, 21.4485f, 3.7262f, 21.8386f, 4.7114f, 21.8358f)
                horizontalLineTo(18.9487f)
                curveTo(20.9984f, 21.8358f, 22.66f, 20.1742f, 22.66f, 18.1244f)
                verticalLineTo(9.91544f)
                curveTo(22.66f, 7.864f, 21.0001f, 6.1994f, 18.9487f, 6.1936f)
                close()
                moveTo(19.9447f, 15.126f)
                lineTo(15.8664f, 19.0156f)
                curveTo(15.6537f, 19.2273f, 15.3775f, 19.3636f, 15.0801f, 19.4035f)
                lineTo(12.8784f, 19.739f)
                curveTo(12.7039f, 19.7706f, 12.5248f, 19.717f, 12.3964f, 19.5947f)
                curveTo(12.2679f, 19.4725f, 12.2055f, 19.2963f, 12.2284f, 19.1204f)
                lineTo(12.5744f, 17.0236f)
                curveTo(12.6207f, 16.7381f, 12.7609f, 16.4761f, 12.9728f, 16.2792f)
                lineTo(17.072f, 12.3897f)
                curveTo(17.8705f, 11.5893f, 19.1598f, 11.5661f, 19.9866f, 12.3372f)
                curveTo(20.3675f, 12.7039f, 20.5793f, 13.2121f, 20.5713f, 13.7407f)
                curveTo(20.5634f, 14.2694f, 20.3364f, 14.771f, 19.9447f, 15.126f)
                close()
            }
        }.build()
        return _Foldereditfilled!!
    }

