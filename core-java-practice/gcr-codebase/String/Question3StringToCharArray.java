import java.util.Arrays;
import java.util.Scanner;

public class Question3StringToCharArray {
    public static char[] getCharacters(String s) {
        if (s == null) return new char[0];
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        char[] a = getCharacters(s);
        char[] b = s.toCharArray();
        System.out.println("getCharacters(): " + Arrays.toString(a));
        System.out.println("toCharArray(): " + Arrays.toString(b));
        System.out.println("Match: " + compareCharArrays(a, b));
        sc.close();
    }
}
