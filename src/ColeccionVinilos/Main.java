package ColeccionVinilos;

public class Main {
    public static void main(String[] args) {
        CollecionVinilos collecion = new CollecionVinilos();

        agregarVinilo("Iron Maiden", "Iron Maiden", 1980);
        agregarVinilo("Iron Maiden", "Killers", 1981);
        agregarVinilo("Iron Maiden", "The number of the beast", 1982);
        agregarVinilo("AC-DC", "Back in black", 1980);
        agregarVinilo("AC-DC", "Highway to Hell", 1979);
        agregarVinilo("AC-DC", "Who made who", 1986);
        agregarVinilo("Judas Priest", "British steel", 1980);
        agregarVinilo("Judas Priest", "Painkiller", 1990);
        agregarVinilo("Judas Priest", "Defenders of the faith", 1984);
        agregarVinilo("Kiss", "Destroyer", 1976);

        System.out.println("Espacio máximo colleción:" + colleccion.getCapacidadMaxima);

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista: " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        buscarArtista(vinilos,artista);
        mostrarColleccion(vinilos);
    }
}
