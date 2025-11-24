package Jobsheet10;

public class SurveiC {
    public static void main(String[] args) {

        int[][] survey = new int[6][10]; 
        double sum, avg;

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

