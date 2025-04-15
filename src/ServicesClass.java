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
    int[] simpanIndex = new int[Trs.length];
    simpanIndex[0] = -1;
    int count = 0;
    for (int i = 0; i < Trs.length; i++) {
      if (Trs[i].brg.nama.equalsIgnoreCase(cari)) {
        simpanIndex[count] = i;
        count++;
      }
    }
    
    for (int i = 0; i < count; i++) {
      if (simpanIndex[0] == -1) {
        System.out.println("Data tidak ditemukan");
        break;
      }
      int indeks = simpanIndex[i];
      Trs[indeks].tampilDataTransaksi();
    }

    return simpanIndex[0];
  }

  void Sorting() {
    for (int i = 0; i < Trs.length - 1; i++) {
      for (int j = 1; j < Trs.length - i; j++) {
        if (Trs[j - 1].brg.nama.compareTo(Trs[j].brg.nama) > 0) {
          TransaksiPembelian temp = Trs[j];
          Trs[j] = Trs[j - 1];
          Trs[j - 1] = temp;
        }
      }
    }

    for (TransaksiPembelian transaksiPembelian : Trs) {
      transaksiPembelian.tampilDataTransaksi();
    }
  }
}
