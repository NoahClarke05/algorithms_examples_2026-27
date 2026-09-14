package in_class;

import java.util.Scanner;

public class DemoUserIO {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");

        if (name.equals("Fred")){
            System.out.println("Go away Fred no one wants you here.");
        }else {

            System.out.println("Please enter your age: ");
            int age = input.nextInt();

            if( age < 18) {
                System.out.println("You're  too young, get out!");
            }else if (age < 25) {
                System.out.println("No car rental for you!");
            } else {
                System.out.println("Welcome in!");
            }
        }
    }
}


