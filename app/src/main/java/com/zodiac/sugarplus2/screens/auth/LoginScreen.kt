package com.zodiac.sugarplus2.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zodiac.sugarplus2.R
import com.zodiac.sugarplus2.componants.BackTextComponent
import com.zodiac.sugarplus2.componants.CustomAppButton
import com.zodiac.sugarplus2.componants.CustomTextField
import com.zodiac.sugarplus2.componants.DividerTextComponent
import com.zodiac.sugarplus2.componants.SocialMediaLogin
import com.zodiac.sugarplus2.ui.theme.LabelColor
import com.zodiac.sugarplus2.ui.theme.LightPink
import com.zodiac.sugarplus2.ui.theme.PrimaryColor

@Composable
fun LoginScreen(){
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
                Image(painter = painterResource(id = R.drawable.sugar_plus_logo), contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 12.dp))

                Text( modifier = Modifier.padding(top = 12.dp),
                    text = "Welcome Back !",
                    style = MaterialTheme.typography.headlineMedium
                    )
                Text(text = "We missed you",
                    modifier = Modifier.padding(top = 4.dp),
                    color = LabelColor)

                Text(modifier = Modifier.padding(top =12.dp),
                    text = "Email Id",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Black
                    )

                Spacer(modifier = Modifier.height(12.dp))
                CustomTextField(hint = "Enter email id",false)
                Spacer(modifier = Modifier.height(12.dp))
                Text(modifier = Modifier.padding(bottom =4.dp),
                    text = "Enter Password",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Black
                )
                CustomTextField(hint = "Enter password",true)
                Spacer(modifier = Modifier.height(16.dp))
                Text(modifier = Modifier.padding(bottom =4.dp),
                    text = "Forget Password",
                    style = MaterialTheme.typography.bodySmall,
                    color = PrimaryColor
                )

                Spacer(modifier = Modifier.height(32.dp))
                CustomAppButton(value = "Login")

                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Don't have an account yet? Sign Up",
                    modifier = Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.bodyMedium,
                    color = PrimaryColor,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))

                DividerTextComponent()

                Text(
                    text = "Social Media Log In",
                    modifier = Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(32.dp))
                SocialMediaLogin()
            }
        }

    }

}

@Preview
@Composable
fun LoginPreview(){
    LoginScreen()
}