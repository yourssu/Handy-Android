import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Foldersharedline, null)
}

private var _Foldersharedline: ImageVector? = null

public val Foldersharedline: ImageVector
    get() {
        if (_Foldersharedline != null) {
            return _Foldersharedline!!
        }
        _Foldersharedline = ImageVector.Builder(
            name = "Foldersharedline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(5.89427f, 20.5919f)
                horizontalLineTo(13.3352f)
                curveTo(13.7693f, 20.5919f, 14.1212f, 20.9438f, 14.1212f, 21.3779f)
                curveTo(14.1212f, 21.812f, 13.7693f, 22.1639f, 13.3352f, 22.1639f)
                horizontalLineTo(5.89427f)
                curveTo(3.1936f, 22.1582f, 1.0058f, 19.9703f, 1f, 17.2697f)
                verticalLineTo(6.91522f)
                curveTo(0.9972f, 5.6144f, 1.5113f, 4.3658f, 2.4292f, 3.444f)
                curveTo(3.347f, 2.5222f, 4.5934f, 2.0028f, 5.8943f, 2f)
                horizontalLineTo(9.93963f)
                curveTo(11.4619f, 2f, 12.6959f, 3.234f, 12.6959f, 4.7563f)
                curveTo(12.7016f, 5.408f, 13.2285f, 5.9349f, 13.8802f, 5.9406f)
                horizontalLineTo(17.9256f)
                curveTo(20.6262f, 5.9463f, 22.8141f, 8.1342f, 22.8198f, 10.8348f)
                curveTo(22.8258f, 11.2783f, 22.477f, 11.6457f, 22.0338f, 11.6628f)
                curveTo(21.8283f, 11.6713f, 21.6282f, 11.5956f, 21.4798f, 11.4532f)
                curveTo(21.3314f, 11.3107f, 21.2476f, 11.1139f, 21.2478f, 10.9082f)
                curveTo(21.2618f, 10.0161f, 20.9186f, 9.1554f, 20.2947f, 8.5177f)
                curveTo(19.6707f, 7.88f, 18.8177f, 7.5181f, 17.9256f, 7.5126f)
                horizontalLineTo(13.8802f)
                curveTo(12.3579f, 7.5126f, 11.1239f, 6.2786f, 11.1239f, 4.7563f)
                curveTo(11.107f, 4.1128f, 10.5833f, 3.5984f, 9.9396f, 3.593f)
                horizontalLineTo(5.89427f)
                curveTo(4.0595f, 3.593f, 2.572f, 5.0804f, 2.572f, 6.9152f)
                verticalLineTo(17.2697f)
                curveTo(2.572f, 19.1045f, 4.0595f, 20.5919f, 5.8943f, 20.5919f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(18.4286f, 10.9606f)
                horizontalLineTo(19.026f)
                curveTo(19.6623f, 10.9494f, 20.2767f, 11.1936f, 20.7316f, 11.6387f)
                curveTo(21.1866f, 12.0838f, 21.4442f, 12.6926f, 21.4469f, 13.3291f)
                verticalLineTo(14.0522f)
                curveTo(21.4469f, 15.5282f, 20.2504f, 16.7247f, 18.7745f, 16.7247f)
                curveTo(17.2985f, 16.7247f, 16.102f, 15.5282f, 16.102f, 14.0522f)
                verticalLineTo(13.3291f)
                curveTo(16.1018f, 12.0372f, 17.1369f, 10.9834f, 18.4286f, 10.9606f)
                close()
                moveTo(18.7325f, 15.1527f)
                curveTo(19.3403f, 15.1527f, 19.833f, 14.66f, 19.833f, 14.0522f)
                verticalLineTo(13.3291f)
                curveTo(19.8272f, 12.8875f, 19.4676f, 12.5326f, 19.026f, 12.5326f)
                horizontalLineTo(18.4286f)
                curveTo(17.9887f, 12.5326f, 17.6321f, 12.8892f, 17.6321f, 13.3291f)
                verticalLineTo(14.0522f)
                curveTo(17.6321f, 14.66f, 18.1248f, 15.1527f, 18.7325f, 15.1527f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.5875f, 17.2697f)
                curveTo(21.6135f, 17.29f, 22.4864f, 18.0232f, 22.6836f, 19.0303f)
                lineTo(22.7779f, 19.5124f)
                curveTo(22.9142f, 20.1819f, 22.7451f, 20.8772f, 22.3168f, 21.4094f)
                curveTo(21.917f, 21.9087f, 21.311f, 22.1982f, 20.6714f, 22.1954f)
                horizontalLineTo(16.7832f)
                curveTo(16.1472f, 22.195f, 15.5458f, 21.9058f, 15.1483f, 21.4094f)
                curveTo(14.7121f, 20.881f, 14.5387f, 20.1835f, 14.6767f, 19.5124f)
                lineTo(14.7815f, 19.0303f)
                curveTo(14.975f, 18.0211f, 15.85f, 17.286f, 16.8775f, 17.2697f)
                horizontalLineTo(20.5875f)
                close()
                moveTo(20.6714f, 20.6233f)
                curveTo(20.8375f, 20.6163f, 20.9933f, 20.5404f, 21.1011f, 20.4137f)
                curveTo(21.2284f, 20.2466f, 21.278f, 20.033f, 21.2373f, 19.8268f)
                lineTo(21.143f, 19.3448f)
                curveTo(21.0946f, 19.0657f, 20.8599f, 18.8571f, 20.5771f, 18.8417f)
                horizontalLineTo(16.8775f)
                curveTo(16.5972f, 18.858f, 16.366f, 19.0673f, 16.3221f, 19.3448f)
                lineTo(16.2278f, 19.8268f)
                curveTo(16.1761f, 20.033f, 16.2268f, 20.2514f, 16.364f, 20.4137f)
                curveTo(16.465f, 20.5432f, 16.619f, 20.6202f, 16.7832f, 20.6233f)
                horizontalLineTo(20.6714f)
                close()
            }
        }.build()
        return _Foldersharedline!!
    }

