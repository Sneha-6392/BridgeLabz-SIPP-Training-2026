package day2;

import java.util.Scanner;

public class KingdomTax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalTax = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter income of citizen " + i + ": ");
            double income = sc.nextDouble();
            double tax;
            if (income < 10000) {
                tax = income * 0.05;
                System.out.println("Tax Bracket: 5%");
            } else if (income <= 50000) {
                tax = income * 0.15;
                System.out.println("Tax Bracket: 15%");
            } else {
                tax = income * 0.30;
                System.out.println("Tax Bracket: 30%");
            }
            System.out.println("Tax Amount: " + tax);
            totalTax += tax;
        }
        System.out.println("Total Tax Collected: " + totalTax);
        sc.close();
    }
}