package Joobsheet05;

import java.util.Scanner;

public class PemilihanHariDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String dayType;

        System.out.print("Masukkan angka (1-7) : ");
        angka = sc.nextInt();

        if (angka >= 1 && angka <= 5) {
            dayType = "weekday";

        } else if (angka == 6 || angka == 7) {
            dayType = "weekend";

        } else
            dayType = "invalid number";

        System.out.println("Hari " + angka + " is a :" + dayType);

    }
}