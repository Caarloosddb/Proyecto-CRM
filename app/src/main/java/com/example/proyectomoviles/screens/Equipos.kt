package com.example.proyectomoviles.screens

import com.example.proyectomoviles.R

data class Equipos(
    val posicion: Int,
    val escudo: Int,
    val puntos: Int,
    val partidos: Int,
    val victorias: Int,
    val derrotas: Int,
    val empates: Int,
    val golDif: Int
)

val imageList = listOf(
    R.drawable.alaves,
    R.drawable.athletic,
    R.drawable.atletico,
    R.drawable.barcelona,
    R.drawable.betis,
    R.drawable.celta,
    R.drawable.espanyol,
    R.drawable.getafe,
    R.drawable.girona,
    R.drawable.las_palmas,
    R.drawable.leganes,
    R.drawable.mallorca,
    R.drawable.osasuna,
    R.drawable.rayo_vallecano,
    R.drawable.real_madrid,
    R.drawable.real_sociedad,
    R.drawable.sevilla,
    R.drawable.valencia,
    R.drawable.valladolid,
    R.drawable.villarreal
)

val equipos = listOf(
    Equipos(1, R.drawable.barcelona, 38, 17, 12, 3, 2, 31),
    Equipos(2, R.drawable.real_madrid, 36, 16, 11, 2, 3, 21),
    Equipos(3, R.drawable.atletico, 32, 15, 9, 1, 5, 18),
    Equipos(4, R.drawable.athletic, 32, 17, 9, 5, 3, 11),
    Equipos(5, R.drawable.villarreal, 26, 15, 7, 3, 5, 2),
    Equipos(6, R.drawable.real_sociedad, 24, 16, 7, 3, 22, 5),
    Equipos(7, R.drawable.osasuna, 24, 16, 6, 6, 3, -3),
    Equipos(8, R.drawable.mallorca, 24, 17, 7, 7, 3, -4),
    Equipos(9, R.drawable.girona, 22, 16, 6, 6, 4, -1),
    Equipos(10, R.drawable.celta, 21, 16, 6, 7, 3, -2),
    Equipos(11, R.drawable.betis, 21, 16, 5, 6, 4, -2),
    Equipos(12, R.drawable.rayo_vallecano, 19, 15, 5, 6, 4, -1),
    Equipos(13, R.drawable.sevilla, 19, 15, 5, 8, 3, -5),
    Equipos(14, R.drawable.las_palmas, 18, 16, 5, 8, 3, -5),
    Equipos(15, R.drawable.alaves, 15, 16, 4, 9, 3, -9),
    Equipos(16, R.drawable.leganes, 15, 16, 3, 7, 6, -9),
    Equipos(17, R.drawable.getafe, 13, 15, 2, 6, 7, -3),
    Equipos(18, R.drawable.espanyol, 13, 14, 4, 9, 1, -9),
    Equipos(19, R.drawable.valencia, 10, 14, 2, 8, 4, -9),
    Equipos(20, R.drawable.valladolid, 9, 16, 2, 11, 3, -23),
    )