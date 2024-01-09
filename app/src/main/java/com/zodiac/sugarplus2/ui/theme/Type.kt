package com.zodiac.sugarplus2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.zodiac.sugarplus2.R

val Montserrats= FontFamily(
    listOf(
        Font(resId = R.font.montserrat_regular, weight =  FontWeight.Normal),
        Font(resId = R.font.montserrat_medium, weight =  FontWeight.Medium),
        Font(resId = R.font.montserrat_bold, weight =  FontWeight.Bold),
        Font(resId = R.font.montserrat_semi_bold, weight =  FontWeight.SemiBold),
    )
)

val Releway =FontFamily(
    listOf(
        Font(resId = R.font.raleway_regular, weight =  FontWeight.Normal),
        Font(resId = R.font.raleway_medium, weight =  FontWeight.Medium),
        Font(resId = R.font.raleway_semibold, weight =  FontWeight.SemiBold),
        Font(resId = R.font.raleway_bold, weight =  FontWeight.Bold),
    )

)
// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Releway,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        letterSpacing = 0.5.sp
    ),
    headlineMedium  = TextStyle(
        fontFamily = Releway,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = Releway,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Releway,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Releway,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.5.sp
    ),

)






