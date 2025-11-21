package Vista;

import javax.swing.*;

public class VentanaRegistro {
    private final JFrame frame = new JFrame("Registro - Casino Black Cat");
    private final JLabel lblNombre = new JLabel("Nombre Completo:");
    private final JTextField txtNombre = new JTextField();
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnRegistrar = new JButton("Registrar");
    private final JButton btnCancelar = new JButton("Cancelar");

    public VentanaRegistro() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        lblNombre.setBounds(50, 30, 300, 25);
        txtNombre.setBounds(50, 60, 300, 25);

        lblUsuario.setBounds(50, 100, 300, 25);
        txtUsuario.setBounds(50, 130, 300, 25);

        lblClave.setBounds(50, 170, 300, 25);
        txtClave.setBounds(50, 200, 300, 25);

        btnRegistrar.setBounds(50, 260, 140, 30);
        btnCancelar.setBounds(210, 260, 140, 30);

        frame.add(lblNombre);
        frame.add(txtNombre);
        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(lblClave);
        frame.add(txtClave);
        frame.add(btnRegistrar);
        frame.add(btnCancelar);
    }
}