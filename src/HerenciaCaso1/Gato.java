package HerenciaCaso1;

public class Gato extends Animal{
    public Gato(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }
    public void rasgunar(){
        System.out.println(getNombre()+ " rasguña.");
    }
    public void morder(){
        super.morder();
    }
}
