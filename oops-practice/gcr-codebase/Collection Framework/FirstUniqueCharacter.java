import java.util.*;

public class FirstUniqueCharacter {
    /**
     * LeetCode Problem 387: First Unique Character in a String
     * Given a string s, find the first non-repeating character in it and return its index.
     * If the string does not contain a unique character, return -1.
     */

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find first character with count 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode Problem 387: First Unique Character in a String ===\n");

        String s1 = "leetcode";
        int result1 = firstUniqChar(s1);
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: " + result1);
        if (result1 != -1) {
            System.out.println("Explanation: The character '" + s1.charAt(result1) + "' at index " + result1 + " is the first non-repeating character.");
        }

        System.out.println();

        String s2 = "loveleetcode";
        int result2 = firstUniqChar(s2);
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output: " + result2);
        if (result2 != -1) {
            System.out.println("Explanation: The character '" + s2.charAt(result2) + "' at index " + result2 + " is the first non-repeating character.");
        }

        System.out.println();

        String s3 = "aabb";
        int result3 = firstUniqChar(s3);
        System.out.println("Input: s = \"" + s3 + "\"");
        System.out.println("Output: " + result3);
        System.out.println("Explanation: No unique character found.");

        System.out.println();

        String s4 = "abcdefg";
        int result4 = firstUniqChar(s4);
        System.out.println("Input: s = \"" + s4 + "\"");
        System.out.println("Output: " + result4);
        if (result4 != -1) {
            System.out.println("Explanation: The character '" + s4.charAt(result4) + "' at index " + result4 + " is the first non-repeating character.");
        }
    }
}
