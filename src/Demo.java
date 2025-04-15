import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Barang[] arrBarang = new Barang[5];
    arrBarang[0] = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
    arrBarang[1] = new Barang("Br002", "You C100 Botol", "Minuman", 10, 7000);
    arrBarang[2] = new Barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
    arrBarang[3] = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
    arrBarang[4] = new Barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);

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
      } else if (menu == 3) {
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
