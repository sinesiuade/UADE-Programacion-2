public class Clase1 {
    /*
     * Este es el típico hola mundo que usamos cuando comenzamos un nuevo lenguaje
     */
    public static void main(String[] args) {
        // Salida por terminal o consola de un texto
        System.out.println("Hello, Word!");

        String nombre;

        nombre = Input.inputStrTexto("Ingrese su nombre: ");
        System.out.println("Hola " + nombre);

        int numero;
        do {
            numero = Input.inputIntTexto("Ingrese un numero (0 para salir): ");
            System.out.println("El numero ingresado es: " + numero);
        } while (numero != 0);
    }
}
