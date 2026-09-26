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

    public static void calcAverage(int[] array){
        /**
         * finds the average of all numbers in an array
         * adds all numbers in an array to a total var and divides it by the number of variables in the array
         * @param int[] array - The array of numbers
         */
        int total = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
            counter++;
        }
        if (counter > 0) {
            int av = total/counter;
            System.out.println("The average is: " + av);

        }else{
            System.out.println("Cannot calculate average of an empty array");
        }
    }

    public static int findMax(int[] array){
        /**
         * Finds the maximum value in an array
         * @param int[] array - The array of numbers
         * @return int - The maximum value in the array
         */
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static String findMax(String[] array){
        /**
         * Finds the maximum value in an array
         * @param String[] array - The array of strings
         * @return String - The maximum value in the array
         */
        String max = "a";
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        /**
         * Finds the minimum value in an array
         * @param int[] array - The array of numbers
         * @return int - The minimum value in the array
         */
        int min = 999999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static String findMin(String[] array){
        /**
         * Finds the minimum value in an array
         * @param String[] array - The array of strings
         * @return String - The minimum value in the array
         */
        String min = "z";
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public static int count(int[] array, int value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                counter++;
            }
        }
        return counter;
    }

    public static int getMostFrequent(int[] array) {
        int mostFrequent = array[0];
        int highestFrequency = 0;

        for (int i = 0; i < array.length; i++) {
            int currentFrequency = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > highestFrequency) {
                highestFrequency = currentFrequency;
                mostFrequent = array[i];
            }
        }
        return mostFrequent;
    }

}
