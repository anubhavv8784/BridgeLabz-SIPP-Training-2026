import java.util.Scanner;

public class Question10ToLowerAscii {
    public static String convertToLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') sb.append((char) (c + 32));
            else sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String conv = convertToLowerCase(s);
        System.out.println("ASCII converted: " + conv);
        System.out.println("toLowerCase(): " + s.toLowerCase());
        System.out.println("Match: " + conv.equals(s.toLowerCase()));
        sc.close();
    }
}
