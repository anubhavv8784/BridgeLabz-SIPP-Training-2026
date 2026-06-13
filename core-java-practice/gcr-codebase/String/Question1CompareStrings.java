import java.util.Scanner;

public class Question1CompareStrings {
    public static boolean compareStrings(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string (no spaces): ");
        String a = sc.next();
        System.out.print("Enter second string (no spaces): ");
        String b = sc.next();
        boolean byCharAt = compareStrings(a, b);
        boolean byEquals = a.equals(b);
        System.out.println("compareStrings (charAt): " + byCharAt);
        System.out.println("equals(): " + byEquals);
        System.out.println("Results match: " + (byCharAt == byEquals));
        sc.close();
    }
}
