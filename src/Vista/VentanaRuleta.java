package Vista;

import Modelo.Ruleta;
import Modelo.TipoApuesta;

import javax.swing.*;
import java.awt.*;

public class VentanaRuleta {
    private final JFrame frame = new JFrame("Ruleta - Casino Black Cat");
    private final JTextField txtApuesta = new JTextField();
    private final JComboBox<TipoApuesta> cboTipo = new JComboBox<>(TipoApuesta.values());
    private final JButton btnGirar = new JButton("Girar");
    private final JTextArea txtResultado = new JTextArea();

    public VentanaRuleta() {
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
    private void iniciarBotones(){
        Ruleta ruleta = null;
        //temporal, ver como arreglar
        JLabel lblSaldo = new JLabel("Saldo: $" + ruleta.getSaldo());
        lblSaldo.setBounds(30, 10, 200, 30);

        JLabel lblApuesta = new JLabel("Monto:");
        lblApuesta.setBounds(30, 50, 50, 30);
        txtApuesta.setBounds(90, 50, 100, 30);

        cboTipo.setBounds(210, 50, 100, 30);
        btnGirar.setBounds(330, 50, 100, 30);

        txtResultado.setBounds(30, 100, 400, 200);
        txtResultado.setEditable(false);

        frame.add(lblSaldo);
        frame.add(lblApuesta);
        frame.add(txtApuesta);
        frame.add(cboTipo);
        frame.add(btnGirar);
        frame.add(txtResultado);

    }
}
