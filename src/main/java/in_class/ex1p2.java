package in_class;

import java.util.Scanner;

public class ex1p2 {
    static void main(){
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int counter = 0;
        int total = 0;

        num1 = CalcMax.getValidInteger("Please enter the first number: ");
        num2 = CalcMax.getValidInteger("Please enter the second number: ");

        if (num1 > num2) {
            int temp = 0;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        counter = num1;
        total = num1;

        for (int i = 0; counter < num2; i++) {
            counter ++;
            total += counter;
        }
        System.out.println("The sum of the numbers between " + num1 + " and " + num2 + " is: " + total);
    }
}
