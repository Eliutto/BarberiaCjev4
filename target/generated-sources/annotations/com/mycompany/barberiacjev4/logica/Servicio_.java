package com.mycompany.barberiacjev4.logica;

import com.mycompany.barberiacjev4.logica.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-10T22:19:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> Asesoria;
    public static volatile SingularAttribute<Servicio, String> Tipo_Cabello;
    public static volatile SingularAttribute<Servicio, String> Sede;
    public static volatile SingularAttribute<Servicio, String> Barbero;
    public static volatile SingularAttribute<Servicio, Cliente> unServicio;
    public static volatile SingularAttribute<Servicio, Integer> num_Servicio;
    public static volatile SingularAttribute<Servicio, String> Tipo_Corte;
    public static volatile SingularAttribute<Servicio, String> Adicionales;

}