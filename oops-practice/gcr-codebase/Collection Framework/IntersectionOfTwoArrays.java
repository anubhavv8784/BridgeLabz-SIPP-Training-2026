import java.util.*;

public class IntersectionOfTwoArrays {
    /**
     * LeetCode Problem 349: Intersection of Two Arrays
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must be unique and you may return the result in any order.
     */

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check which elements from nums2 are in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert HashSet to array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }

    public static String arrayToString(int[] arr) {
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode Problem 349: Intersection of Two Arrays ===\n");

        int[] nums1_1 = { 1, 2, 2, 1 };
        int[] nums2_1 = { 2, 2 };
        int[] result1 = intersection(nums1_1, nums2_1);
        System.out.println("Input: nums1 = [1,2,2,1], nums2 = [2,2]");
        System.out.println("Output: " + arrayToString(result1));
        System.out.println("Explanation: The intersection is [2].");

        System.out.println();

        int[] nums1_2 = { 4, 9, 5 };
        int[] nums2_2 = { 9, 4, 9, 8, 4 };
        int[] result2 = intersection(nums1_2, nums2_2);
        System.out.println("Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]");
        System.out.println("Output: " + arrayToString(result2));
        System.out.println("Explanation: The intersection is [4,9] or [9,4].");

        System.out.println();

        int[] nums1_3 = { 1, 2, 3, 4, 5 };
        int[] nums2_3 = { 5, 6, 7, 8, 9 };
        int[] result3 = intersection(nums1_3, nums2_3);
        System.out.println("Input: nums1 = [1,2,3,4,5], nums2 = [5,6,7,8,9]");
        System.out.println("Output: " + arrayToString(result3));
        System.out.println("Explanation: The intersection is [5].");
    }
}
