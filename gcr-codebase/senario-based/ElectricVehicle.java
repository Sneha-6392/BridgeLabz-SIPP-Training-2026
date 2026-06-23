public class ElectricVehicle {
    public static void main(String[] args) {
        ChargingStation s1 = new ChargingStation("CS101", 100);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 200);
        ChargingStation s4 = new ChargingStation("CS104", 120);
        ChargingStation s5 = new ChargingStation("CS105", 180);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);

        // Changing electricity rate
        ChargingStation.electricityRate = 10.0;

        System.out.println("\nAfter changing electricity rate:\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
    }
}
class ChargingStation {

    // Static variables
    static int totalStations = 0;
    static double electricityRate = 8.5; // per unit

    // Instance variables
    String stationId;
    int unitsConsumed;

    // Constructor
    ChargingStation(String stationId, int unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display station details
    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate);
        System.out.println("Bill Amount: " + calculateBill());
        System.out.println();
    }
}

