import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.println("Enter heights of 11 players (in meters):");
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / 11.0;
        System.out.println("Mean height = " + mean);
        sc.close();
    }
}
