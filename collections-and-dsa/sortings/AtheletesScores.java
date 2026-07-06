package sortings;

import java.util.*;

public class AtheletesScores {
    public static int bubbleSort(int n, int[] arr) {
        int cnt = 0;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                    cnt++;
                }
            }
            if (swap == false) {
                break;
            }
        }
        return cnt;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = bubbleSort(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Number of swaps: " + cnt);
        sc.close();
    }
}
