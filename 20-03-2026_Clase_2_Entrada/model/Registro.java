package model;

import java.util.*;

public class Registro {
    ArrayList<Pulsera> accesos = new ArrayList<>();
    ArrayList<Pulsera> egresos = new ArrayList<>();

    public void agregarAcceso(Pulsera pulsera) {
        if (tieneAcceso(pulsera)) {
            System.out.println("El usuario ya tiene acceso");
        } else if (tieneEgreso(pulsera)) {
            System.out.println("El usuario ya egresó, no puede volver a ingresar");
        } else {
            accesos.add(pulsera);
        }
    }

    public void agregarEgreso(Pulsera pulsera) {
        egresos.add(pulsera);
    }

    public Boolean tieneAcceso(Pulsera pulsera) {
        return accesos.contains(pulsera);
    }

    public Boolean tieneEgreso(Pulsera pulsera) {
        return egresos.contains(pulsera);
    }
}
