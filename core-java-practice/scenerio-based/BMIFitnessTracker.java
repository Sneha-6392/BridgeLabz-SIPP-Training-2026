import java.util.*;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();      // height of client
        int weight = sc.nextInt();      // weight of client
        // Calculate BMI
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMI >= 18.5 & BMI < 24.9) {
            System.out.println("Normal Weight");
        }
        else if (BMI >= 25.0 & BMI < 29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        sc.close();
    }    
}
