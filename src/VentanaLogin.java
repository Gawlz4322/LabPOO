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
        USUARIOS.add(new Usuarios("admin", "1234", "Administrador"));
        USUARIOS.add(new Usuarios("Juanin", "abcd", "Juanin Juan Harry"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(lblClave);
        frame.add(txtClave);
        frame.add(btnIngresar);

        lblUsuario.setBounds(50, 80,300,25);
        txtUsuario.setBounds(50, 120,300,25);
        lblClave.setBounds(50, 160,300,25);
        txtClave.setBounds(50, 200,300,25);
        btnIngresar.setBounds(50, 240,300,25);

    }
    public void mostrarVentana(){
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    private void login(){
        String u = txtUsuario.getText();
        String p = txtClave.getText();
        String nombre = validarCredenciales(String u, String p);
        if (!nombre.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Bienvenido "+ nombre);
            //Ver como llamar VentanaSaludo
        } else{
            JOptionPane.showMessageDialog(frame, "Usuario o clave incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    private String validarCredenciales(String u, String p){
        //TODO
        return "";
    }
    void abrirRegistro(){

    }
}
