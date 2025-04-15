public class TransaksiPembelian {

  String kodeTransaki;
  String namaPembeli;
  String tanggalPembelian;
  int qty;
  Barang brg;

  TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang brg) {
    this.kodeTransaki = kodeTransaksi;
    this.namaPembeli = namaPembeli;
    this.tanggalPembelian = tanggalPembelian;
    this.qty = qty;
    this.brg = brg;
  }

  void tampilDataTransaksi() {
    System.out.println(kodeTransaki+"\t\t"+namaPembeli+"\t\t"+tanggalPembelian+"\t\t"+brg.nama+"\t"+qty+"\t\t"+brg.harga);
  }

}
