package Jobsheet09;
public class ModifikasiArrayNilai21 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int tertinggi = 0;
        int terendah = 100;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah = " + terendah);
    }
}
