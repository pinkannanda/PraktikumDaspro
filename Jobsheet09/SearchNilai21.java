package Jobsheet09;

import java.util.Scanner;

public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int posisi = -1;   

        for (int i = 0; i < n; i++) {
            if (nilai[i] == key) {
                posisi = i;        
                break;             
            }
        }

        if (posisi != -1) {
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (posisi+1));
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }
    }
}
