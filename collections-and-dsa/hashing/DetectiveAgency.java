package hashing;

import java.util.*;

public class DetectiveAgency {
    static void mostInvestigated(HashMap<String, ArrayList<Integer>> suspects) {
        String ans = "";
        int max = 0;
        for (String suspect : suspects.keySet()) {
            if (suspects.get(suspect).size() > max) {
                max = suspects.get(suspect).size();
                ans = suspect;
            }
        }
        System.out.println("Most Investigated Suspect: " + ans);
        System.out.println("Number of Cases: " + max);
    }
    static void exactlyTwoCases(HashMap<String, ArrayList<Integer>> suspects) {
        System.out.println("\nSuspects in Exactly 2 Cases:");
        for (String suspect : suspects.keySet()) {
            if (suspects.get(suspect).size() == 2) {
                System.out.println(suspect);
            }
        }
    }
    static void alwaysTogether(HashMap<String, ArrayList<Integer>> suspects) {
        System.out.println("\nPairs Always Seen Together:");
        ArrayList<String> names = new ArrayList<>(suspects.keySet());
        boolean found = false;
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (suspects.get(names.get(i)).equals(suspects.get(names.get(j)))) {
                    System.out.println(names.get(i) + " & " + names.get(j));
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No such pair found.");
        }
    }
    static void subarraySum(int[] arr, int k) {
        System.out.println("\nSubarray with Sum = " + k);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                int start = map.get(sum - k) + 1;
                System.out.println("Subarray Found from Index " + start + " to " + i);
                System.out.print("Elements: ");
                for (int j = start; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                return;
            }
            map.put(sum, i);
        }
        System.out.println("No Subarray Found");
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> suspects = new HashMap<>();
        suspects.put("Alice", new ArrayList<>(Arrays.asList(101, 102, 103)));
        suspects.put("Bob", new ArrayList<>(Arrays.asList(101, 103)));
        suspects.put("Charlie", new ArrayList<>(Arrays.asList(102)));
        suspects.put("David", new ArrayList<>(Arrays.asList(101, 102, 103)));
        System.out.println("Suspect Records:");
        for (String s : suspects.keySet()) {
            System.out.println(s + " -> " + suspects.get(s));
        }
        mostInvestigated(suspects);
        exactlyTwoCases(suspects);
        alwaysTogether(suspects);
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        subarraySum(arr, k);
    }
}