import java.util.Scanner;

public class alattulis {
  public static void main(String[] args) {
    // Membuat objek Scanner untuk mengambil input dari pengguna
    Scanner scanner = new Scanner(System.in);

    // Menampilkan menu pilihan alat keperluan sekolah
    System.out.println("Pilih alat keperluan sekolah dengan memasukkan nomor berikut:");
    System.out.println("1. Pensil");
    System.out.println("2. Penghapus");
    System.out.println("3. Buku Tulis");
    System.out.println("4. Rautan");
    System.out.println("5. Spidol");
    System.out.println("6. Penggaris");
    System.out.print("Masukkan nomor pilihan Anda: ");

    // Membaca input pengguna
    int pilihan = scanner.nextInt();

    // Menentukan alat keperluan sekolah berdasarkan nomor yang dipilih
    switch (pilihan) {
      case 1:
        System.out.println("Anda memilih Pensil.");
        break;
      case 2:
        System.out.println("Anda memilih Penghapus.");
        break;
      case 3:
        System.out.println("Anda memilih Buku Tulis.");
        break;
      case 4:
        System.out.println("Anda memilih Rautan.");
        break;
      case 5:
        System.out.println("Anda memilih Spidol.");
        break;
      case 6:
        System.out.println("Anda memilih Penggaris.");
        break;
      default:
        System.out.println("Pilihan tidak valid. Silakan masukkan nomor antara 1 dan 6.");
        break;
    }

    // Menutup Scanner
    scanner.close();
  }
}
