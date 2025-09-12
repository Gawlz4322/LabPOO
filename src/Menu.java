import javax.swing.*;
import java.awt.*;

public class Menu {
    private final JFrame frame = new JFrame("Ruleta - Casino Black Cat");
    private final JButton btnInicio = new JButton("Inicio");
    private final JButton btnJugar = new JButton("Jugar");
    private final JButton btnHistorial = new JButton("Historial");
    private final JButton btnSalir = new JButton("Salir");

    public  Menu() {
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        frame.add(btnInicio);
        frame.add(btnJugar);
        frame.add(btnHistorial);
        frame.add(btnSalir);

        btnInicio.setBounds(10,100,80,40);
        btnJugar.setBounds(10,150,80,40);
        btnHistorial.setBounds(10,200,80,40);
        btnSalir.setBounds(10,250,80,40);

        mostrarMenu();
        redireccionador();
    }
    public void mostrarMenu(){
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public void redireccionador(){
        btnSalir.addActionListener(e -> salirMenu());
        btnHistorial.addActionListener(e -> historialVentanas());
        btnJugar.addActionListener(e -> jugarRuleta());
    }
    public void salirMenu(){
        frame.dispose();
    }
    public void jugarRuleta(){
        new Ruleta();
    }
    public void historialVentanas(){
        JOptionPane.showMessageDialog(frame, "Funcionalidad aún no implementada");
    }
}
