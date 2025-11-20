package Controlador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SessionControllerTest {

    @Test
    void testLoginUsuarioNoRegistrado() {
        SessionController session = new SessionController();
        session.registrarUsuario("juan", "123", "Juan Perez");

        boolean resultado = session.iniciarSesion("pedro", "123");

        assertFalse(resultado, "El login debería fallar para usuarios inexistentes");
        assertFalse(session.hayUsuario(), "No debería haber usuario en sesión");
    }
}