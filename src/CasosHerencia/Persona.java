package CasosHerencia;

public class Persona extends SerVivo{
    private String nombre;
    public Persona(String nombre, int edad) {
        super(edad);
        this.nombre = nombre;
    }
}
