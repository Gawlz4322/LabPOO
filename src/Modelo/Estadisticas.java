package Modelo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estadisticas {
    private final IRepositorioResultados repositorio;
    public Estadisticas(IRepositorioResultados repositorio) {
        this.repositorio = repositorio;
    }
    public int calcularTotalJugadas() {
        List<Resultado> historial = repositorio.obtenerHistorial();
        return historial.size();
    }

    public int calcularVictorias() {
        List<Resultado> historial = repositorio.obtenerHistorial();
        if (historial == null || historial.isEmpty()) {
            return 0;
        }
        return (int) historial.stream()
                .filter(Resultado::isAcierto)
                .count();
    }
    public double calcularPorcentajeVictorias() {
        int total = calcularTotalJugadas();
        if (total == 0) {
            return 0.0;
        }
        int victorias = calcularVictorias();
        return ((double) victorias / total) * 100.0;
    }

    public String calcularTipoMasJugado() {
        List<Resultado> historial = repositorio.obtenerHistorial();
        if (historial == null || historial.isEmpty()) {
            return "";
        }
        Map<String, Long> conteo = historial.stream()
                .collect(Collectors.groupingBy(
                        Resultado::getTipoApuesta,
                        Collectors.counting()
                ));

        return conteo.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }
    public int calcularRachaMaxima() {
        List<Resultado> historial = repositorio.obtenerHistorial();
        if (historial == null || historial.isEmpty()) return 0;
        int rachaActual = 0;
        int rachaMaxima = 0;
        for (Resultado r : historial) {
            if (r.isAcierto()) {
                rachaActual++;
            } else {
                if (rachaActual > rachaMaxima) {
                    rachaMaxima = rachaActual;
                }
                rachaActual = 0;
            }
        }
        if (rachaActual > rachaMaxima) {
            rachaMaxima = rachaActual;
        }
        return rachaMaxima;
    }
}