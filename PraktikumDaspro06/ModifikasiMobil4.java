import java.util.Scanner;

public class ModifikasiMobil4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaMobilPerHari = 300000;
        int biayaSupirPerHari = 200000;
        int biayaBahanbakarperkm = 1000;
        int lamaSewa; 
        int jarakTempuhperkm;
        int totalBiayaSewa;
        double diskon, totalBayar;
        String pesan;

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
        System.out.print("Masukkan jenis bahan bakar (pertalite/pertamax) : ");
        String jenisBahanBakar = sc.nextLine();

        //Bahan bakar
        if (jenisBahanBakar.equalsIgnoreCase ("pertalite ")) {
            biayaBahanbakarperkm = 1000 * jarakTempuhperkm;
            System.out.println("jumlah biaya BBM pertalite: " + biayaBahanbakarperkm);

        } else if (jenisBahanBakar.equalsIgnoreCase ("pertamax ")) {
            System.out.println("Jenis bahan bakar tidak tersedia");
            biayaBahanbakarperkm = 1300 * jarakTempuhperkm;
            System.out.println("jumlah biaya BBM pertamax: " + biayaBahanbakarperkm);
       
        } else {
            biayaBahanbakarperkm = 0;
            System.out.println("jenis bahan bakar tidak tersedia");

        } 

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

       //Batas lama sewa
        if (lamaSewa > 30) {
            pesan = ("lama sewa tidak boleh lebih dari 30 hari");
            System.out.println("pesan");
            sc.close();
            return;
        } else {
            System.out.println("pesan");
        }
       
        System.out.println("biaya mobil: " + biayaMobilPerHari);
        System.out.println("biaya supir: " + biayaSupirPerHari);
        System.out.println("biaya bahan bakar: " + 1000);
        System.out.println(" total biaya lamasewa: " + totalBiayaSewa);

    
        sc.close();
    }
}

