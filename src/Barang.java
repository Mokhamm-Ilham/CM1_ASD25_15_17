public class Barang {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;

    Barang(String kodeBarang, String nama, String kategori, int stock, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        stok = stock;
        this.harga = harga;
    }

    void tampilDataBarang() {
        System.out.println(kodeBarang + " \t" + nama + "\t\t"
                + kategori + "\t\t" + stok + " \t" + harga);
    }
}
