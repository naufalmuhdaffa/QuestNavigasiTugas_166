package com.example.inputnavigasi

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.inputnavigasi.view.FormScreen
import com.example.inputnavigasi.view.HomeScreen
import com.example.inputnavigasi.view.ListParticipantScreen

enum class Navigasi {
    Beranda,
    ListPeserta,
    Formulir
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Beranda.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Navigasi.Beranda.name) {
                HomeScreen(
                    onStartClick = {
                        navController.navigate(Navigasi.ListPeserta.name)
                    }
                )
            }
            composable(route = Navigasi.ListPeserta.name) {
                ListParticipantScreen(
                    onBerandaClick = {
                        cancelAndBackToBeranda(navController)
                    },
                    onFormulirClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }
            composable(route = Navigasi.Formulir.name) {
                FormScreen(
                    onBerandaClick = {
                        cancelAndBackToBeranda(navController)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToBeranda(
    navController: NavHostController
) {
    navController.popBackStack(
        Navigasi.Beranda.name,
        inclusive = false
    )
}
