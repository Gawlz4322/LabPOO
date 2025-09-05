import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaLogin {
    public static final List<Usuarios> USUARIOS = new ArrayList<>();

    private final JFrame frame = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnIngresar = new JButton("Ingresar");

    public  VentanaLogin() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mostrarVentana(){

    }
    private void login(){

    }
    private String validarCredenciales(String u, String p){
        //TODO
        return "";
    }
    void abrirRegistro(){

    }
}
