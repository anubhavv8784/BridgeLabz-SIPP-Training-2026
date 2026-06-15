import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = scanner.nextDouble();
        }
        scanner.close();

        int youngestIndex = findYoungestFriend(ages);
        int tallestIndex = findTallestFriend(heights);

        System.out.println("Youngest friend: " + names[youngestIndex] + " (age " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (height " + heights[tallestIndex] + " cm)");
    }

    public static int findYoungestFriend(int[] ages) {
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int findTallestFriend(double[] heights) {
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[index]) {
                index = i;
            }
        }
        return index;
    }
}
