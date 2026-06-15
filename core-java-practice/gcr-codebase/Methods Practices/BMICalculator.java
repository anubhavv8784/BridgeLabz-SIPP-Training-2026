import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] people = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            people[i][0] = scanner.nextDouble();
            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            people[i][1] = scanner.nextDouble();
        }
        scanner.close();

        calculateBMI(people);
        displayBMIStatus(people);
    }

    public static void calculateBMI(double[][] people) {
        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double heightInMeters = people[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            people[i][2] = bmi;
        }
    }

    public static String[] displayBMIStatus(double[][] people) {
        String[] statuses = new String[people.length];
        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double height = people[i][1];
            double bmi = people[i][2];
            String status = getBMIStatus(bmi);
            statuses[i] = status;
            System.out.printf("Person %d: weight=%.2f kg, height=%.2f cm, BMI=%.2f, status=%s\n",
                    i + 1, weight, height, bmi, status);
        }
        return statuses;
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        }
        return "Obese";
    }
}
