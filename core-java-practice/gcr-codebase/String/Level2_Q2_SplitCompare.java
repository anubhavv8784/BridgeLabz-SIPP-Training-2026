import java.util.Arrays;
import java.util.Scanner;

public class Level2_Q2_SplitCompare {
    public static String[] splitUsingCharAt(String s) {
        if (s == null || s.length() == 0) return new String[0];
        // count words by spaces
        int n = s.length();
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ' && !inWord) { inWord = true; wordCount++; }
            else if (s.charAt(i) == ' ') inWord = false;
        }
        String[] words = new String[wordCount];
        int wi = 0;
        int start = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ' && start == -1) start = i;
            if ((s.charAt(i) == ' ' || i == n-1) && start != -1) {
                int end = (s.charAt(i) == ' ') ? i : i+1;
                // build word
                StringBuilder sb = new StringBuilder();
                for (int j = start; j < end; j++) sb.append(s.charAt(j));
                words[wi++] = sb.toString();
                start = -1;
            }
        }
        return words;
    }

    public static boolean compareStringArrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        String[] mine = splitUsingCharAt(line);
        String[] builtin = line.split("\\s+");
        System.out.println("Custom split: " + Arrays.toString(mine));
        System.out.println("Built-in split: " + Arrays.toString(builtin));
        System.out.println("Match: " + compareStringArrays(mine, builtin));
        sc.close();
    }
}
