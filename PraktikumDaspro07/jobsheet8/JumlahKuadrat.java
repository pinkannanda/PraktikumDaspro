import java.util.Scanner;

public class JumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (1 - 5): ");
        int n = sc.nextInt();

        // perulangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            int jumlah = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");

            // inner loop untuk menghitung dan menampilkan deret kuadrat
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlah);
        }

        sc.close(); 
    }
}