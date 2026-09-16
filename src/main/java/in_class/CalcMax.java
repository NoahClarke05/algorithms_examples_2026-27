package in_class;

import java.util.Scanner;

public class CalcMax {
    public static int getValidInteger(String prompt){
        /**
         * Verifies user has entered an integer
         * Asks user to enter a number, and checks that it is an integer, and loops if not.
         *
         * @param String prompt - The message to display to the user
         * @return int - The valid integer entered by the user
         */
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid Input. Please enter a number");
            input.next();
            System.out.println("Please enter a number: ");
        }

    num = input.nextInt();
        System.out.println("You entered " + num);
        return num;
    }

    public static void findMax(int num1, int num2, int num3){
        /**
         * Finds the largest of three integers
         * Takes in three integers as parameters and compares them to find the largest
         *
         * @param int num1 - The first number
         * @param int num2 - The second number
         * @param int num3 - The third number
         */
        int large = 0;

        large = num1;
        if (num2 > large){
            large = num2;
        }

        if (num3 > large){
            large = num3;
        }

        System.out.println("The largest number is: " + large);
        }


    static void Main() {
        /**
         * Asks user to enter 3 numbers
         * It will then use the findMax function to compare them and display the largest
         */
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        num1 = getValidInteger("Please enter first number: ");
        num2 = getValidInteger("Please enter second number: ");
        num3 = getValidInteger("Please enter third number: ");

        findMax(num1, num2, num3);
        }
    }


