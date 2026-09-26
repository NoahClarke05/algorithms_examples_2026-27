package in_class_week2.apps;

import in_class.CalcMax;
import in_class_week2.ArrayUtils;

import java.util.Scanner;


public class ArrayManipulation {
    static void main() {
        int[] grades = new int[10];
        String[] texts = new String[10];
        int grade = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            grade = in_class.CalcMax.getValidInteger("Please enter grade " + (i+1) + ": ");
            grades[i] = grade;

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter random text number" + (i+1) + ":");
            String text = input.nextLine();
            texts[i] = text;
        }
        ArrayUtils.calcAverage(grades);
        System.out.println("The maximum grade is: " + ArrayUtils.findMax(grades));
        System.out.println("The maximum text is: " + ArrayUtils.findMax(texts));

        System.out.println("The minimum grade is: " + ArrayUtils.findMin(grades));
        System.out.println("The minimum text is: " + ArrayUtils.findMin(texts));

        System.out.println("The number of grades above 70 is: " + ArrayUtils.count(grades, 70));
    }
}

