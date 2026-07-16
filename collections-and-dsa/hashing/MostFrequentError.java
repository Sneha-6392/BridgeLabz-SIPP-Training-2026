package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentError {
    public static int mostFrequent(int[] errors) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int answer = -1;
        for (int code : errors) {
            int freq = map.getOrDefault(code, 0) + 1;
            map.put(code, freq);
            if (freq > maxFreq) {
                maxFreq = freq;
                answer = code;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] error = new int[n];
        for (int i = 0; i < n; i++) {
            error[i] = sc.nextInt();
        }
        System.out.println("Most Frequent Error Code: " + mostFrequent(error));
        sc.close();
    }
}
