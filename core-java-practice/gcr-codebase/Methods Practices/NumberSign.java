import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int result = checkNumberSign(number);
        if (result > 0) {
            System.out.println("The number is positive.");
        } else if (result < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        }
        return 0;
    }
}
