package CAs.ca1.utils;

public class problem4 {
    public static String problem4BruteForce(String word){
        /**
         * This method first converts a word into an array of chars. It then loops through this array, and extracts every vowel in the word into flippedVowels array
         * This array is then flipped so that whichever vowel came first is now last, etc.
         * Finally, the word array is then looped through again, and everytime it finds a vowel, it replaces it with the flipped one stored in flippedVowels
         * The big O notation for this method is n. Technically, it is 3n roughly, as it loops 3 times, but they arent nested so its not n^3. 3n simplifies to n
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
}
