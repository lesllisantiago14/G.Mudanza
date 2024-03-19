package org.example

class EmpleadoController(private val view: RegistroEmpleadoView) {
    fun registrarEmpleado(empleado: Empleado) {
        view.mostrarMensajeExitoRegistro()
    }
}