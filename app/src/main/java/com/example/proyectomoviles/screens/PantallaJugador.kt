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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectomoviles.R

@Composable
fun PantallaJugador(navController: NavController) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp)
                .background(color = Color.White)
        ) {
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
                modifier = Modifier
                    .fillMaxWidth()
                    .height(760.dp)
                    .background(color = colorResource(id = R.color.blancoLaLiga))
                    .padding(start = 16.dp)
                    .padding(end = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id = R.color.grisLaLiga)),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bellingham),
                        contentDescription = "jugador",
                        modifier = Modifier
                            .weight(1f),
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .height(250.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(text = "Jude Bellingham", color = Color.White)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = "21 años", color = Color.White)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = "29/06/2003", color = Color.White)
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = "Inglaterra", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = "Centrocampista", color = Color.White)
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id = R.color.grisLaLiga)),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .height(250.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row {
                            Text(text = "Estadisticas", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {
                            Text(text = "Partidos jugados", color = Color.White
                            )
                            Text(text = "5", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {
                            Text(text = "Goles", color = Color.White)
                            Text(text = "4", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {
                            Text(text = "Asistencias", color = Color.White)
                            Text(text = "3", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {
                            Text(text = "Tarjetas", color = Color.White)
                            Text(text = "2", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {
                            Text(text = "Minutos", color = Color.White)
                            Text(text = "1000", color = Color.White)
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
