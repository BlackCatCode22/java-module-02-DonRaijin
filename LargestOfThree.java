// LargestOfThree.java
// db 9/07/2025

// LargestOfThree.java
// db 9/07/25

// the Scanner class in the java.util package
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        System.out.printf("\n\n Welcome to my largest of three program!");

        // Variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;
        String largestVar = "";

        // Get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt for num1
        System.out.println("\n Please enter a whole number for num1: ");
        num1 = scanner.nextInt();
        System.out.println("\n The user entered " + num1 + " for num1.");

        // Prompt for num2
        System.out.println("\n Please enter a whole number for num2: ");
        num2 = scanner.nextInt();
        System.out.println("\n The user entered " + num2 + " for num2.");

        // Prompt for num3
        System.out.println("\n Please enter a whole number for num3: ");
        num3 = scanner.nextInt();
        System.out.println("\n The user entered " + num3 + " for num3.");

        // Use nested statements to find the largest.
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
                largestVar = "num1";
            } else {
                largest = num3;
                largestVar = "num3";
            }
        } else {
            if (num2 > num3) {
                largest = num2;
                largestVar = "num2";
            } else {
                largest = num3;
                largestVar = "num3";
            }
        }

        // output meaningful information for the user.
        System.out.println("\n You entered " + num1 + " for the value of num1.");
        System.out.println(" You entered " + num2 + " for the value of num2.");
        System.out.println(" You entered " + num3 + " for the value of num3.\n");

        System.out.println(" You entered the value of " + largest + " for " + largestVar +
                ", and that was the largest of the three integers!");
    }
}