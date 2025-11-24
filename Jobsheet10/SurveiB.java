package Jobsheet10;

public class SurveiB {
    public static void main(String[] args) {

        int[][] survey = new int[6][10]; // contoh array
        double sum, avg;

        System.out.println("Rata-rata responden");

        for (int i = 0; i < survey.length; i++) {
            sum = 0;

            for (int j = 0; j < survey[i].length; j++) {
                sum += survey[i][j];
            }

            avg = sum / 6.0;
            System.out.println("Responden " + (i + 1) + ": " + avg);
        }
    }
}

