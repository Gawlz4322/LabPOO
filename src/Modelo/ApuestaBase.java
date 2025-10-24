package Modelo;
abstract public class ApuestaBase{
    private final int montoApostado;
    protected String etiqueta;

    public ApuestaBase(int montoApostado, String etiqueta){
        this.montoApostado = montoApostado;
        this.etiqueta = etiqueta;
    }
    public void acierta(int numero, String color){}
}