package com.example.movie_app.navigation

enum class MovieScreen {
    HomeScreen,
    DetailScreen;
    companion object {
      fun  fromRoute(route:String ?): MovieScreen
      = when (route?.substringBefore(delimiter = "/")){
          HomeScreen.name -> HomeScreen
          DetailScreen.name -> DetailScreen
          null -> HomeScreen
          else -> throw IllegalArgumentException("Route $route not found")
      }
    }
}