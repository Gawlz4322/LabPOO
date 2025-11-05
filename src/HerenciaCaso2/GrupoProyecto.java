package HerenciaCaso2;

import java.util.ArrayList;
import java.util.List;

public class GrupoProyecto {
    private String nombre;
    private List<Empleado> miembros;
    public  GrupoProyecto(String nombre) {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }
}
