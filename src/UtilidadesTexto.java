public class UtilidadesTexto {

    public static void main(String[] args) {
        menu();
    }
    public boolean VerificarPalindromo(String palindromo){
        palindromo = palindromo.replaceAll("\\s+", "").toLowerCase();
        String PalindromoRevertido = new StringBuilder(palindromo).reverse().toString();
        return palindromo.equals(PalindromoRevertido);


    }
    private void menu(){
        System.out.println("Menu: \n");
        System.out.println();
    }