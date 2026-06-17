class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds");
        }

        System.out.println("Payment successful.");
    }
    public static void main(String[] args) {
        try {
            int totalBill = 100000; 
            int item = 0;
            double costPerItem = totalBill / item;
            System.out.println("Cost of each item: " + costPerItem);
        }
        catch (ArithmeticException e) {
            System.out.println("Error, bill cannot have zero items");
        }
        try {
            String[] patientName = {"Sneha", "Vanshka", "Astha", "Tushar"};
            System.out.println(patientName[5]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Error, patient not found");
        }
        try {
            String name = "Sneha";
            int age = Integer.parseInt(name);
            System.out.println("Patient's age is: " + age);
        }
        catch (NumberFormatException e) {
            System.out.println("Error, invalid number added");
        }
        try {
            processPayment(5000, 3000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hospital billing system is running safely.");
    }
}
