public class ParkingManagement {
     static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    // Display only bikes
    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("DL01AB1234", "Aman", "Car");
        vehicles[1] = new Vehicle("DL02CD5678", "Riya", "Bike");
        vehicles[2] = new Vehicle("DL03EF1111", "Rahul", "Car");
        vehicles[3] = new Vehicle("DL04GH2222", "Priya", "Bike");
        vehicles[4] = new Vehicle("DL05IJ3333", "Karan", "Car");
        vehicles[5] = new Vehicle("DL06KL4444", "Neha", "Bike");
        vehicles[6] = new Vehicle("DL07MN5555", "Arjun", "Car");
        vehicles[7] = new Vehicle("DL08OP6666", "Sneha", "Bike");
        vehicles[8] = new Vehicle("DL09QR7777", "Vikas", "Car");
        vehicles[9] = new Vehicle("DL10ST8888", "Pooja", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    // Constructor
    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }
}