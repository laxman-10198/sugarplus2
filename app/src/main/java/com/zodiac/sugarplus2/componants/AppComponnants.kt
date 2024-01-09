package com.zodiac.sugarplus2.componants


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zodiac.sugarplus2.R
import com.zodiac.sugarplus2.ui.theme.PrimaryColor

@Composable
fun CustomTextField(hint: String, isIconEnable:Boolean) {
    val input = remember { mutableStateOf("") }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .border(
                width = 1.dp,
                color = PrimaryColor,
                shape = RoundedCornerShape(10.dp),
            ),
        singleLine = true,
        value = input.value, onValueChange = {input.value = it},
        placeholder = { Text(text = hint)},
        colors =  TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.White,
        ),
        visualTransformation =  if (isIconEnable) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (isIconEnable)
                Icons.Filled.Favorite
            else Icons.Filled.FavoriteBorder

            // Please provide localized description for accessibility services
            val description = if (isIconEnable) "Hide password" else "Show password"

            IconButton(onClick = {  !isIconEnable}){
                Icon(imageVector  = image, description)
            }
        }
    )
}

@Composable
fun CustomAppButton(value: String){
    Button(onClick = {  },
        modifier = Modifier
            .fillMaxWidth()
            .background(PrimaryColor, shape = RoundedCornerShape(10.dp)),
        colors = ButtonDefaults.buttonColors(Color.Transparent)
    ) {
        Text(text = value, style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun BackTextComponent(){
    Row (modifier = Modifier.padding(22.dp)){
        Image(painter = painterResource(id = R.drawable.back), contentDescription ="Back" )
        Text( modifier = Modifier
            .height(28.dp)
            .align(Alignment.CenterVertically),
            text = stringResource(id = R.string.back))
    }
}

@Composable
fun DividerTextComponent() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = Color.Gray,
            thickness = 1.dp
        )

        Text(
            modifier = Modifier.padding(8.dp),
            text = stringResource(R.string.or),
            fontSize = 18.sp,
            color = Color.Gray
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = Color.Gray,
            thickness = 1.dp
        )
    }
}


@Composable
fun SocialMediaLogin(){
    Box (modifier = Modifier.fillMaxWidth(),
    ){
        Row(modifier = Modifier.align(Alignment.Center)) {
            Image(
                modifier = Modifier
                    .height(45.dp)
                    .width(45.dp),
                painter = painterResource(id = R.drawable.ic_facebook), contentDescription =null )
            Spacer(modifier = Modifier.width(22.dp))
            Image(
                modifier = Modifier
                    .height(45.dp)
                    .width(45.dp),
                painter = painterResource(id = R.drawable.ic_google), contentDescription =null )
            Spacer(modifier = Modifier.width(22.dp))
            Image( modifier = Modifier
                .height(45.dp)
                .width(45.dp),
                painter = painterResource(id = R.drawable.twitter), contentDescription =null )
        }

    }
}


@Composable
fun CustomTextFieldSearch(){
    val input = remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .clip(shape = RoundedCornerShape(18.dp))
            .border(
                width = 1.dp,
                color = PrimaryColor,
                shape = RoundedCornerShape(20.dp)
            )
            .height(45.dp),
        value = input.value, onValueChange = {input.value= it},
        placeholder = {Text(
            text = "Search here",
            color = Color.Gray,
            style = MaterialTheme.typography.bodySmall
        )},
        colors =  TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.White
        ),
        leadingIcon = { Icon(imageVector = Icons.Filled.Search, contentDescription =null,
            tint = PrimaryColor)}

    )
}


@Composable
fun ProductItemComposable(){
    Surface(modifier = Modifier
        .width(200.dp)
        .height(260.dp)
        .clip(shape = RoundedCornerShape(8.dp))
        .background(Color.White)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box( modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)) {
                Image(modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillWidth,
                    painter = painterResource(id = R.drawable.product_bg),
                    contentDescription =null,
                )
                Text(
                    modifier = Modifier.padding(10.dp),
                    style = MaterialTheme.typography.bodySmall,
                    text = "BESTSELLER")

                Row( modifier = Modifier
                    .padding(10.dp)
                    .width(40.dp)
                    .height(16.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .align(Alignment.TopEnd)) {
                    Image( modifier = Modifier
                        .padding(start = 3.dp, top = 3.dp, bottom = 3.dp),
                        painter = painterResource(id = R.drawable.review_rating_yellow_star),
                        contentDescription =null )
                    Text( modifier = Modifier.fillMaxSize(),
                        style = MaterialTheme.typography.bodySmall,
                        textAlign = TextAlign.Center,
                        text = "4.4")

                }

                Image(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.Center),
                    painter = painterResource(id =R.drawable.makeup ) , contentDescription =null,
                    alignment = Alignment.Center)

            }

            Text( modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                text = "Product Name",
                style = MaterialTheme.typography.bodyLarge)

            Text( modifier = Modifier.padding(start = 10.dp),
                text = "Lorem Ipsum",
                style = MaterialTheme.typography.bodySmall)
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 10.dp)) {
                Text( modifier = Modifier,
                    text = "$40",
                    color = Color.Black,
                    style = MaterialTheme.typography.bodySmall)

                Text( modifier = Modifier.padding(start = 10.dp),
                    text = "$30",
                    color = Color.Black,
                    style = MaterialTheme.typography.bodySmall)

            }

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = {  },) {
                    Text(text = "Add")
                }

               Image(painter = painterResource(id = R.drawable.ic_heart_favorites_on), contentDescription = null)

            }


        }

    }
}

@Composable
@Preview
fun ComponentPreview(){
    ProductItemComposable()

}