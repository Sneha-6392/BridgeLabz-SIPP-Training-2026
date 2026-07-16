abstract class BankAccount {
    // Private fields (Encapsulation)
    private String accountNumber;
    private String holderName;
    private double balance;

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }

    // Abstract Method (Abstraction)
    public abstract double calculateInterest();
}

// SavingsAccount Class
class SavingsAccount extends BankAccount {

    private double interestRate;

    // Getter and Setter
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Implement abstract method
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

// CurrentAccount Class
class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    // Getter and Setter
    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    // Implement abstract method
    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}


public class BankingManagementSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("SA101");
        sa.setHolderName("Astha");
        sa.setBalance(50000);
        sa.setInterestRate(5);

        sa.deposit(10000);
        sa.withdraw(5000);

        System.out.println("\nSavings Account Details:");
        sa.displayAccountDetails();
        System.out.println("Interest: ₹" + sa.calculateInterest());

        System.out.println();

        // Current Account Object
        CurrentAccount ca = new CurrentAccount();
        ca.setAccountNumber("CA201");
        ca.setHolderName("Rahul");
        ca.setBalance(80000);
        ca.setMonthlyBonusRate(2);

        ca.deposit(20000);
        ca.withdraw(10000);

        System.out.println("\nCurrent Account Details:");
        ca.displayAccountDetails();
        System.out.println("Interest/Bonus: ₹" + ca.calculateInterest());
    }
}
