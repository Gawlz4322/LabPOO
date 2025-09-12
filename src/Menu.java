import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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

        btnInicio.setBounds(10,100,100,50);
        btnJugar.setBounds(100,150,100,50);
        btnHistorial.setBounds(100,200,100,50);
        btnSalir.setBounds(100,250,100,50);

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

    }
    public void historialVentanas(){
        JOptionPane.showMessageDialog(frame, "Funcionalidad aún no implementada");
    }
}
