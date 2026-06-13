import java.util.Scanner;

public class Question7NumberFormatDemo {
    public static int generate(String s) {
        return Integer.parseInt(s);
    }

    public static void handle(String s) {
        try {
            System.out.println(generate(s));
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: input is not numeric.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to parse as integer: ");
        String s = sc.nextLine();
        handle(s);
        sc.close();
    }
}
