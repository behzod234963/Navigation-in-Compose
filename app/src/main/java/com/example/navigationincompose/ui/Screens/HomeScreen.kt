package com.example.navigationincompose.ui.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navigationincompose.ui.navigation.ScreensRoute

@Composable
fun HomeScreen(navController: NavController) {
    var text by remember { mutableStateOf("") }
    Column {
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        Row (
            horizontalArrangement = Arrangement.End
        ){
            Button(
                onClick = {
                    navController.navigate(ScreensRoute.DetailScreenRoute.route + "/$text")
                },
            ) {
                Text(text = "to Detail Screen")
            }
        }
    }
}
