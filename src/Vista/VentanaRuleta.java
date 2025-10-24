package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaRuleta {
    private final JFrame frame = new JFrame("Ruleta - Casino Black Cat");
    private final JTextField txtApuesta = new JTextField();
    private final String [] tiposDeApuesta = {"ROJO","NEGRO","PAR","IMPAR"};
    private final JComboBox<String> cboTipo = new JComboBox<>(tiposDeApuesta);
    private final JButton btnGirar = new JButton("Girar");
    private final JTextArea txtResultado = new JTextArea();
    private final JLabel lblSaldo = new JLabel("Saldo: $0");

    public VentanaRuleta() {
        iniciarVentanaRuleta();
        iniciarComponentes();
    }
    private void iniciarVentanaRuleta() {
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    private void iniciarComponentes() {
        JLabel lblApuesta = new JLabel("Monto:");
        lblApuesta.setBounds(30, 50, 50, 30);
        txtApuesta.setBounds(90, 50, 100, 30);
        lblSaldo.setBounds(30, 10, 200, 30);

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
    public void mostrar(){
        frame.setVisible(true); //para que lo llame el controlador
    }
    public JFrame getFrame() { return frame; }
    public JTextField getTxtApuesta() { return txtApuesta; }
    public JComboBox<String> getCboTipo() { return cboTipo; }
    public JButton getBtnGirar() { return btnGirar; }
    public JTextArea getTxtResultado() { return txtResultado; }
    public JLabel getLblSaldo() { return lblSaldo; }
}
