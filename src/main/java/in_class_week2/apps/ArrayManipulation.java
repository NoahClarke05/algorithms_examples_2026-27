package in_class_week2.apps;

import in_class.CalcMax;
import in_class_week2.ArrayUtils;

import java.util.Scanner;


public class ArrayManipulation {
    static void main() {
        int[] grades = new int[10];
        int grade = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            grade = in_class.CalcMax.getValidInteger("Please enter grade " + (i+1) + ": ");
            grades[i] = grade;

        }
        ArrayUtils.calcAverage(grades);
    }
}

