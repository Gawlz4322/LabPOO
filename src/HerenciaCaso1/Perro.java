package HerenciaCaso1;

public class Perro extends Animal{

    public Perro(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }
    public void ladrar(){
        System.out.println(getNombre() + "Guau guau guau.");
    }
}
