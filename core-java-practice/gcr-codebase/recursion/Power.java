import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
        sc.close();
    }
    public static int power(int n, int x) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
