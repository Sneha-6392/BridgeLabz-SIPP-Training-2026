import java.util.*;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        char[] arr2 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr2[i] = s.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.equals(arr, arr2));
        sc.close();
    }
}
