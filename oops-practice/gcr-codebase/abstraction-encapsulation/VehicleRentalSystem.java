abstract class Vehicle {
    // Private fields
    private String vehicleNumber;
    private String vehicleType;
    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public abstract double calculateRentalCost(int days);
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

// Car class
class Car extends Vehicle {

    private double dailyRate;

    // Getter and Setter
    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Implement abstract method
    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Bike class
class Bike extends Vehicle {

    private double dailyRate;

    // Getter and Setter
    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Implement abstract method
    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Truck class
class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    // Getters and Setters
    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    // Implement abstract method
    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car();
        car.setVehicleNumber("CAR101");
        car.setVehicleType("Car");
        car.setDailyRate(2000);

        // Bike Object
        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE201");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        // Truck Object
        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK301");
        truck.setVehicleType("Truck");
        truck.setDailyRate(5000);
        truck.setLoadingCharge(2000);

        int days = 5;

        // Display Car Details
        System.out.println("Car Details:");
        car.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days: ₹"
                + car.calculateRentalCost(days));

        System.out.println();

        // Display Bike Details
        System.out.println("Bike Details:");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days: ₹"
                + bike.calculateRentalCost(days));

        System.out.println();

        // Display Truck Details
        System.out.println("Truck Details:");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days: ₹"
                + truck.calculateRentalCost(days));
    
    }
}
