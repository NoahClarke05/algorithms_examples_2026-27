package CAs.ca1.apps;
import CAs.ca1.utils.problem1;

public class problem1TestBed {

    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,4,5};
        int [] array3 = {5,4,3,2,1};
        int [] array4 = {2,3,4,5,6};
        int [] array5 = {1,2,3,4,5,6};

        //Tests for problem1BruteForce
        System.out.println("Tests for problem1BruteForce:");
        System.out.println(problem1.problem1BruteForce(array1, array2));
        System.out.println(problem1.problem1BruteForce(array3, array4));
        System.out.println(problem1.problem1BruteForce(array1, array5));
        System.out.println(problem1.problem1BruteForce(array1, array3));
        System.out.println(problem1.problem1BruteForce(array4, array5));

        System.out.println("-----------------------------------------");

        //Tests for problem1TwoPointer
        System.out.println("Tests for problem1TwoPointer:");
        System.out.println(problem1.problem1TwoPointer(array1, array2));
        System.out.println(problem1.problem1TwoPointer(array3, array4));
        System.out.println(problem1.problem1TwoPointer(array1, array5));
        System.out.println(problem1.problem1TwoPointer(array1, array3));
        System.out.println(problem1.problem1TwoPointer(array4, array5));
    }
}
