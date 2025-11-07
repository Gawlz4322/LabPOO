package Modelo;

import java.util.List;

public class RepositorioArchivo implements  IRepositorioResultados {

	private static final String NOMBRE_ARCHIVO = "historial_ruleta.csv";

    @Override
    public void guardarResultados(Resultado resultado) {

    }

    @Override
    public List<Resultado> obtenerHistorial() {
        return List.of();
    }
}