package day2.level2;

import java.util.*;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int counter = number - 1;
            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}