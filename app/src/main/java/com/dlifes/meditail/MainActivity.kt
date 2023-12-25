package com.dlifes.meditail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.dlifes.meditail.navigation.BottomNavItems
import com.dlifes.meditail.navigation.SetNavGraph
import com.dlifes.meditail.screens.LogIn
import com.dlifes.meditail.screens.MainScreen
import com.dlifes.meditail.screens.SignUp
import com.dlifes.meditail.ui.theme.MediTailTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediTailTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navHostController = rememberNavController()
                    SetNavGraph(navHostController = navHostController, startDestination = BottomNavItems.Login.route)
                }
            }
        }
    }
}
