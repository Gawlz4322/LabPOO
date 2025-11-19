package Launcher;

import Controlador.SessionController;
import Vista.VentanaLoginRuleta;
import javax.swing.SwingUtilities;
import Modelo.IRepositorioResultados;
import Modelo.RepositorioEnMemoria;

public class Launcher {
    static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SessionController session = new SessionController();
            session.registrarUsuario("admin", "1234", "Administrador");
            session.registrarUsuario("Juanin", "abcd", "Juanin Harry");
            IRepositorioResultados repositorio = new RepositorioEnMemoria();
            new VentanaLoginRuleta(session, repositorio).mostrarVentana();
        });
    }

}
