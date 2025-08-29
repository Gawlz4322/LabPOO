public class UtilidadesTexto {

    public static void main(String[] args) {
        menu();
    }
    private void menu(){
        String mostrarMenu = "1. Verificar si una frase es Revés-Derecho \n"
                + "2. Contar Vocales en una frase "
                + "3. Encriptar una frase "
                + "4. Desencriptar una frase"
                + "5. Salir";
        System.out.println(mostrarMenu);
    }
    public boolean VerificarPalindromo(String palindromo){
        palindromo = palindromo.replaceAll("\\s+", "").toLowerCase();
        String PalindromoRevertido = new StringBuilder(palindromo).reverse().toString();
        return palindromo.equals(PalindromoRevertido);
    }
    public int ContarVocales(String vocal) {
        int total = 0;
        for (int i = 0; i < vocal.length(); i++) {
            total = 0;
            total++;
        }
        return total;
    }

}

