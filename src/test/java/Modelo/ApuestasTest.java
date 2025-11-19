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
    @Test
    void testApuestaNegro() {
        ApuestaNegro apuesta = new ApuestaNegro(100);
        assertTrue(apuesta.acierta(2, "NEGRO"), "Debería acertar si sale Negro");
        assertFalse(apuesta.acierta(1, "ROJO"), "Debería fallar si sale Rojo");
    }
    @Test
    void testApuestaPar() {
        ApuestaPar apuesta = new ApuestaPar(100);
        assertTrue(apuesta.acierta(2, "NEGRO"), "2 es par, debería ganar");
        assertFalse(apuesta.acierta(1, "ROJO"), "1 es impar, debería perder");
        assertFalse(apuesta.acierta(0, "VERDE"), "El 0 no paga par en la ruleta");
    }
    @Test
    void testApuestaImpar() {
        ApuestaImpar apuesta = new ApuestaImpar(100);
        assertTrue(apuesta.acierta(1, "ROJO"), "1 es impar, debería ganar");
        assertFalse(apuesta.acierta(2, "NEGRO"), "2 es par, debería perder");
    }
}