package Vista;

import Modelo.Ruleta;
import javax.swing.*;
import java.awt.*;

public class VentanaRuleta {
    private final JFrame frame = new JFrame("Ruleta - Casino Black Cat");
    private final Ruleta ruleta;

    public VentanaRuleta(Ruleta ruleta) {
        this.ruleta = ruleta;
        iniciarVentanaRuleta();
    }
    private void iniciarVentanaRuleta() {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
