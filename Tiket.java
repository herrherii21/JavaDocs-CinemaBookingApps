/**
 * Kelas Tiket merepresentasikan tiket yang dipesan untuk menonton film.
 */
public class Tiket {
    private Film film;
    private Kursi kursi;

    /**
     * Konstruktor untuk membuat objek Tiket.
     * 
     * @param film Film yang dipesan
     * @param kursi Kursi yang dipilih
     */
    public Tiket(Film film, Kursi kursi) {
        this.film = film;
        this.kursi = kursi;
    }

    /**
     * Mendapatkan informasi tentang tiket yang dipesan.
     * 
     * @return Informasi tiket (judul film dan nomor kursi)
     */
    public String infoTiket() {
        return "Film: " + film.getJudul() + ", Kursi: " + kursi.getNomorKursi();
    }

    /**
     * Mendapatkan kursi yang dipesan.
     * 
     * @return Kursi yang dipilih
     */
    public Kursi getKursi() {
        return kursi;
    }
}
