package com.mycompany.barberiacjev4.logica;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * Clase Cliente.
 * Representa a un cliente en el sistema de la barbería. Esta clase utiliza
 * anotaciones de JPA para mapear la información en la base de datos.
 */
@Entity
public class Cliente implements Serializable {
    // Identificador único para el cliente (clave primaria en la base de datos)
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id_cliente;
    private String Cedula;
    private String Num_Contacto;
    private String Nombre_Apellido;
    private String Residencia;
    /*
     * Constructor por defecto.
     * Necesario para las operaciones de JPA.
     */
    public Cliente() {
    }
    /*
     * Constructor con parámetros.
     * Permite inicializar un cliente con todos sus atributos.
     * @param id_cliente Identificador único del cliente
     * @param Cedula Número de cédula del cliente
     * @param Num_Contacto Número de contacto del cliente
     * @param Nombre_Apellido Nombre completo del cliente
     * @param Residencia Dirección de residencia del cliente
     */
    public Cliente(int id_cliente, String Cedula, String Num_Contacto, String Nombre_Apellido, String Residencia) {
        this.id_cliente = id_cliente;
        this.Cedula = Cedula;
        this.Num_Contacto = Num_Contacto;
        this.Nombre_Apellido = Nombre_Apellido;
        this.Residencia = Residencia;
    }
    // Métodos getter y setter para cada atributo
    /*
     * Obtiene el identificador único del cliente.
     *
     * @return id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    public String getNum_Contacto() {
        return Num_Contacto;
    }
    public void setNum_Contacto(String Num_Contacto) {
        this.Num_Contacto = Num_Contacto;
    }
    public String getNombre_Apellido() {
        return Nombre_Apellido;
    }
    public void setNombre_Apellido(String Nombre_Apellido) {
        this.Nombre_Apellido = Nombre_Apellido;
    }
    public String getResidencia() {
        return Residencia;
    }
    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
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