package Vista;

import Modelo.Menu;
import Modelo.Usuario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaLoginRuleta {    public static final List<Usuario> USUARIOS = new ArrayList<>();

    private final JFrame frame = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnIngresar = new JButton("Ingresar");

    public  VentanaLoginRuleta() {
        USUARIOS.add(new Usuario("admin", "1234", "Administrador"));
        USUARIOS.add(new Usuario("Juanin", "abcd", "Juanin Juan Harry"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);

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

        btnIngresar.addActionListener(e -> login());

        mostrarVentana();

    }
    public void mostrarVentana(){
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    private void login(){
        String u = txtUsuario.getText();
        String p = new String(txtClave.getPassword());
        String nombre = validarCredenciales(u, p);
        if (!nombre.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Bienvenido "+ nombre);
            new Menu();
        } else{
            JOptionPane.showMessageDialog(frame, "Modelo.Usuario o clave incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    private String validarCredenciales(String u, String p){
        for (Usuario usuarios : USUARIOS){
            if(usuarios.validarCredenciales(u,p)){
                return usuarios.getNombre();
            }
        }
        return "";
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaLoginRuleta::new);
    }
}
