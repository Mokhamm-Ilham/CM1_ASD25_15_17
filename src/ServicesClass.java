public class ServicesClass {
  TransaksiPembelian[] Trs = new TransaksiPembelian[5];

  int index;

  void tambahDataTransaksi(TransaksiPembelian trp) {
    if (index < Trs.length) {
      Trs[index] = trp;
      index++;
    } else {
      System.out.println("Data sudah penuh");
    }
  }

  int searching(String cari) {
    int posisi = -1;

    for (int i = 0; i < Trs.length; i++) {
      if (Trs[i].brg.nama.equalsIgnoreCase(cari)) {
        posisi = i;
        break;
      }
    }

    return posisi;
  }

  void Sorting() {

  }
}
