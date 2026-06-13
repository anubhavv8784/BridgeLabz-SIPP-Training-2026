import java.util.Scanner;

public class Question2CreateSubstring {
    public static String createSubstring(String s, int start, int end) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter start index: ");
        int start = Integer.parseInt(sc.next());
        System.out.print("Enter end index: ");
        int end = Integer.parseInt(sc.next());
        sc.nextLine();
        String byCharAt = createSubstring(s, start, end);
        String bySubstring = s.substring(Math.max(0, start), Math.min(s.length(), end));
        System.out.println("createSubstring(): " + byCharAt);
        System.out.println("substring(): " + bySubstring);
        System.out.println("Match: " + byCharAt.equals(bySubstring));
        sc.close();
    }
}
