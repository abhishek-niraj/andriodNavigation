package com.example.movie_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movie_app.screens.DetailScreen
import com.example.movie_app.screens.HomeScreen

@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreen.HomeScreen.name){
        composable(MovieScreen.HomeScreen.name) { 
            HomeScreen(navController = navController)
        }
        composable (MovieScreen.DetailScreen.name) {
            DetailScreen(navController = navController)
        }
    }
}