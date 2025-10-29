package ColeccionVinilos;
import java.util.ArrayList;

public class CollecionVinilos {
    private final int cantidadMax = 100;
    private ArrayList<Vinilo> collecion;
    public CollecionVinilos(){
        collecion = new ArrayList<>();
    }
    public int getCantidadMax() {
        return cantidadMax;
    }
}
