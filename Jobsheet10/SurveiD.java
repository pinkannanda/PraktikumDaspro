package Jobsheet10;

public class SurveiD {
    public static void main(String[] args) {

        int[][] survey = new int[6][10];
        double sum = 0, avg;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                sum += survey[i][j];
            }
        }

        avg = sum / 60.0;

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        System.out.println("Rata-rata keseluruhan: " + avg);
    }
}

