import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fizzBuzz= new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                fizzBuzz.add("FizzBuzz");
            }
            else if(i%3==0){
                fizzBuzz.add("Fizz");
            }
            else if(i%5==0){
                fizzBuzz.add("Buzz");
            }
            else{
                String s=Integer.toString(i);
                fizzBuzz.add(s);
            }
        }
        return fizzBuzz;
    }
}

public class LC_412_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        List<String> result = obj.fizzBuzz(n);
        System.out.println(result);
        sc.close();
    }
}