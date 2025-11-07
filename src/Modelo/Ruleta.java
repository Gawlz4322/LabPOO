package Modelo;

import java.util.Random;
import java.util.List;

public class Ruleta {
    private final IRepositorioResultados repositorio;
    private final Random rng = new Random();

    public Ruleta(IRepositorioResultados repositorio) {
        this.repositorio = repositorio;
    }

    public int girarRuleta() {
        return rng.nextInt(37);
    }

    public boolean evaluarResultado(int numero, ApuestaBase apuesta) {
        String color = colorDe(numero);
        return apuesta.acierta(numero, color);
    }
    public static String colorDe(int n) {
        if (n == 0) {
            return "VERDE";
        }
        for (int rojo : NUMEROS_ROJOS){
            if (rojo == n){
                return "ROJO";
            }
        }
        return "NEGRO";
    }
    public static boolean esRojo(int n) {
        if (n == 0){
            return false;
        }
        for (int rojo : NUMEROS_ROJOS){
            if (rojo == n){
                return true;
            }
        }
        return false;
    }

    public void registrarResultado(int numero, ApuestaBase apuesta, boolean acierto) {
        // Se crea el objeto Resultado
        Resultado resultado = new Resultado(numero, apuesta.getMontoApostado(), acierto, apuesta.getEtiqueta());
        // Se delega el guardado al repositorio inyectado
        repositorio.guardarResultados(resultado);
    }
    public int getHistorialSize() {
        return historialSize;
    }
    public int[] getHistorialNumeros() {
        return historialNumeros;
    }
    public int[] getHistorialApuestas() {
        return historialApuestas;
    }
    public boolean[] getHistorialAciertos() {
        return historialAciertos;
    }
}