import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final JFrame frame = new JFrame("Ruleta - Casino Black Cat");
    private final JButton btnInicio = new JButton("Inicio");
    private final JButton btnJugar = new JButton("Jugar");
    private final JButton btnHistorial = new JButton("Historial");

    public  Menu() {
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        frame.add(btnInicio);
        frame.add(btnJugar);
        frame.add(btnHistorial);
    }
}
