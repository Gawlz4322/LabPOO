package Controlador;
import Vista.VentanaRegistro;
import javax.swing.JOptionPane;

public class RegistroController {
    private final VentanaRegistro vista;
    private final SessionController session;

    public RegistroController(VentanaRegistro vista, SessionController session) {
        this.vista = vista;
        this.session = session;
    }
}
