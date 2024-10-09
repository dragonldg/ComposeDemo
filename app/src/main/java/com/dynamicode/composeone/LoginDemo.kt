package com.dynamicode.composeone

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginDemo() {
    var name by remember { // 属性委托，by关键字，调用代理的getValue和setValue
        mutableStateOf("douglas")
    }
    var pwd by remember {
        mutableStateOf("123456")
    }
    Surface(onClick = { /*TODO*/ }, shape = RoundedCornerShape(20.dp), border = BorderStroke(3.dp,Color.Gray)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)

//                .wrapContentSize(Alignment.Center) // 居中显示
//        .align(Alignment.CenterVertically) // 无效
                .background(Color.White)
        ) {
            // title
            Text(
                text = "登录操作",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 20.sp
            )

            TextField(
                value = name,
                onValueChange = {
                    name = it
                },
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = null) },
                modifier = Modifier.fillMaxWidth().background(Color.Transparent)
            )

            TextField(
                value = pwd,
                onValueChange = {
                    pwd = it
                },
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = null) },
                modifier = Modifier.fillMaxWidth().background(Color.Red)
            )

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "登录")
            }
        }
    }
}