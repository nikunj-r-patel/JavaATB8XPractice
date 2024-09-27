package Sept24.day25092024;

import java.util.Scanner;

public class Task2509 {
    // Method to print table of a number
    public void printTable(int n) {
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Method to calculate factorial of a number
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to print prime numbers between 1 and 100
    public void printPrimeNumbers() {
        System.out.println("Prime numbers between 1 and 100:");
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Method to count vowels and consonants in a string
    public void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task2509 task = new Task2509();// for nonstatic methods need to create instance

        // 1. Get input for printing table
        System.out.print("Enter a number to print its table: ");
        int tableNumber = scanner.nextInt();
        task.printTable(tableNumber);

        // 2. Get input for calculating factorial
        System.out.print("Enter a number to calculate its factorial: ");
        int factorialNumber = scanner.nextInt();
        int factorialResult = task.factorial(factorialNumber);
        System.out.println("Factorial of " + factorialNumber + " is: " + factorialResult);

        // 3. Print prime numbers between 1 and 100
        task.printPrimeNumbers();

        // 4. Get input for counting vowels and consonants in a string
        System.out.print("Enter a string to count vowels and consonants: ");
        String inputString = scanner.next();
        task.countVowelsAndConsonants(inputString);

        scanner.close();
    }
}
