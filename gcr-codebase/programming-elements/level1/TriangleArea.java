import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;
        System.out.println("The area of the triangle in square inches is "  + areaInSqInches + " and in square centimeters is "  + areaInSqCm);
        sc.close();
    }
}