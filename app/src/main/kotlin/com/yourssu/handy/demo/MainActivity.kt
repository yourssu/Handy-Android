package com.yourssu.handy.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import com.yourssu.handy.compose.IconSize
import com.yourssu.handy.compose.atom.CheckBox
import com.yourssu.handy.compose.atom.CheckBoxSize
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Spacer(modifier = Modifier.padding(100.dp))
                CheckBox(checked = true, onCheckedChange = {}, sizeType = CheckBoxSize.MEDIUM, text = "selected")
            }
        }
    }
}
