package day2.level2;

import java.util.*;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int year = sc.nextInt();
        double bonus = 0;
        if (year > 5) {
            bonus = 0.05 * salary;
            System.out.println("Bonus amount is: " + bonus);
        }
        else {
            System.out.println("No Bonus");
        }
        sc.close();
    }
}
