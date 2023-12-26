package com.dlifes.meditail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.dp

@Composable
fun NewAppoinmentRow() {
    var bill by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(10.dp)
            )
            .background(color = Color.Green)
            .padding(10.dp)
    ) {
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Patient Name")
            CustomEditText(
                label = "Bill",
                placeholder = "Total Bill",
                inputType ="bill" ,
                modifier = Modifier.fillMaxWidth(.5f),
                onValueChanged = {value -> bill = value}
            )
        }
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Doctor Name")
            Text(text = "Speciality :")
        }
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Diagnostic")
            Text(text = "Date :")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { /*TODO*/ },modifier = Modifier
                .fillMaxWidth(.5f),
                shape = RoundedCornerShape(5.dp)) {
                Text(text = "Cancel Appoinment")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { /*TODO*/ },modifier = Modifier
                .fillMaxWidth(),
                shape = RoundedCornerShape(5.dp)) {
                Text(text = "Mark As Done")
            }
        }
    }
}