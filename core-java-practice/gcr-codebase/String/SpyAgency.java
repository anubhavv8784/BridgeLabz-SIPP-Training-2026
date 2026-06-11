import java.util.Scanner;

public class SpyAgencyMessage {

    public static String reverseString(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static boolean isPalindrome(String str) {
        String reverse = reverseString(str);
        return str.equalsIgnoreCase(reverse);
    }

    public static void countVowelsAndConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }

    public static char firstNonRepeatingCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return str.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Secret Message: ");
        String message = sc.nextLine();

        System.out.println("\nReversed Message: "
                + reverseString(message));

        if (isPalindrome(message)) {
            System.out.println("Message is Palindrome");
        } else {
            System.out.println("Message is NOT Palindrome");
        }

        countVowelsAndConsonants(message);

        System.out.print("\nEnter First Intercept: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter Second Intercept: ");
        String intercept2 = sc.nextLine();

        if (isAnagram(intercept1, intercept2)) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }

        char result = firstNonRepeatingCharacter(message);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character = " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}