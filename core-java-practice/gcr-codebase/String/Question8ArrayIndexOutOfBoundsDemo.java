import java.util.Scanner;

public class Question8ArrayIndexOutOfBoundsDemo {
    public static void generate(int[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handle(int[] arr) {
        try {
            generate(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: index out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(sc.next());
        handle(arr);
        sc.close();
    }
}
