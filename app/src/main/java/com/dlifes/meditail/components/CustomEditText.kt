package com.dlifes.meditail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.dlifes.meditail.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomEditText(
    label: String,
    placeholder: String,
    inputType: String,
    modifier: Modifier,
    onValueChanged: (String) -> Unit
) {
    var visualTransformation: VisualTransformation = VisualTransformation.None
    var alpha: Float = 0f
    var value by remember {
        mutableStateOf("")
    }
    var passIcon by remember {
        mutableStateOf(true)
    }
    var iconId = if (passIcon) R.drawable.baseline_key_24 else R.drawable.baseline_key_off_24

    if (inputType == "password" && passIcon) {
        visualTransformation = PasswordVisualTransformation()
        alpha = 1f
    }
    if (!passIcon) {
        alpha = 1f
    }
    OutlinedTextField(value = value, onValueChange = { text ->
        value = text
        onValueChanged(value)

    }, label = { Text(text = label) }, placeholder = {
        Text(
            text = placeholder
        )
    }, visualTransformation = visualTransformation, trailingIcon = {
        if (inputType == "password") {
            Image(painter = painterResource(id = iconId),
                contentDescription = "Icon",
                modifier = Modifier
                    .clickable { passIcon = !passIcon }
                    .alpha(alpha))
        }

    }, modifier = modifier)
}