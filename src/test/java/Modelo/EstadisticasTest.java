package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstadisticasTest {

    @Test
    void testCalculosEstadisticos() {
        IRepositorioResultados repo = new RepositorioEnMemoria();
        repo.guardarResultados(new Resultado(1, 100, true, "ROJO"));
        repo.guardarResultados(new Resultado(3, 100, true, "ROJO"));
        // Pierde racha
        repo.guardarResultados(new Resultado(2, 100, false, "NEGRO"));
        // Gana y tiene nueva racha
        repo.guardarResultados(new Resultado(5, 100, true, "ROJO"));
        Estadisticas stats = new Estadisticas(repo);

        assertEquals(4, stats.calcularTotalJugadas(), "Total de jugadas");
        assertEquals(3, stats.calcularVictorias(), "Total de victorias");
        assertEquals(75.0, stats.calcularPorcentajeVictorias(), 0.01, "Porcentaje (3 de 4 = 75%)");

        assertEquals("ROJO", stats.calcularTipoMasJugado(), "Tipo más frecuente");
        assertEquals(2, stats.calcularRachaMaxima(), "Racha máxima de victorias");
    }
}