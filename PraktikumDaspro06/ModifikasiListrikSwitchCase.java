import java.util.Scanner;

public class ModifikasiListrikSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrikKWh = 0;
        double biayaPemakaian;
        double totalBiayaListrik;
        double ppn = 0.1; // PPN 10%
        double kwh;

        // Input opsi daya
        System.out.println("Masukkan opsi daya: 900 / 1300 / 2200 / 3500 / 5500");
        String opsiDaya = sc.nextLine();

        // Menentukan tarif berdasarkan opsi daya dengan switch-case
        switch (opsiDaya) {
            case "900":
                tarifListrikKWh = 1300;
                break;

            case "1300":
            case "2200":
                tarifListrikKWh = 1500;
                break;

            case "3500":
            case "5500":
                tarifListrikKWh = 1700;
                break;

            default:
                System.out.println("Daya tidak tersedia");
                sc.close();
                return;
        }

        // Input jumlah pemakaian
        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        kwh = sc.nextDouble();

        // Hitung biaya
        biayaPemakaian = tarifListrikKWh * kwh;
        totalBiayaListrik = biayaPemakaian + (biayaPemakaian * ppn);

        // Output hasil
        System.out.println("Tarif per kWh: Rp " + tarifListrikKWh);
        System.out.println("Biaya Pemakaian: Rp " + biayaPemakaian);
        System.out.println("PPN (10%): Rp " + (biayaPemakaian * ppn));
        System.out.println("Total Biaya Listrik: Rp " + totalBiayaListrik);

        sc.close();
    }
}