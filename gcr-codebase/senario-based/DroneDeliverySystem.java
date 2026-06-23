public class DroneDeliverySystem {
    public static void main(String[] args) {
        Drone d1 = new Drone("D101", 80);
        Drone d2 = new Drone("D102", 15);
        Drone d3 = new Drone("D103", 60);
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println();
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Verifying shared company name
        System.out.println("Company Name accessed using objects:");
        System.out.println(d1.companyName);
        System.out.println(d2.companyName);
        System.out.println(d3.companyName);
    }
}
class Drone {

    // Instance variables
    String droneId;
    int batteryPercentage;

    // Static variable
    static String companyName = "Sky Logistics";

    // Constructor
    Drone(String droneId, int batteryPercentage) {
        // Using this keyword
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Method to start delivery
    void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println("Drone " + droneId + " has started delivery.");
        } else {
            System.out.println("Drone " + droneId + " cannot start delivery. Battery is low.");
        }
    }

    // Method to display status
    void displayStatus() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
        System.out.println();
    }
}