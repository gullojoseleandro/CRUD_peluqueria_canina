package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Duenio;
import logica.Mascota;
import persistence.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    private DuenioJpaController duenioJpa = new DuenioJpaController();
    private MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        //Creo el dueño en la BD
        duenioJpa.create(duenio);
        
        //Creo mascota en la BD
        mascotaJpa.create(mascota);
    }



    public List<Mascota> traerMascota() {
        return mascotaJpa.findMascotaEntities();
    }

    public void eliminarMascota(int id_mascota){
        try {
            mascotaJpa.destroy(id_mascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void editarDatos(Mascota mascota, Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
