import java.util.ArrayList;
import java.util.Scanner;

public class Level3_Q4_Frequency2D {
    public static String[][] frequencyTable(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0; i < 256; i++) if (freq[i] > 0) list.add(new String[]{String.valueOf((char)i), String.valueOf(freq[i])});
        String[][] out = new String[list.size()][2];
        return list.toArray(out);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[][] table = frequencyTable(s);
        System.out.println("Char\tFreq");
        for (int i = 0; i < table.length; i++) System.out.println(table[i][0] + "\t" + table[i][1]);
        sc.close();
    }
}
