public class ATMSystem {
    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {
        double balance = 5000;
        double amount = 8000;
        try {
            withdraw(balance, amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance! Available Balance: ₹" + balance + ", Requested Amount: ₹" + amount);
    }
}