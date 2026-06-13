import java.util.Scanner;

public class Level3_Q7_PalindromeChecks {
    public static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) { if (s.charAt(i) != s.charAt(j)) return false; i++; j--; }
        return true;
    }

    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start+1, end-1);
    }

    public static String reverseUsingCharAt(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static boolean isPalindromeUsingReverse(String s) {
        return s.equals(reverseUsingCharAt(s));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        System.out.println("Iterative: " + isPalindromeIterative(s));
        System.out.println("Recursive: " + isPalindromeRecursive(s, 0, s.length()-1));
        System.out.println("Reverse compare: " + isPalindromeUsingReverse(s));
        sc.close();
    }
}
