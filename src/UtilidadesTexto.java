public class UtilidadesTexto {

    public static void main(String[] args) {
        menu();
    }
    private void menu(){
        System.out.println("Menu: \n");
        System.out.println();
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

