package Modelo;
abstract public class ApuestaBase{
    private final int montoApostado;
    protected String etiqueta;

    public ApuestaBase(int montoApostado, String etiqueta){
        this.montoApostado = montoApostado;
        this.etiqueta = etiqueta;
    }
    public abstract boolean acierta(int numero, String color);

    public int getMontoApostado() { return montoApostado; }
    public String getEtiqueta() { return etiqueta; }

    @Override
    public String toString(){
        return etiqueta;
    }
}