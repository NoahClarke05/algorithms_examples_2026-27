package CAs.ca1.utils;
import java.util.Arrays;

public class problem2 {
    public static boolean problem2BruteForce(String palindrome){
        /**
         * This method loops through all the characters in a word, and compares them with another loop running backwards through the word. If the letters allign each time the loops allign, than the word is a palindrome and return true. If not return false
         * The big O for this method would be n^2, because it is looping through the word inside a loop
         * @param String palindrome - The word you are checking if its a palindrome
         * @returns True if it is a palindrome, false otherwise
         */
        int n = palindrome.length();
        for (int i = 0; i < n / 2; i++) {
            boolean found = false;
            for (int j = n - 1; j >= n / 2; j--) {
                if (palindrome.charAt(i) == palindrome.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
