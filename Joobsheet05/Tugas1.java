package Joobsheet05;

import java.util.Scanner;

public class Tugas1 { 
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        int maksimum;
        int minimum;

        System.out.print("Masukkan bilangan A : ");
        A = sc.nextInt();
        System.out.print("Masukkan bilangan B : ");
        B = sc.nextInt();
        System.out.print("Masukkan bilangan C : ");
        C = sc.nextInt();

        if (A > B) {
            if (B > C) {
                maksimum = A;
            } else {
                maksimum = C;
            }
        } else {
            if (B > C) {
                maksimum = B;
            } else {
                maksimum = C;
            }

        }
        // nilai minimum

    }

}