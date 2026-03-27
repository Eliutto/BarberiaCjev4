package com.mycompany.barberiacjev4.logica;
import com.mycompany.barberiacjev4.persistencia.ControladoraPersistencia;
import java.util.List;
// Clase Controladora que actúa como puente entre la lógica de la aplicación y la persistencia de datos
public class Controladora {
    // Instancia de la clase ControladoraPersistencia para manejar las operaciones de base de datos
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    // Método para guardar un cliente y un servicio asociado en la base de datos
    public void guardar(String cedula, String contacto, String corte, String nombre, String residencia, String adicionales, String asesoria, String barbero, 
                        String sede, String cabello) {
        // Creamos un cliente y asignamos sus valores a partir de los parámetros
        Cliente cliente = new Cliente();
        cliente.setCedula(cedula);
        cliente.setNombre_Apellido(nombre);
        cliente.setNum_Contacto(contacto);
        cliente.setResidencia(residencia);              
        //creamos el servicio  y asignamos sus valores
        Servicio servicio = new Servicio();
        servicio.setAdicionales(adicionales);
        servicio.setAsesoria(asesoria);
        servicio.setBarbero(barbero);
        servicio.setSede(sede);
        servicio.setTipo_Cabello(cabello);
        servicio.setTipo_Corte(corte);
         // Asociamos el cliente al servicio
        servicio.setUnServicio(cliente);
         // Guardamos el cliente y el servicio en la base de datos
        controlPersis.guardar(cliente,servicio);       
    }
    // Método para traer todos los servicios desde la base de datos
    public List<Servicio> traerServicios() {
        // Llamamos al método de persistencia que retorna la lista de servicios
        return controlPersis.traerServicios();
    }
    // Método para borrar un servicio específico por su número
    public void borrarServicio(int num_servicio) {
        // Llamamos al método de persistencia para eliminar el servicio
        controlPersis.borrarServicio(num_servicio);
    }
    // Método para traer un servicio específico por su número
    public Servicio traerServicios(int num_servicio) {
        // Retornamos el servicio encontrado en la base de datos
        return controlPersis.traerServicios(num_servicio);
    }
    // Método para modificar los datos de un servicio y el cliente asociado
    public void modificarServicio(Servicio servicio, String adicionales, String asesoria, String barbero, String sede, String cabello, String residencia, 
                                  String nombre, String corte, String contacto, String cedula) {
        // Actualizamos los valores del servicio
        servicio.setAdicionales(adicionales);
        servicio.setAsesoria(asesoria);
        servicio.setBarbero(barbero);
        servicio.setSede(sede);
        servicio.setTipo_Cabello(cabello);
        servicio.setTipo_Corte(corte);       
        // Modificamos el servicio en la base de datos
        controlPersis.modificarServicio(servicio);
        // Buscamos al cliente asociado al servicio para actualizar su información
        Cliente cliente = this.buscarCliente(servicio.getUnServicio().getId_cliente());
        cliente.setCedula(cedula);
        cliente.setNombre_Apellido(nombre);
        cliente.setNum_Contacto(contacto);
        cliente.setResidencia(residencia);       
        // Actualizamos los datos del cliente en la base de datos
        this.modificarCliente(cliente);        
    }
    // Método privado para buscar un cliente por su ID
    private Cliente buscarCliente(int id_cliente) {
         // Retornamos el cliente encontrado en la base de datos
        return controlPersis.traerCliente(id_cliente);    
    }
    // Método privado para modificar los datos de un cliente en la base de datos
    private void modificarCliente(Cliente cliente) {
        // Llamamos al método de persistencia para actualizar el cliente
        controlPersis.modificarCliente(cliente);
    }    
}
/*
 * =================================================================================
 *                                Barberiacjev App
 * =================================================================================
 * 
 * Aplicación desarrollada por [Gerson Eliut Torrado Guerrero] para la gestión de clientes
 * y servicios en la barbería "Barberiacjev".
 * 
 * Fecha de creación: [1/10/2025]
 * Última modificación: [1/12/2025]
 * 
 * Derechos de Autor © [2025], [Gerson Eliut Torrado Guerrero]. Todos los derechos reservados.
 * 
 * Esta aplicación y su código fuente son propiedad exclusiva de [Gerson Eliut Torrado Guerrero].
 * Está prohibida su reproducción, distribución, modificación o uso no autorizado sin el
 * consentimiento explícito por escrito del propietario. Cualquier intento de uso indebido
 * o apropiación del código será considerado una violación de los derechos de autor y será
 * tratado según las leyes vigentes.
 * 
 * Para consultas o permisos especiales, contacta a: [gerson.torrado@cun.edu.co]
 * 
 * =================================================================================
 */