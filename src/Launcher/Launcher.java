package Launcher;

import Controlador.RuletaController;
import Modelo.Ruleta;
import Vista.VentanaRuleta;

public class Launcher {
    public static void main(String[] args) {
        Ruleta modelo = new Ruleta(1000);
        VentanaRuleta vista = new VentanaRuleta();
        new RuletaController(modelo, vista);
    }
}
