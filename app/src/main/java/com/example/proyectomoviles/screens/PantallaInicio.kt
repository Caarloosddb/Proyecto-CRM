package com.example.proyectomoviles.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectomoviles.R


@Composable
fun PantallaInicio(navController: NavController){
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
                .padding(16.dp)
                .background(color = colorResource(id = R.color.blancoLaLiga)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Noticia principal
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(232.dp)) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(color = colorResource(id = R.color.grisLaLiga))
                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .height(182.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.inicio1),
                                contentDescription = "",
                                modifier = Modifier.fillMaxWidth(),
                                contentScale = ContentScale.FillBounds
                            )
                        }
                        Row(modifier = Modifier
                                .background(color = colorResource(id = R.color.grisClaro))
                                .fillMaxWidth()
                                .height(50.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image( painter = painterResource(id = R.drawable.athletic),
                                contentDescription = "")
                            Text(text = "Athletic Club")
                            Text(text = "2", modifier = Modifier,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center)
                            Text(text = "1", modifier = Modifier,
                                    fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center)
                            Text(text = "Real Madrid")
                            Image( painter = painterResource(id = R.drawable.real_madrid),
                                contentDescription = "")
                        }
                    }
                }

            Spacer(modifier = Modifier.height(16.dp))

            //Noticias 2
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(232.dp)) {
                //Noticia 2
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(color = colorResource(id = R.color.grisLaLiga))
                ){
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(182.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.inicio3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.FillBounds
                        )
                    }
                    Row(modifier = Modifier
                        .background(color = colorResource(id = R.color.grisClaro))
                        .fillMaxWidth()
                        .height(50.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(text = "Así es el sorteo del Mundial de Clubes 2025")
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            //Noticia 3
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(232.dp)) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(color = colorResource(id = R.color.grisLaLiga))
                ){
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(182.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.inicio2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.FillBounds
                        )
                    }
                    Row(modifier = Modifier
                        .background(color = colorResource(id = R.color.grisClaro))
                        .fillMaxWidth()
                        .height(50.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image( painter = painterResource(id = R.drawable.mallorca),
                            contentDescription = "")
                        Text(text = "Mallorca")
                        Text(text = "1", modifier = Modifier,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center)
                        Text(text = "5", modifier = Modifier,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center)
                        Text(text = "Barcelona")
                        Image( painter = painterResource(id = R.drawable.barcelona),
                            contentDescription = "")
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

