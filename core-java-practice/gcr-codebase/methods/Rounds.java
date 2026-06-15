import java.util.*;

public class Rounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(round(a, b, c));
        sc.close();
    }    
    public static int round(int a, int b, int c) {
        int perimeter = a + b + c;
        int r = 5000 / perimeter;
        return r;
    }
}
