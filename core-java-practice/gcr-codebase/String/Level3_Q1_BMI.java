import java.util.Scanner;

public class Level3_Q1_BMI {
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    public static String[][] computeBMI(double[][] wh) {
        int n = wh.length; String[][] out = new String[n][4];
        for (int i = 0; i < n; i++) {
            double weight = wh[i][0];
            double heightCm = wh[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            out[i][0] = String.valueOf((int)heightCm);
            out[i][1] = String.valueOf((int)weight);
            out[i][2] = String.format("%.2f", bmi);
            out[i][3] = bmiStatus(bmi);
        }
        return out;
    }

    public static void display(String[][] table) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1] + "\t\t" + table[i][2] + "\t" + table[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[][] wh = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i+1) + " weight (kg): ");
            wh[i][0] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " height (cm): ");
            wh[i][1] = sc.nextDouble();
        }
        String[][] res = computeBMI(wh);
        display(res);
        sc.close();
    }
}
