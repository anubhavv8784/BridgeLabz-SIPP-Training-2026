import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        scanner.close();

        long handshakes = calculateHandshakes(students);
        System.out.printf("Maximum number of handshakes among %d students is %d\n", students, handshakes);
    }

    public static long calculateHandshakes(int numberOfStudents) {
        if (numberOfStudents < 0) {
            return 0;
        }
        return (long) numberOfStudents * (numberOfStudents - 1) / 2;
    }
}
