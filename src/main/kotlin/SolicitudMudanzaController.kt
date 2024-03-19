package org.example

class SolicitudMudanzaController(private val view: RegistroSolicitudMudanzaView) {
    fun registrarSolicitudMudanza(solicitud: SolicitudMudanza) {
        view.mostrarMensajeExitoRegistro()
    }
}