import java.util.Scanner;

public class Question6IllegalArgumentDemo {
    public static String generate(String s, int start, int end) {
        if (start > end) throw new IllegalArgumentException("start index greater than end index");
        return s.substring(start, end);
    }

    public static void handle(String s, int start, int end) {
        try {
            System.out.println(generate(s, start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter start index: ");
        int st = Integer.parseInt(sc.next());
        System.out.print("Enter end index: ");
        int en = Integer.parseInt(sc.next());
        handle(s, st, en);
        sc.close();
    }
}
