package Modelo;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
        List<Resultado> historial = new ArrayList<>();
        File archivo = new File(NOMBRE_ARCHIVO);

        if (!archivo.exists()) {
            return historial;
        }
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    try {
                        int num = Integer.parseInt(partes[0]);
                        int monto = Integer.parseInt(partes[1]);
                        boolean acierto = Boolean.parseBoolean(partes[2]);
                        String tipo = partes[3];
                        LocalDateTime fechaHora = LocalDateTime.parse(partes[4]);
                        Resultado resultado = new Resultado(num, monto, acierto, tipo);
                        historial.add(resultado);
                    } catch (Exception e) {
                        System.err.println("Error al parsear línea de historial: " + linea + " | Error: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de historial: " + e.getMessage());
        }
        return historial;
    }
}