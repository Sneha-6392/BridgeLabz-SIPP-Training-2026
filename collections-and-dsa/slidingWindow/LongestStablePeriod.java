package slidingWindow;

import java.util.*;

public class LongestStablePeriod {
    public static int longestSubarray(int[] levels, int limit) {
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < levels.length; right++) {
            while (!maxDeque.isEmpty() && levels[maxDeque.peekLast()] < levels[right])
                maxDeque.pollLast();
            while (!minDeque.isEmpty() && levels[minDeque.peekLast()] > levels[right])
                minDeque.pollLast();
            maxDeque.offerLast(right);
            minDeque.offerLast(right);
            while (levels[maxDeque.peekFirst()] - levels[minDeque.peekFirst()] > limit) {
                if (maxDeque.peekFirst() == left)
                    maxDeque.pollFirst();

                if (minDeque.peekFirst() == left)
                    minDeque.pollFirst();

                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] levels = {8, 2, 4, 7};
        int limit = 4;
        System.out.println(longestSubarray(levels, limit));
    }
}