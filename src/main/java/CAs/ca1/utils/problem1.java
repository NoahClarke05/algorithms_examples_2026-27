package CAs.ca1.utils;
import java.util.Arrays;

public class problem1 {
    public static boolean problem1BruteForce(int array1[], int array2[]) {
        /**
         * This method uses a brute force approach to check if all the values in array1 are equal to array 2
         * The Big O for this method would be n^2, as it loops through the second array for each value in the first array
         * @params int array1[] - The first array
         * @params int array2[] - The second array
         * @returns True if the two arrays are equal, regardless of order, false otherwise
         */
        if (array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
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

    public static boolean problem1TwoPointer(int array1[], int array2[]) {
        /**
         * This method uses a brute force approach to check if all the values in array1 are equal to array 2
         * The Big O for this method would be n, as it loops through only one list, and both lists must be the same length in order for it to loop through one of them
         * @params int array1[] - The first array
         * @params int array2[] - The second array
         * @returns True if the two arrays are equal, regardless of order, false otherwise
         */
        int [] temp1 = Arrays.copyOf(array1, array1.length);
        Arrays.sort(temp1);

        int [] temp2 = Arrays.copyOf(array2, array2.length);
        Arrays.sort(temp2);

        if (array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < temp1.length; i++) {
            if (temp1[i] != temp2[i]) {
                return false;
            }
        }
        return true;
    }
}
