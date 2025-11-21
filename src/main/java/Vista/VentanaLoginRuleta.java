package Vista;

import Controlador.SessionController;
import javax.swing.*;
import Modelo.IRepositorioResultados;
import Modelo.Menu;
import Controlador.RegistroController;

public class VentanaLoginRuleta {
    private final SessionController session;
    private final IRepositorioResultados repositorio;

    private final JFrame frame = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnIngresar = new JButton("Ingresar");
    private final JButton btnRegistrar = new JButton("Registrar");

    public  VentanaLoginRuleta(SessionController session, IRepositorioResultados repositorio) {
        this.session = session;
        this.repositorio = repositorio;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);

        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(lblClave);
        frame.add(txtClave);
        frame.add(btnIngresar);
        frame.add(btnRegistrar);

        lblUsuario.setBounds(50, 80,300,25);
        txtUsuario.setBounds(50, 120,300,25);
        lblClave.setBounds(50, 160,300,25);
        txtClave.setBounds(50, 200,300,25);
        btnIngresar.setBounds(50, 240,300,25);
        btnRegistrar.setBounds(50, 280,300,25);

        btnIngresar.addActionListener(e -> login());
        btnRegistrar.addActionListener(e -> abrirRegistro());
    }
    public void mostrarVentana(){
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    private void login(){
        String u = txtUsuario.getText();
        String p = new String(txtClave.getPassword());
        if (session.iniciarSesion(u,p)) {
            JOptionPane.showMessageDialog(frame, "Bienvenido " + session.getNombreUsuario());
            frame.dispose();
            VentanaMenu vistaMenu = new VentanaMenu();
            new Menu(vistaMenu, session, repositorio);
            vistaMenu.mostrarMenu(session.getNombreUsuario());
        } else{
            JOptionPane.showMessageDialog(frame, "Usuario o clave incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void abrirRegistro() {
        VentanaRegistro vRegistro = new VentanaRegistro();
        new RegistroController(vRegistro, session);
        vRegistro.mostrar();
    }
}
