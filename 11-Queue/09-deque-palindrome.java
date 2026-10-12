import java.util.*;

class Solution {
    public static void main(String[] args) {
        String s = "racecar";
        Deque<Character> dq = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            dq.addLast(s.charAt(i));
        }
        
        boolean isPalindrome = true;
        
        while (dq.size() > 1) {
            char first = dq.removeFirst();
            char last = dq.removeLast();
            
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("Original string: " + s);
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}
