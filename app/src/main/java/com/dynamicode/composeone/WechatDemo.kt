package com.dynamicode.composeone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek

@Composable
fun FirstDayOfWeek(modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp)) {
        items(100){ index: Int ->
            Card(modifier = Modifier.padding(10.dp)) {
                Row(modifier = Modifier.fillMaxWidth().height(100.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(R.drawable.yy), modifier = Modifier.size(60.dp,60.dp).weight(1f), contentDescription = null)
                    Column (modifier = Modifier.width(200.dp).background(Color.Green), verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.Start){
                        Text(text = "douglas", fontSize = 20.sp)
                        Text(text = "消息内容", fontSize = 16.sp)
                    }
                    Column (modifier = Modifier.height(100.dp).background(Color.Yellow).weight(1f), verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "time", fontSize = 15.sp , color = Color.Gray)
                        Icon(imageVector = Icons.Default.Build , contentDescription = null)
                    }
                }

            }

        }
    }
}