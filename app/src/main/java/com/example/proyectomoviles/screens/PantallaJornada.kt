package com.example.proyectomoviles.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectomoviles.R

@Composable
fun PantallaJornada(navController: NavController){
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
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Jornada 16",
                    style = TextStyle(
                    fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.negroLaLiga)
            )
            )

            Spacer(modifier = Modifier.height(20.dp))

            //1-2 partido
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(brush = Brush.horizontalGradient(
                        colors = listOf(Color.Black, Color.LightGray),
                        startX = 0f,
                        endX = Float.POSITIVE_INFINITY ))
                    .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.celta),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "VIERNES", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "21:00", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.mallorca),
                        contentDescription = ""
                    )
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.LightGray, Color.Black),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.las_palmas),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "SABADO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "14:00", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.valladolid),
                        contentDescription = ""
                    )
                }
            }
            //3-4 partido
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.Black, Color.LightGray),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.betis),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "SABADO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "16:15", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.barcelona),
                        contentDescription = ""
                    )
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.LightGray, Color.Black),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.valencia),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "SABADO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "18:30", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.rayo_vallecano),
                        contentDescription = ""
                    )
                }
            }
            //5-6 partidos
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.Black, Color.LightGray),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.girona),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "SABADO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "21:00", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.real_madrid),
                        contentDescription = ""
                    )
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.LightGray, Color.Black),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.leganes),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "DOMINGO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "14:00", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.real_sociedad),
                        contentDescription = ""
                    )
                }
            }
            //7-8 partidos
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.Black, Color.LightGray),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.athletic),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "DOMINGO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "16:15", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.villarreal),
                        contentDescription = ""
                    )
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.LightGray, Color.Black),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.osasuna),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "DOMINGO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "18:30", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.alaves),
                        contentDescription = ""
                    )
                }
            }
            //9-10 partidos
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.Black, Color.LightGray),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.atletico),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "DOMINGO", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "21:00", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.sevilla),
                        contentDescription = ""
                    )
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(brush = Brush.horizontalGradient(
                            colors = listOf(Color.LightGray, Color.Black),
                            startX = 0f,
                            endX = Float.POSITIVE_INFINITY ))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Image(
                        painter = painterResource(id = R.drawable.getafe),
                        contentDescription = ""
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "LUNES", color = colorResource(R.color.blancoLaLiga))
                        Text(text = "21:00", color = colorResource(R.color.blancoLaLiga))

                    }
                    Image(
                        painter = painterResource(id = R.drawable.espanyol),
                        contentDescription = ""
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            //Mini clasificacion
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                //1º
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "1", modifier = Modifier
                        .weight(0.5f).wrapContentSize(Alignment.Center)
                    )
                    Image(painter = painterResource(id = R.drawable.barcelona),
                        contentDescription = "Escudo", modifier = Modifier
                            .size(40.dp).padding(4.dp).wrapContentSize(Alignment.Center)
                    )
                    Text(text = "33", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "11", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "14", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "3", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                }
                //2º
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "2", modifier = Modifier
                        .weight(0.5f).wrapContentSize(Alignment.Center)
                    )
                    Image(painter = painterResource(id = R.drawable.real_madrid),
                        contentDescription = "Escudo", modifier = Modifier
                            .size(40.dp).padding(4.dp).wrapContentSize(Alignment.Center)
                    )
                    Text(text = "33", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "11", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "14", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "3", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                }
                //3º
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "3", modifier = Modifier
                        .weight(0.5f).wrapContentSize(Alignment.Center)
                    )
                    Image(painter = painterResource(id = R.drawable.atletico),
                        contentDescription = "Escudo", modifier = Modifier
                            .size(40.dp).padding(4.dp).wrapContentSize(Alignment.Center)
                    )
                    Text(text = "33", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "11", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "14", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "3", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                }
                //4º
                Row(
                    modifier = Modifier.fillMaxWidth() ,
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "4", modifier = Modifier
                        .weight(0.5f).wrapContentSize(Alignment.Center)
                    )
                    Image(painter = painterResource(id = R.drawable.villarreal),
                        contentDescription = "Escudo", modifier = Modifier
                            .size(40.dp).padding(4.dp).wrapContentSize(Alignment.Center)
                    )
                    Text(text = "33", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "11", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "2", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "14", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
                    Text(text = "3", modifier = Modifier.weight(1f).wrapContentSize(Alignment.Center))
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