package com.zodiac.sugarplus2.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zodiac.sugarplus2.R
import com.zodiac.sugarplus2.componants.BackTextComponent
import com.zodiac.sugarplus2.componants.CustomAppButton
import com.zodiac.sugarplus2.componants.CustomTextField
import com.zodiac.sugarplus2.ui.theme.LabelColor
import com.zodiac.sugarplus2.ui.theme.LightPink

@Composable
fun ForgetPasswordScreen(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.sign_up_bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize(),
        )
        BackTextComponent()
        val gradient = Brush.horizontalGradient(
            listOf(LightPink, Color.Transparent, LightPink),
            startX = 10f,
            endX = 1000.0f
        )
        Box(
            modifier = Modifier
                .padding(16.dp, 52.dp, 16.dp, 16.dp)
                .fillMaxSize()
                .background(gradient, shape = RoundedCornerShape(10.dp))
        ){
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)) {
                Image(painter = painterResource(id = R.drawable.sugar_plus_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 12.dp))

                Image(painter = painterResource(id = R.drawable.reset_password_graphic),
                    contentDescription =null,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(24.dp))

                Text( modifier = Modifier.padding(top = 12.dp),
                    text = "Reset Your Password",
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(text = "To Rest your password please enter your registered email id",
                    modifier = Modifier.padding(top = 4.dp),
                    color = LabelColor
                )

                Text(modifier = Modifier.padding(top =12.dp),
                    text = "Email Id",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(12.dp))
                CustomTextField(hint = "Enter email id",false)
                Spacer(modifier = Modifier.height(48.dp))
                CustomAppButton(value = "Get Link")

            }
        }

    }
}


@Composable
@Preview
fun ForgetScreenPreview(){
    ForgetPasswordScreen()

}