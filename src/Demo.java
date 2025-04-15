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

    sc.Trs[0] = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, arrBarang[0]);
    sc.Trs[1] = new TransaksiPembelian("Tr002", "Vani", "21-04-2024", 2, arrBarang[1]);
    sc.Trs[2] = new TransaksiPembelian("Tr003", "Siska", "21-04-2024", 3, arrBarang[2]);
    sc.Trs[3] = new TransaksiPembelian("Tr004", "MeiMei", "21-04-2024", 1, arrBarang[2]);
    sc.Trs[4] = new TransaksiPembelian("Tr005", "Ihhsan", "21-04-2024", 1, arrBarang[1]);

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
        for (int i = 0; i < sc.Trs.length; i++) {
          sc.Trs[i].tampilDataTransaksi();
        }
      } else if (menu == 3) {
        System.out.print("Masukkan nama barang : ");
        String cari = input.nextLine();
        System.out.println("Kode Transaksi\tNama Pembeli\tTanggal Pembelian\tNama Barang\tKuantitas\tHarga");
        sc.searching(cari);
      } else if (menu == 4) {
        System.out.println("Kode Transaksi\tNama Pembeli\tTanggal Pembelian\tNama Barang\tKuantitas\tHarga");
        sc.Sorting();
      } else if (menu == 5) {
        input.close();
        System.exit(0);
      } else {
        System.out.println("Pilih menu dengan benar");
      }
    }

  }

}
