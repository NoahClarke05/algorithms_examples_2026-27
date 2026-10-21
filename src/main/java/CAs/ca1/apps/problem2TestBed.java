package CAs.ca1.apps;
import CAs.ca1.utils.problem2;

public class problem2TestBed {
    public static void main(String[] args) {
        String palindrome1 = "racecar";
        String palindrome2 = "civic";
        String notPalindrome = "hello";

        System.out.println(problem2.problem2BruteForce(palindrome1));
        System.out.println(problem2.problem2BruteForce(palindrome2));
        System.out.println(problem2.problem2BruteForce(notPalindrome));
        System.out.println("--------------------------------");
        System.out.println(problem2.problem2TwoPointer(palindrome1));
        System.out.println(problem2.problem2TwoPointer(palindrome2));
        System.out.println(problem2.problem2TwoPointer(notPalindrome));
    }
}
