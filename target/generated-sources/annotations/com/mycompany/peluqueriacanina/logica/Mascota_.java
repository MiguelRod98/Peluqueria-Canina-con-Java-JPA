package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Dueño;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-15T13:33:25")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, Dueño> dueño;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, String> atencion_especial;
    public static volatile SingularAttribute<Mascota, String> nombre;
    public static volatile SingularAttribute<Mascota, Integer> numero_cliente;

}