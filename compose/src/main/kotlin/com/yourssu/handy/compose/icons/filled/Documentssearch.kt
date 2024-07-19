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
    Image(Documentssearchfilled, null)
}

private var _Documentssearchfilled: ImageVector? = null

public val Documentssearchfilled: ImageVector
    get() {
        if (_Documentssearchfilled != null) {
            return _Documentssearchfilled!!
        }
        _Documentssearchfilled = ImageVector.Builder(
            name = "Documentssearchfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.17f, 9.14017f)
                horizontalLineTo(18.79f)
                curveTo(19.0368f, 9.1605f, 19.2677f, 9.0163f, 19.3577f, 8.7855f)
                curveTo(19.4477f, 8.5548f, 19.3754f, 8.2923f, 19.18f, 8.1402f)
                lineTo(13.63f, 2.69017f)
                curveTo(13.4778f, 2.4947f, 13.2154f, 2.4224f, 12.9846f, 2.5124f)
                curveTo(12.7538f, 2.6024f, 12.6096f, 2.8333f, 12.63f, 3.0802f)
                verticalLineTo(7.65017f)
                curveTo(12.6297f, 8.0542f, 12.7936f, 8.4409f, 13.0839f, 8.7218f)
                curveTo(13.3742f, 9.0028f, 13.7662f, 9.1537f, 14.17f, 9.1402f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.07f, 10.2402f)
                horizontalLineTo(18.85f)
                curveTo(19.1261f, 10.2402f, 19.35f, 10.464f, 19.35f, 10.7402f)
                verticalLineTo(17.6602f)
                curveTo(19.35f, 19.8693f, 17.5591f, 21.6602f, 15.35f, 21.6602f)
                horizontalLineTo(8.45996f)
                curveTo(6.2508f, 21.6602f, 4.46f, 19.8693f, 4.46f, 17.6602f)
                verticalLineTo(6.50017f)
                curveTo(4.46f, 4.291f, 6.2508f, 2.5002f, 8.46f, 2.5002f)
                horizontalLineTo(11.13f)
                curveTo(11.4039f, 2.5055f, 11.6246f, 2.7263f, 11.63f, 3.0002f)
                verticalLineTo(7.78017f)
                curveTo(11.6273f, 8.4299f, 11.8829f, 9.0542f, 12.3405f, 9.5155f)
                curveTo(12.7981f, 9.9769f, 13.4202f, 10.2375f, 14.07f, 10.2402f)
                close()
                moveTo(8.84996f, 18.2802f)
                curveTo(9.3025f, 18.5646f, 9.8255f, 18.717f, 10.36f, 18.7202f)
                lineTo(10.4f, 18.6702f)
                curveTo(11.9684f, 18.6702f, 13.24f, 17.3987f, 13.24f, 15.8302f)
                curveTo(13.24f, 14.2617f, 11.9684f, 12.9902f, 10.4f, 12.9902f)
                curveTo(8.8315f, 12.9902f, 7.56f, 14.2617f, 7.56f, 15.8302f)
                curveTo(7.562f, 16.2916f, 7.6788f, 16.7452f, 7.9f, 17.1502f)
                curveTo(7.8543f, 17.1767f, 7.8109f, 17.2068f, 7.77f, 17.2402f)
                lineTo(6.70996f, 18.3402f)
                curveTo(6.5015f, 18.5568f, 6.4426f, 18.877f, 6.5602f, 19.1536f)
                curveTo(6.6779f, 19.4303f, 6.9493f, 19.61f, 7.25f, 19.6102f)
                curveTo(7.455f, 19.6163f, 7.6524f, 19.5322f, 7.79f, 19.3802f)
                lineTo(8.84996f, 18.2802f)
                close()
            }
            handyPath {
                moveTo(10.36f, 14.5302f)
                curveTo(9.8131f, 14.5261f, 9.3177f, 14.8524f, 9.1056f, 15.3566f)
                curveTo(8.8935f, 15.8607f, 9.0065f, 16.443f, 9.3918f, 16.8312f)
                curveTo(9.7771f, 17.2193f, 10.3586f, 17.3367f, 10.8642f, 17.1283f)
                curveTo(11.3699f, 16.92f, 11.6999f, 16.4271f, 11.7f, 15.8802f)
                curveTo(11.7f, 15.1385f, 11.1016f, 14.5357f, 10.36f, 14.5302f)
                close()
            }
        }.build()
        return _Documentssearchfilled!!
    }

