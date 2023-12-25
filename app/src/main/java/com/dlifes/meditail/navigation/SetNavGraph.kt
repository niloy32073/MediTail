package com.dlifes.meditail.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dlifes.meditail.screens.LogIn
import com.dlifes.meditail.screens.MainScreen
import com.dlifes.meditail.screens.SignUp

@Composable
fun SetNavGraph(navHostController: NavHostController,startDestination:String){
    NavHost(navController = navHostController, startDestination = startDestination){
        composable(BottomNavItems.Home.route ){
            MainScreen(navHostController)
        }
        composable(BottomNavItems.History.route){
            MainScreen(navHostController)
        }
        composable(BottomNavItems.Setting.route){
            MainScreen(navHostController)
        }
        composable(BottomNavItems.Login.route){
            LogIn(navHostController)
        }
        composable(BottomNavItems.SignUp.route){
            SignUp(navHostController)
        }
    }
}