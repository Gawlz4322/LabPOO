package ColeccionVinilos;
import java.util.ArrayList;

public class ColecionVinilos {
    private final int capacidadMaxima = 100;
    private ArrayList<Vinilo> collecion;
    public ColeccionVinilos(){
        collecion = new ArrayList<>();
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int totalVinilos(){
        return collecion.size();
    }
    public int espaciosDisponibles(){
        return capacidadMaxima - collecion.size();
    }
}
