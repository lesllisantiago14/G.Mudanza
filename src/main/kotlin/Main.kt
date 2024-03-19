package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val clienteView=RegistroClienteView()
    val clienteController=ClienteController(clienteView)

    val cliente= Cliente("Dana Santiago","123 Main St","1234567890")
    clienteController.registrarCliente(cliente)

    val empleadoView=RegistroEmpleadoView()
    val empleadoController= EmpleadoController(empleadoView)

    val empleado = Empleado("Liam Ortiz", "Conductor", 2000.0)
    empleadoController.registrarEmpleado(empleado)

    val solicitudView = RegistroSolicitudMudanzaView()
    val solicitudController = SolicitudMudanzaController(solicitudView)

    val solicitud = SolicitudMudanza(cliente, empleado, "Origen", "Destino", "2024-03-16")
    solicitudController.registrarSolicitudMudanza(solicitud)
}