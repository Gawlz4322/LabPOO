package ColeccionVinilos;

public class Main {
    public static void main(String[] args) {
        ColecionVinilos coleccion = new ColecionVinilos();

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

        System.out.println("Espacio máximo colleción:" + coleccion.getCapacidadMaxima());
        System.out.println("Hay un total de:" + coleccion.totalVinilos() + "vinilos en la colleción.");
        System.out.println("Hay un total de:" + coleccion.espaciosDisponibles()+" espacios disponibles en la colección.");

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista: " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        buscarArtista(vinilos,artista);
        mostrarColleccion(vinilos);
    }
}
