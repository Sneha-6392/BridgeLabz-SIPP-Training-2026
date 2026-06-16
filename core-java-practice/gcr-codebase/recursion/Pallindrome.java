import java.util.*;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = 0;
        int end = s.length() - 1;
        System.out.println(isPallindrome(s, start, end));
        sc.close();
    }
    public static boolean isPallindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPallindrome(s, start + 1, end - 1);
    }
}
