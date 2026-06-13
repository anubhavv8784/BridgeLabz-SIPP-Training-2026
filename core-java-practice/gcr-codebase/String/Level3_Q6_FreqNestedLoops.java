import java.util.ArrayList;
import java.util.Scanner;

public class Level3_Q6_FreqNestedLoops {
    public static String[] frequencyNested(String s) {
        int n = s.length(); char[] arr = s.toCharArray(); int[] freq = new int[n];
        for (int i = 0; i < n; i++) freq[i] = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') continue;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) { freq[i]++; arr[j] = '0'; }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) if (arr[i] != '0') list.add(arr[i] + "\t" + freq[i]);
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[] out = frequencyNested(s);
        System.out.println("Char\tFreq");
        for (String line : out) System.out.println(line.replace('\t', '\t'));
        sc.close();
    }
}
