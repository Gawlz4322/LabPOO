void main(){
    menu();
}

public String VerificarPalindromo(String palindromo){
    palindromo = palindromo.replaceAll("\\s+","").toLowerCase();
    StringBuilder test = new StringBuilder(palindromo);
    StringBuilder ReversedTest = test.reverse();
    if (test == ReversedTest) return True;
    else{
        return False;
    }

}
private void menu(){
    System.out.println("Menu de :");
}