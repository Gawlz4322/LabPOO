package Modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testConstructorRechazaSaldoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("juan", "1234", "Juan Perez", -100.0);
        });
        assertEquals("Saldo inicial inválido", exception.getMessage());
    }
    @Test
    void testDepositoValido() {
        Usuario usuario = new Usuario("juan", "1234", "Juan Perez", 1000.0);
        usuario.cargarSaldo(500.0);
        assertEquals(1500.0, usuario.getSaldo(), "El saldo debería sumar el depósito");
    }
}