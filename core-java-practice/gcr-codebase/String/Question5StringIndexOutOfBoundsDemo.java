import java.util.Scanner;

public class Question5StringIndexOutOfBoundsDemo {
    public static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }

    public static void handleException(String s) {
        try {
            generateException(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: index out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        handleException(s);
        sc.close();
    }
}
