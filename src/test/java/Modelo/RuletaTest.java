package Modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RuletaTest {

    @Test
    void testApuestaNula() {
        IRepositorioResultados repo = new RepositorioEnMemoria();
        Ruleta ruleta = new Ruleta(repo);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ruleta.evaluarResultado(10, null);
        });
        assertEquals("Apuesta requerida", exception.getMessage());
    }
}