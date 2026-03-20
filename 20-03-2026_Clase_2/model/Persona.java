package model;

import interfaces.I_Persona;

public class Persona implements I_Persona {
    private String nombre;
    private Integer dni;
    private String fechaNacimiento;
    private String genero;
    private String nacionalidad;

    public Persona(String nombre, Integer dni, String fechaNacimiento, String genero, String nacionalidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getDNI() {
        return dni;
    }

    @Override
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", genero='" + genero + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
