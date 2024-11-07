/**
 * Kelas utama untuk menjalankan aplikasi pemesanan tiket bioskop.
 * Program ini membuat objek Bioskop, menambahkan film dan kursi,
 * lalu memesan tiket dan membatalkan pesanan.
 */
public class Main {
    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        // Membuat objek bioskop dan menambahkan film serta kursi
        Bioskop bioskop = new Bioskop();

        // Menambahkan film ke bioskop
        Film film1 = new Film("Avengers", 150);
        Film film2 = new Film("Avatar", 180);
        bioskop.tambahFilm(film1);
        bioskop.tambahFilm(film2);

        // Menambahkan kursi ke bioskop
        for (int i = 1; i <= 10; i++) {
            bioskop.tambahKursi(new Kursi(i));
        }

        // Membuat objek pemesan
        Pemesan pemesan = new Pemesan("John Doe");

        // Pemesan memesan tiket untuk film tertentu di kursi tertentu
        Tiket tiket = pemesan.pesanTiket(bioskop, "Avengers", 3);
        if (tiket != null) {
            System.out.println("Tiket berhasil dipesan: " + tiket.infoTiket());
        } else {
            System.out.println("Tiket gagal dipesan.");
        }

        // Pemesan membatalkan pesanan tiket
        pemesan.batalPesanan(tiket);
    }
}
