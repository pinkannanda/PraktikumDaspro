import java.util.Scanner;

public class ModifikasiListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaListrikPerbulan = 50000;
        int tarifListrikKwh = 1500;
        double ppn = 0.1;
        int kwh;
        int biayaPemakaian;
        double totalBiayaListrik;
        double pajak, pesan;

        System.out.println("jumlah kwh: ");
        kwh = sc.nextInt();
        tarifListrikKwh = 1500 * kwh;
        biayaPemakaian = biayaListrikPerbulan * +tarifListrikKwh;
        totalBiayaListrik = biayaPemakaian + ppn;

        // Opsi daya 
        System.out.println("masukkan opsi daya: 900 / 1300 / 2200 / 3500 / 5500)");
        String opsiDaya = sc.nextLine();

        sc.nextLine();

        if (opsiDaya.equalsIgnoreCase("900")) {
            tarifListrikKwh = 1300;
        } else if (opsiDaya.equalsIgnoreCase("1300") || opsiDaya.equalsIgnoreCase("2200")) {
            tarifListrikKwh = 1500;
        } else if (opsiDaya.equalsIgnoreCase("3500") || opsiDaya.equalsIgnoreCase("5500")) {
            tarifListrikKwh = 1700;
        } else {
            System.out.println("Daya tidak tersedia");
            return;
        }

        System.out.println("tarif per kwh:" + tarifListrikKwh);
        System.out.println("biaya pemakaian:" + kwh + kwh);
        System.out.println("PPN:" + ppn);
        System.out.println("total biaya listrik:" + totalBiayaListrik);

    }

}
