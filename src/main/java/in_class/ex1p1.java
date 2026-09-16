package in_class;

import java.util.Scanner;

public class ex1p1 {
    static void main(){
        /**
         * Asks user to enter a number
         * It will then compare the user's input to a target number and display the average of all numbers entered
         */
        Scanner input = new Scanner(System.in);
        int target = -1;
        int guess = 0;
        int total = 0;
        int counter = 0;

        while (guess != target){
            System.out.println("Please enter a number: ");
            guess = input.nextInt();
            counter += 1;
            total += guess;

            if (guess == target){
                System.out.println("You entered the correct number");
            }else{
                System.out.println("Try Again");
            }
        }
        int av = total/counter;
        System.out.println("Total of numbers entered:" + total);
        System.out.println("Average:" + av);
    }
}
