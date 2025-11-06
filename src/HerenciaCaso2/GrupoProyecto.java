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
    public void agregarMiembro(Empleado empleado) {
        if (miembros.size() < 5) {
            this.miembros.add(empleado);
            System.out.println(empleado.getNombre() + " asignado a " + nombre);
        } else {
            System.out.println("Grupo de proyecto lleno.");
        }
}
