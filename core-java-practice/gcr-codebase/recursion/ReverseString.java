import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(reverse(s));
        sc.close();
    }
    public static String reverse(String s) {
        if (s.length() == 0) {
            return "";
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
