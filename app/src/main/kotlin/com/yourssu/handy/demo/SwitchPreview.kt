package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
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
    val switchStates =
        listOf(SwitchState.Unselected, SwitchState.Selected, SwitchState.Disabled)
    val switchSizes = listOf(SwitchSize.Large, SwitchSize.Medium, SwitchSize.Small)
    val samples = switchStates.flatMap { state ->
        switchSizes.map { size -> SwitchPreviewParameter(state, size) }
    }


    Column {
        samples.forEachIndexed { index, switchPreviewParameter ->
            Text(text = "Size:${switchPreviewParameter.switchSize} State:${switchPreviewParameter.switchState}")
            Switch(
                switchState = switchPreviewParameter.switchState,
                switchSize = switchPreviewParameter.switchSize,
                onToggle = {

                }
            )
        }
    }
}
