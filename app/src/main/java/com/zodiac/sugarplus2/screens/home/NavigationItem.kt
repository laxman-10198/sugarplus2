package com.zodiac.sugarplus2.screens.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(val route: String, val label: String, val icons: ImageVector) {

    object Home : NavigationItem("home", "Home", Icons.Default.Home)

    object Account : NavigationItem("account", "Account", Icons.Default.AccountCircle)

    object Bag : NavigationItem("bag","Bag",Icons.Default.ShoppingCart)

    object Favorite: NavigationItem("favorite","Favorite",Icons.Default.Favorite)

    object Categories: NavigationItem("categories","Categories",Icons.Default.Face)

}