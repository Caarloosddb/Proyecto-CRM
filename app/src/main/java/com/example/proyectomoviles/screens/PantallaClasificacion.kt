package com.example.proyectomoviles.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectomoviles.R


@Composable
fun PantallaClasificacion(navController: NavController){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top=24.dp)
            .background(color = Color.White)) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.white),
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.menu_icon),
                    contentDescription = "menu"
                )

            }

            Spacer(modifier = Modifier.width(175.dp))

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.white),
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bandera_espana),
                    contentDescription = "idioma"
                )

            }

            Button(
                onClick = {
                    navController.navigate("pantallaUsuario")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.white),
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.user),
                    contentDescription = "user"
                )

            }

        }
        LazyRow(
            modifier = Modifier.fillMaxWidth().height(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(imageList) { imageRes ->
                Card(
                    modifier = Modifier
                        .size(60.dp)
                        .clickable {
                            navController.navigate("pantallaAlineacion")
                        }
                ) {
                    Image(
                        painter = painterResource(id = imageRes),
                        contentDescription = "Imagen",
                        modifier = Modifier.fillMaxSize()
                            .background(color = colorResource(id = R.color.blancoLaLiga))
                    )
                }
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .height(760.dp)
        ) {
            // Título de la tabla
            Text(
                text = "Clasificación",
                modifier = Modifier.padding(16.dp)
            )

            // Encabezado de la tabla
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "", fontWeight = FontWeight.Bold, modifier = Modifier.weight(0.5f).wrapContentWidth(Alignment.CenterHorizontally))
                Text(text = "", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally))
                Text(text = "Pts", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally))
                Text(text = "V", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally))
                Text(text = "D", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally))
                Text(text = "E", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally))
                Text(text = "PJ", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally))
                Text(text = "DG", fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f).wrapContentWidth(Alignment.CenterHorizontally))
            }

            // Datos de la clasificación (ejemplo de equipo)
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(equipos) { equipo -> // Aquí 'teams' es una lista de tus datos
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .background(color = colorResource(R.color.blancoLaLiga)),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = equipo.posicion.toString(),
                            modifier = Modifier.weight(0.5f).wrapContentSize(Alignment.Center))
                        Image(painter = painterResource(id = equipo.escudo),
                            contentDescription = "Escudo", modifier = Modifier.size(40.dp).padding(4.dp).wrapContentSize(Alignment.Center))
                        Text(text = equipo.puntos.toString(), modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                        Text(text = equipo.victorias.toString(), modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                        Text(text = equipo.derrotas.toString(), modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                        Text(text = equipo.empates.toString(), modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                        Text(text = equipo.partidos.toString(), modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                        Text(text = equipo.golDif.toString(), modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    }
                }
            }
        }

        //Footer
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.grisClaro))
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Button(
                onClick = {
                    navController.navigate("pantallaInicio")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.grisClaro)
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_negro),
                    contentDescription = "inicio"
                )

            }

            Button(
                onClick = {
                    navController.navigate("pantallaListaJugadores")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.grisClaro),
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.equipo_logo),
                    contentDescription = "inicio"
                )

            }

            Button(
                onClick = {
                    navController.navigate("pantallaClasificacion")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.grisClaro),
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.clasificacion),
                    contentDescription = "inicio"
                )

            }

            Button(
                onClick = {
                    navController.navigate("pantallaCalendario")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.grisClaro),
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.calendario),
                    contentDescription = "inicio"
                )

            }

            Button(
                onClick = {
                    navController.navigate("pantallaJornada")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.grisClaro),
                    contentColor = Color.White
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.balon),
                    contentDescription = "inicio"
                )

            }
        }
    }
}