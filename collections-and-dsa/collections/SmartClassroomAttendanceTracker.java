package collections;
import java.util.*;

public class SmartClassroomAttendanceTracker {

    HashMap<String, ArrayList<String>> attendanceMap = new HashMap<>();
    public void markAttendance(String subject, String student) {
        attendanceMap.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> students = attendanceMap.get(subject);
        if (students.contains(student)) {
            System.out.println(student +
                    " is already marked present in " + subject);
        } else {
            students.add(student);
            System.out.println("Attendance marked for " +
                    student + " in " + subject);
        }
    }
    public void displayAttendance() {

        if (attendanceMap.isEmpty()) {
            System.out.println("No attendance records found.");
            return;
        }

        System.out.println("\n===== Attendance Records =====");

        for (Map.Entry<String, ArrayList<String>> entry :
                attendanceMap.entrySet()) {

            String subject = entry.getKey();
            ArrayList<String> students = entry.getValue();

            System.out.println("\nSubject: " + subject);
            System.out.println("Students Present:");

            for (String student : students) {
                System.out.println("- " + student);
            }

            System.out.println("Total Present: " + students.size());
        }
    }

    public static void main(String[] args) {

        SmartClassroomAttendanceTracker tracker =
                new SmartClassroomAttendanceTracker();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Smart Classroom Attendance Tracker =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Subject Name: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String student = sc.nextLine();

                    tracker.markAttendance(subject, student);
                    break;

                case 2:
                    tracker.displayAttendance();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}