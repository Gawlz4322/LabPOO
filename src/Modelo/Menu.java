package Modelo;

import Vista.VentanaMenu;
import javax.swing.*;

public class Menu {
    private final VentanaMenu menu;

    public Menu(){
        menu = new VentanaMenu();
        redireccionador();
    }

    private void redireccionador(){
        menu.getBtnSalir().addActionListener(e -> salirMenu());
        menu.getBtnHistorial().addActionListener(e -> historialVentanas());
        menu.getBtnJugar().addActionListener(e -> jugarRuleta());
    }

    private void salirMenu(){
        menu.getFrame().dispose();
    }

    private void jugarRuleta(){
        new Ruleta();
    }

    private void historialVentanas(){
        JOptionPane.showMessageDialog(menu.getFrame(), "Funcionalidad aún no implementada");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Menu::new);
    }
}
