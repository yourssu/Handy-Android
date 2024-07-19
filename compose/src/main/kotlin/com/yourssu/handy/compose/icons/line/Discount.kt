import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Discountline, null)
}

private var _Discountline: ImageVector? = null

public val Discountline: ImageVector
    get() {
        if (_Discountline != null) {
            return _Discountline!!
        }
        _Discountline = ImageVector.Builder(
            name = "Discountline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.801f, 8.93999f)
                lineTo(9.03096f, 14.71f)
                curveTo(8.7385f, 15.0028f, 8.7385f, 15.4772f, 9.031f, 15.77f)
                curveTo(9.1708f, 15.9116f, 9.3619f, 15.9909f, 9.561f, 15.99f)
                curveTo(9.7602f, 15.9921f, 9.9517f, 15.9126f, 10.091f, 15.77f)
                lineTo(15.861f, 9.99999f)
                curveTo(16.0616f, 9.813f, 16.1442f, 9.5314f, 16.0763f, 9.2657f)
                curveTo(16.0085f, 9f, 15.801f, 8.7925f, 15.5352f, 8.7246f)
                curveTo(15.2695f, 8.6567f, 14.9879f, 8.7393f, 14.801f, 8.94f)
                close()
            }
            handyPath {
                moveTo(10.601f, 10.1f)
                curveTo(10.601f, 10.5142f, 10.2652f, 10.85f, 9.851f, 10.85f)
                curveTo(9.4367f, 10.85f, 9.101f, 10.5142f, 9.101f, 10.1f)
                curveTo(9.101f, 9.6858f, 9.4367f, 9.35f, 9.851f, 9.35f)
                curveTo(10.2652f, 9.35f, 10.601f, 9.6858f, 10.601f, 10.1f)
                close()
            }
            handyPath {
                moveTo(15.881f, 14.61f)
                curveTo(15.881f, 15.0242f, 15.5452f, 15.36f, 15.131f, 15.36f)
                curveTo(14.7167f, 15.36f, 14.381f, 15.0242f, 14.381f, 14.61f)
                curveTo(14.381f, 14.1958f, 14.7167f, 13.86f, 15.131f, 13.86f)
                curveTo(15.5452f, 13.86f, 15.881f, 14.1958f, 15.881f, 14.61f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(22.6397f, 8.22134f)
                curveTo(22.97f, 9.0765f, 22.7535f, 10.0464f, 22.0908f, 10.6799f)
                curveTo(21.6112f, 11.1086f, 21.337f, 11.7215f, 21.337f, 12.3649f)
                curveTo(21.337f, 13.0083f, 21.6112f, 13.6211f, 22.0908f, 14.0499f)
                curveTo(22.7828f, 14.6786f, 23.0185f, 15.6672f, 22.6847f, 16.5405f)
                curveTo(22.3508f, 17.4138f, 21.5157f, 17.9931f, 20.5808f, 17.9999f)
                horizontalLineTo(20.3308f)
                curveTo(19.7101f, 18.0046f, 19.1181f, 18.2622f, 18.6916f, 18.7133f)
                curveTo(18.265f, 19.1644f, 18.0409f, 19.7698f, 18.0709f, 20.3899f)
                curveTo(18.104f, 21.0133f, 17.8779f, 21.6226f, 17.446f, 22.0734f)
                curveTo(17.0142f, 22.5242f, 16.4151f, 22.7763f, 15.7908f, 22.7699f)
                curveTo(15.1554f, 22.7701f, 14.5506f, 22.4969f, 14.1308f, 22.0199f)
                curveTo(13.7004f, 21.5431f, 13.0882f, 21.271f, 12.4458f, 21.271f)
                curveTo(11.8035f, 21.271f, 11.1913f, 21.5431f, 10.7608f, 22.0199f)
                curveTo(10.3411f, 22.4969f, 9.7363f, 22.7701f, 9.1008f, 22.7699f)
                curveTo(8.4729f, 22.7766f, 7.8705f, 22.5219f, 7.438f, 22.0666f)
                curveTo(7.0055f, 21.6113f, 6.7819f, 20.9966f, 6.8209f, 20.3699f)
                curveTo(6.848f, 19.7515f, 6.6226f, 19.1487f, 6.1964f, 18.6998f)
                curveTo(5.7702f, 18.251f, 5.1798f, 17.9947f, 4.5609f, 17.9899f)
                horizontalLineTo(4.31085f)
                curveTo(3.4165f, 17.9474f, 2.6307f, 17.3832f, 2.3045f, 16.5494f)
                curveTo(1.9783f, 15.7156f, 2.1727f, 14.7679f, 2.8009f, 14.1299f)
                curveTo(3.2772f, 13.7013f, 3.5492f, 13.0906f, 3.5492f, 12.4499f)
                curveTo(3.5492f, 11.8091f, 3.2772f, 11.1985f, 2.8009f, 10.7699f)
                curveTo(2.0696f, 10.1489f, 1.8076f, 9.1353f, 2.1464f, 8.2378f)
                curveTo(2.4852f, 7.3403f, 3.3517f, 6.7527f, 4.3109f, 6.7699f)
                horizontalLineTo(4.56085f)
                curveTo(5.1881f, 6.7685f, 5.7867f, 6.5076f, 6.2149f, 6.0492f)
                curveTo(6.6429f, 5.5908f, 6.8623f, 4.9757f, 6.8209f, 4.3499f)
                curveTo(6.799f, 3.7333f, 7.0302f, 3.1345f, 7.4607f, 2.6926f)
                curveTo(7.8913f, 2.2507f, 8.4839f, 2.004f, 9.1008f, 2.0099f)
                curveTo(9.7387f, 2.0082f, 10.3454f, 2.2859f, 10.7608f, 2.7699f)
                curveTo(11.1955f, 3.2426f, 11.8087f, 3.5111f, 12.4508f, 3.5099f)
                curveTo(13.0895f, 3.5083f, 13.6985f, 3.24f, 14.1308f, 2.7699f)
                curveTo(14.5445f, 2.2822f, 15.1514f, 2.0006f, 15.7908f, 1.9999f)
                curveTo(16.4169f, 1.9933f, 17.0177f, 2.2467f, 17.4498f, 2.6998f)
                curveTo(17.882f, 3.1528f, 18.1069f, 3.7648f, 18.0709f, 4.3899f)
                curveTo(18.0408f, 5.009f, 18.2653f, 5.6135f, 18.6921f, 6.063f)
                curveTo(19.1189f, 6.5125f, 19.711f, 6.7679f, 20.3308f, 6.7699f)
                horizontalLineTo(20.5808f)
                curveTo(21.4973f, 6.7936f, 22.3095f, 7.3662f, 22.6397f, 8.2213f)
                close()
                moveTo(20.9909f, 15.8799f)
                curveTo(21.0733f, 15.7057f, 21.0234f, 15.4976f, 20.8708f, 15.3799f)
                verticalLineTo(15.3199f)
                curveTo(20.0328f, 14.5474f, 19.5561f, 13.4596f, 19.5561f, 12.3199f)
                curveTo(19.5561f, 11.1801f, 20.0328f, 10.0923f, 20.8708f, 9.3199f)
                curveTo(21.0234f, 9.2021f, 21.0733f, 8.994f, 20.9909f, 8.8199f)
                curveTo(20.9334f, 8.6432f, 20.7666f, 8.5252f, 20.5809f, 8.5299f)
                horizontalLineTo(20.3309f)
                curveTo(19.2152f, 8.5277f, 18.1492f, 8.0687f, 17.3808f, 7.2599f)
                curveTo(16.6193f, 6.4512f, 16.2155f, 5.3698f, 16.2608f, 4.2599f)
                curveTo(16.2776f, 4.1405f, 16.2411f, 4.0198f, 16.1608f, 3.9299f)
                curveTo(16.064f, 3.829f, 15.9307f, 3.7713f, 15.7908f, 3.7699f)
                curveTo(15.6483f, 3.7567f, 15.5089f, 3.817f, 15.4208f, 3.9299f)
                curveTo(14.6528f, 4.7773f, 13.5645f, 5.2634f, 12.4208f, 5.2699f)
                curveTo(11.2775f, 5.2622f, 10.1896f, 4.7762f, 9.4208f, 3.9299f)
                curveTo(9.3434f, 3.8315f, 9.226f, 3.7728f, 9.1008f, 3.7699f)
                curveTo(8.961f, 3.7713f, 8.8277f, 3.829f, 8.7309f, 3.9299f)
                curveTo(8.6506f, 4.0198f, 8.6141f, 4.1405f, 8.6309f, 4.2599f)
                curveTo(8.6969f, 5.3812f, 8.2978f, 6.4801f, 7.5276f, 7.2977f)
                curveTo(6.7573f, 8.1152f, 5.6841f, 8.5791f, 4.5609f, 8.5799f)
                horizontalLineTo(4.34085f)
                curveTo(4.1452f, 8.5648f, 3.9642f, 8.6841f, 3.9009f, 8.8699f)
                curveTo(3.8184f, 9.044f, 3.8683f, 9.2521f, 4.0209f, 9.3699f)
                curveTo(4.8662f, 10.1394f, 5.3519f, 11.2268f, 5.3609f, 12.3699f)
                curveTo(5.3544f, 13.5135f, 4.8682f, 14.6019f, 4.0209f, 15.3699f)
                curveTo(3.8683f, 15.4876f, 3.8184f, 15.6957f, 3.9009f, 15.8699f)
                curveTo(3.9516f, 16.0527f, 4.1212f, 16.1768f, 4.3109f, 16.1699f)
                horizontalLineTo(4.56085f)
                curveTo(5.6758f, 16.1741f, 6.7408f, 16.6334f, 7.5091f, 17.4414f)
                curveTo(8.2775f, 18.2494f, 8.6827f, 19.3361f, 8.6309f, 20.4499f)
                curveTo(8.6128f, 20.5663f, 8.6497f, 20.6845f, 8.7309f, 20.7699f)
                curveTo(8.8389f, 20.8776f, 8.9888f, 20.9325f, 9.1409f, 20.9199f)
                curveTo(9.2638f, 20.9168f, 9.3798f, 20.8624f, 9.4609f, 20.7699f)
                curveTo(10.231f, 19.9095f, 11.3311f, 19.4178f, 12.4858f, 19.4178f)
                curveTo(13.6406f, 19.4178f, 14.7407f, 19.9095f, 15.5108f, 20.7699f)
                curveTo(15.5806f, 20.8567f, 15.6806f, 20.9139f, 15.7908f, 20.9299f)
                curveTo(15.9307f, 20.9285f, 16.064f, 20.8708f, 16.1608f, 20.7699f)
                curveTo(16.242f, 20.6845f, 16.2789f, 20.5663f, 16.2608f, 20.4499f)
                curveTo(16.22f, 19.3407f, 16.6231f, 18.261f, 17.3808f, 17.4499f)
                curveTo(18.1519f, 16.6449f, 19.2162f, 16.1867f, 20.3309f, 16.1799f)
                horizontalLineTo(20.5508f)
                curveTo(20.7503f, 16.1975f, 20.9344f, 16.072f, 20.9909f, 15.8799f)
                close()
            }
        }.build()
        return _Discountline!!
    }

