package Jobsheet10;

import java.util.Scanner;

public class SurveiA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[6][10]; 
        int i, j;

        System.out.println("Masukkan pilihan jawaban bernilai 1-5:");

        for (i = 0; i < survei.length; i++) {
            System.out.println("Respon " + (i + 1) + ": ");

            for (j = 0; j < survei[i].length; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();
            }
        }
    }
}
