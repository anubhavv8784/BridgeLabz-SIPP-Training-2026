import java.util.Arrays;
import java.util.Scanner;

public class Level3_Q5_FreqUsingUnique {
    public static char[] uniqueCharacters(String s) {
        int n = s.length(); char[] temp = new char[n]; int ti = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i); boolean seen = false;
            for (int j = 0; j < i; j++) if (s.charAt(j) == c) { seen = true; break; }
            if (!seen) temp[ti++] = c;
        }
        return Arrays.copyOf(temp, ti);
    }

    public static String[][] frequencyUsingUnique(String s) {
        char[] uniques = uniqueCharacters(s);
        String[][] out = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            char c = uniques[i]; int count = 0;
            for (int j = 0; j < s.length(); j++) if (s.charAt(j) == c) count++;
            out[i][0] = String.valueOf(c); out[i][1] = String.valueOf(count);
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[][] table = frequencyUsingUnique(s);
        System.out.println("Char\tFreq");
        for (int i = 0; i < table.length; i++) System.out.println(table[i][0] + "\t" + table[i][1]);
        sc.close();
    }
}
