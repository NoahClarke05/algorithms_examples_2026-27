package in_class;

import java.util.Scanner;

public class CalcMax {
    public static int getValidInteger(String prompt){
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number: ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid Input. Please enter a number");
            input.next();
            System.out.println("Please enter a number: ");
        }

    num = input.nextInt();
        System.out.println("You entered" + num);
        return num;
    }
}
