public class Barang {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;

    Barang(String kodeBarang, String nama, String kategori, int stock, int harga){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        stok = stock;
        this.harga = harga;
    }

    void tampilDataBarang(){
        System.out.println("Kode Barang : "+kodeBarang);
        System.out.println("Nama : "+nama);
        System.out.println("Kategori : "+kategori);
        System.out.println("stok : "+stok);
        System.out.println("Harga : "+harga);
    }
}
