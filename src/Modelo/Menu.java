package Modelo;
import Controlador.RuletaController;
import Controlador.SessionController;
import Vista.VentanaMenu;
import Vista.VentanaRuleta;
import javax.swing.*;

public class Menu {
    private final VentanaMenu menu;
    private final SessionController session;

    public Menu(VentanaMenu menu, SessionController session) {
        this.menu = menu;
        this.session = session;
        redireccionador();
    }

    private void redireccionador(){
        menu.getBtnSalir().addActionListener(e -> salirMenu());
        menu.getBtnHistorial().addActionListener(e -> historialVentanas());
        menu.getBtnJugar().addActionListener(e -> jugarRuleta());
    }

    private void salirMenu(){
        session.cerrarSesion();
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
