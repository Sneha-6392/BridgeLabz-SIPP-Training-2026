package collections;
import java.util.HashSet;
import java.util.Scanner;

public class EventEntryVerificationSystem {
    HashSet<String> participants = new HashSet<>();
    public void registerParticipant(String email) {
        if (participants.add(email)) {
            System.out.println("Registration successful for: " + email);
        } else {
            System.out.println("Duplicate registration! " + email +
                               " is already registered.");
        }
    }
    public void displayParticipants() {
        if (participants.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            System.out.println("\nUnique Registered Participants:");
            for (String email : participants) {
                System.out.println(email);
            }

            System.out.println("\nTotal Eligible Attendees: "
                               + participants.size());
        }
    }
    public static void main(String[] args) {
        EventEntryVerificationSystem event =
                new EventEntryVerificationSystem();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Event Entry Verification System =====");
            System.out.println("1. Register Participant");
            System.out.println("2. Display Registered Participants");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Participant Email ID: ");
                    String email = sc.nextLine();
                    event.registerParticipant(email);
                    break;

                case 2:
                    event.displayParticipants();
                    break;

                case 3:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}