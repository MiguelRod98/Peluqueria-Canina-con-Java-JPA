package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueño implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_dueño;
    private String nombre;
    private String celular_dueño;

    public Dueño() {
    }

    public Dueño(int id_dueño, String nombre, String celular_dueño) {
        this.id_dueño = id_dueño;
        this.nombre = nombre;
        this.celular_dueño = celular_dueño;
    }

    public int getId_dueño() {
        return id_dueño;
    }

    public void setId_dueño(int id_dueño) {
        this.id_dueño = id_dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular_dueño() {
        return celular_dueño;
    }

    public void setCelular_dueño(String celular_dueño) {
        this.celular_dueño = celular_dueño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Due\u00f1o{");
        sb.append("id_due\u00f1o=").append(id_dueño);
        sb.append(", nombre=").append(nombre);
        sb.append(", celular_due\u00f1o=").append(celular_dueño);
        sb.append('}');
        return sb.toString();
    }
    
}
