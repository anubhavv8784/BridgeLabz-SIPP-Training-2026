// PenDistribution calculates equal distribution of 14 pens among 3 students
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;

        int penPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
