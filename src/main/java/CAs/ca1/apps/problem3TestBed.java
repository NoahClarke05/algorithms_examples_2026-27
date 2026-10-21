package CAs.ca1.apps;
import CAs.ca1.utils.problem3;

public class problem3TestBed {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {11, 12, 13, 14, 15};
        int[] array3 = {2, 4, 6, 8, 10, 12};
        int[] array4 = {4, 12, 7, 9, 5, 18};
        int[] array5 = {1, 56, 4, 33, 63, 14, 18};

        System.out.println("Brute Force Method:");
        int[] result = problem3.problem3BruteForce(array5, 100);
        if (result.length == 1 && result[0] == 0) {
            System.out.println("No valid subarray found");
        } else {
            System.out.println("Start = " + result[0] + ", End = " + result[1]);
        }

        System.out.println("Two Pointer Method:");
        int[] resulttp = problem3.problem3TwoPointer(array5, 100);
        if (resulttp.length == 1 && resulttp[0] == 0) {
            System.out.println("No valid subarray found");
        } else {
            System.out.println("Start = " + resulttp[0] + ", End = " + resulttp[1]);

        }
    }
}

