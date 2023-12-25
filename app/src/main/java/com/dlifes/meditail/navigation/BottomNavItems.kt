package com.dlifes.meditail.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItems(val route: String, val icon: ImageVector, val label: String) {
    object Home : BottomNavItems("home", Icons.Filled.Home, "Home")
    object History : BottomNavItems("history", Icons.Filled.List, "History")
    object Setting : BottomNavItems("setting", Icons.Filled.Settings, "Setting")
    object Login : BottomNavItems("login", Icons.Filled.Settings, "Login")
    object SignUp : BottomNavItems("signup", Icons.Filled.Settings, "SignUp")
}