import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ServicesClass sc = new ServicesClass();

    Barang[] arrBarang = new Barang[5];
    arrBarang[0] = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
    arrBarang[1] = new Barang("Br002", "You C100 Botol", "Minuman", 10, 7000);
    arrBarang[2] = new Barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
    arrBarang[3] = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
    arrBarang[4] = new Barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);

    TransaksiPembelian[] arrTrans = new TransaksiPembelian[5];
    arrTrans[0] = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, arrBarang[0]);
    arrTrans[1] = new TransaksiPembelian("Tr002", "Vani", "21-04-2024", 2, arrBarang[1]);
    arrTrans[2] = new TransaksiPembelian("Tr003", "Siska", "21-04-2024", 3, arrBarang[2]);
    arrTrans[3] = new TransaksiPembelian("Tr004", "MeiMei", "21-04-2024", 1, arrBarang[2]);
    arrTrans[4] = new TransaksiPembelian("Tr005", "Ihhsan", "21-04-2024", 1, arrBarang[1]);
    sc.tambahDataTransaksi(arrTrans[0]);
    sc.tambahDataTransaksi(arrTrans[1]);
    sc.tambahDataTransaksi(arrTrans[2]);
    sc.tambahDataTransaksi(arrTrans[3]);
    sc.tambahDataTransaksi(arrTrans[4]);

    while (true) {

      System.out.println("Pilih menu : ");
      System.out.println("1. Data Barang");
      System.out.println("2. Data Transaksi");
      System.out.println("3. Pencarian Data (Nama)");
      System.out.println("4. Pengurutan Data (Nama)");
      System.out.println("5. Keluar");
      System.out.print("Masukkan pilihan menu : ");
      int menu = input.nextInt();
      input.nextLine();
      if (menu == 1) {
        System.out.println("Kode\t" + "Nama Barang\t\t    " + "Jenis\t" + "Stok\t" + "Harga Barang");
        for (int i = 0; i < arrBarang.length; i++) {
          arrBarang[i].tampilDataBarang();
        }
      } else if (menu == 2) {
        System.out.println("Kode Transaksi\tNama Pembeli\tTanggal Pembelian\tNama Barang\tKuantitas\tHarga");
        for (int i = 0; i < arrTrans.length; i++) {
          arrTrans[i].tampilDataTransaksi();
        }
      } else if (menu == 3) {
        System.out.print("Masukkan nama barang : ");
        String cari = input.nextLine();
        int posisi = sc.searching(cari);
        if (posisi == -1) {
          System.out.println("Data tidak ditemukan");
        } else {
          System.out.println("Kode Transaksi\tNama Pembeli\tTanggal Pembelian\tNama Barang\tKuantitas\tHarga");
          arrTrans[posisi].tampilDataTransaksi();
        }
      } else if (menu == 4) {
      } else if (menu == 5) {
        input.close();
        System.exit(0);
      } else {
        System.out.println("Pilih menu dengan benar");
      }
    }

  }

}
