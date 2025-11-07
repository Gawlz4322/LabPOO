package HerenciaCaso2;

public class Empleado extends Persona{
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    public void trabajar(){
        System.out.println(getNombre() + " trabaja.");
    }
}
