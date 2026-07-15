package queue;

import java.util.*;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
                dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1)
                ans[idx++] = nums[dq.peekFirst()];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10, 8, 7, 5, 12, 15, 6, 9};
        int k = 3;
        int[] ans = maxSlidingWindow(arr, k);
        for (int x : ans)
            System.out.print(x + " ");
    }
}