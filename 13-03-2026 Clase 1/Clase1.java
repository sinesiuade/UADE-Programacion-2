public class Clase1 {
    /*
     * Este es el típico hola mundo que usamos cuando comenzamos un nuevo lenguaje
     */
    public static void main(String[] args) {
        // Salida por terminal o consola de un texto
        Print.println("Hello, Word!");

        String nombre;

        nombre = Input.inputStrTexto("Ingrese su nombre: ");
        Print.println("Hola " + nombre);

        int numero;
        do {
            numero = Input.inputIntTexto("Ingrese un numero (0 para salir): ");
            Print.println("El numero ingresado es: " + numero);
        } while (numero != 0);
    }
}
