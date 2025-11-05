package HerenciaCaso2;

public class Empleado extends Persona{
    public Empleado(String nombre) {
        super(nombre);
    }
    public void trabajar(){
        System.out.println(getNombre() + " trabaja.");
    }
}
