import java.util.*;
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n /=10;
        }
        return prod - sum;
    }
}

public class LC_1281_SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        int result = obj.subtractProductAndSum(n);
        System.out.println(result);
        sc.close();
    }
}