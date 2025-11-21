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
    private void initController() {
        vista.getBtnRegistrar().addActionListener(e -> registrar());
        vista.getBtnCancelar().addActionListener(e -> vista.cerrar());
    }
    private void registrar() {
        try {
            String nombre = vista.getNombre();
            String usuario = vista.getUsuario();
            String clave = vista.getClave();
            session.registrarUsuario(usuario, clave, nombre);

            JOptionPane.showMessageDialog(vista.getFrame(), "¡Usuario registrado con éxito!", "Registro", JOptionPane.INFORMATION_MESSAGE);
            vista.cerrar();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(vista.getFrame(), ex.getMessage(), "Error de Registro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
