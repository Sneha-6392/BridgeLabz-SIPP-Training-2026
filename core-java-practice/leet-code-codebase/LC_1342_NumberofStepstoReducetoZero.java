import java.util.*;
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                steps++;
            }
            else {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }
}

public class LC_1342_NumberofStepstoReducetoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        int result = obj.numberOfSteps(n);
        System.out.println(result);
        sc.close();
    }
}