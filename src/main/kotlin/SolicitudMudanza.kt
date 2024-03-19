package org.example

data class SolicitudMudanza (
    val cliente: Cliente,
    val empleado: Empleado,
    val origen: String,
    val destino:String,
    val fecha: String,
)