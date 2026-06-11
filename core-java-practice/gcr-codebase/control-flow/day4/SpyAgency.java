package day4;

import java.util.*;

public class SpyAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        message = message.toLowerCase();
        // Reverse the message
        String reverse = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reverse += message.charAt(i);
        }
        System.out.println(reverse);
        // Check palindrome
        if (message.equals(reverse)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        // Count vowels and consonents
        int vowels = 0;
        int consonents = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'a' || message.charAt(i) == 'e' || message.charAt(i) == 'i' || message.charAt(i) == 'o' || message.charAt(i) == 'u') {
                vowels++;
            }
            else {
                consonents++;
            }
        }
        System.out.println("Number of vowels: " + vowels + "\n" + "Number of consonents: " + consonents);
        // Check anagram
        char[] ch1 = message.toCharArray();
        char[] ch2 = reverse.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
        for(int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if(message.indexOf(ch) == message.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
        sc.close();
    }
}
