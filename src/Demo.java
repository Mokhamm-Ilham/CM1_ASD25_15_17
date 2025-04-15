import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

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
