import java.util.Scanner;
import java.lang.Math;

public class ModifikasiBiayaBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerHalaman = 200;
        int biayaHardCover = 20000;
        int biayaSoftCover = 10000;
        double beratPerLembar = 3; // gram
        double beratHardCover = 250;
        double beratSoftCover = 100;
        double beratKemasan = 300;
        double biayaKirimPerKg = 15000;

        // Input
        System.out.print("Masukkan jumlah halaman buku: ");
        int halaman = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        System.out.print("Masukkan jenis cover (hard/soft): ");
        String cover = sc.nextLine().toLowerCase();

        // Hitung biaya cetak
        double biayaCetak = halaman * hargaPerHalaman;

        // Hitung berat isi buku (2 halaman per lembar)
        double jumlahLembar = Math.ceil((double) halaman / 2);
        double beratIsi = jumlahLembar * beratPerLembar;

        // Tentukan cover
        double biayaCover;
        double beratCover;
        if (cover.equals("hard")) {
            biayaCover = biayaHardCover;
            beratCover = beratHardCover;
        } else {
            biayaCover = biayaSoftCover;
            beratCover = beratSoftCover;
        }

        // Total berat (gram → kg)
        double totalBeratGram = beratIsi + beratCover + beratKemasan;
        double totalBeratKg = Math.ceil(totalBeratGram / 1000);

        // Biaya kirim
        double biayaKirim = totalBeratKg * biayaKirimPerKg;

        // Total biaya
        double totalBiaya = biayaCetak + biayaCover + biayaKirim;

        // Output
        System.out.println("Biaya cetak: Rp " + biayaCetak);
        System.out.println("Biaya cover: Rp " + biayaCover);
        System.out.println("Berat total: " + totalBeratGram + " gram (" + totalBeratKg + " kg)");
        System.out.println("Biaya kirim: Rp " + biayaKirim);
        System.out.println("TOTAL BAYAR: Rp " + totalBiaya);
    }
}