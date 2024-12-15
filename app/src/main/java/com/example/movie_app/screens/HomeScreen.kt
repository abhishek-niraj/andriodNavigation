package com.example.movie_app.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movie_app.MovieRow
import com.example.movie_app.navigation.MovieScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Movie App",
                    style = TextStyle(
                        color = Color.White
                    )
                ) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary, // Background color
                    scrolledContainerColor = MaterialTheme.colorScheme.primary

                ),
                modifier = Modifier.shadow(1.dp) // Elevation effect
            )
        }
    ) { paddingValues ->
        // Apply padding provided by Scaffold
        Box(modifier = Modifier.padding(paddingValues)) {
            MainContent(navController)
        }
    }

}

@Composable
fun MainContent(navController: NavController,movieList: List<String> = listOf(
    "BB",
    "88",
    "00",
    "iii",
    "jkjjk",
    "Abhishek",
    "Niraj"
)) {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column (modifier = Modifier.padding(12.dp)){
            LazyColumn(){
                items(movieList){
                        movie ->
                    MovieRow(movie = movie) {
                            selectedMovie ->
                        // Handle the movie click here
                        navController.navigate(route = MovieScreen.DetailScreen.name)

                    }
                }
            }
        }
    }
}