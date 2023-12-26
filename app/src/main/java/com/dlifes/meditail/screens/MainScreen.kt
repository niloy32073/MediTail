package com.dlifes.meditail.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.dlifes.meditail.navigation.BottomNavItems
import com.dlifes.meditail.ui.theme.Purple40

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    val items = listOf(
        BottomNavItems.Home,
        BottomNavItems.History,
        BottomNavItems.Setting
    )
    Scaffold(
        bottomBar = {
            NavigationBar(modifier = Modifier.height(60.dp)) {
                items.forEach() { item ->
                    NavigationBarItem(
                        selected = item.route == navController.currentBackStackEntry?.destination?.route,
                        onClick = { navController.navigate(item.route) },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.label,
                                tint = if (item.route == navController.currentBackStackEntry?.destination?.route) Purple40 else Color.Black
                            )
                        })
                }
            }

        }
    ) {

        if (BottomNavItems.Home.route == navController.currentBackStackEntry?.destination?.route) {
            Home(navController = navController)
        } else if (BottomNavItems.History.route == navController.currentBackStackEntry?.destination?.route) {
            History(navController = navController)
        } else if (BottomNavItems.Setting.route == navController.currentBackStackEntry?.destination?.route) {
            Setting(navHostController = navController)
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green, shape = RectangleShape)
            ) {
                Text(text = "Home")
            }
        }
    }
}
