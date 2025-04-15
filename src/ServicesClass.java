public class ServicesClass {
  TransaksiPembelian[] Trs = new TransaksiPembelian[5];
  int[] simpanIndex;
  int count;
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
    simpanIndex = new int[Trs.length];
    simpanIndex[0] = -1;
    count=0;
    for (int i = 0; i < Trs.length; i++) {
      if (Trs[i].brg.nama.equalsIgnoreCase(cari)) {
        simpanIndex[count] = i;
        count++;
      }
    }

    return simpanIndex[0];
  }

  void Sorting() {

  }
}
