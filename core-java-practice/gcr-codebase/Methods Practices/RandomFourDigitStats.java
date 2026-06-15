import java.util.Arrays;
import java.util.Scanner;

public class RandomFourDigitStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many 4-digit random numbers to generate: ");
        int size = scanner.nextInt();
        scanner.close();

        int[] numbers = generate4DigitRandomArray(size);
        double[] stats = findAverageMinMax(numbers);

        System.out.print("Generated numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.printf("Average = %.2f, Min = %.0f, Max = %.0f\n", stats[0], stats[1], stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) {
            return new double[]{0, 0, 0};
        }

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}
