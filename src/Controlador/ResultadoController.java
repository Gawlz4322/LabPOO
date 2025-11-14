package Controlador;

import Modelo.IRepositorioResultados;
import Modelo.Resultado;
import Vista.VentanaHistorial;
import java.util.List;

public class ResultadoController {

    private final VentanaHistorial vista;
    private final IRepositorioResultados repositorio;

    public ResultadoController(VentanaHistorial vista, IRepositorioResultados repositorio) {
        this.vista = vista;
        this.repositorio = repositorio;
        List<Resultado> historial = this.repositorio.obtenerHistorial();
        this.vista.mostrarHistorial(historial);
    }
}