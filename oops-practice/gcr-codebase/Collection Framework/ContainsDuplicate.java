import java.util.*;

public class ContainsDuplicate {
    /**
     * LeetCode Problem 217: Contains Duplicate
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     */

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode Problem 217: Contains Duplicate ===\n");

        int[] nums1 = { 1, 2, 3, 1 };
        System.out.println("Input: nums = [1,2,3,1]");
        System.out.println("Output: " + containsDuplicate(nums1));
        System.out.println("Explanation: The value 1 appears at least twice in the array.");

        System.out.println();

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Input: nums = [1,2,3,4]");
        System.out.println("Output: " + containsDuplicate(nums2));
        System.out.println("Explanation: All elements are distinct.");

        System.out.println();

        int[] nums3 = { 99, 99 };
        System.out.println("Input: nums = [99,99]");
        System.out.println("Output: " + containsDuplicate(nums3));
        System.out.println("Explanation: The value 99 appears twice.");

        System.out.println();

        int[] nums4 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Input: nums = [1,1,1,3,3,4,3,2,4,2]");
        System.out.println("Output: " + containsDuplicate(nums4));
        System.out.println("Explanation: Multiple duplicate values exist.");
    }
}
