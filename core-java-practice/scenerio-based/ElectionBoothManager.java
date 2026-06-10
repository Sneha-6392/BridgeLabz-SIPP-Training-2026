import java.util.*;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;
        while (true) {
            System.out.print("Enter voter code (or 'exit' to stop): ");
            String code = sc.next();
            if (code.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("Eligible to vote");
                System.out.println("Vote for:");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");
                int vote = sc.nextInt();
                switch (vote) {
                    case 1:
                        candidate1++;
                        System.out.println("Vote recorded for Candidate 1");
                        break;
                    case 2:
                        candidate2++;
                        System.out.println("Vote recorded for Candidate 2");
                        break;
                    case 3:
                        candidate3++;
                        System.out.println("Vote recorded for Candidate 3");
                        break;
                    default:
                        System.out.println("Invalid vote");
                }
            } else {
                System.out.println("Not eligible to vote");
            }
            System.out.println();
        }
        System.out.println("\nVoting Closed");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);
        sc.close();
    }
}