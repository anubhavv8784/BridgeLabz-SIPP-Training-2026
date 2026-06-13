import java.util.Random;
import java.util.Scanner;

public class Level2_Q8_VotingAges {
    public static int[] randomAges(int n) {
        Random r = new Random(); int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = 10 + r.nextInt(90); // 10-99
        return arr;
    }

    public static String[][] ageVotingTable(int[] ages) {
        String[][] out = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            out[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) out[i][1] = "false";
            else out[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return out;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < table.length; i++) System.out.println(table[i][0] + "\t" + table[i][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.next());
        int[] ages = randomAges(n);
        String[][] table = ageVotingTable(ages);
        displayTable(table);
        sc.close();
    }
}
