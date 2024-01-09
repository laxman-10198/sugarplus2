package com.zodiac.sugarplus2.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.zodiac.sugarplus2.screens.home.AccountScreen
import com.zodiac.sugarplus2.screens.home.BagScreen
import com.zodiac.sugarplus2.screens.home.CategoryScreen
import com.zodiac.sugarplus2.screens.home.FavoriteScreen
import com.zodiac.sugarplus2.screens.home.HomeScreen
import com.zodiac.sugarplus2.screens.home.NavigationItem


@Composable
fun NavigationController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {

        composable(NavigationItem.Home.route) {
            HomeScreen()
        }

        composable(NavigationItem.Categories.route) {
            CategoryScreen()
        }

        composable(NavigationItem.Account.route) {
            AccountScreen()
        }

        composable(NavigationItem.Favorite.route) {
           FavoriteScreen()
        }

        composable(NavigationItem.Bag.route) {
            BagScreen()
        }

    }


}


@Composable
fun Navigation() {
    val navController = rememberNavController()
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Account,
        NavigationItem.Bag,
        NavigationItem.Favorite,
        NavigationItem.Categories
    )


 Scaffold(
        bottomBar = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            BottomNavigation(backgroundColor = MaterialTheme.colorScheme.background) {
                items.forEach {
                    BottomNavigationItem(selected = currentRoute == it.route,
                        label = {
                            Text(
                                text = it.label,
                                color = if (currentRoute == it.route) Color.DarkGray else Color.LightGray
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = it.icons, contentDescription = null,
                                tint = if (currentRoute == it.route) Color.DarkGray else Color.LightGray
                            )

                        },

                        onClick = {
                            if(currentRoute!=it.route){

                                navController.graph.startDestinationRoute?.let {
                                    navController.popBackStack(it,true)
                                }

                                navController.navigate(it.route){
                                    launchSingleTop = true
                                }

                            }

                        })

                }
            }


        }) { innerPadding ->
          Column(modifier = Modifier.padding(innerPadding)) {
              NavigationController(navController = navController)
          }


    }


}




