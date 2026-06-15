import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("Simple Interest is: " + simpleInterest(p, r, t));
        sc.close();
    }
    public static int simpleInterest(int p, int r, int t) {
        int si = (p * r * t) / 100;
        return si;
    }
}
