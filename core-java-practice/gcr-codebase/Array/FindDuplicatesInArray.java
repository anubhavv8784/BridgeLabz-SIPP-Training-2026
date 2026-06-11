import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int v : arr) freq.put(v, freq.getOrDefault(v, 0) + 1);

        System.out.println("\nDuplicates and counts:");
        boolean any = false;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " -> " + e.getValue());
                any = true;
            }
        }
        if (!any) System.out.println("No duplicates found.");
        sc.close();
    }
}
