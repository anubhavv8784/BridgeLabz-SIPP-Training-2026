import java.util.Scanner;

public class Level2_Q1_LengthWithoutLength {
    public static int lengthWithoutLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string (no spaces): ");
        String s = sc.next();
        int computed = lengthWithoutLength(s);
        int builtin = s.length();
        System.out.println("Computed length: " + computed);
        System.out.println("Built-in length(): " + builtin);
        System.out.println("Match: " + (computed == builtin));
        sc.close();
    }
}
