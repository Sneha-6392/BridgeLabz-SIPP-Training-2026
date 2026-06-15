package day5;

import java.util.*;

public class MathWizard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(factorial(n));
        System.out.println(factorial((double)n));
        System.out.println(fibbonaci(n));
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
        System.out.println(power(base, exp));
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int factorial(int n) {
        int fact = 1;
        while (n != 0) {
            fact *= n;
            n -= 1;
        }
        return fact;
    }
    public static double factorial(double n) {
        double fact = 1;
        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int fibbonaci(int n) {
        if (n <= 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int power(int base, int exp) {
        return (int) Math.pow(base, exp);
    }
    
}
