import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        if (spring(day, month) == true) {
            System.out.println("Its a Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
    public static boolean spring(int day, int month) {
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }
}
