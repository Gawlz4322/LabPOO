package Modelo;

public class ApuestaPar extends ApuestaBase{
    public ApuestaPar(int montoApostado){
        super(montoApostado, "PAR");
    }
    @Override
    public boolean acierta(int numero, String color){
        return numero != 0 && numero % 2 == 0;
    }
}
