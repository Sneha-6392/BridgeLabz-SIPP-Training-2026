package day1;

import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of a rectangle: " + perimeter);
        sc.close();
    }
}
