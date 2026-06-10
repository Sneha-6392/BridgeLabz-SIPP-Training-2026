import java.util.*;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > 0) {
                System.out.println("Positive");
            }
            else if (nums[i] < 0) {
                System.out.println("Negative");
            }
            else {
                System.out.println("Zero");
            }
        }
        sc.close();
    }
}
