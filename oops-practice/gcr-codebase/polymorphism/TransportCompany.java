abstract class Vehicle {
    abstract double fuelCost(int km);
}

class Car extends Vehicle {
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {
    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportCompany {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car();
        vehicles[1] = new Bus();
        vehicles[2] = new Bike();
        vehicles[3] = new ElectricCar();

        int km = 100;

        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                System.out.println("Car Fuel Cost = " + ((Car) v).fuelCost(km));
            } else if (v instanceof Bus) {
                System.out.println("Bus Fuel Cost = " + ((Bus) v).fuelCost(km));
            } else if (v instanceof Bike) {
                System.out.println("Bike Fuel Cost = " + ((Bike) v).fuelCost(km));
            } else if (v instanceof ElectricCar) {
                System.out.println("Electric Car Fuel Cost = " + ((ElectricCar) v).fuelCost(km));
            }
        }
    }
}