import java.util.Arrays;
import java.util.Scanner;

public class Level3_Q2_UniqueCharacters {
    public static int lengthWithoutLength(String s) {
        int c = 0; try { while (true) { s.charAt(c); c++; } } catch (IndexOutOfBoundsException e) {} return c;
    }

    public static char[] uniqueCharacters(String s) {
        int n = lengthWithoutLength(s);
        char[] temp = new char[n]; int ti = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i); boolean unique = true;
            for (int j = 0; j < i; j++) if (s.charAt(j) == c) { unique = false; break; }
            if (unique) temp[ti++] = c;
        }
        return Arrays.copyOf(temp, ti);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        char[] uniques = uniqueCharacters(s);
        System.out.println("Unique chars: " + Arrays.toString(uniques));
        sc.close();
    }
}
