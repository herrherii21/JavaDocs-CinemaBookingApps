/**
 * Kelas Kursi merepresentasikan kursi yang ada di dalam bioskop.
 * Kursi bisa tersedia atau sudah terpesan.
 */
public class Kursi {
    private int nomorKursi;
    private boolean tersedia;

    /**
     * Konstruktor untuk membuat objek Kursi.
     * 
     * @param nomorKursi Nomor kursi
     */
    public Kursi(int nomorKursi) {
        this.nomorKursi = nomorKursi;
        this.tersedia = true; // Kursi tersedia saat pertama kali dibuat
    }

    /**
     * Memeriksa apakah kursi tersedia.
     * 
     * @return true jika kursi tersedia, false jika sudah terpesan
     */
    public boolean isTersedia() {
        return tersedia;
    }

    /**
     * Memesan kursi (mengubah status kursi menjadi tidak tersedia).
     */
    public void pesan() {
        if (tersedia) {
            tersedia = false;
        }
    }

    /**
     * Mendapatkan nomor kursi.
     * 
     * @return Nomor kursi
     */
    public int getNomorKursi() {
        return nomorKursi;
    }
}
