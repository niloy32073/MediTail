package com.dlifes.meditail.screens

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dlifes.meditail.components.CustomEditText
import com.dlifes.meditail.components.HistoryRow

@Composable
fun History(navController: NavHostController) {
    var fromdate by remember {
        mutableStateOf("")
    }
    var todate by remember {
        mutableStateOf("")
    }
    var itemList = listOf<String>("i1", "i2", "i3","i1", "i2")
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(.9f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            CustomEditText(
                label = "From Date",
                placeholder = "dd/mm/year",
                inputType = "date",
                modifier = Modifier.fillMaxWidth(.5f),
                onValueChanged = { value -> fromdate = value }
            )

            CustomEditText(
                label = "To Date",
                placeholder = "dd/mm/year",
                inputType = "date",
                modifier = Modifier.fillMaxWidth(),
                onValueChanged = { value -> todate = value }
            )
        }

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "History :", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Left)

        LazyColumn(modifier = Modifier
            .fillMaxSize(),
            contentPadding = PaddingValues(0.dp,16.dp)
        ){
            items(itemList){ item ->
                HistoryRow()
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}