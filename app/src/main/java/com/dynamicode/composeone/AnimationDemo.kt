package com.dynamicode.composeone

import androidx.compose.animation.Animatable
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * Created by liudagang on 2024/10/10.
 *
 * Package Name ComposeOne
 */
@Composable
fun AnimationDemo(modifier: Modifier = Modifier) {
    var enable by remember {
        mutableStateOf(true)
    }

    val color = remember {
        Animatable(Color.Red)
    }

    // 控制流程
    LaunchedEffect(enable) {
        color.animateTo(if (enable) Color.Red else Color.Blue,
            animationSpec = TweenSpec(durationMillis = 1000, easing = LinearOutSlowInEasing))
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "",
            modifier = Modifier.size(50.dp,50.dp).background(color.value, CircleShape).clickable {
                enable = !enable
            })
    }

     // 旋转和移动
    val size = animateFloatAsState(targetValue = if (enable) 0f else 360f)
    val offset = animateFloatAsState(targetValue = if (enable) 0f else 100f)
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Image(painter = painterResource(R.drawable.anew),contentDescription = null,
            modifier = Modifier.size(48.dp,48.dp).clickable {
                enable = !enable
            }.rotate(size.value)
                .offset(0.dp,offset.value.dp))
    }

    // // 放大缩小
//    val size = animateSizeAsState(targetValue = if (enable) Size(500f,500f) else Size(100f,100f))
//    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
//        Image(painter = painterResource(R.drawable.yy),contentDescription = null,
//            modifier = Modifier.size(size.value.width.dp,size.value.height.dp).clickable {
//                enable = !enable
//            })
//    }
}