package HerenciaCaso2;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    public String getModelo(){
        return super.modelo;
    }
}
