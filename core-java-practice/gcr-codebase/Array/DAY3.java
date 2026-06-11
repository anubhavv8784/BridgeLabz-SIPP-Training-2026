import java.util.*;

class Warehouse {

    public static void main(String[] args) {

        int[] stock = {10, 20, 15, 20, 30, 10};

        // Max, Min, Total
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int num : stock) {
            if (num > max) max = num;
            if (num < min) min = num;
            total += num;
        }

        System.out.println("Max Stock: " + max);
        System.out.println("Min Stock: " + min);
        System.out.println("Total Stock: " + total);

        // Duplicate Detection
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Duplicates: ");

        for (int num : stock) {
            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }

        // Rotate Array by k positions
        int k = 2;
        rotate(stock, k);

        System.out.println("\nRotated Stock Array:");
        System.out.println(Arrays.toString(stock));

        // 2D Shelf Grid
        int[][] shelf = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\nTranspose:");
        transpose(shelf);
    }

    static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
