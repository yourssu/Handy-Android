package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.Switch
import com.yourssu.handy.compose.SwitchSize
import com.yourssu.handy.compose.SwitchState
import com.yourssu.handy.compose.Text


data class SwitchPreviewParameter(
    var switchState: SwitchState,
    val switchSize: SwitchSize
)

@Preview(showBackground = true)
@Composable
private fun PreviewMultipleSwitchState() {
    val samples = remember { mutableStateListOf<SwitchPreviewParameter>() }

    LaunchedEffect(Unit) {// SwitchState와 SwitchSize의 모든 조합 생성
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
    }


    Column {
        samples.forEachIndexed { index, switchPreviewParameter ->
            Text(text = "Size:${switchPreviewParameter.switchSize} State:${switchPreviewParameter.switchState}")
            Switch(
                switchState = switchPreviewParameter.switchState,
                switchSize = switchPreviewParameter.switchSize,
                onToggle = {
                    samples[index] = samples[index].copy(switchState = it)
                }
            )
        }
    }
}
