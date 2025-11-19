package Modelo;

public class ApuestaRojo extends ApuestaBase{
    public ApuestaRojo(int montoApostado){
        super(montoApostado, "ROJO");
    }
    @Override
    public boolean acierta(int numero, String color){
        return numero != 0 && color.equals("ROJO");
    }
}
