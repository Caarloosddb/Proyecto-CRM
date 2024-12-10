package com.example.proyectomoviles.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectomoviles.R
import com.google.firebase.firestore.FirebaseFirestore

@Composable
fun PantallaRegistro(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
            .padding(start = 10.dp)
            .padding(end = 10.dp)

    ) {
        Image(
            painter = painterResource(id= R.drawable.nombre_negro),
            contentDescription = "logo"
        )

        Text(
            text = "Registrarse",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.size(20.dp))

        var nif by remember { mutableStateOf("") }

        OutlinedTextField(
            value = nif,
            onValueChange = { nif = it },
            label = { Text("NIF") }
        )


        var nombre by remember { mutableStateOf("") }

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("nombre") }
        )

        var direccion by remember { mutableStateOf("") }

        OutlinedTextField(
            value = direccion,
            onValueChange = { direccion = it },
            label = { Text("dirección") }
        )

        var telefono by remember { mutableStateOf("") }

        OutlinedTextField(
            value = telefono,
            onValueChange = { telefono = it },
            label = { Text("teléfono") }
        )

        var contrasena by remember { mutableStateOf("") }

        OutlinedTextField(
            value = contrasena,
            onValueChange = { contrasena = it },
            label = { Text("contrasena") }
        )

        Spacer(modifier = Modifier.size(16.dp))

        val db = FirebaseFirestore.getInstance()
        val coleccion = "clientes"


        var mensajeConfirmacion by remember { mutableStateOf("") }

        val dato = hashMapOf(

            "nif" to nif.toString(),
            "nombre" to nombre.toString(),
            "direccion" to direccion.toString(),
            "telefono" to telefono.toString(),
            "contrasena" to contrasena.toString()
        )

        Button(

            onClick = {
                db.collection(coleccion)
                    .document(nif)
                    .set(dato)
                    .addOnSuccessListener {
                        mensajeConfirmacion = "Datos guardados correctamente"

                        nif = ""
                        direccion = ""
                        nombre = ""
                        telefono = ""
                        contrasena = ""

                        navController.navigate("pantallaInicio")

                    }
                    .addOnFailureListener {
                        mensajeConfirmacion = "No se ha podido guardar"

                        nif = ""
                        direccion = ""
                        nombre = ""
                        telefono = ""
                        contrasena = ""
                    }
            },

            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.rojoLaLiga) ,
                contentColor = Color.White
            ),
            border = BorderStroke(1.dp, Color.Black)
        )
        {
            Text(text = "Guardar")

        }

        Spacer(modifier = Modifier.size(5.dp))
        Text(text = mensajeConfirmacion)

    }
}