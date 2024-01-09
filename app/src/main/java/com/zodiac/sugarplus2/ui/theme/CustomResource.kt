package com.zodiac.sugarplus2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zodiac.sugarplus2.R

@Composable
fun AuthBackground(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.sign_up_bg),
            contentDescription =null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize(),
        )

        val gradient =Brush.horizontalGradient(
            listOf(LightPink, Color.Transparent ,LightPink),
            startX = 10f,
            endX =  1000.0f
        )
        Box(modifier = Modifier
            .padding(22.dp,32.dp, 22.dp, 22.dp)
            .fillMaxSize()
            .background(gradient, shape = RoundedCornerShape(10.dp))
        )
    }

}

@Composable
@Preview
fun GradientPreview(){
   AuthBackground()
}