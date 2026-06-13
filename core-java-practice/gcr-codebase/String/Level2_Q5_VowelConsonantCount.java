import java.util.Scanner;

public class Level2_Q5_VowelConsonantCount {
    // 0 = not a letter, 1 = vowel, 2 = consonant
    public static int charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
        if (c < 'a' || c > 'z') return 0;
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return 1;
        return 2;
    }

    public static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            int t = charType(s.charAt(i)); if (t == 1) vowels++; else if (t == 2) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        int[] res = countVowelsConsonants(s);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
        sc.close();
    }
}
