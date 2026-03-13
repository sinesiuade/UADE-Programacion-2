import java.util.Scanner;

public class Clase1 {
    /*
     * Este es el típico hola mundo que usamos cuando comenzamos un nuevo lenguaje
     */
    public static void main(String[] args) {
        // Salida por terminal o consola de un texto
        System.out.println("Hello, Word!");

        Scanner entrada = new Scanner(System.in);

        String nombre;

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);
    }
}