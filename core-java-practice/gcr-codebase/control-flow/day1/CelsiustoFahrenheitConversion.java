package day1;

import java.util.Scanner;

public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Temprature in fahrenheit: " + fahrenheit);
        sc.close();
    }
}
