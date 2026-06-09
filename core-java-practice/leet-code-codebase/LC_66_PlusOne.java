import java.util.Scanner;
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

public class LC_66_PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] result = obj.plusOne(digits);
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}