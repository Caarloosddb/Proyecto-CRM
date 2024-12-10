package com.example.proyectomoviles.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectomoviles.R

@Composable
fun PantallaCalendario(navController: NavController){
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
            //Columna principal
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.blancoLaLiga)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Lunes", fontWeight = FontWeight.Bold, fontSize = 9.sp, textAlign = TextAlign.Center,modifier = Modifier.weight(1f))
                        Text(text = "Martes", fontWeight = FontWeight.Bold, fontSize = 9.sp, textAlign = TextAlign.Center,modifier = Modifier.weight(1f))
                        Text(text = "Miercoles", fontWeight = FontWeight.Bold, fontSize = 9.sp, textAlign = TextAlign.Center,modifier = Modifier.weight(1f))
                        Text(text = "Jueves", fontWeight = FontWeight.Bold, fontSize = 9.sp, textAlign = TextAlign.Center,modifier = Modifier.weight(1f))
                        Text(text = "Viernes", fontWeight = FontWeight.Bold, fontSize = 9.sp, textAlign = TextAlign.Center,modifier = Modifier.weight(1f))
                        Text(text = "Sabado", fontWeight = FontWeight.Bold, fontSize = 9.sp, textAlign = TextAlign.Center,modifier = Modifier.weight(1f))
                        Text(text = "Domingo", fontWeight = FontWeight.Bold, fontSize = 9.sp, textAlign = TextAlign.Center,modifier = Modifier.weight(1f))
                    }
                //Semana1
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "1", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 15",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                }
                //Semana2
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "2", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 15",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "3", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 19",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "4", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 19",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "5", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "6", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 16",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "7", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 16",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "8", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 16",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                }
                //Semana3
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "9", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 16",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "10", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "11", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "12", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "13", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 17",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "14", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 17",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "15", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 17",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                }
                //Semana4
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "16", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "17", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "18", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 12",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "19", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "20", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 18",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "21", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 18",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "22", modifier = Modifier.align(Alignment.TopEnd))
                        Text(text = "J 18",
                            modifier = Modifier.align(Alignment.Center).fillMaxWidth().background(color = colorResource(id = R.color.rojoLaLiga)),
                            color = colorResource(id = R.color.blancoLaLiga), textAlign = TextAlign.Center)
                    }
                }
                //Semana5
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                            Text(text = "23", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "24", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "25", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "26", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "27", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "28", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "29", modifier = Modifier.align(Alignment.TopEnd))
                    }
                }
                //Semana6
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "30", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).border(width = 1.dp, color = colorResource(id = R.color.grisClaro)).padding(0.5.dp)
                    ){
                        Text(text = "31", modifier = Modifier.align(Alignment.TopEnd))
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
                    }
                    Box(
                        modifier = Modifier.weight(1f).fillMaxSize().padding(4.dp).padding(0.5.dp)
                    ){
                        Text(text = "")
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