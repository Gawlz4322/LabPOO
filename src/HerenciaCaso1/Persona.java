package HerenciaCaso1;

import java.util.List;

public class Persona extends SerVivo{
    private List<Animal> mascotas;
    private String nombre;
    public Persona(String nombre, int edad) {
        super(edad);
        this.nombre = nombre;
    }
    public void vaEscuela(){
        System.out.println(this.nombre + " va a la escuela.");
    }
    public void decirEdad(){
        System.out.println(this.nombre + " tiene " + getEdad() + " años.");
    }
    public void agregarMascotas(Animal mascota){
        this.mascotas.add(mascota);
        mascota.asignarDueño(this);
    }
}
