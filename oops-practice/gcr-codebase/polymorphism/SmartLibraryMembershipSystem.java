import java.util.Scanner;

class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibraryMembershipSystem {

    static void printMembers(LibraryMember[] members, int overdueDays) {
        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine: " + m.calculateFine(overdueDays));
            System.out.println();
        }
    }

    static void searchMember(LibraryMember[] members, String id) {
        boolean found = false;

        for (LibraryMember m : members) {
            if (m.memberId.equals(id)) {
                System.out.println("\nMember Found:");
                m.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nMember not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryMember[] members = new LibraryMember[3];

        System.out.print("Enter Student Name: ");
        String sName = sc.nextLine();
        System.out.print("Enter Student ID: ");
        String sId = sc.nextLine();

        System.out.print("Enter Faculty Name: ");
        String fName = sc.nextLine();
        System.out.print("Enter Faculty ID: ");
        String fId = sc.nextLine();

        System.out.print("Enter Guest Name: ");
        String gName = sc.nextLine();
        System.out.print("Enter Guest ID: ");
        String gId = sc.nextLine();

        members[0] = new StudentMember(sName, sId);
        members[1] = new FacultyMember(fName, fId);
        members[2] = new GuestMember(gName, gId);

        System.out.print("\nEnter overdue days: ");
        int days = sc.nextInt();
        sc.nextLine();

        System.out.println("\nLibrary Members:");
        printMembers(members, days);

        System.out.print("Enter Member ID to search: ");
        String searchId = sc.nextLine();

        searchMember(members, searchId);

        sc.close();
    }
}