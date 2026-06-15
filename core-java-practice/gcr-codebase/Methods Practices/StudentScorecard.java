import java.util.Random;

public class StudentScorecard {
    public static void main(String[] args) {
        int[][] marks = generateRandomMarks(1); // generate for one student
        displayScorecard(marks);
    }

    public static int[][] generateRandomMarks(int students) {
        int[][] marks = new int[students][3];
        Random random = new Random();
        for (int i = 0; i < students; i++) {
            marks[i][0] = random.nextInt(101); // Physics
            marks[i][1] = random.nextInt(101); // Chemistry
            marks[i][2] = random.nextInt(101); // Maths
        }
        return marks;
    }

    public static void displayScorecard(int[][] marks) {
        System.out.println("Subject\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            int physics = marks[i][0];
            int chemistry = marks[i][1];
            int maths = marks[i][2];
            int total = physics + chemistry + maths;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            System.out.printf("Student %d\t%d\t%d\t%d\t%d\t%.2f\t%.2f%%\n", i + 1, physics, chemistry, maths, total, average, percentage);
        }
    }
}
