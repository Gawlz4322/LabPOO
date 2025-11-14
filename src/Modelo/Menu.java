package Modelo;
import Controlador.RuletaController;
import Controlador.SessionController;
import Vista.VentanaMenu;
import Vista.VentanaRuleta;
import javax.swing.*;
import Modelo.IRepositorioResultados;
import Modelo.RepositorioEnMemoria;
import Modelo.RepositorioArchivo;
import Modelo.Resultado;
import Vista.VentanaHistorial;
import java.util.List;

public class Menu {
    private final VentanaMenu menu;
    private final SessionController session;
    private final IRepositorioResultados repo = new RepositorioEnMemoria();

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
        if (!session.hayUsuario()) {
            JOptionPane.showMessageDialog(menu.getFrame(), "Debe iniciar sesión para jugar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        Ruleta modeloRuleta = new Ruleta(repo);
        VentanaRuleta vistaRuleta = new VentanaRuleta();
        new RuletaController(modeloRuleta, vistaRuleta, session);
        vistaRuleta.mostrar();
    }
    private void historialVentanas(){
        List<Resultado> historial = repo.obtenerHistorial();
        VentanaHistorial vistaHistorial = new VentanaHistorial();
        vistaHistorial.mostrarHistorial(historial);
    }
}
