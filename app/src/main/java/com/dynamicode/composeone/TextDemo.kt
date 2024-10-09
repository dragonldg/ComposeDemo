package com.dynamicode.composeone

import android.widget.ImageView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter

@Composable
fun DcText(){
    Column {
        Text(text = "douglas", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp)) // 水平用width
        Text(text = "douglas", fontSize = 30.sp, fontWeight = FontWeight.Thin)
        Text(text = "douglas", fontSize = 30.sp, fontWeight = FontWeight.Thin, color = Color.Red)
        Text(text = "douglas", fontSize = 30.sp, fontWeight = FontWeight.Thin, color = Color.Red, fontFamily = FontFamily.Cursive)
    }
}

@Composable
fun DcPoet(){
    Column(modifier = Modifier.padding(10.dp)) {
        Text(text = "李白", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Right)
        Text(text = "锄禾日当午"
                +"汗滴禾下土"
                +"谁知盘中餐", fontSize = 20.sp) // 字大小，字间距必须用sp
        Text(text = "锄禾日当午"
                +"汗滴禾下土"
                +"谁知盘中餐", fontSize = 20.sp , letterSpacing = 8.sp) // 字大小，字间距必须用sp
        Text(text = "锄禾日当午"
                +"汗滴禾下土"
                +"谁知盘中餐", fontSize = 20.sp , letterSpacing = 8.sp , lineHeight = 22.sp) // 字大小，字间距必须用sp
    }
}

@Composable
fun DcImage(){
    // webp不可以
    Image(painter = painterResource(id = R.drawable.a0002) , contentDescription = null, modifier = Modifier
        .size(300.dp)
        .background(Color.Red), contentScale = ContentScale.FillHeight)
}

@Composable
fun DcImage2(){
    Surface(onClick = { /*TODO*/ }, shape = CircleShape, border = BorderStroke(5.dp, Color.Red)) {//RoundedCornerShape(10.dp)
        Image(painter = painterResource(id = R.drawable.a0002) , contentDescription = null, modifier = Modifier
            .size(300.dp)
            .background(Color.Red), contentScale = ContentScale.FillHeight)
    }
}

@Composable
fun NetImage(){
    var painter = rememberImagePainter(data = "https://pic.rmb.bdstatic.com/bjh/news/420a987dc8c929c7263e625c56a087054610.jpeg")

    Surface(shape = CircleShape, border = BorderStroke(5.dp, Color.Red)) {//RoundedCornerShape(10.dp)
        Image(painter = painter, contentDescription = null, modifier = Modifier
            .size(300.dp)
            .background(Color.Red), contentScale = ContentScale.FillHeight)
        AsyncImage(model = "https://img.tukuppt.com/photo-big/00/00/74/6152d9dc09d26908.jpg", contentDescription = null)
    }

//    AsyncImage(model = "https://img.tukuppt.com/photo-big/00/00/74/6152d9dc09d26908.jpg", contentDescription = null)
}
@Composable
fun NetImage2(){
//    ImageCacheForCoilTheme {
        val imageUrl="https://img.tukuppt.com/photo-big/00/00/74/6152d9dc09d26908.jpg"

        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1280f / 847f)//图片比例
        )
//    }
}

@Composable
fun InnerImage(){
    Image(
        imageVector = Icons.Default.Call,
        contentDescription = null,
        modifier = Modifier.size(20.dp)
    )
}

@Composable
fun BasicTextDemo(modifier: Modifier = Modifier) {
    BasicText(text = "abc")
}