import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            long r = x % 10;
            rev = (rev * 10) + r;
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) rev;
        }
    }
}

public class LC_7_ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution obj = new Solution();
        int result = obj.reverse(x);
        System.out.println(result);
        sc.close();
    }
}