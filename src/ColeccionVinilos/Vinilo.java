package ColeccionVinilos;

public class Vinilo {
    private String artista;
    private String album;
    public int año;
    public Vinilo(String artista, String album, int año) {
        this.artista = artista;
        this.album = album;
        this.año = año;
    }
    public String getArtista() { return artista; }
    public String getAlbum() { return album; }
    public int getAño(){return año; }
}
