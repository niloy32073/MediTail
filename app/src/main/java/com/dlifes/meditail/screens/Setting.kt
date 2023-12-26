package com.dlifes.meditail.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dlifes.meditail.R
import com.dlifes.meditail.components.CustomEditText
import com.dlifes.meditail.navigation.BottomNavItems

@Composable
fun Setting(navHostController: NavHostController) {
    var password by remember {
        mutableStateOf("")
    }
    var newPassword by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.user), contentDescription = "User Icon")
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Name :")
            Text(text = "Md. Nifaur Rahman")
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "CashBox :")
            Text(text = "100Tk")
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Bkash :")
            Text(text = "016xxxxXXXX")
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Mobile :")
            Text(text = "016xxxxXXXX")
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Address :")
            Text(text = "Dummy Address")
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Email :")
            Text(text = "Dummy Email")
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Divider(thickness = 1.dp, color = Color.Black)
        Text(
            text = "Reset Password :",
            modifier = Modifier.fillMaxWidth(.9f),
            textAlign = TextAlign.Left
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Password ")
            CustomEditText(
                label = "Password",
                placeholder = "Current Password",
                inputType = "password",
                modifier = Modifier.fillMaxWidth(.8f),
                onValueChanged = { value -> password = value }
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Password ")
            CustomEditText(
                label = "New Password",
                placeholder = "New Password",
                inputType = "password",
                modifier = Modifier.fillMaxWidth(.8f),
                onValueChanged = { value -> password = value }
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Button(
            onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth(.5f),
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(text = "Reset Password")
        }
        Divider(thickness = 1.dp, color = Color.Black)
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )

        Button(
            onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth(.9f),
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(text = "SignOut")
        }
    }
}