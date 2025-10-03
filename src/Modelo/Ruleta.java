package Modelo;

import Vista.VentanaLoginRuleta;
import Vista.VentanaRuleta;

import java.util.Random;
import java.util.Scanner;

import static Modelo.TipoApuesta.*;

public class Ruleta {
    public static final int MAX_HISTORIAL = 100;
    public static int[] historialNumeros = new int[MAX_HISTORIAL];
    public static int[] historialApuestas = new int[MAX_HISTORIAL];
    public static boolean[] historialAciertos = new boolean[MAX_HISTORIAL];
    public static int historialSize = 0;
    public static Random rng = new Random();
    private static final int[] numerosRojos =
            {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};

     static void main(String[] args) {
        new VentanaRuleta();
    }

    public static void menu() {
        System.out.println("Bienvenido a la Modelo. Ruleta del Casino Black Cat");
        mostrarMenu();
    }
    public static void mostrarMenu() {
        new VentanaRuleta();
    }

    public static int leerOpcion(Scanner in) {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    /**
     * Ejecuta la acción correspondiente a la opción del menú.
     * @param opcion opción elegida por el usuario.
     * @param in Scanner para entrada por consola.
     */
    public static void ejecutarOpcion(int opcion, Scanner in) {}

    public static void iniciarRonda(Scanner in) {
        char tipoChar = leerTipoApuesta(in);
        TipoApuesta tipoApuesta = null;

        switch (Character.toUpperCase(tipoChar)) {
            case 'R' -> tipoApuesta = ROJO;
            case 'N' -> tipoApuesta = NEGRO;
            case 'P' -> tipoApuesta = PAR;
            case 'I' -> tipoApuesta = IMPAR;
            default -> {
                System.out.println("Tipo de apuesta inválido.");
                return;
            }
        }
        System.out.println("Entra el monto a apostar:");
        int monto = in.nextInt();
        int numeroGanador = girarRuleta();
        boolean acierto = evaluarResultado(numeroGanador, tipoApuesta);
        registrarResultado(numeroGanador, monto, acierto);
        mostrarResultado(numeroGanador, tipoChar, monto, acierto);
    }

    public static char leerTipoApuesta(Scanner in) {
        System.out.println("Entra tu tipo de apuesta: (R/N/P/I)");
        String input = in.next();
        return input.charAt(0);
    }
    public static int girarRuleta() {
        return rng.nextInt(37);
    }

    public static boolean evaluarResultado(int numero, TipoApuesta tipo) {
        if (numero == 0) {
            return false;
        }
        return switch (tipo) {
            case ROJO -> esRojo(numero);
            case NEGRO -> !esRojo(numero);
            case PAR -> numero % 2 == 0;
            case IMPAR -> numero % 2 != 0;
        };

    }

    public static boolean esRojo(int n) {
        if (n== 0){
            return false;
        }
        for (int rojo : numerosRojos){
            if (rojo == n){
                return true;
            }
        }
        return false;
    }

    public static void registrarResultado(int numero, int apuesta, boolean acierto) {
        if (historialSize < MAX_HISTORIAL) {
            historialNumeros[historialSize] = numero;
            historialApuestas[historialSize] = apuesta;
            historialAciertos[historialSize] = acierto;
            historialSize++;
        } else {
            System.out.println("Historial lleno. No se puede registrar.");
        }

    }


/**
 * Muestra estadísticas generales de todas las rondas jugadas.
 */
    public static void mostrarEstadisticas() {}

    /**
    public String getSaldo() {
        return null;
    }
     */
}
