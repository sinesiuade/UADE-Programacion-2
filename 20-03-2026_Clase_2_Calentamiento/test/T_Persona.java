package test;

public class T_Persona {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        model.Persona persona = new model.Persona("Juan Pérez", 123456789, "01/01/1990", "Masculino", "Argentina");

        // Imprimir los detalles de la persona utilizando el método toString
        System.out.println(persona.toString());

        // Imprimir cada atributo individualmente utilizando los métodos get
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("DNI: " + persona.getDNI());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Nacionalidad: " + persona.getNacionalidad());
    }
}
