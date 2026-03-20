package model;

public class Usuario {
    String nombre;
    String apellido;
    Integer dni;
    Pulsera pulsera;

    public Usuario(String nombre, String apellido, Integer dni, Pulsera pulsera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pulsera = pulsera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public Pulsera getPulsera() {
        return pulsera;
    }
}
