package ColeccionVinilos;
import java.util.ArrayList;

public class ColecionVinilos {
    private final int capacidadMaxima = 100;
    private ArrayList<Vinilo> coleccion;
    public ColeccionVinilos() {
        coleccion = new ArrayList<>();
    }
    public void agregarVinilo(String artista, String album, int año){
        if (coleccion.size()<capacidadMaxima){
            coleccion.add(new Vinilo(artista, album, año));
        }else{
            System.out.println("No hay espacio.");
        }
    }
    public boolean buscarArtista(String artista){
        for (Vinilo vinilo : coleccion){
            if (vinilo.getArtista().equals(artista)){
                return true;
            }
        }
        return false;
    }
    public void mostrarBusquedaArtista(String artista){
        if(buscarArtista(artista)){
            System.out.println("El artista " + artista + " si está en la colección.");
        }else{
            System.out.println("El artista " + artista + " no está en la colección.");
        }
    }
    public void mostrarColeccion(){
        System.out.println();
        int fila = 1;
        for (Vinilo vinilo : coleccion){
            System.out.println("Fila: " + fila + ": " + vinilo.toString());
            fila++;
        }
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int totalVinilos(){
        return coleccion.size();
    }
    public int espaciosDisponibles(){
        return capacidadMaxima - coleccion.size();
    }
}
