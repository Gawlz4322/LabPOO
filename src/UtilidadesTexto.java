void main(){
    menu();
}

public String VerificarPalindromo(String palindromo){
    palindromo = palindromo.replaceAll("\\s+","").toLowerCase();
    StringBuilder test = new StringBuilder(palindromo);
    StringBuilder ReversedTest = test.reverse();
    if (test == ReversedTest){
        return True
    }
    else{
        return False
    }

}
private void menu(){
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();
}