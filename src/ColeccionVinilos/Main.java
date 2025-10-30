package ColeccionVinilos;

public class Main {
    public static void main(String[] args) {
        ColeccionVinilos coleccion = new ColeccionVinilos();

        coleccion.agregarVinilo("Iron Maiden", "Iron Maiden", 1980);
        coleccion.agregarVinilo("Iron Maiden", "Killers", 1981);
        coleccion.agregarVinilo("Iron Maiden", "The number of the beast", 1982);
        coleccion.agregarVinilo("AC-DC", "Back in black", 1980);
        coleccion.agregarVinilo("AC-DC", "Highway to Hell", 1979);
        coleccion.agregarVinilo("AC-DC", "Who made who", 1986);
        coleccion.agregarVinilo("Judas Priest", "British steel", 1980);
        coleccion.agregarVinilo("Judas Priest", "Painkiller", 1990);
        coleccion.agregarVinilo("Judas Priest", "Defenders of the faith", 1984);
        coleccion.agregarVinilo("Kiss", "Destroyer", 1976);

        System.out.println("Espacio máximo colleción: " + coleccion.getCapacidadMaxima());
        System.out.println("Hay un total de: " + coleccion.totalVinilos() + " vinilos en la colleción.");
        System.out.println("Hay un total de: " + coleccion.espaciosDisponibles()+" espacios disponibles en la colección.");

        String artista = "AC-DC";
        System.out.println("Buscar artista: " + artista);
        coleccion.mostrarBusquedaArtista(artista);
        coleccion.mostrarColeccion();
    }
}
