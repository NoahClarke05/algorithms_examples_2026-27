package in_class_week2;

public class ArrayUtils {
    public static void displayArray(int[] array){
        /**
         * Display each value in an array with its position
         * Pulls in an array and cycles through each value and displays the value with its position
         * @param int[] array - The array of numbers
         */
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }
    public static void displayArray(String[] array){
        /**
         * Display each value in an array with its position
         * Pulls in an array and cycles through each value and displays the value with its position
         * @param String[] array - The array of strings
         */
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }
}

