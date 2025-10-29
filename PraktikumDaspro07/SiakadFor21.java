import java.util.Scanner;

public class SiakadFor21 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //comment

      double nilai, tertinggi = 100, terendah = 0;
      int Lulus=0;
      int tidakLulus=0;

      for (int i = 1; i <= 10; i++) {
         System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
         nilai = sc.nextDouble();
         if (nilai > tertinggi) {
            tertinggi = nilai;
         }
         if (nilai < terendah) {
            terendah = nilai;
         }
         if (nilai >= 60) {
            Lulus++;
         } else {
            tidakLulus++;
         }

      }

      System.out.println("Nilai tertinggi: " + tertinggi);
      System.out.println("Nilai terndah: " + terendah);
      System.out.println("Jumlah mahasiswa lulus: " + Lulus);
      System.out.println("Jumlah mahasiswa tidak luus: " + tidakLulus);
   }
}
