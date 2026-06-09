import java.util.Scanner;

// MaxHandshakesCalculator calculates the maximum number of handshakes among N students
public class MaxHandshakesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        long maxHandshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;

        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        input.close();
    }
}
