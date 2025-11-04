import java.util.Scanner;

public class Parkir21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (Mobil/Motor): ");
        String jenis = sc.nextLine();

        System.out.print("Masukkan durasi (jam): ");
        int durasi = sc.nextInt();

        int total = 0;

        if (durasi <= 1) {
            total = 15000;
        } else if (jenis.equals("Mobil")) {
            total = durasi * 30000;
        } else if (jenis.equals("Motor")) {
            total = durasi * 15000;
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            return;
        }

        System.out.println("Total biaya parkir: Rp " + total);
    }
}