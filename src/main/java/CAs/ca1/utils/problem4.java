package CAs.ca1.utils;

public class problem4 {
    public static String problem4BruteForce(String word){
        /**
         * This method first converts a word into an array of chars. It then loops through this array, and extracts every vowel in the word into flippedVowels array
         * This array is then flipped so that whichever vowel came first is now last, etc.
         * Finally, the word array is then looped through again, and everytime it finds a vowel, it replaces it with the flipped one stored in flippedVowels
         * The big O notation for this method is n. Technically, it is 4n roughly, as it loops 4 times, but they arent nested so its not n^4. 4n simplifies to n
         * @param String word - the word you want to flip the vowels of
         * @returns String a string version of the array of characters, aka the word with its vowels flipped.
         */
      String VOWELS = "aeiouAEIOU";

      char[] array = new char[word.length()];

      for (int i = 0; i < word.length(); i++) {
          array[i] = word.charAt(i);
        }

      char[] flippedVowels = new char[array.length];
      int count1 = 0;

        for (int i = 0; i < array.length ; i++) {
            char ch = array[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                flippedVowels[count1] = ch;
                count1++;
            }
        }
        for (int i = 0; i < count1 / 2; i++) {
            char temp = flippedVowels[i];
            flippedVowels[i] = flippedVowels[count1 -1 -i];
            flippedVowels[count1 - 1 - i] = temp;
        }

        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                array[i] = flippedVowels[count2];
                count2++;
            }
        }
        return new String(array);
    }

    public static String problem4TwoPointer(String word) {
        /**
         * This algorithm starts the same way as the brute force one, by changing the string into an array.
         * It then creates 2 pointers, start and end, and they move towards eachother, checking if they are a vowel.
         * If they are both a vowel, flip them. If only one is, increment the other, etc.
         * It then returns the array of the word with its vowels flipped as a string
         * The bigO for this method is n, as there is 1 loop to change the word into a string, and a while loop for changing the vowels. This simplifies to just n (linear)
         * @param String word - the word you want to flip the vowels of
         * @returns String a string version of the array of characters, aka the word with its vowels flipped.
         */
        String VOWELS = "aeiouAEIOU";

        char[] array = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            array[i] = word.charAt(i);
        }

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            char c = array[start];
            char h = array[end];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                if (h == 'a' || h == 'e' || h == 'i' || h == 'o' || h == 'u' || h == 'A' || h == 'E' || h == 'I' || h == 'O' || h == 'U') {
                    // Swap the vowels
                    char temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        return new String(array);
    }
}
