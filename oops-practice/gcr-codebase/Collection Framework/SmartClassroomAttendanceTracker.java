import java.util.*;

public class SmartClassroomAttendanceTracker {
    private HashMap<String, ArrayList<String>> attendanceRecords;
    private HashMap<String, HashSet<String>> attendanceSet;

    public SmartClassroomAttendanceTracker() {
        attendanceRecords = new HashMap<>();
        attendanceSet = new HashMap<>();
    }

    public void markAttendance(String subject, String studentName) {
        attendanceRecords.putIfAbsent(subject, new ArrayList<>());
        attendanceSet.putIfAbsent(subject, new HashSet<>());

        HashSet<String> subjectSet = attendanceSet.get(subject);

        if (subjectSet.contains(studentName)) {
            System.out.println("Error: " + studentName + " is already marked present in " + subject + "!");
            return;
        }

        attendanceRecords.get(subject).add(studentName);
        subjectSet.add(studentName);
        System.out.println(studentName + " marked present in " + subject + ".");
    }

    public void displayAttendanceBySubject(String subject) {
        if (!attendanceRecords.containsKey(subject)) {
            System.out.println("No records found for subject: " + subject);
            return;
        }

        System.out.println("\n=== Attendance for " + subject + " ===");
        ArrayList<String> students = attendanceRecords.get(subject);
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
        System.out.println("Total students present: " + students.size());
    }

    public void displayAllSubjectsAttendance() {
        System.out.println("\n=== Complete Attendance Records ===");
        for (String subject : attendanceRecords.keySet()) {
            ArrayList<String> students = attendanceRecords.get(subject);
            System.out.println(subject + ": " + students.size() + " students present");
            for (String student : students) {
                System.out.println("  - " + student);
            }
        }
    }

    public int getTotalStudentsBySubject(String subject) {
        if (attendanceRecords.containsKey(subject)) {
            return attendanceRecords.get(subject).size();
        }
        return 0;
    }

    public static void main(String[] args) {
        SmartClassroomAttendanceTracker tracker = new SmartClassroomAttendanceTracker();

        System.out.println("=== Marking Attendance ===");
        tracker.markAttendance("Mathematics", "Amit");
        tracker.markAttendance("Mathematics", "Bhavna");
        tracker.markAttendance("Mathematics", "Charan");

        tracker.markAttendance("Physics", "Amit");
        tracker.markAttendance("Physics", "Divya");

        tracker.markAttendance("Chemistry", "Bhavna");
        tracker.markAttendance("Chemistry", "Charan");
        tracker.markAttendance("Chemistry", "Divya");

        System.out.println("\n=== Attempting Duplicate Attendance ===");
        tracker.markAttendance("Mathematics", "Amit");

        tracker.displayAttendanceBySubject("Mathematics");
        tracker.displayAttendanceBySubject("Physics");

        tracker.displayAllSubjectsAttendance();

        System.out.println("\n=== Total Students Summary ===");
        System.out.println("Mathematics: " + tracker.getTotalStudentsBySubject("Mathematics") + " students");
        System.out.println("Physics: " + tracker.getTotalStudentsBySubject("Physics") + " students");
        System.out.println("Chemistry: " + tracker.getTotalStudentsBySubject("Chemistry") + " students");
    }
}
