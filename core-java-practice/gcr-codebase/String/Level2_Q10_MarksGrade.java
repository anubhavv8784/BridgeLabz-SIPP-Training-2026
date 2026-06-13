import java.util.Random;
import java.util.Scanner;

public class Level2_Q10_MarksGrade {
    public static int[][] randomScores(int students) {
        Random r = new Random(); int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) for (int j = 0; j < 3; j++) scores[i][j] = 10 + r.nextInt(90);
        return scores;
    }

    public static String[][] totalsAndPercentages(int[][] scores) {
        int n = scores.length; String[][] out = new String[n][5];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100.0;
            out[i][0] = String.valueOf(total);
            out[i][1] = String.valueOf(Math.round(avg*100.0)/100.0);
            out[i][2] = String.valueOf(Math.round(percent*100.0)/100.0);
        }
        return out;
    }

    public static String gradeFor(double percent) {
        if (percent >= 90) return "A";
        if (percent >= 80) return "B";
        if (percent >= 70) return "C";
        if (percent >= 60) return "D";
        return "F";
    }

    public static void displayScorecard(int[][] scores) {
        int n = scores.length;
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total/3.0)*100.0)/100.0;
            double percent = Math.round(((total/300.0)*100.0)*100.0)/100.0;
            String grade = gradeFor(percent);
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + total + "\t" + avg + "\t" + percent + "\t" + grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.next());
        int[][] scores = randomScores(n);
        displayScorecard(scores);
        sc.close();
    }
}
