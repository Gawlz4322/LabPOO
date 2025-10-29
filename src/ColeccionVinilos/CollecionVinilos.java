package ColeccionVinilos;
import java.util.ArrayList;

public class CollecionVinilos {
    private final int capacidadMaxima = 100;
    private ArrayList<Vinilo> collecion;
    public CollecionVinilos(){
        collecion = new ArrayList<>();
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int totalVinilos(){
        return collecion.size();
    }
}
