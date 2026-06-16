import java.util.*;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(n);
        sc.close();
    }
    public static void num(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        num(n - 1);
    }
}
