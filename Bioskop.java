import java.util.ArrayList;

/**
 * Kelas Bioskop merepresentasikan bioskop yang memiliki film dan kursi untuk ditonton.
 */
public class Bioskop {
    private ArrayList<Film> films;
    private ArrayList<Kursi> kursis;

    /**
     * Konstruktor untuk membuat objek Bioskop dengan daftar film dan kursi.
     */
    public Bioskop() {
        films = new ArrayList<>();
        kursis = new ArrayList<>();
    }

    /**
     * Menambahkan film ke daftar film yang tersedia di bioskop.
     * 
     * @param film Film yang akan ditambahkan
     */
    public void tambahFilm(Film film) {
        films.add(film);
    }

    /**
     * Menambahkan kursi ke daftar kursi yang tersedia di bioskop.
     * 
     * @param kursi Kursi yang akan ditambahkan
     */
    public void tambahKursi(Kursi kursi) {
        kursis.add(kursi);
    }

    /**
     * Mencari film berdasarkan judul.
     * 
     * @param judul Judul film yang dicari
     * @return Film yang ditemukan, atau null jika tidak ditemukan
     */
    public Film cariFilm(String judul) {
        for (Film film : films) {
            if (film.getJudul().equalsIgnoreCase(judul)) {
                return film;
            }
        }
        return null;
    }

    /**
     * Memilih kursi untuk dipesan.
     * 
     * @param nomorKursi Nomor kursi yang ingin dipesan
     * @return Kursi yang dipilih, atau null jika kursi sudah terpesan
     */
    public Kursi pilihKursi(int nomorKursi) {
        for (Kursi kursi : kursis) {
            if (kursi.getNomorKursi() == nomorKursi && kursi.isTersedia()) {
                return kursi;
            }
        }
        return null;
    }
}
