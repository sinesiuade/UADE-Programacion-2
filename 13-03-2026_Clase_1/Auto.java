public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int años;

    public Auto(String marca, String modelo, String color, int años) { // Constructor
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.años = años;
    }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Años: " + años;
    }
}
