package Modelo;

public class Usuario {
    private double saldo;
    private String username;
    private String password;
    private String nombre;
    private String invitado;

    public Usuario(String username, String password, String nombre, double saldoInicial) {
        if (username == null) {
            throw new IllegalArgumentException("Username no puede ser nulo");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial inválido");
        }
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }
    public boolean validarCredenciales(String u, String p){
        if (u == null) return false;
        return this.username.equals(u) && this.password.equals(p);
    }
    public void actualizarSaldo(int montoApostado, boolean gano){
        if(gano){
            this.saldo += montoApostado;
        } else {
            if (saldo < montoApostado) {
                throw new IllegalArgumentException("Saldo insuficiente");
            }
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
