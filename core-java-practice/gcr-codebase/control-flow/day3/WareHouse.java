package day3;

import java.util.*;

public class WareHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items in warehouse: ");
        int n = sc.nextInt();
        System.out.println("Enter number of stock of the items: ");
        int[] stock = new int[n];
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }
        // Min, Max, Total
        int max = stock[0];
        int min = stock[0];
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (stock[i] > max)
                max = stock[i];
            if (stock[i] < min)
                min = stock[i];
            total += stock[i];
        }
        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);
        System.out.print("Duplicate Quantities: ");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (stock[i] == stock[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted)
                continue;
            for (int j = i + 1; j < n; j++) {
                if (stock[i] == stock[j]) {
                    System.out.print(stock[i] + " ");
                    found = true;
                    break;
                }
            }
        }
        if (!found)
            System.out.print("No Duplicates");
        System.out.println();
        // Rotate Array
        System.out.print("Enter k for rotation: ");
        int k = sc.nextInt();
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }
        System.out.println("Rotated Array:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        System.out.println();
        // 2D Shelf Grid
        System.out.print("Enter rows of shelf grid: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of shelf grid: ");
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter shelf grid values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Transpose
        System.out.println("Transpose of Shelf Grid:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
