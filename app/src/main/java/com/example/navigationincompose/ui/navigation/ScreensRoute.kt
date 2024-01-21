package com.example.navigationincompose.ui.navigation

sealed class ScreensRoute (val route:String){
    object HomeScreenRoute:ScreensRoute("home_screen")
    object DetailScreenRoute:ScreensRoute("detail_screen")
}