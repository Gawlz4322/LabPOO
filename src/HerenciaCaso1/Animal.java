package HerenciaCaso1;

import java.util.List;

public class Animal extends SerVivo{
    private String nombre;
    private String color;
    private List<Persona> duenos;
    public Animal(String nombre, String color, int edad) {
        super(edad);
        this.nombre = nombre;
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public void comer(){
        System.out.println(getNombre() + " come.");
    }
    public void morder(){
        System.out.println(getNombre() + " muerde.");
    }
    public void asignarDueno(Persona dueno){
        if (!this.duenos.contains(dueno)){
            this.duenos.add(dueno);
        }
    }
}
