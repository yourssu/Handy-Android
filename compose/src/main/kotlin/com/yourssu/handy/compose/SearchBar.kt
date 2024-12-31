package com.yourssu.handy.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

enum class SearchBarState {
    Inactive,
    Focused,
    Typing,
    Completed
}

@Composable
fun SearchBar(
    modifier: Modifier  = Modifier,
    text : String,
    onTextChange : (String) -> Unit
){
    var searchText by remember { mutableStateOf(TextFieldValue(text)) }
}