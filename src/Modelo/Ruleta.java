package Modelo;

import Vista.VentanaLoginRuleta;
import Vista.VentanaRuleta;

import java.util.Random;
import java.util.Scanner;

import static Modelo.TipoApuesta.*;

public class Ruleta {
    public static final int MAX_HISTORIAL = 100;
    public int[] historialNumeros = new int[MAX_HISTORIAL];
    public int[] historialApuestas = new int[MAX_HISTORIAL];
    public boolean[] historialAciertos = new boolean[MAX_HISTORIAL];
    public int historialSize = 0;
    public Random rng = new Random();
    private static final int[] numerosRojos =
            {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};

}
