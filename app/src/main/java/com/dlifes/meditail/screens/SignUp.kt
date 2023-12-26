package com.dlifes.meditail.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dlifes.meditail.components.CustomEditText
import com.dlifes.meditail.navigation.BottomNavItems
import com.dlifes.meditail.ui.theme.Purple40
import com.dlifes.meditail.ui.theme.Purple80

@Composable
fun SignUp(navController: NavHostController) {
    var name by remember {
        mutableStateOf("")
    }

    var bkash by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomEditText(
            label = "Name",
            placeholder = "Type Your Name",
            inputType = "name",
            modifier = Modifier.fillMaxWidth(.9f),
            onValueChanged = { value -> name = value })
        Spacer(modifier = Modifier.height(10.dp))
        CustomEditText(
            label = "Phone",
            placeholder = "Type Your Phone",
            inputType = "phone",
            modifier = Modifier.fillMaxWidth(.9f),
            onValueChanged = { value -> phone = value })
        Spacer(modifier = Modifier.height(10.dp))
        CustomEditText(
            label = "Bkash",
            placeholder = "Type Your Bkash",
            inputType = "bkash",
            modifier = Modifier.fillMaxWidth(.9f),
            onValueChanged = { value -> bkash = value })
        Spacer(modifier = Modifier.height(10.dp))
        CustomEditText(
            label = "Email",
            placeholder = "Type Your Email",
            inputType = "email",
            modifier = Modifier.fillMaxWidth(.9f),
            onValueChanged = { value -> email = value })
        Spacer(modifier = Modifier.height(10.dp))
        CustomEditText(
            label = "Password",
            placeholder = "Type Your Password",
            inputType = "password",
            modifier = Modifier.fillMaxWidth(.9f),
            onValueChanged = { value -> password = value })
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ navController.navigate(BottomNavItems.Home.route) },
            modifier = Modifier
                .fillMaxWidth(.9f),
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(text = "SignUp")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.Right
        ) {
            Text(text = "Already Have An Account ?")
            Text(
                text = "LogIn",
                modifier = Modifier.clickable { /*TODO*/ navController.navigate(BottomNavItems.Login.route) },
                color = Purple40,
                fontWeight = FontWeight(800)
            )
        }
    }
}