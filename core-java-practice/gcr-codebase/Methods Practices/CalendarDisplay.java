import java.util.Scanner;

public class CalendarDisplay {
    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number.");
            return;
        }

        String monthName = MONTH_NAMES[month - 1];
        int days = daysInMonth(month, year);
        int firstDay = firstDayOfMonth(month, year);

        System.out.printf("%s %d\n", monthName, year);
        displayCalendar(firstDay, days);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static int firstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return ((h + 5) % 7) + 1;
    }

    public static void displayCalendar(int firstDay, int totalDays) {
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int currentPosition = 1;
        for (int i = 1; i < firstDay; i++) {
            System.out.print("    ");
            currentPosition++;
        }
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if (currentPosition % 7 == 0) {
                System.out.println();
            }
            currentPosition++;
        }
        System.out.println();
    }
}
