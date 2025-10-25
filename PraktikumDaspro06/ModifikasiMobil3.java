import java.util.Scanner;

public class ModifikasiMobil3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaMobilPerHari = 300000;
        int biayaSupirPerHari = 200000;
        int biayaBahanbakarperkm = 1000;
        int lamaSewa; 
        int jarakTempuhperkm;
        int totalBiayaSewa;
        double diskon, totalBayar;
        
        System.out.println("Masukan lama sewa");
        lamaSewa = sc.nextInt();
        System.out.println("Masukkan jarak tempuh");
        jarakTempuhperkm = sc.nextInt();

        biayaMobilPerHari = 300000 * lamaSewa;
        biayaSupirPerHari = 200000 * lamaSewa;
        biayaBahanbakarperkm = 1000 * jarakTempuhperkm;
        totalBiayaSewa = biayaMobilPerHari + biayaSupirPerHari + biayaBahanbakarperkm;
        diskon = totalBiayaSewa * 0.05;
        totalBayar = totalBiayaSewa - diskon;

        sc.nextLine();
        
        //Hitungan
        biayaMobilPerHari = 300000 * lamaSewa;
        biayaSupirPerHari = 200000 * lamaSewa;
        biayaBahanbakarperkm = biayaBahanbakarperkm * jarakTempuhperkm;
        totalBiayaSewa = biayaMobilPerHari * biayaSupirPerHari * biayaBahanbakarperkm;

        System.out.println("masukkan lama sewa");
        String pesan;
        
        //Batas lama sewa
        if (lamaSewa > 30) {
            pesan = "Lama sewa tidak boleh lebih dari 30 hari";
            System.out.println("pesan");
            sc.close();
            return;
        } else {
            pesan = "lama sewa valid";
            System.out.println("pesan");
        }
       totalBayar = totalBiayaSewa - diskon;

        System.out.println("biaya mobil: " + biayaMobilPerHari);
        System.out.println("biaya supir: " + biayaSupirPerHari);
        System.out.println("biaya bahan bakar: " + 1000);
        System.out.println(" total biaya lamasewa: " + totalBiayaSewa);

    
        sc.close();
    }
}





    

