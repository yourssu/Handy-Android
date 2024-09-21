package com.yourssu.handy.demo

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.yourssu.handy.compose.Switch
import com.yourssu.handy.compose.SwitchSize
import com.yourssu.handy.compose.SwitchState
import com.yourssu.handy.compose.Text


data class SwitchPreviewParameter(
    val switchState: SwitchState,
    val switchSize: SwitchSize
)

class SwitchPreviewParameterProvider : PreviewParameterProvider<SwitchPreviewParameter> {
    override val values = getAllCombinations()

    private fun getAllCombinations(): Sequence<SwitchPreviewParameter> {
        val samples = mutableListOf<SwitchPreviewParameter>()

        // SwitchState와 SwitchSize의 모든 조합 생성
        val switchStates =
            listOf(SwitchState.Unselected, SwitchState.Selected, SwitchState.Disabled)
        val switchSizes = listOf(SwitchSize.Large, SwitchSize.Medium, SwitchSize.Small)

        switchStates.forEach { state ->
            switchSizes.forEach { size ->
                samples.add(
                    SwitchPreviewParameter(
                        switchState = state,
                        switchSize = size
                    )
                )
            }
        }
        return samples.asSequence()
    }
}

@Preview
@Composable
private fun PreviewSwitchState() {
    var switchState by remember { mutableStateOf<SwitchState>(SwitchState.Unselected) }

    Column {
        Text(text = "Size:Large State:$switchState")
        Switch(
            switchState = switchState,
            switchSize = SwitchSize.Large,
            onToggle = { switchState = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewMultipleSwitchState(
    @PreviewParameter(SwitchPreviewParameterProvider::class) parameter: SwitchPreviewParameter,
) {
    Column {
        Text(text = "Size:${parameter.switchSize} State:${parameter.switchState}")
        Switch(
            switchState = parameter.switchState,
            switchSize = parameter.switchSize,
            onToggle = { Log.d("Switch", "onToggle: $it") }
        )
    }
}
