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
        int pl = palindrome.length();
        for (int i = 0; i < pl / 2; i++) {
            boolean found = false;
            for (int j = pl - 1; j >= pl / 2; j--) {
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

    public static boolean problem2TwoPointer(String palindrome) {
        /**
         * This method creates a pointer at the start and end of the amount of characters in the word. The two pointers converge to meet in the middle, while checking if their characters are the same.
         * If the characters are all the same by the time they meet, it returns true. If it finds any characters that are not equal, it returns false.
         * The big O notation for this method would be n / 2, as each pointer only needs to loop through half of the word
         * @param String palindrome - The word you want to find out if its a palindrome
         * @returns True if the word is a palindrome, false otherwise
         */
        int pl = palindrome.length();
        int start = 0;
        int end = pl - 1;

        while (start <= end) {
            if (palindrome.charAt(start) != palindrome.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
