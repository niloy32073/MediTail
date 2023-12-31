package com.dlifes.meditail.screens


import android.widget.Toast
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dlifes.meditail.MainActivity
import com.dlifes.meditail.components.CustomEditText
import com.dlifes.meditail.components.DropdownMenuWithLabel
import com.dlifes.meditail.components.HistoryRow
import com.dlifes.meditail.components.NewAppoinmentRow
import com.dlifes.meditail.navigation.BottomNavItems

@Composable
fun Home(navController: NavHostController) {

    var speciality by remember {
        mutableStateOf("")
    }

    var doctor by remember {
        mutableStateOf("")
    }
    var chamber by remember {
        mutableStateOf("")
    }

    var diagnostics by remember {
        mutableStateOf("")
    }

    var name by remember {
        mutableStateOf("")
    }

    var age by remember {
        mutableStateOf("")
    }
    var gender by remember {
        mutableStateOf("")
    }

    var note by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }

    var role = "users"

    var itemList = listOf<String>("i1", "i2", "i3", "i1", "i2", "i3", "i1", "i2", "i3")
    if (role == "user") {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Doctor's Info:",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Left
            )
            DropdownMenuWithLabel(
                label = "Speciality",
                itemList = itemList,
                onSelectedValueChange = { value -> speciality = value })
            Spacer(modifier = Modifier.height(10.dp))
            DropdownMenuWithLabel(
                label = "Doctor",
                itemList = itemList,
                onSelectedValueChange = { value -> speciality = value })
            Spacer(modifier = Modifier.height(10.dp))
            DropdownMenuWithLabel(
                label = "Available Chamber",
                itemList = itemList,
                onSelectedValueChange = { value -> speciality = value })
            Spacer(modifier = Modifier.height(10.dp))
            DropdownMenuWithLabel(
                label = "Diagnostics",
                itemList = itemList,
                onSelectedValueChange = { value -> speciality = value })
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Patient's Info:",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Left
            )
            CustomEditText(
                label = "Name",
                placeholder = "Type Patient's Name",
                inputType = "name",
                modifier = Modifier.fillMaxWidth(.9f),
                onValueChanged = { value -> name = value })
            Spacer(modifier = Modifier.height(10.dp))
            CustomEditText(
                label = "Age",
                placeholder = "Type Patient's Age",
                inputType = "age",
                modifier = Modifier.fillMaxWidth(.9f),
                onValueChanged = { value -> age = value })
            Spacer(modifier = Modifier.height(10.dp))
            CustomEditText(
                label = "Gender",
                placeholder = "Type Patient's Gender",
                inputType = "gender",
                modifier = Modifier.fillMaxWidth(.9f),
                onValueChanged = { value -> gender = value })
            Spacer(modifier = Modifier.height(10.dp))
            CustomEditText(
                label = "Phone",
                placeholder = "Type Patient's Phone",
                inputType = "phone",
                modifier = Modifier.fillMaxWidth(.9f),
                onValueChanged = { value -> phone = value })
            Spacer(modifier = Modifier.height(10.dp))
            CustomEditText(
                label = "Note",
                placeholder = "Type Patient's Note",
                inputType = "note",
                modifier = Modifier.fillMaxWidth(.9f),
                onValueChanged = { value -> note = value })
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {
                    if (speciality.isNotEmpty() && doctor.isNotEmpty() && chamber.isNotEmpty() && diagnostics.isNotEmpty() && name.isNotEmpty() && age.isNotEmpty() && gender.isNotEmpty() && note.isNotEmpty() && phone.isNotEmpty()) {
                        /*TODO*/
                        navController.navigate(BottomNavItems.History.route)
                    }

                },
                modifier = Modifier
                    .fillMaxWidth(.9f),
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(text = "Create Appointment")
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
            )
            Text(text = "Today's Appoinment")
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
            )
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth(),
                contentPadding = PaddingValues(0.dp, 16.dp)
            ) {
                items(itemList) { item ->
                    NewAppoinmentRow()
                    Spacer(modifier = Modifier.height(10.dp))
                }

            }

        }
    }
}