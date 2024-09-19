package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.ColorGray800
import com.yourssu.handy.compose.foundation.ColorStatusRedSub
import com.yourssu.handy.compose.foundation.HandyTypography

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
            color = HandyTheme.colors.textBasicWhite,
            maxLines = 2,
            style = HandyTypography.B3Sb14
        )
    }
}

@Composable
fun ErrorSnackBar(
    text: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(ColorStatusRedSub)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_alert_triangle),
            tint = HandyTheme.colors.bgStatusNegative
        )
        Text(
            text = text,
            color = HandyTheme.colors.textStatusNegative,
            maxLines = 2,
            style = HandyTypography.B3Sb14
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.ic_cancel),
            tint = HandyTheme.colors.textBasicTertiary,
        )
    }
}