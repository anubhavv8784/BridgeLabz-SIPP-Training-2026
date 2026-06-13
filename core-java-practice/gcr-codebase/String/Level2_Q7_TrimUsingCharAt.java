import java.util.Scanner;

public class Level2_Q7_TrimUsingCharAt {
    public static int[] trimIndices(String s) {
        int n = s.length(); int start = 0, end = n-1;
        while (start < n && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (start > end) return new int[]{0,0};
        return new int[]{start, end+1}; // end exclusive
    }

    public static String substringUsingCharAt(String s, int start, int end) {
        if (s == null) return null; StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static boolean compareStringsCharAt(String a, String b) {
        if (a==null || b==null) return false; if (a.length()!=b.length()) return false;
        for (int i=0;i<a.length();i++) if (a.charAt(i)!=b.charAt(i)) return false; return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String s = sc.nextLine();
        int[] idx = trimIndices(s);
        String trimmed = substringUsingCharAt(s, idx[0], idx[1]);
        String builtin = s.trim();
        System.out.println("Custom trimmed: '" + trimmed + "'");
        System.out.println("Built-in trim: '" + builtin + "'");
        System.out.println("Match: " + compareStringsCharAt(trimmed, builtin));
        sc.close();
    }
}
