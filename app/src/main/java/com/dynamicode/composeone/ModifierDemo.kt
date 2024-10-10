package com.dynamicode.composeone

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Created by liudagang on 2024/10/9.
 *
 * Package Name ComposeOne
 */
@Composable
fun ModifierDemo(modifier: Modifier = Modifier) {
    // ModifierNodeElement<SizeNode>()
    // 连续两个size只有第一个生效,其他属性每次都生效
    Text(text = "abc", modifier = Modifier.size(30.dp,30.dp).background(Color.Yellow).width(100.dp))
}

@Composable
fun ModifierDemo1(modifier: Modifier = Modifier) {
    // ModifierNodeElement<SizeNode>()
    // 连续两个size只有第一个生效,其他属性每次都生效
    // A Modifier. Element that makes content draw into a draw layer
    Text(text = "abc", modifier = Modifier.size(30.dp,30.dp).background(Color.Yellow).width(100.dp))
    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "abc", modifier = Modifier.size(30.dp,30.dp).background(Color.Green).clip(
        CircleShape)) // 裁剪无效
    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "abc", modifier = Modifier.size(30.dp,30.dp).clip(CircleShape).background(Color.Yellow)) // 裁剪有效

    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "abc", modifier = Modifier.size(30.dp,30.dp).clip(CircleShape).background(Color.Yellow).border(2.dp,Color.Blue, shape = CircleShape)) // 裁剪有效,边界线默认的形状为矩形
}