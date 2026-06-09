import java.util.Scanner;
public class DisplayResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String studentName = "Sam";

        int rollNumber = 1;

        double percentMarks = 99.99;

        char result = 'P';


        System.out.println("Displaying Result:");
        System.out.println(studentName + " with Roll Number " + rollNumber +
                " has scored " + percentMarks + "% marks and Result is " + result);

        input.close();
    }
}
