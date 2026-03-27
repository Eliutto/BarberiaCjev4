package com.mycompany.barberiacjev4.persistencia;

import com.mycompany.barberiacjev4.logica.Cliente;
import com.mycompany.barberiacjev4.logica.Servicio;
import com.mycompany.barberiacjev4.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    ServicioJpaController servicioJpa = new ServicioJpaController();

    public void guardar(Cliente cliente, Servicio servicio) {
        
        //creamos en la base de datos del cliente
        clienteJpa.create(cliente);
        
        //creamos en la base de datos de los servicios
        servicioJpa.create(servicio);
        
    }

    public List<Servicio> traerServicios() {
        return servicioJpa.findServicioEntities();
    }

    public void borrarServicio(int num_servicio) {
        try {
            servicioJpa.destroy(num_servicio);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Servicio traerServicios(int num_servicio) {
        return servicioJpa.findServicio(num_servicio);
    }

    public void modificarServicio(Servicio servicio) {
        try {
            servicioJpa.edit(servicio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerCliente(int id_cliente) {
        return clienteJpa.findCliente(id_cliente);
    
    }

    public void modificarCliente(Cliente cliente) {
        try {
            clienteJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
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