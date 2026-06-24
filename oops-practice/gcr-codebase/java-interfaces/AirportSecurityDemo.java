interface LuggageScanner {

    boolean scanLuggage(double luggageWeight);

    default void displaySecurityGuidelines() {
        System.out.println("Luggage Guidelines:");
        System.out.println("Maximum allowed luggage weight is 25 kg.");
    }

    static boolean isPassportNumberValid(String passportNo) {
    
        return passportNo.length() == 8 && passportNo.startsWith("P");
    }
}

interface PassportVerifier {

    boolean verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Passport Guidelines:");
        System.out.println("Passengers must carry a valid passport.");
    }
}

class AirportSecuritySystem
        implements LuggageScanner, PassportVerifier {

    @Override
    public boolean scanLuggage(double luggageWeight) {
        return luggageWeight <= 25;
    }

    @Override
    public boolean verifyPassport(String passportNo) {
        return LuggageScanner.isPassportNumberValid(passportNo);
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

public class AirportSecurityDemo {

    public static void main(String[] args) {

        String[] passengerNames = {"Amit", "Priya", "Rahul", "Sneha"};

        String[] passportNumbers = {"P1234567", "A9876543", "P7654321", "P111"};

        double[] luggageWeights = {20.5, 28.0, 18.0, 22.0};

        AirportSecuritySystem security = new AirportSecuritySystem();

        security.displaySecurityGuidelines();

        System.out.println("\nPassenger Verification:\n");

        for (int i = 0; i < passengerNames.length; i++) {

            System.out.println("Passenger: " + passengerNames[i]);

            boolean passportValid = security.verifyPassport(passportNumbers[i]);

            boolean luggageValid = security.scanLuggage(luggageWeights[i]);

            if (passportValid && luggageValid) {
                System.out.println("Status: Allowed to Board");
            } else {
                System.out.println("Status: Not Allowed to Board");
            }

            System.out.println();
        }
    }
}