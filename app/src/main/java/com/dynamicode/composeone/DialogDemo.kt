package com.dynamicode.composeone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun DialogOne(){
    Dialog(onDismissRequest = { /*TODO*/ }) {
        Column(modifier = Modifier.fillMaxWidth().background(Color.White).padding(10.dp)) {
            Text(text = "title", fontSize = 25.sp)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "内容", fontSize = 18.sp)
            Spacer(modifier = Modifier.height(10.dp))
            Row (modifier = Modifier.align(Alignment.End)){
                Button(onClick = {

                }) {
                    Text(text = "取消", letterSpacing = 6.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "确认", letterSpacing = 6.sp)
                }
            }
        }
    }
}