package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int numero_cliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    @OneToOne
    private Dueño dueño;

    public Mascota() {
    }

    public Mascota(int numero_cliente, String nombre, String raza, String color, String alergico, String atencion_especial, String observaciones, Dueño dueño) {
        this.numero_cliente = numero_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.dueño = dueño;
    }

    public int getNumero_cliente() {
        return numero_cliente;
    }

    public void setNumero_cliente(int numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mascota{");
        sb.append("numero_cliente=").append(numero_cliente);
        sb.append(", nombre=").append(nombre);
        sb.append(", raza=").append(raza);
        sb.append(", color=").append(color);
        sb.append(", alergico=").append(alergico);
        sb.append(", atencion_especial=").append(atencion_especial);
        sb.append(", observaciones=").append(observaciones);
        sb.append(", due\u00f1o=").append(dueño);
        sb.append('}');
        return sb.toString();
    }
    
}
