import model.*;

public class Main {
    public static void main(String[] args) {
        Festival festival = new Festival();

        Pulsera pulsera_u1 = new Pulsera("VIP");
        Usuario usuario1 = new Usuario("Dante", "Sinesi", 12345678, pulsera_u1);

        festival.registrarUsuario(usuario1);
        festival.registrarPulsera(pulsera_u1);

        // Usuario accede al festival
        festival.registrarAcceso(usuario1);

        System.out.println(festival.tieneAcceso(usuario1));

        // Usuario egresa del festival
        festival.registrarEgreso(usuario1);

        System.out.println(festival.tieneEgreso(usuario1));

        // Usuario intenta acceder al festival nuevamente
        festival.registrarAcceso(usuario1);
    }
}
