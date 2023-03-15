package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueño;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {

    DueñoJpaController dueñoJpaController = new DueñoJpaController();
    MascotaJpaController mascotaJpaController = new MascotaJpaController();

    public void guardar(Dueño dueño, Mascota mascota) {
        
        /*Crear en la base de datos el dueño y luego la mascota*/
        dueñoJpaController.create(dueño);
        mascotaJpaController.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpaController.findMascotaEntities();
    }

    public void borrarMascota(int numero_cliente) throws NonexistentEntityException {
        mascotaJpaController.destroy(numero_cliente);
    }

    public Mascota traerMascota(int numero_cliente) {
        return mascotaJpaController.findMascota(numero_cliente);
    }

    public void modificarMascota(Mascota mascota) throws Exception {
        mascotaJpaController.edit(mascota);
    }

    public Dueño traerDueño(int id_dueño) {
        return dueñoJpaController.findDueño(id_dueño);
    }

    public void modificarDueño(Dueño dueño) throws Exception {
        dueñoJpaController.edit(dueño);
    }
    
}
