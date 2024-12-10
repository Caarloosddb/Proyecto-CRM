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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectomoviles.R

@Composable
fun PantallaAlineacion(navController: NavController){
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(528.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(528.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fondo_futbol),
                        contentDescription = "Fondo",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Column {
                        //Delanteros
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .height(132.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            //Vinicius
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                                    .offset(y = 30.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.vinicius),
                                    contentDescription = "Vinicius",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "95%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                            //Mbappe
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mbappe),
                                    contentDescription = "Mbappe",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "95%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                            //Rodrygo
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                                    .offset(y = 30.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.rodrygo),
                                    contentDescription = "Rodrygo",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "80%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                        }
                        //Mediocentros
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .height(132.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            //Bellingham
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                                    .offset(x = 20.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.bellingham),
                                    contentDescription = "Bellingham",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "95%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                            //Camavinga
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                                    .offset(y = 80.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.camavinga),
                                    contentDescription = "Camavinga",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "60%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                            //Valverde
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                                    .offset(x = (-20.dp))
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.valverde),
                                    contentDescription = "Valverde",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "95%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                        }
                        //Defensas
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .height(132.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            //Mendy
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mendy),
                                    contentDescription = "Mendy",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "70%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                            //Rudiger
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                                    .offset(y = 30.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.rudiger),
                                    contentDescription = "Rudiger",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "95%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                            //Militao
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                                    .offset(y = 30.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.militao),
                                    contentDescription = "Militao",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "90%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                            //Carvajal
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.carvajal),
                                    contentDescription = "Carvajal",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "95%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                        }
                        //Portero
                        //Courtois
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .height(132.dp),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(70.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.courtois),
                                    contentDescription = "Courtois",
                                    modifier = Modifier.fillMaxSize()
                                )
                                Text(
                                    text = "95%",
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .background(
                                            color = colorResource(R.color.negroLaLiga),
                                            shape = RoundedCornerShape(50.dp)
                                        )

                                        .border(
                                            1.dp,
                                            Color.Green,
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .padding(1.dp)
                                )
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(color = colorResource(id = R.color.grisLaLiga))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(color = colorResource(id = R.color.banquillo)),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    //Alaba
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.alaba),
                            contentDescription = "Alaba",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "30%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Modric
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.modric),
                            contentDescription = "Modric",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Lunin
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lunin),
                            contentDescription = "Lunin",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }

                    //Tchouameni
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.tchouameni),
                            contentDescription = "Tchouameni",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Guler
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.guler),
                            contentDescription = "Guler",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Endrick
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.endrick),
                            contentDescription = "Endrick",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(color = colorResource(id = R.color.banquillo)),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    //Lucas
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lucas),
                            contentDescription = "Lucas",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Vallejo
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vallejo),
                            contentDescription = "Vallejo",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Ceballos
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ceballos),
                            contentDescription = "Ceballos",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fran),
                            contentDescription = "Fran",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Brahim
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.brahim),
                            contentDescription = "Brahim",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
                    }
                    //Asencio
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.asencio),
                            contentDescription = "Asencio",
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "95%",
                            color = Color.White,
                            fontSize = 12.sp,
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .background(
                                    color = colorResource(R.color.negroLaLiga),
                                    shape = RoundedCornerShape(50.dp)
                                )

                                .border(
                                    1.dp,
                                    Color.Green,
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .padding(1.dp)
                        )
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
