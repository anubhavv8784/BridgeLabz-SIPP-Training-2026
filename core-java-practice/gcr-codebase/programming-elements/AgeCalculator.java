// AgeCalculator computes the age of Harry based on birth year 2000 and current year 2024
public class AgeCalculator {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
