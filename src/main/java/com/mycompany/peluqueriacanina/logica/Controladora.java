package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void guardar(String nombre, String raza, String color, String observaciones, 
            String alergico, String atencion, String nombreDueño, String celularDueño) {
        
        /*Creamos el dueño y asignamos valores*/
        Dueño dueño = new Dueño();
        dueño.setNombre(nombreDueño);
        dueño.setCelular_dueño(celularDueño);
        
        /*Creamos la mascota y asignamos valores*/
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencion);
        mascota.setObservaciones(observaciones);
        mascota.setDueño(dueño);
        
        controladoraPersistencia.guardar(dueño,mascota);
    }

    public List<Mascota> traerMascotas() {
        return controladoraPersistencia.traerMascotas();
    }

    public void borrarMascota(int numero_cliente) throws NonexistentEntityException {
        controladoraPersistencia.borrarMascota(numero_cliente);
    }

    public Mascota traerMascota(int numero_cliente) {
        return controladoraPersistencia.traerMascota(numero_cliente);
    }

    public void modificarMascota(Mascota mascota, String nombre, String color, String raza, String alergico, String atencion, String observaciones, String nombreDueño, String celularDueño) throws Exception {
        mascota.setNombre(nombre);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencion);
        mascota.setObservaciones(observaciones);
        
        /*MOfico mascota*/
        controladoraPersistencia.modificarMascota(mascota);
        
        /*Seteo valores del dueño*/
        Dueño dueño = this.buscarDueño(mascota.getDueño().getId_dueño());
        dueño.setNombre(nombreDueño);
        dueño.setCelular_dueño(celularDueño);
        
        /*Llamar a modificarDueño()*/
        this.modificarDueño(dueño);
    }

    private Dueño buscarDueño(int id_dueño) {
        return controladoraPersistencia.traerDueño(id_dueño);
    }

    private void modificarDueño(Dueño dueño) throws Exception {
        controladoraPersistencia.modificarDueño(dueño);
    }
}
