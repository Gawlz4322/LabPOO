package Vista;

import Modelo.Resultado;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VentanaHistorial {
    private JFrame frame;
    private JTextArea txtHistorial;

    public VentanaHistorial() {
        frame = new JFrame("Historial de Jugadas");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        txtHistorial = new JTextArea();
        txtHistorial.setEditable(false);
        txtHistorial.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(txtHistorial);
        frame.add(scrollPane, BorderLayout.CENTER);
    }
}