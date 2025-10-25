import java.util.Scanner;

public class ModifikasiDanaSponsorShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPublikasi = 300000;
        int biayaDekorasi = 500000;
        int biayaKonsumsiPanitia = 500000;
        int biayaHadiah = 4000000;
        int biayaOperasional = 500000;
        int biayaKonsumsiPeserta = 25000;
        int biayaHonoranium = 75000;
        int jumlahPeserta = 3;
        int biayaPendaftaran = 50000;
        double danaPolinema = 0.6;
        int jumlahTim;
        int danaAnggaran;
        double totalDanaSponsorShip;
        
        sc.nextLine();
       
        //input
        System.out.print("Masukkan jumlah Tim: ");
        jumlahTim = sc.nextInt(); 
        
        
        //penghitungan
        jumlahPeserta = 3 * jumlahTim;
        biayaKonsumsiPeserta = 25000 * jumlahPeserta;
        biayaHonoranium = 75000 * jumlahTim;
        danaAnggaran = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitia + biayaHadiah + biayaOperasional + biayaKonsumsiPeserta + biayaHonoranium;
        danaPolinema = 0.7 * danaAnggaran;
        biayaPendaftaran = 50000 * jumlahTim;
        totalDanaSponsorShip = danaAnggaran - danaPolinema - biayaPendaftaran;
        
        //printnya
        System.out.println("jumlah tim:" + jumlahTim);
        System.out.println("jumlah peserta: " + jumlahPeserta);
        System.out.println("total anggaran: Rp " + totalDanaSponsorShip);
        System.out.println("dana dari polinema (70%) : Rp " + danaPolinema);
        System.out.println("total dari biaya pendaftaran: Rp " + biayaPendaftaran);
        System.out.println("biaya pendaftaran:" + biayaPendaftaran);
        System.out.println("dana yang harus dicari sponsorship: Rp" + totalDanaSponsorShip);

        sc.close();
    }
}
