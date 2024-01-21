package com.example.navigationincompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationincompose.ui.Screens.DetailScreen
import com.example.navigationincompose.ui.Screens.HomeScreen
import com.example.navigationincompose.ui.constans.DETAIL_SCREEN_KEY

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreensRoute.HomeScreenRoute.route
    ){
        composable(ScreensRoute.HomeScreenRoute.route){
            HomeScreen(navController = navController)
        }
        composable(
            ScreensRoute.DetailScreenRoute.route + "/{text}",
            arguments = listOf(
                navArgument(
                    name = "text",){
                        type = NavType.StringType
                        defaultValue = "Behzod"
                        nullable = true
                }
            )
        ){ entry->
            DetailScreen(
                navController = navController,
                text = entry.arguments?.getString("text"))
        }
    }
}