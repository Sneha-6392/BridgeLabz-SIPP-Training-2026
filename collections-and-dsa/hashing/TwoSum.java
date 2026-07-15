package hashing;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] transactions, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < transactions.length; i++) {
            int complement = target - transactions[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(transactions[i], i);
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        int[] transactions = new int[n];
        System.out.println("Enter transaction amounts:");
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }
        System.out.print("Enter target amount: ");
        int target = sc.nextInt();
        int[] ans = twoSum(transactions, target);
        if (ans[0] != -1) {
            System.out.println("Pair found at indices: " + ans[0] + " and " + ans[1]);
            System.out.println("Values: " + transactions[ans[0]] + " + " + transactions[ans[1]] + " = " + target);
        } else {
            System.out.println("No pair found.");
        }
        sc.close();
    }
}