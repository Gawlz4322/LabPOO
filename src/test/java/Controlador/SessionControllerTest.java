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
    @Test
    void testManejoDeNulos() {
        SessionController session = new SessionController();

        boolean resultadoLogin = session.iniciarSesion(null, "123");
        assertFalse(resultadoLogin, "Login con username null debe retornar false");

        assertThrows(IllegalArgumentException.class, () -> {
            session.registrarUsuario(null, "123", "Fantasma");
        }, "Registrar username null debe lanzar excepción");
    }
}