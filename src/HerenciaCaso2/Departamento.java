package HerenciaCaso2;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<GrupoProyecto> grupos;
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.grupos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;

    }
    public List<GrupoProyecto> getGrupos() {
        return grupos;
    }
}
