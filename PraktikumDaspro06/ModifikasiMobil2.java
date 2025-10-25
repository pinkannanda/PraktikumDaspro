import java.util.Scanner;

public class ModifikasiMobil2 {
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

        //Diskon
        if (totalBiayaSewa > 2000000) {
            diskon = 0.5 * totalBiayaSewa;
            System.out.println("total biaya sewa : " + diskon);
        } else {
            diskon = 0.0 * totalBiayaSewa;
            System.out.println("total biaya : " + diskon);
            
        }
       totalBayar = totalBiayaSewa - diskon;

        System.out.println("biaya mobil: " + biayaMobilPerHari);
        System.out.println("biaya supir: " + biayaSupirPerHari);
        System.out.println("biaya bahan bakar: " + 1000);
        System.out.println(" total biaya lamasewa: " + totalBiayaSewa);

    
        sc.close();
    }
}



