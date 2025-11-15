package Jobsheet09;

import java.util.Scanner;

public class PemesananKafe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        double[] harga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        int[] pesanan = new int[menu.length];

        System.out.print("Masukkan jumlah pesanan: ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan menu ke-" + (i+1) + ": ");
            String pilih = sc.nextLine();

        
            int idx = -1;
            for (int j = 0; j < menu.length; j++) {
                if (pilih.equalsIgnoreCase(menu[j])) {
                    idx = j;
                    break;
                }
            }

            if (idx == -1) {
                System.out.println("Menu tidak tersedia.");
                i--; 
                continue;
            }

            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = sc.nextInt();
            sc.nextLine();

            pesanan[idx] += jumlahItem;
        }

        double total = 0;
        for (int i = 0; i < menu.length; i++) {
            total += pesanan[i] * harga[i];
        }

        System.out.println("\nTotal pembayaran: Rp " + total);
    }
}
