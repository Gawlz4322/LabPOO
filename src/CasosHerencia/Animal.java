package CasosHerencia;

public class Animal extends SerVivo{
    private String nombre;
    private String color;
    public Animal(String nombre, String color, int edad) {
        super(edad);
        this.nombre = nombre;
        this.color = color;
    }
}
