/**
 * Kelas Film merepresentasikan sebuah film yang ditayangkan di bioskop.
 * Film memiliki judul dan durasi.
 */
public class Film {
    private String judul;
    private int durasi; // dalam menit

    /**
     * Konstruktor untuk membuat objek Film.
     * 
     * @param judul Judul film
     * @param durasi Durasi film dalam menit
     */
    public Film(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    /**
     * Mendapatkan judul film.
     * 
     * @return Judul film
     */
    public String getJudul() {
        return judul;
    }

    /**
     * Mendapatkan durasi film.
     * 
     * @return Durasi film dalam menit
     */
    public int getDurasi() {
        return durasi;
    }
}
