import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaSaludo extends JFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame (" App de Saludo ICC490 ");
        ventana.setSize (500 , 350);
        ventana.setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        ventana.setLayout ( null ) ;

        ventana.getContentPane().setBackground(new Color(150, 170, 190));

        JTextField campoTexto = new JTextField () ;
        campoTexto.setBounds (50 , 50 , 200 , 25);
        JButton botonSaludar = new JButton (" Saludar ");
        campoTexto.setFont(new Font("Roboto", Font.BOLD, 15));

        botonSaludar.setBounds(270,50 ,100,25);
        botonSaludar.setFont (new Font("Roboto", Font.BOLD, 15));

        JLabel etiquetaSaludo = new JLabel ("") ;
        etiquetaSaludo.setBounds(50,80,300,25);
        etiquetaSaludo.setFont(new Font("Roboto", Font.BOLD, 15));

        botonSaludar . addActionListener ( e -> {
            String nombre = campoTexto.getText();
            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa tu nombre.");
            } else {
                etiquetaSaludo.setText("Hola: " + nombre);
            }
        });
        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick();
                }
            }
        });
        ventana.add(campoTexto);
        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);


    }


}
