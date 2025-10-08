package Joobsheet05;

import java.util.Scanner;

public class CetakKRS21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        Boolean uktLunas = sc.nextBoolean();

        // if (uktLunas) {
        // System.out.println("Pembayaran UKT terverifikasi");
        // System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");

        // } else {
        // System.out.println("Registrasi ditolak silakan, lunasi UKT terlebih dahuu");
        // }

        String hasil = uktLunas
                ? "Pembayaran UKT Terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(hasil);

    }
}
