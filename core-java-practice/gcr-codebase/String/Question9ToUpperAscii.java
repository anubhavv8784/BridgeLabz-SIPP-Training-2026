import java.util.Scanner;

public class Question9ToUpperAscii {
    public static String convertToUpperCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') sb.append((char) (c - 32));
            else sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String conv = convertToUpperCase(s);
        System.out.println("ASCII converted: " + conv);
        System.out.println("toUpperCase(): " + s.toUpperCase());
        System.out.println("Match: " + conv.equals(s.toUpperCase()));
        sc.close();
    }
}
