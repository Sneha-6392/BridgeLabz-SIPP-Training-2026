package hashing;

import java.util.*;

public class DuplicateSessionToken {
    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] tokens = new String[n];
        if (hasDuplicateToken(tokens))
            System.out.println("Duplicate Token Found");
        else
            System.out.println("No Duplicate Token");
        sc.close();
    }
}