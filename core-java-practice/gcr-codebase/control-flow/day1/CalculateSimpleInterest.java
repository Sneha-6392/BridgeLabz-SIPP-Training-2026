package day1;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int si = (principle * rate * time) / 100;
        System.out.println("Simple interest: " + si);
        sc.close();
    }
}
