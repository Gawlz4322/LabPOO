package Controlador;

import Modelo.Usuario;
import java.util.HashMap;
import java.util.Map;

public class SessionController {
    private Map<String, Usuario> usuariosRegistrados = new HashMap<>();
    private Usuario usuarioActual;
    public void registrarUsuario(String u, String p, String n) {
        if (u == null || u.isBlank() || p == null || p.isBlank() || n == null || n.
                isBlank())
            throw new IllegalArgumentException("Datos requeridos");
        Usuario nuevoUsuario = new Usuario(u, p, n);
        this.usuariosRegistrados.put(u, nuevoUsuario);
    }
    public boolean iniciarSesion(String u, String p) {
        Usuario usuario = usuariosRegistrados.get(u);
        if (usuario != null && usuario.validarCredenciales(u, p)) {
            this.usuarioActual = usuario;
            return true;
        }
        return false;
    }
    public boolean hayUsuario() {
        return usuarioActual != null;
    }
    public String getNombreUsuario() {
        return hayUsuario() ? usuarioActual.getNombre() : "";
    }
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
    public void cerrarSesion() {
        usuarioActual = null;
    }
}