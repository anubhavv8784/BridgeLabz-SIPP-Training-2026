import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] res = new int[4];
        int idx = 0;
        for (int i = 6; i <= 9; i++) res[idx++] = n * i;
        idx = 0;
        for (int i = 6; i <= 9; i++) System.out.println(n + " * " + i + " = " + res[idx++]);
        sc.close();
    }
}
