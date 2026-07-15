package stack;

import java.util.*;

public class NextGreaterPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && price[i] > price[stack.peek()]) {
                ans[stack.pop()] = price[i];
            }
            stack.push(i);
        }
        System.out.println("Next Greater Prices:");
        for (int x : ans)
            System.out.print(x + " ");
        sc.close();
    }
}