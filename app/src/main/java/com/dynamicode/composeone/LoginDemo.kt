package com.dynamicode.composeone

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
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
    Surface(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(3.dp, Color.Gray)
    ) {
        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)

//                .wrapContentSize(Alignment.Center) // 居中显示
//        .align(Alignment.CenterVertically) // 无效
                .background(Color.White)
        ) {

            Box(contentAlignment = Alignment.Center) { // FrameLayyout
                Image(
                    painter = painterResource(id = R.drawable.yy),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MyShape(120f))
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(Color(206, 236, 250, 121))
                        .size(100.dp, 100.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.yy),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .size(60.dp, 60.dp)
                            .clip(
                                CircleShape
                            )
                    )
                }
            }
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
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                shape = RoundedCornerShape(10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
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
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red),
                visualTransformation = PasswordVisualTransformation(),
                shape = RoundedCornerShape(10.dp)
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

class MyShape(var hudu: Float = 100f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.moveTo(0f, 0f)
        path.lineTo(0f, size.height - hudu)
        path.quadraticBezierTo(size.width / 2f, size.height, size.width, size.height - hudu)
        path.lineTo(size.width, 0f)
        path.close()
        return Outline.Generic(path)
    }

}