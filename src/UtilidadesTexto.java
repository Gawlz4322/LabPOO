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

