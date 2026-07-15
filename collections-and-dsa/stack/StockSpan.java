package stack;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i])
                stack.pop();
            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();
            stack.push(i);
        }
        System.out.println("Stock Span:");
        for (int x : span)
            System.out.print(x + " ");
        sc.close();
    }
}