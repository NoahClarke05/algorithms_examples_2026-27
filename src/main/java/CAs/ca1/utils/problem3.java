package CAs.ca1.utils;

public class problem3 {
    public static int[] problem3BruteForce(int[] array, int target) {
        /**
         * This brute force algorithm cycles through each number in an array. For each number , it adds up itself with the following numbers until it reaches the target.
         * It does this for all numbers in the array, and stores the way of reaching the target that takes the least number of numbers.
         * It then returns the indices of the first and last numbers in the sequence.
         * The big O for this algorithm is n^2, as there is a loop inside of a loop
         * @param int[] array - the array of positive integers you are looping through
         * @param int target -the target number you are trying to reach
         * @returns int[] a subarray consisting of the first and last indices if the target has been reached, 0 otherwise.
         */
        int minLength = array.length;
        int start = -1;
        int end = -1;


        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];

                if (sum >= target) {
                    int currentLength = j - i + 1;

                    if (currentLength < minLength) {
                        minLength = currentLength;
                        start = i;
                        end = j;
                    }

                    break;
                }
            }
        }

        if (start == -1) {
            return new int[]{0};
        }
        return new int[]{start, end};
    }

    public static int[] problem3TwoPointer(int[] array, int target) {
        /**
         * This two pointer algorithm creates a start pointer and an end pointer. The end pointer moves up through the array until the sum of the numbers between the pointers reaches the target
         * Then the start pointer will begin to move up until the target is no longer reached. Then the end will move up again, and this continues until the end of the array
         * It stores what the minimum window size, and the start and end values it was at when it was recorded.
         * The big O notation for this algorithm would be n, as all values are only visited at most 2 times. (n * 2 is the same as n)
         * @param int[] array - the array of positive integers you are looping through
         * @param int target -the target number you are trying to reach
         * @returns int[] a subarray consisting of the first and last indices if the target has been reached, 0 otherwise.
         */
        int start = 0;
        int sum = 0;
        int minLength = array.length + 1;
        int bestStart = 0;
        int bestEnd = 0;

        for (int end = 0; end < array.length; end++) {
            sum += array[end];

            while (sum >= target) {
                if(end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    bestStart = start;
                    bestEnd = end;
                }
                sum -= array[start];
                start++;
            }



        }
        if (minLength == array.length + 1) {
            return new int[]{0};
        }else {
            return new int[]{bestStart, bestEnd};
        }
    }
}
