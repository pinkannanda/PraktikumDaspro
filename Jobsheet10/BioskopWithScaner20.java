package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScaner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 
            switch (menu) {

                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;

                    
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 
                        
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris/kolom TIDAK tersedia! Coba lagi.\n");
                            continue;
                        }

                        
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println(" Kursi sudah terisi oleh: "
                                    + penonton[baris - 1][kolom - 1]);
                            System.out.println("Silakan pilih kursi lain!\n");
                        } else {
                            break; 
                        }
                    }

                    
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Kursi berhasil diisi!");
                    break;

                case 2:
                    System.out.println("DAFTAR PENONTON");

                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {

                            
                            if (penonton[i][j] == null) {
                                System.out.print("[***]\t");
                            } else {
                                System.out.print("[" + penonton[i][j] + "]\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    return;

                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
