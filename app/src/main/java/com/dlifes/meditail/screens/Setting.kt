package com.dlifes.meditail.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
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
    var diagonostiName by remember {
        mutableStateOf("")
    }
    var diagonostiAddress by remember {
        mutableStateOf("")
    }
    var role = "admin"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
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
        if(role == "admin"){
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            Divider(thickness = 1.dp, color = Color.Black)
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            Text(
                text = "Add Diagnostic center :",
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
                Text(text = "Name ")
                CustomEditText(
                    label = "Name",
                    placeholder = "Diagnostic Name",
                    inputType = "name",
                    modifier = Modifier.fillMaxWidth(.8f),
                    onValueChanged = { value -> diagonostiName = value }
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
                Text(text = "Address")
                CustomEditText(
                    label = "Address",
                    placeholder = "Diagnostics's Address",
                    inputType = "address",
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
                Text(text = "Add Diagnostic")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
            )
            Divider(thickness = 1.dp, color = Color.Black)
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

        Spacer(modifier = Modifier.height(100.dp).fillMaxWidth())
    }
}

@Composable
@Preview
fun pq(){
    val navHostController = rememberNavController()
    Setting(navHostController = navHostController )
}