import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month as integer (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day of month: ");
        int day = scanner.nextInt();
        scanner.close();

        if (isSpringSeason(month, day)) {
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
}
