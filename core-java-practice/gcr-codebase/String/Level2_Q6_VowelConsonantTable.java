import java.util.Scanner;

public class Level2_Q6_VowelConsonantTable {
    public static String typeOfChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
        if (c < 'a' || c > 'z') return "Not a Letter";
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
        return "Consonant";
    }

    public static String[][] charTypes(String s) {
        String[][] out = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) { out[i][0] = String.valueOf(s.charAt(i)); out[i][1] = typeOfChar(s.charAt(i)); }
        return out;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (int i = 0; i < table.length; i++) System.out.println(table[i][0] + "\t" + table[i][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[][] table = charTypes(s);
        displayTable(table);
        sc.close();
    }
}
