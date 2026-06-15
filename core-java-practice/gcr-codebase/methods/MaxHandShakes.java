import java.util.*;

public class MaxHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The maximum number of handshakes among students: " + maxHandShakes(n));
        sc.close();
    }
    public static int maxHandShakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
