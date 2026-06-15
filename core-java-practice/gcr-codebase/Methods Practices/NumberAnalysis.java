import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        for (int number : numbers) {
            if (isPositive(number)) {
                String evenOrOdd = isEven(number) ? "even" : "odd";
                System.out.println(number + " is positive and " + evenOrOdd + ".");
            } else {
                System.out.println(number + " is negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("First element is greater than last element.");
        } else if (comparison < 0) {
            System.out.println("First element is less than last element.");
        } else {
            System.out.println("First element is equal to last element.");
        }
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        }
        return 0;
    }
}
