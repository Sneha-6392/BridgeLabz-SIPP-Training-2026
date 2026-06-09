package day2.level2;

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}