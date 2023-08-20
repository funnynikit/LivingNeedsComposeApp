package com.sample.livingneedapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sample.livingneedapp.screens.CheckoutScreen
import com.sample.livingneedapp.screens.DetailScreen
import com.sample.livingneedapp.screens.HomeScreen

@Composable
fun LivingNeedNavigation() {

    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Home){

        composable(Home){
            HomeScreen(navHostController)
        }

        composable(Detail){
            DetailScreen(navHostController)
        }

        composable(Checkout){
            CheckoutScreen(navHostController)
        }
    }
}

const val Home = "home"
const val Detail = "detail"
const val Checkout = "checkout"