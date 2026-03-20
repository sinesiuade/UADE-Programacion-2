package model;

import java.util.*;

public class Festival {
    Registro registro = new Registro();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Pulsera> pulseras = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarPulsera(Pulsera pulsera) {
        pulseras.add(pulsera);
    }

    public void registrarAcceso(Usuario usuario) {
        registro.agregarAcceso(usuario.getPulsera());
    }

    public void registrarEgreso(Usuario usuario) {
        registro.agregarEgreso(usuario.getPulsera());
    }

    public Boolean tieneAcceso(Usuario usuario) {
        return registro.tieneAcceso(usuario.getPulsera());
    }

    public Boolean tieneEgreso(Usuario usuario) {
        return registro.tieneEgreso(usuario.getPulsera());
    }
}