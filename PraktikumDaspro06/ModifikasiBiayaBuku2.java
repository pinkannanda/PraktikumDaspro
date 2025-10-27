import java.util.Scanner;
import java.lang.Math;

public class ModifikasiBiayaBuku2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel 
        double hargaPerHalaman = 200;
        double biayaHardCover = 20000;
        double biayaSoftCover = 10000;
        double beratPerLembar = 3; // gram
        double beratHardCover = 250;
        double beratSoftCover = 100;
        double beratKemasan = 300;
        double biayaKirimPerKg = 15000;

        //Input 
        System.out.print("Masukkan jumlah halaman buku: ");
        int halaman = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Masukkan jenis cover (hard/soft): ");
        String cover = sc.nextLine().toLowerCase();

        System.out.print("Masukkan kota tujuan pengiriman: ");
        String kota = sc.nextLine().toLowerCase();

        //Hitung biaya cetak
        double biayaCetak = halaman * hargaPerHalaman;

        // Buku dicetak bolak-balik (2 halaman per lembar)
        double jumlahLembar = Math.ceil((double) halaman / 2);
        double beratIsi = jumlahLembar * beratPerLembar;

        //Tentukan cover 
        double biayaCover;
        double beratCover;
        if (cover.equals("hard")) {
            biayaCover = biayaHardCover;
            beratCover = beratHardCover;
        } else {
            biayaCover = biayaSoftCover;
            beratCover = beratSoftCover;
        }

        // Hitung total berat 
        double totalBeratGram = beratIsi + beratCover + beratKemasan;
        double totalBeratKg = Math.ceil(totalBeratGram / 1000);

        //Hitung biaya pengiriman
        double biayaKirim;
        if (kota.equals("malang") || kota.equals("batu")) {
            biayaKirim = 20000; // flat rate
        } else {
            biayaKirim = totalBeratKg * biayaKirimPerKg;
        }

        // Hitung total biaya
        double totalBiaya = biayaCetak + biayaCover + biayaKirim;

        // Output hasil
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Jenis cover: " + cover);
        System.out.println("Kota tujuan: " + kota);
        System.out.println("Biaya cetak: Rp " + biayaCetak);
        System.out.println("Biaya cover: Rp " + biayaCover);
        System.out.println("Berat total: " + totalBeratGram + " gram (" + totalBeratKg + " kg)");
        System.out.println("Biaya kirim: Rp " + biayaKirim);
        System.out.println("TOTAL YANG HARUS DIBAYAR: Rp " + totalBiaya);
    }
}