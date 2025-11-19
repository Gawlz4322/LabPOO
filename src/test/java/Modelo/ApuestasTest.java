package Modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApuestasTest {

    @Test
    void testApuestaRojo() {
        ApuestaRojo apuesta = new ApuestaRojo(100);
        assertTrue(apuesta.acierta(1, "ROJO"), "Debería acertar si sale rojo");
        assertFalse(apuesta.acierta(2, "NEGRO"), "Debería fallar si sale negro");
        assertFalse(apuesta.acierta(0, "VERDE"), "El 0 es verde por ende debe de perder");
}