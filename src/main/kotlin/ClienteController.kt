package org.example

class ClienteController (private val view: RegistroClienteView) {
    fun registrarCliente(cliente: Cliente) {
        view.mostrarMensajeExitoRegistro()
    }
}
