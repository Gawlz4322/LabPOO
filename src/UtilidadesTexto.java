import java.util.Scanner;

public class UtilidadesTexto {

    public static void main(String[] args) {
        menu();
        System.out.println("Escribe una opción: ");
        Scanner sc = new Scanner(System.in);
        Redirectador(sc);
    }
    private static void menu(){
        String mostrarMenu = "1. Verificar si una frase es Revés-Derecho \n"
                + "2. Contar Vocales en una frase \n"
                + "3. Encriptar una frase \n"
                + "4. Desencriptar una frase \n"
                + "5. Salir";
        System.out.println(mostrarMenu);
    }
    public boolean VerificarPalindromo(String palindromo){
        palindromo = palindromo.replaceAll("\\s+", "").toLowerCase();
        String PalindromoRevertido = new StringBuilder(palindromo).reverse().toString();
        return palindromo.equals(PalindromoRevertido);
    }
    public int ContarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
    public String EncriptarTexto(String texto){
        return texto.replace("a", "@")
                .replace("e", "&")
                .replace("i", "¡")
                .replace("o", ">")
                .replace("u", "#");
    }
    public String DesencriptarTexto(String texto){
        return texto.replace("@", "a")
                .replace("&", "e")
                .replace("¡", "i")
                .replace(">", "o")
                .replace("#", "u");

    }
    public static void Redirectador(Scanner sc){
        if
    }
}

