package com.example.proyectomoviles.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectomoviles.R
import com.google.firebase.firestore.FirebaseFirestore

@Composable
fun PantallaIS(navController: NavController) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id= R.drawable.nombre_negro),
            contentDescription = "logo"
        )

        Spacer(modifier = Modifier.size(16.dp))

        Text(text = "Iniciar sesión")

        Spacer(modifier = Modifier.size(16.dp))

        var nif by remember { mutableStateOf("") }
        var contrasena by remember { mutableStateOf("") }
        var mensajeError by remember { mutableStateOf("") }


        OutlinedTextField(
            value = nif,
            onValueChange = { nif = it },
            label = { Text("NIF") }
        )

        Spacer(modifier = Modifier.size(16.dp))

        OutlinedTextField(
            value = contrasena,
            onValueChange = { contrasena = it },
            label = { Text("Contraseña") }
        )

        Spacer(modifier = Modifier.size(16.dp))

        Text(text = mensajeError)

        Spacer(modifier = Modifier.size(5.dp))

        val db = FirebaseFirestore.getInstance()
        val coleccion = "clientes"

        Button(
            onClick = {
                db.collection(coleccion)
                    .document(nif)
                    .get()
                    .addOnSuccessListener { document ->
                        if (document.exists()) {
                            val contasenaUsuario = document.getString("contrasena")

                            // Comprobar si la contraseña ingresada coincide
                            if (contasenaUsuario == contrasena) {
                                // Contraseña correcta
                                navController.navigate("pantallaInicio")
                            } else {
                                mensajeError = "Contraseña incorrecta"
                            }
                        } else {
                            mensajeError = "El NIF no está registrado"
                        }
                    }
                    .addOnFailureListener {
                        mensajeError = "Error al intentar iniciar sesión"
                    }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.rojoLaLiga) ,
                contentColor = Color.White
            ),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = "Iniciar sesión")
        }

        Spacer(modifier = Modifier.size(16.dp))

        Text(text = "¿No tienes cuenta?")

        Spacer(modifier = Modifier.size(16.dp))

        Button(
            onClick = {
                navController.navigate("pantallaRegistro")
            },
                    colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.rojoLaLiga) ,
            contentColor = Color.White
        ),
        border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = "Registrarse")
        }
    }
}

