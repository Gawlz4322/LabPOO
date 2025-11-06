package HerenciaCaso2;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Persona> arrendatarios;
    public Casa(String direccion) {
        this.direccion = direccion;
        this.arrendatarios = new ArrayList<>();
    }
    public void agregarArrendatario(Persona persona){
        this.arrendatarios.add(persona);
    }
}
