package in_class;

import java.util.Scanner;

public class DemoSecurityIO {
    static void main() {
        Scanner input = new Scanner(System.in);
        String correctusername = "Noah";

        System.out.println("Please enter your username: ");
        String username = input.nextLine();
        if (username.equals(correctusername)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
