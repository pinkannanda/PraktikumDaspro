import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalPenjualan = 0;
        char ulang;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = input.nextInt();

            // validasi input
            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.\n");
                continue; // kembali ke awal loop
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            // hitung diskon
            if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * totalHarga;
            }

            totalHarga -= diskon;
            totalPenjualan += totalHarga;

            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            System.out.println("----------------------------------");

            System.out.print("Apakah ingin input pembelian lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nTotal penjualan tiket hari ini: Rp " + totalPenjualan);
        input.close();
    }
}