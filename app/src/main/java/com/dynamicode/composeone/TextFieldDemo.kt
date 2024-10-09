package com.dynamicode.composeone

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DcTextField(){
    val text = remember {
        mutableStateOf("douglas")
    }
    TextField(value = text.value, onValueChange = {
        println(it)
        text.value = it // 唯一数据源
    }, modifier = Modifier.background(Color.Blue), colors = TextFieldDefaults.colors(
        focusedTextColor = Color.Transparent, focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent
    ), shape = RoundedCornerShape(13.dp)
    )
}