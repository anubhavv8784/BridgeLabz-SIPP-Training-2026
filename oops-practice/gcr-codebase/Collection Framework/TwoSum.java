import java.util.*;

public class TwoSum {
    /**
     * LeetCode Problem 1: Two Sum
     * Given an array of integers nums and an integer target, return the indices of the two numbers
     * that add up to the target. You may assume each input has exactly one solution,
     * and you cannot use the same element twice.
     */

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode Problem 1: Two Sum ===\n");

        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Input: nums = [2,7,11,15], target = 9");
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]");
        System.out.println("Explanation: nums[" + result1[0] + "] + nums[" + result1[1] + "] = " + nums1[result1[0]] + " + " + nums1[result1[1]] + " = " + target1);

        System.out.println();

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Input: nums = [3,2,4], target = 6");
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]");
        System.out.println("Explanation: nums[" + result2[0] + "] + nums[" + result2[1] + "] = " + nums2[result2[0]] + " + " + nums2[result2[1]] + " = " + target2);

        System.out.println();

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Input: nums = [3,3], target = 6");
        System.out.println("Output: [" + result3[0] + "," + result3[1] + "]");
        System.out.println("Explanation: nums[" + result3[0] + "] + nums[" + result3[1] + "] = " + nums3[result3[0]] + " + " + nums3[result3[1]] + " = " + target3);
    }
}
