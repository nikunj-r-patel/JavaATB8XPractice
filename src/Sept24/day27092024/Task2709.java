package Sept24.day27092024;

import java.util.Scanner;

public class Task2709 {
    public class WhileVsDoWhile {

        // Example using a while loop
        public void whileLoopExample() {
            Scanner scanner = new Scanner(System.in);
            int input;

            System.out.println("Using while loop:");
            System.out.print("Enter a number (enter 5 to stop): ");
            input = scanner.nextInt();

            // The while loop will only execute if the condition is true
            while (input != 5) {
                System.out.print("Enter a number (enter 5 to stop): ");
                input = scanner.nextInt();
            }
            System.out.println("You entered 5, exiting loop.");
        }

        // Example using a do-while loop
        public void doWhileLoopExample() {
            Scanner scanner2 = new Scanner(System.in);
            int input2;

            System.out.println("Using do-while loop:");

            // The do-while loop executes at least once, even if the condition is false initially
            do {
                System.out.print("Enter a number (enter 5 to stop): ");
                input2 = scanner2.nextInt();
            } while (input2 != 5);

            System.out.println("You entered 5, exiting loop.");
        }
    }
        // Method to print the first 5 even numbers using a do-while loop
        public void printEvenNumbers() {
            int number = 2; // Start from the first even number
            int count = 0;  // To track the number of even numbers printed

            System.out.println("First 5 even numbers:");
            do {
                System.out.println(number);
                number += 2;  // Increment by 2 to get the next even number
                count++;      // Increment the count to know how many even numbers printed
            } while (count < 5);  // Loop until 5 even numbers are printed
        }

        // Method to calculate the sum of numbers from 1 to 100 using a while loop
        public void calculateSum() {
            int sum = 0;   // To store the sum of numbers
            int number = 1;  // Start from 1

            while (number <= 100) {  // Loop until number is less than or equal to 100
                sum += number;   // Add the current number to the sum
                number++;  // Increment the number
            }

            System.out.println("The sum of numbers from 1 to 100 is: " + sum);
        }

        // Main method to execute both tasks
        public static void main(String[] args) {
            Task2709 task = new Task2709();  // Create an instance of Task
            WhileVsDoWhile example = task.new WhileVsDoWhile();
            example.whileLoopExample();    // Execute the while loop example
            System.out.println();  // Separate outputs for clarity
            example.doWhileLoopExample();
            task.printEvenNumbers();  // Call method to print even numbers
            System.out.println();  // Just to separate the outputs
            task.calculateSum();    // Call method to calculate the sum
        }
}
