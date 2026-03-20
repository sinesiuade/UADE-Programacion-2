package model;

public class Festival {
    public static void main(String[] args) {
        Registro acceso = new Registro();

        Pulsera pulsera_u1 = new Pulsera("VIP");
        Usuario usuario1 = new Usuario("Dante", "Sinesi", 12345678, pulsera_u1);

        acceso.agregarAcceso(usuario1.getPulsera());

        System.out.println(acceso.tieneAcceso(usuario1.getPulsera()));

        System.out.println(acceso.tieneEgreso(usuario1.getPulsera()));

        acceso.agregarEgreso(usuario1.getPulsera());

        System.out.println(acceso.tieneEgreso(usuario1.getPulsera()));

        acceso.agregarAcceso(usuario1.getPulsera());
    }
}
