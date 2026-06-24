class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);

        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();
        
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("\nPetrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}