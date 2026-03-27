package com.mycompany.barberiacjev4.logica;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/* Clase Servicio.
 * Representa un servicio ofrecido en la barbería. Utiliza anotaciones de JPApara mapear la información en la 
   base de datos y tiene una relación uno a uno con la clase Cliente.*/
@Entity
public class Servicio implements Serializable {
    // Identificador único para el servicio (clave primaria en la base de datos)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_Servicio;
    private String Tipo_Cabello;
    private String Tipo_Corte;
    private String Sede;
    private String Barbero;
    private String Adicionales;
    private String Asesoria;
    // Relación uno a uno con la clase Cliente
    @OneToOne
    private Cliente unServicio;
    /*
     * Constructor por defecto. Necesario para las operaciones de JPA.
     */
    public Servicio() {
    }
    /*
     * Constructor con parámetros.
     * Permite inicializar un servicio con todos sus atributos.
     * @param num_Servicio Identificador único del servicio
     * @param Tipo_Cabello Tipo de cabello
     * @param Tipo_Corte Tipo de corte
     * @param Sede Sede de la barbería
     * @param Barbero Nombre del barbero
     * @param Adicionales Servicios adicionales
     * @param Asesoria Indicación de asesoría
     * @param unServicio Cliente asociado al servicio
     */
    public Servicio(int num_Servicio, String Tipo_Cabello, String Tipo_Corte, String Sede, String Barbero, String Adicionales, String Asesoria, Cliente unServicio) {
        this.num_Servicio = num_Servicio;
        this.Tipo_Cabello = Tipo_Cabello;
        this.Tipo_Corte = Tipo_Corte;
        this.Sede = Sede;
        this.Barbero = Barbero;
        this.Adicionales = Adicionales;
        this.Asesoria = Asesoria;
        this.unServicio = unServicio;
    }
     // Métodos getter y setter para cada atributo
    /*Obtiene el identificador único del servicio.
     * @return num_Servicio*/
    public int getNum_Servicio() {
        return num_Servicio;
    }
    public void setNum_Servicio(int num_Servicio) {
        this.num_Servicio = num_Servicio;
    }
    public String getTipo_Cabello() {
        return Tipo_Cabello;
    }
    public void setTipo_Cabello(String Tipo_Cabello) {
        this.Tipo_Cabello = Tipo_Cabello;
    }
    public String getTipo_Corte() {
        return Tipo_Corte;
    }
    public void setTipo_Corte(String Tipo_Corte) {
        this.Tipo_Corte = Tipo_Corte;
    }
    public String getSede() {
        return Sede;
    }
    public void setSede(String Sede) {
        this.Sede = Sede;
    }
    public String getBarbero() {
        return Barbero;
    }
    public void setBarbero(String Barbero) {
        this.Barbero = Barbero;
    }
    public String getAdicionales() {
        return Adicionales;
    }
    public void setAdicionales(String Adicionales) {
        this.Adicionales = Adicionales;
    }
    public String getAsesoria() {
        return Asesoria;
    }
    public void setAsesoria(String Asesoria) {
        this.Asesoria = Asesoria;
    }
    public Cliente getUnServicio() {
        return unServicio;
    }
    public void setUnServicio(Cliente unServicio) {
        this.unServicio = unServicio;
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