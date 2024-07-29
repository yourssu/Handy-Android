package com.yourssu.handy.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.atom.CheckBox
import com.yourssu.handy.compose.atom.CheckBoxSize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Spacer(modifier = Modifier.padding(100.dp))
                CheckBox(checked = true, onCheckedChange = {}, sizeType = CheckBoxSize.MEDIUM, text = "selected")
                CheckBox(checked = false, onCheckedChange = {}, sizeType = CheckBoxSize.MEDIUM, text = "unselected")
                CheckBox(checked = false, isDisabled = true, onCheckedChange = {}, sizeType = CheckBoxSize.MEDIUM, text = "disabled")
            }
        }
    }
}
