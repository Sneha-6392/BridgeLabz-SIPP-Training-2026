import java.util.*;

public class Comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        System.out.println(str1.equals(str2));
        sc.close();
    }
}
