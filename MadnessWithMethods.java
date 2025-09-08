// MadnessWithMethods.java
// db 9/07/2025

import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for user's name
        System.out.println("Enter your name:");
        String name = input.nextLine();
        helloThere(name);

        // Ask for two numbers
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        addTwoInts(num1, num2);

        input.close(); // Close the scanner
    }

    // Say hello to the user
    static void helloThere(String name) {
        System.out.println("Hello " + name);
    }

    // Add two integers and display the result
    static void addTwoInts(int a, int b) {
        System.out.println("The sum of the two numbers is " + (a + b));
    }
}