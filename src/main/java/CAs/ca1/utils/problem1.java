package CAs.ca1.utils;
import java.util.Arrays;

public class problem1 {
    public static boolean problem1BruteForce(int array1[], int array2[]) {
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
        int [] temp1 = Arrays.copyOf(array1, array1.length);
        Arrays.sort(temp1);

        int [] temp2 = Arrays.copyOf(array2, array2.length);
        Arrays.sort(temp2);

        for (int i = 0; i < temp1.length; i++) {
            if (temp1[i] != temp2[i]) {
                return false;
            }
        }
        return true;
    }
}
