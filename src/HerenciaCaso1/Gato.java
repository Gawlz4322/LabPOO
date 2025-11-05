package HerenciaCaso1;

public class Gato extends Animal{
    public Gato(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }
    public void rasguñar(){
        System.out.println(getNombre()+ " rasguña.");
    }
}
