import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaSaludo extends JFrame {
    private final JTextField campoTexto;
    private final JButton botonSaludar;
    private final JButton botonLimpiar;
    private final JLabel etiquetaSaludo;


    public VentanaSaludo() {
        super(" App de Saludo ICC490 ");
        setSize(500 , 350);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );
        setLayout( null );

        getContentPane().setBackground(new Color(150, 170, 190));

        campoTexto = new JTextField () ;
        campoTexto.setBounds (50 , 50 , 200 , 25);
        campoTexto.setFont(new Font ("Arial", Font.BOLD, 20));

        botonSaludar = new JButton (" Saludar ");
        campoTexto.setFont(new Font ("Arial", Font.BOLD, 15));
        botonSaludar.setBounds(270,50 ,100,25);
        botonSaludar.setFont(new Font ("Arial", Font.BOLD, 15));

        etiquetaSaludo = new JLabel ("") ;
        etiquetaSaludo.setBounds(50,80,300,25);
        etiquetaSaludo.setFont(new Font ("Arial", Font.BOLD, 15));

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(270, 80, 100, 25);
        botonLimpiar.setFont(new Font ("Arial", Font.BOLD, 15));

        add(campoTexto);
        add(botonSaludar);
        add(etiquetaSaludo);
        add(botonLimpiar);

        initListeners();

        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void saludar() {
        String nombre = campoTexto.getText();
        if (nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa tu nombre.");
        } else {
            Usuario usuario = new Usuario(nombre.trim());
            etiquetaSaludo.setText(usuario.getSaludo());
        }
    }
    private void initListeners() {
        botonSaludar.addActionListener(e -> saludar());
        botonLimpiar.addActionListener(e -> limpiar());
        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick();
                }
            }
        });
    }
    private void limpiar() {
        campoTexto.setText("");
        etiquetaSaludo.setText("");
        campoTexto.requestFocus();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaSaludo::new);
    }


}
