/**
 * Kelas Pemesan merepresentasikan pengguna yang ingin memesan tiket bioskop.
 */
public class Pemesan {
    private String nama;

    /**
     * Konstruktor untuk membuat objek Pemesan.
     * 
     * @param nama Nama pemesan
     */
    public Pemesan(String nama) {
        this.nama = nama;
    }

    /**
     * Memesan tiket untuk film tertentu dan kursi tertentu.
     * 
     * @param bioskop Objek bioskop tempat memesan tiket
     * @param judulFilm Judul film yang ingin dipesan
     * @param nomorKursi Nomor kursi yang ingin dipesan
     * @return Tiket yang berhasil dipesan, atau null jika gagal
     */
    public Tiket pesanTiket(Bioskop bioskop, String judulFilm, int nomorKursi) {
        Film film = bioskop.cariFilm(judulFilm);
        if (film != null) {
            Kursi kursi = bioskop.pilihKursi(nomorKursi);
            if (kursi != null) {
                kursi.pesan();
                return new Tiket(film, kursi);
            }
        }
        return null;
    }

/**
 * Membatalkan tiket yang sudah dipesan.
 * 
 * @param tiket Tiket yang ingin dibatalkan
 */
public void batalPesanan(Tiket tiket) {
    if (tiket != null) {
        tiket.getKursi().pesan();  // Mengubah status kursi kembali tersedia
        System.out.println("Pesanan dibatalkan untuk " + tiket.infoTiket());
    }
}
}
