import java.util.Scanner;

public class Level2_Q4_ShortestLongestWords {
    public static String[] splitUsingCharAt(String s) {
        if (s == null || s.length() == 0) return new String[0];
        int n = s.length(); int wordCount = 0; boolean inWord = false;
        for (int i = 0; i < n; i++) { if (s.charAt(i) != ' ' && !inWord) { inWord = true; wordCount++; } else if (s.charAt(i) == ' ') inWord = false; }
        String[] words = new String[wordCount]; int wi = 0; int start = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ' && start == -1) start = i;
            if ((s.charAt(i) == ' ' || i == n-1) && start != -1) {
                int end = (s.charAt(i) == ' ') ? i : i+1; StringBuilder sb = new StringBuilder();
                for (int j = start; j < end; j++) sb.append(s.charAt(j)); words[wi++] = sb.toString(); start = -1;
            }
        }
        return words;
    }

    public static int lengthWithoutLength(String s) { int c = 0; try { while (true) { s.charAt(c); c++; } } catch (IndexOutOfBoundsException e) {} return c; }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] out = new String[words.length][2];
        for (int i = 0; i < words.length; i++) { out[i][0] = words[i]; out[i][1] = String.valueOf(lengthWithoutLength(words[i])); }
        return out;
    }

    public static int[] shortestAndLongest(String[][] table) {
        if (table.length == 0) return new int[0];
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < Integer.parseInt(table[minIdx][1])) minIdx = i;
            if (len > Integer.parseInt(table[maxIdx][1])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        String[] words = splitUsingCharAt(line);
        String[][] table = wordsWithLengths(words);
        int[] res = shortestAndLongest(table);
        if (res.length == 0) System.out.println("No words found"); else {
            System.out.println("Shortest word: " + table[res[0]][0] + " (" + table[res[0]][1] + ")");
            System.out.println("Longest word: " + table[res[1]][0] + " (" + table[res[1]][1] + ")");
        }
        sc.close();
    }
}
