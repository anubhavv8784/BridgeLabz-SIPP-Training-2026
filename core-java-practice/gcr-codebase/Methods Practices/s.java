import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.print("Choose a program (0 to exit): ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 0:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;
                case 1:
                    runSimpleInterest(scanner);
                    break;
                case 2:
                    runHandshakes(scanner);
                    break;
                case 3:
                    runTriangleRounds(scanner);
                    break;
                case 4:
                    runNumberSign(scanner);
                    break;
                case 5:
                    runSpringSeason(scanner);
                    break;
                case 6:
                    runSumOfNaturalNumbers(scanner);
                    break;
                case 7:
                    runSmallestAndLargest(scanner);
                    break;
                case 8:
                    runQuotientAndRemainder(scanner);
                    break;
                case 9:
                    runChocolateDistribution(scanner);
                    break;
                case 10:
                    runWindChill(scanner);
                    break;
                case 11:
                    runTrigonometricFunctions(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option from 0 to 11.");
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("Level 1 Practice Programs");
        System.out.println("1. Simple Interest");
        System.out.println("2. Maximum Handshakes");
        System.out.println("3. 5 km Run Around Triangle Park");
        System.out.println("4. Positive, Negative, or Zero");
        System.out.println("5. Spring Season Check");
        System.out.println("6. Sum of n Natural Numbers");
        System.out.println("7. Smallest and Largest of 3 Numbers");
        System.out.println("8. Quotient and Remainder");
        System.out.println("9. Distribute Chocolates Among Children");
        System.out.println("10. Wind Chill Temperature");
        System.out.println("11. Trigonometric Functions");
        System.out.println("0. Exit");
    }

    private static void runSimpleInterest(Scanner scanner) {
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n",
                simpleInterest, principal, rate, time);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100.0;
    }

    private static void runHandshakes(Scanner scanner) {
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        long handshakes = calculateHandshakes(students);
        System.out.printf("Maximum number of handshakes among %d students is %d\n", students, handshakes);
    }

    public static long calculateHandshakes(int numberOfStudents) {
        if (numberOfStudents < 0) {
            return 0;
        }
        return (long) numberOfStudents * (numberOfStudents - 1) / 2;
    }

    private static void runTriangleRounds(Scanner scanner) {
        System.out.print("Enter side 1 of the triangular park in meters: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangular park in meters: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangular park in meters: ");
        double side3 = scanner.nextDouble();

        double rounds = calculateRoundsFor5Km(side1, side2, side3);
        if (rounds <= 0) {
            System.out.println("Invalid triangle sides. The perimeter must be greater than zero.");
        } else {
            System.out.printf("To complete a 5 km run, the athlete must complete %.2f rounds around the park.\n", rounds);
        }
    }

    public static double calculateRoundsFor5Km(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        if (perimeter <= 0) {
            return 0;
        }
        double distanceInMeters = 5000.0;
        return distanceInMeters / perimeter;
    }

    private static void runNumberSign(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
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

    private static void runSpringSeason(Scanner scanner) {
        System.out.print("Enter month as integer (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day of month: ");
        int day = scanner.nextInt();

        boolean isSpring = isSpringSeason(month, day);
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 3 && day >= 20) {
            return true;
        }
        if (month > 3 && month < 6) {
            return true;
        }
        return month == 6 && day <= 20;
    }

    private static void runSumOfNaturalNumbers(Scanner scanner) {
        System.out.print("Enter n to compute sum of first n natural numbers: ");
        int n = scanner.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.printf("The sum of first %d natural numbers is %d\n", n, sum);
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static void runSmallestAndLargest(Scanner scanner) {
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = scanner.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.printf("Smallest number is %d and largest number is %d\n", result[0], result[1]);
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    private static void runQuotientAndRemainder(Scanner scanner) {
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.printf("Quotient = %d, Remainder = %d\n", result[1], result[0]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    private static void runChocolateDistribution(Scanner scanner) {
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.printf("Each child gets %d chocolates and %d chocolates remain.\n", result[1], result[0]);
    }

    private static void runWindChill(Scanner scanner) {
        System.out.print("Enter temperature (degrees Fahrenheit): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (miles per hour): ");
        double windSpeed = scanner.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is %.2f degrees Fahrenheit.\n", windChill);
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        if (windSpeed < 0) {
            throw new IllegalArgumentException("Wind speed cannot be negative.");
        }
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    private static void runTrigonometricFunctions(Scanner scanner) {
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] values = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f°) = %.4f\n", angle, values[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, values[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angle, values[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}
