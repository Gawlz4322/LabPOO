package Modelo;

import java.util.Collections;
import java.util.List;

public class RepositorioEnMemoria implements IRepositorioResultados {

	private List<Resultado> historial;

    @Override
    public void guardarResultados(Resultado resultado) {
        historial.add(resultado);
    }

    @Override
    public List<Resultado> obtenerHistorial() {
        return Collections.unmodifiableList(historial);
    }
}