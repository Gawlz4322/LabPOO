package ColeccionVinilos;
import java.util.ArrayList;

public class ColecionVinilos {
    private final int capacidadMaxima = 100;
    private ArrayList<Vinilo> collecion;
    public ColeccionVinilos(){
        collecion = new ArrayList<>();
    }
    public void agregarVinilo(String artista, String album, int año){
        if (collecion.size()<capacidadMaxima){
            collecion.add(new Vinilo(artista, album, año));
        }else{
            System.out.println("No hay espacio.");
        }
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
