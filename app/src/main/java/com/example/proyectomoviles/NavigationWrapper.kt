package com.example.proyectomoviles

import PantallaListaJugadores
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.proyectomoviles.screens.PantallaAlineacion
import com.example.proyectomoviles.screens.PantallaCalendario
import com.example.proyectomoviles.screens.PantallaCambioContrasena
import com.example.proyectomoviles.screens.PantallaClasificacion
import com.example.proyectomoviles.screens.PantallaIS
import com.example.proyectomoviles.screens.PantallaInicio
import com.example.proyectomoviles.screens.PantallaJornada
import com.example.proyectomoviles.screens.PantallaJugador
import com.example.proyectomoviles.screens.PantallaRegistro
import com.example.proyectomoviles.screens.Pantallausuario
import com.example.proyectomoviles.screens.SplashScreen


@Composable
fun NavigationWrapper (navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = "splashScreen") {

        composable ("splashScreen") { SplashScreen(navHostController) }
        composable ("pantallaIS") {PantallaIS(navHostController)}
        composable("pantallaRegistro"){ PantallaRegistro(navHostController) }
        composable("pantallaInicio"){ PantallaInicio(navHostController) }
        composable("pantallaClasificacion"){ PantallaClasificacion(navHostController) }
        composable("pantallaCalendario"){ PantallaCalendario(navHostController) }
        composable("pantallaJornada"){ PantallaJornada(navHostController) }
        composable("pantallaAlineacion"){ PantallaAlineacion(navHostController) }
        composable("pantallaUsuario"){ Pantallausuario(navHostController) }
        composable("pantallaListaJugadores"){ PantallaListaJugadores(navHostController) }
        composable("pantallaJugador"){ PantallaJugador(navHostController) }
        composable("pantallaCambioContrasena"){ PantallaCambioContrasena(navHostController) }




    }
}
