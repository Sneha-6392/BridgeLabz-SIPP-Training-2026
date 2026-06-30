import java.util.ArrayList;
import java.util.Scanner;
public class SmartParkingManager {
    ArrayList<String> parkedVehicles = new ArrayList<>();

    public void vehicleEntry(String regNo) {
        if (parkedVehicles.contains(regNo)) {
            System.out.println("Vehicle is already parked.");
        } else {
            parkedVehicles.add(regNo);
            System.out.println("Vehicle " + regNo + " entered successfully.");
        }
    }
    public void vehicleExit(String regNo) {
        if (parkedVehicles.remove(regNo)) {
            System.out.println("Vehicle " + regNo + " exited successfully.");
        } else {
            System.out.println("Vehicle not found in parking area.");
        }
    }
    public void searchVehicle(String regNo) {
        if (parkedVehicles.contains(regNo)) {
            System.out.println("Vehicle " + regNo + " is currently parked.");
        } else {
            System.out.println("Vehicle " + regNo + " is not parked.");
        }
    }
    public void displayVehicles() {
        if (parkedVehicles.isEmpty()) {
            System.out.println("Parking area is empty.");
        } else {
            System.out.println("\nVehicles currently parked:");
            for (String vehicle : parkedVehicles) {
                System.out.println(vehicle);
            }
            System.out.println("\nTotal Occupied Slots: " + parkedVehicles.size());
        }
    }
    public static void main(String[] args) {
        SmartParkingManager spm = new SmartParkingManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Smart Parking Slot Manager =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String entryReg = sc.nextLine();
                    spm.vehicleEntry(entryReg);
                    break;
                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String exitReg = sc.nextLine();
                    spm.vehicleExit(exitReg);
                    break;
                case 3:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String searchReg = sc.nextLine();
                    spm.searchVehicle(searchReg);
                    break;
                case 4:
                    spm.displayVehicles();
                    break;
                case 5:
                    System.out.println("Exiting Smart Parking Manager...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}