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
    public List<Resultado> obtenerHistorial() {
        return repositorio.obtenerHistorial();
    }

    public void registrarResultado(int numero, ApuestaBase apuesta, boolean acierto) {
        Resultado resultado = new Resultado(numero, apuesta.getMontoApostado(), acierto, apuesta.getEtiqueta());
        repositorio.guardarResultados(resultado);
    }
}