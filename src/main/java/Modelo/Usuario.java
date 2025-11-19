package Modelo;

public class Usuario {
    private double saldo;
    private String username;
    private String password;
    private String nombre;
    private String invitado;

    public Usuario(String username, String password, String nombre) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.saldo = 1000.0;
    }
    public boolean validarCredenciales(String u, String p){
        return this.username.equals(u) && this.password.equals(p);
    }
    public void actualizarSaldo(int montoApostado, boolean gano){
        if(gano){
            this.saldo += montoApostado * 1;
        }else{
            this.saldo -= montoApostado;
        }
    }
    public String getNombre() {
        return nombre;
    }
    public double getSaldo() {
        return saldo;
    }
}
