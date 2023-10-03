package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    private ControladoraPersistencia control = new ControladoraPersistencia();

    public void guardar(String mascotaNombre, String mascotaColor, String mascotaRaza, String mascotaObservaciones, String mascotaAEspecial, String mascotaEdad, String duenioNombre, String duenioTel) {
        //Carga a BD duenio
        Duenio duenio = new Duenio();
        duenio.setNombre(duenioNombre);
        duenio.setTelefono(duenioTel);
        
        //Carga a BD mascota
        Mascota mascota = new Mascota();
        mascota.setNombre(duenioNombre);
        mascota.setColor(mascotaColor);
        mascota.setEdad(mascotaEdad);
        mascota.setRaza(mascotaRaza);
        mascota.setAtenEspecial(mascotaAEspecial);
        mascota.setObservaciones(mascotaObservaciones);
        mascota.setId_duenio(duenio);
        
        control.guardar(duenio, mascota);
    }

    public List<Mascota> cargarDatosMascotas() {
        return control.traerMascota();
    }


    public void eliminarFila(int id_mascota){
        control.eliminarMascota(id_mascota);
    }


    public void editar(int idMascota, String mascotaNombre, String mascotaColor, String mascotaRaza, String mascotaObservaciones, String mascotaAEspecial, String mascotaEdad, String duenioNombre, String duenioTel) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(duenioNombre);
        duenio.setTelefono(duenioTel);        
        
        Mascota mascota = new Mascota();
        mascota.setId_mascota(idMascota);
        mascota.setNombre(duenioNombre);
        mascota.setColor(mascotaColor);
        mascota.setEdad(mascotaEdad);
        mascota.setRaza(mascotaRaza);
        mascota.setAtenEspecial(mascotaAEspecial);
        mascota.setObservaciones(mascotaObservaciones);
        mascota.setId_duenio(duenio);
        
        control.editarDatos(mascota, duenio);
    }


    



    
    
    
}
