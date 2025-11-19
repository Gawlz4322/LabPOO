package Modelo;
import Controlador.*;
import Vista.VentanaMenu;
import Vista.VentanaRuleta;
import Vista.VentanaHistorial;

import javax.swing.JOptionPane;

public class Menu {
    private final VentanaMenu menu;
    private final SessionController session;
    private final IRepositorioResultados repositorio;

    public Menu(VentanaMenu menu, SessionController session, IRepositorioResultados repositorio) {
        this.menu = menu;
        this.session = session;
        this.repositorio = repositorio;
        redireccionador();
    }

    private void redireccionador(){
        menu.getBtnSalir().addActionListener(e -> salirMenu());
        menu.getBtnHistorial().addActionListener(e -> historialVentanas());
        menu.getBtnJugar().addActionListener(e -> jugarRuleta());
        menu.getBtnInicio().addActionListener(e -> mostrarEstadisticas());
    }
    private void mostrarEstadisticas() {
        Estadisticas stats = new Estadisticas(repositorio);
        int totalJugadas = stats.calcularTotalJugadas();
        int victorias = stats.calcularVictorias();
        double porcentaje = stats.calcularPorcentajeVictorias();
        String masJugado = stats.calcularTipoMasJugado();
        int rachaMax = stats.calcularRachaMaxima();

        StringBuilder sb = new StringBuilder();
        sb.append("--- Estadísticas Generales ---\n\n");
        sb.append(String.format("Total de Jugadas: %d\n", totalJugadas));
        sb.append(String.format("Victorias: %d\n", victorias));
        sb.append(String.format("Porcentaje de Victorias: %.2f%%\n", porcentaje));
        sb.append(String.format("Tipo de Apuesta Más Jugado: %s\n", masJugado));
        sb.append(String.format("Racha de Victorias Máxima: %d\n", rachaMax));

        JOptionPane.showMessageDialog(
                menu.getFrame(),
                sb.toString(),
                "Estadísticas del Casino",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void salirMenu(){
        session.cerrarSesion();
        menu.getFrame().dispose();
    }

    private void jugarRuleta(){
        if (!session.hayUsuario()) {
            JOptionPane.showMessageDialog(menu.getFrame(), "Debe iniciar sesión para jugar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        Ruleta modeloRuleta = new Ruleta(repositorio);
        VentanaRuleta vistaRuleta = new VentanaRuleta();
        new RuletaController(modeloRuleta, vistaRuleta, session);
        vistaRuleta.mostrar();
    }
    private void historialVentanas(){
        VentanaHistorial vistaHistorial = new VentanaHistorial();
        new ResultadoController(vistaHistorial, repositorio);
    }
}
