package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.ColorGray800

@Composable
fun InfoSnackBar(
    text: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(ColorGray800)
            .padding(16.dp)
    ) {
        Text(
            text = text,
            color = White,
            maxLines = 2
        )
    }
}

//@Composable
//fun ErrorSnackBar(
//    text: String,
//    modifier: Modifier = Modifier,
//) {
//    Row(
//        modifier = modifier
//            .padding(horizontal = 16.dp)
//            .fillMaxWidth()
//            .clip(RoundedCornerShape(12.dp))
//            .background(ColorGray800)
//            .padding(16.dp)
//    ) {
//
//        Text(
//            text = text,
//            color = White,
//            maxLines = 2
//        )
//    }
//}