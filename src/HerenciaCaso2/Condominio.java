package HerenciaCaso2;

import java.util.ArrayList;
import java.util.List;

public class Condominio {
    private String nombre;
    private List<Casa> casas;
    public Condominio(String nombre, List<Casa> casas) {
        this.nombre = nombre;
        this.casas = new ArrayList<>();
        for (int i = 1; i <= 20; i++){
            this.casas.add(new Casa("Calle Sol " + i));
        }
    }
    public Casa getCasa(int index) {
        if (index > 0 && index <= casas.size()) {
            return casas.get(index - 1);
        }
        return null;
    }
}
