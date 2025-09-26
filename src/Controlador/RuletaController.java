package Controlador;

import Modelo.Ruleta;
import Modelo.TipoApuesta;
import Vista.VentanaRuleta;

import javax.swing.*;

public class RuletaController {
    public Ruleta ruleta;
    public VentanaRuleta ventanaRuleta;

    public RuletaController(Ruleta ruleta, VentanaRuleta vista) {
        this.ruleta = ruleta;
        this.ventanaRuleta = vista;
    }
}
