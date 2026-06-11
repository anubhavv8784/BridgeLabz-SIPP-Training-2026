import java.util.Scanner;

public class Voting10StudentsLevel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) ages[i] = sc.nextInt();

        for (int a : ages) {
            if (a < 0) System.out.println("Invalid age: " + a);
            else if (a >= 18) System.out.println("The student with the age " + a + " can vote.");
            else System.out.println("The student with the age " + a + " cannot vote.");
        }
        sc.close();
    }
}
