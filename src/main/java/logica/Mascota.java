package logica;

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
    private int id_mascota;
    private String nombre;
    private String color;
    private String raza;
    private String atenEspecial;
    private String observaciones;
    private String edad;
    @OneToOne
    private Duenio id_duenio;

    public Mascota() {
    }

    public Mascota(int id_mascota, String nombre, String color, String raza, String atenEspecial, String observaciones, String edad, Duenio id_duenio) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.atenEspecial = atenEspecial;
        this.observaciones = observaciones;
        this.edad = edad;
        this.id_duenio = id_duenio;
    }

    Mascota(int idMascota, String mascotaNombre, String mascotaColor, String mascotaRaza, String mascotaObservaciones, String mascotaAEspecial, String mascotaEdad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAtenEspecial() {
        return atenEspecial;
    }

    public void setAtenEspecial(String atenEspecial) {
        this.atenEspecial = atenEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Duenio getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(Duenio id_duenio) {
        this.id_duenio = id_duenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id_mascota=" + id_mascota + ", nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", atenEspecial=" + atenEspecial + ", observaciones=" + observaciones + ", edad=" + edad + ", id_duenio=" + id_duenio + '}';
    }
    
    
    
}
