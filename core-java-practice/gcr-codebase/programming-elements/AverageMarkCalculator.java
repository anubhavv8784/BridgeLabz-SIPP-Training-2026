// AverageMarkCalculator computes the average percentage mark in Physics, Chemistry, and Math
public class AverageMarkCalculator {
    public static void main(String[] args) {
        int mathMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        double averageMark = (mathMark + physicsMark + chemistryMark) / 3.0;

        System.out.println("Sam's average mark in PCM is " + averageMark);
    }
}
