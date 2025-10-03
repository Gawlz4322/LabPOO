package Controlador;

import Modelo.Ruleta;
import Modelo.TipoApuesta;
import Vista.VentanaRuleta;

import javax.swing.*;

public class RuletaController {
    private final SessionController session;
    public Ruleta ruleta;
    public VentanaRuleta ventanaRuleta;

    public RuletaController(Ruleta ruleta, VentanaRuleta vista, SessionController session) {
        this.ruleta = ruleta;
        this.ventanaRuleta = vista;
        this.session = session;
    }

    private void lectorEventos() {

    }

    //private void jugarRuleta(JLabel lblSaldo){
        //try{
            //int monto = Integer.parseInt(txtApuesta.getText());
            //TipoApuesta tipo = (TipoApuesta)cboTipo.getSelectedItem();
            //int numero = ruleta.girar():
            //continuar pero se debe hacer Ruleta primero
        //}
    //}
    public RuletaController(Ruleta ruleta, SessionController session) {
        this.session = session;
    }
}
