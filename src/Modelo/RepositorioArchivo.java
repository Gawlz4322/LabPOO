package Modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RepositorioArchivo implements  IRepositorioResultados {

	private static final String NOMBRE_ARCHIVO = "historial_ruleta.csv";

    @Override
    public void guardarResultados(Resultado resultado) {
        String linea = String.format("%d,%d,%b,%s,%s%n",
                resultado.getNumeroGanador(),
                resultado.getMontoApostado(),
                resultado.isAcierto(),
                resultado.getTipoApuesta(),
                resultado.getFechaHora().toString());
        try (FileWriter fw = new FileWriter(NOMBRE_ARCHIVO, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(linea);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de historial: " + e.getMessage());
        }
    }

    @Override
    public List<Resultado> obtenerHistorial() {
        return List.of();
    }
}