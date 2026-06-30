import java.util.*;

public class FirstUniqueEvenElement {
    /**
     * LeetCode Problem 3866: Find First Unique Element Every Query
     * Given an integer array nums and a queries array, for each query,
     * find the first unique even element in nums after rotating nums by the given query amount.
     * Return an array of query results.
     */

    public static int[] firstUniqueEvenElementQuery(int[] nums, int[] queries) {
        int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int rotation = queries[q] % nums.length;
            HashMap<Integer, Integer> count = new HashMap<>();

            // Count frequency of elements in rotated array
            for (int i = 0; i < nums.length; i++) {
                int rotatedIndex = (i + rotation) % nums.length;
                count.put(nums[rotatedIndex], count.getOrDefault(nums[rotatedIndex], 0) + 1);
            }

            // Find first unique even element
            result[q] = -1;
            for (int i = 0; i < nums.length; i++) {
                int rotatedIndex = (i + rotation) % nums.length;
                int element = nums[rotatedIndex];

                if (element % 2 == 0 && count.get(element) == 1) {
                    result[q] = element;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode Problem 3866: First Unique Even Element ===\n");

        int[] nums1 = { 2, 3, 4, 5, 6, 7, 2, 4 };
        int[] queries1 = { 0, 2, 4 };
        int[] result1 = firstUniqueEvenElementQuery(nums1, queries1);
        System.out.println("Input: nums = [2,3,4,5,6,7,2,4], queries = [0,2,4]");
        System.out.println("Output: " + Arrays.toString(result1));

        System.out.println();

        int[] nums2 = { 1, 3, 5, 7, 9 };
        int[] queries2 = { 0, 1, 2 };
        int[] result2 = firstUniqueEvenElementQuery(nums2, queries2);
        System.out.println("Input: nums = [1,3,5,7,9], queries = [0,1,2]");
        System.out.println("Output: " + Arrays.toString(result2));
        System.out.println("Explanation: No even elements present.");

        System.out.println();

        int[] nums3 = { 2, 4, 6, 8, 2, 4 };
        int[] queries3 = { 0, 1, 2 };
        int[] result3 = firstUniqueEvenElementQuery(nums3, queries3);
        System.out.println("Input: nums = [2,4,6,8,2,4], queries = [0,1,2]");
        System.out.println("Output: " + Arrays.toString(result3));
    }
}
