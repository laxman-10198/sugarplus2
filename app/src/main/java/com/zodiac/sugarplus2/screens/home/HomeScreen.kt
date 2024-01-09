package com.zodiac.sugarplus2.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zodiac.sugarplus2.R
import com.zodiac.sugarplus2.componants.CustomTextFieldSearch
import com.zodiac.sugarplus2.ui.theme.LightPink
import com.zodiac.sugarplus2.ui.theme.PrimaryColor


@Composable
fun HomeScreen(){
  Surface(modifier = Modifier
      .fillMaxSize()
      .background(Color.Black)) {
      Column(modifier = Modifier.fillMaxSize()) {
          Column( modifier = Modifier
              .fillMaxWidth()
              .background(LightPink)
              .padding(22.dp)){
              Row (modifier = Modifier.fillMaxWidth(),
                  horizontalArrangement = Arrangement.Absolute.SpaceBetween){
                  Image(painter = painterResource(id = R.drawable.notification),
                      contentDescription =null,)
                  Image(painter = painterResource(id = R.drawable.sugar_plus_logo),
                      contentDescription = null,
                      alignment = Alignment.TopCenter)
                  Image(painter = painterResource(id = R.drawable.language), contentDescription =null,
                      modifier = Modifier.size(28.dp))

              }
              Spacer(modifier = Modifier.height(20.dp))
              CustomTextFieldSearch()

          }

          Column(modifier = Modifier
              .fillMaxWidth()
              .padding(22.dp)) {
              Image(
                  modifier = Modifier.clip(shape = RoundedCornerShape(10.dp)),
                  painter = painterResource(id = R.drawable.header_banner),
                  contentDescription =null,
                  contentScale = ContentScale.Inside
                  )
              Row(
                  modifier = Modifier.fillMaxWidth()
                      .padding(top = 20.dp),
                  horizontalArrangement = Arrangement.Absolute.Right,
                  verticalAlignment = Alignment.CenterVertically) {
                  Text(modifier = Modifier.padding(end = 50.dp),
                      text = "Categories",
                      style = MaterialTheme.typography.headlineSmall,
                      color = Color.Black)
                  Text(
                      text = "View All",
                      style = MaterialTheme.typography.bodySmall,
                      color = PrimaryColor)

              }

          }

      }

  }
}


@Composable
@Preview
fun HomePreview(){
    HomeScreen()
}