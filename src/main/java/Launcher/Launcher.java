package Launcher;

import Controlador.SessionController;
import Vista.VentanaLoginRuleta;

import javax.swing.*;

import Modelo.IRepositorioResultados;
import Modelo.RepositorioEnMemoria;

public class Launcher {
    static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SessionController session = new SessionController();
            IRepositorioResultados repositorio = new RepositorioEnMemoria();
            try {
                session.registrarUsuario("admin", "1234", "Administrador");
                session.registrarUsuario("Juanin", "abcd", "Juanin Harry");
            }catch(IllegalArgumentException e){
                System.out.println("Advertencia: " + e.getMessage());
            }
            new VentanaLoginRuleta(session, repositorio).mostrarVentana();
        });
    }

}
