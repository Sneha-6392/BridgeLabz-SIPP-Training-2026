package sortings;

import java.util.*;

public class SortEmployeeIDs {
    public static void intsertionSort(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        intsertionSort(n, arr);
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
