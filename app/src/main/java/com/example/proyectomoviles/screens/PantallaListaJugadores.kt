import com.example.proyectomoviles.screens.Jugador

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectomoviles.R
import com.example.proyectomoviles.screens.imageList
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await


@Composable
fun PantallaListaJugadores(navController: NavController) {

    // Estado para almacenar la lista de clientes
    var listaJugadores by remember { mutableStateOf(emptyList<Jugador>()) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 24.dp)
            .background(color = Color.White)
    ) {
        //Header
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
            // Título del informe
            Text(
                text = "Informe general de Jugadores",
                fontWeight = FontWeight.ExtraBold
            )

            // Usar LaunchedEffect para manejar operaciones asíncronas
            LaunchedEffect(Unit) {
                try {
                    val jugadores = getJugadores()
                    if (jugadores.isNotEmpty()) {
                        listaJugadores = jugadores
                        Log.d("Jugadores", "Lista de jugadores obtenida con éxito.")
                    } else {
                        Log.d("Jugadores", "No se encontraron jugadores.")
                    }
                } catch (e: Exception) {
                    Log.e("ErrorFirestore", "Error obteniendo jugadores: ${e.message}")
                }
            }

            // Si la lista está vacía, mostrar un mensaje
            if (listaJugadores.isEmpty()) {
                Text("Cargando jugadores o lista vacía...", Modifier.padding(16.dp))
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    items(listaJugadores) { jugador ->
                        JugadorItem(jugador, navController)
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

suspend fun getJugadores(): List<Jugador> {
    val db = FirebaseFirestore.getInstance()
    val jugadorRef = db.collection("jugadores")

    return try {
        val querySnapshot = jugadorRef.get().await()

        val jugadores = mutableListOf<Jugador>()
        for (document in querySnapshot.documents) {
            val jugador = document.toObject(Jugador::class.java)
            jugador?.let {
                jugadores.add(it)
            }
        }
        jugadores
    } catch (e: Exception) {
        Log.e("ErrorFirestore", "Excepción obteniendo datos: ${e.message}")
        emptyList()
    }
}

@Composable
fun JugadorItem(jugador: Jugador, navController: NavController) {
    val context = LocalContext.current
    val imageResource = remember(jugador.foto) {
        context.resources.getIdentifier(jugador.foto, "drawable", context.packageName)
    }

    Row (
        modifier = Modifier
            .padding(8.dp)
            .background(MaterialTheme.colorScheme.surface, RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {

                Image(
                    painter = painterResource(id = imageResource),
                    contentDescription = "Foto del jugador",
                    modifier = Modifier.size(64.dp).clip(CircleShape)
                        .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                )

            Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = "${jugador.nombre} ${jugador.apellidos}",
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = "Dorsal: ${jugador.dorsal} | Nacionalidad: ${jugador.nacionalidad}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )
        }
    }
}