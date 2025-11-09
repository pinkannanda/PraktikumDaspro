import java.util.Scanner;

public class NilaiKelompok21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1; // untuk kelompok
        double totalNilai, rataNilai;
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i + ":");
            totalNilai = 0; // inisialisasi ulang setiap kelompok

            // perulangan untuk input 5 nilai
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata: " + rataNilai);
            System.out.println();

            // cek apakah rata-rata tertinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);
    }
}
