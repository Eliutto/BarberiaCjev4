package com.mycompany.barberiacjev4.persistencia.exceptions;

public class PreexistingEntityException extends Exception {
    public PreexistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public PreexistingEntityException(String message) {
        super(message);
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