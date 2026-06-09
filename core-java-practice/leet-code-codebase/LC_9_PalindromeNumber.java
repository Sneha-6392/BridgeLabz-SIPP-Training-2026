import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int rev = 0;
        int num = x;
        while (num!= 0) {
            rev = rev * 10 + num % 10;
            num =num / 10;
        }
        return (rev == x);
    }
}

public class LC_9_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        boolean result = obj.isPalindrome(n);
        System.out.println(result);
        sc.close();
    }
 
}