package HerenciaCaso1;

public class Persona extends SerVivo{
    private String nombre;
    public Persona(String nombre, int edad) {
        super(edad);
        this.nombre = nombre;
    }
    public void vaEscuela(){
        System.out.println(this.nombre + " va a la escuela.");
    }
}
