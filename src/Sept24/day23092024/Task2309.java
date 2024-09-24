package Sept24.day23092024;

import java.util.Scanner;

public class Task2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        simpleCalculator(scanner);
        monthFinder(scanner);
        unitConverter(scanner);


    }
//Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
//    Inputs :   num 1, num 2, +
//    Output :  num1+num2 → print information.
public static void simpleCalculator(Scanner scanner) {
    System.out.println("Simple Calculator:");
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

    System.out.print("Enter the operator (+, -, *, /, %): ");
    char operator = scanner.next().charAt(0);

    double result;

    switch (operator) {
        case '+' -> {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
        case '-' -> {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }
        case '*' -> {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
        case '/' -> {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        }
        case '%' -> {
            if (num2 != 0) {
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        }
        default -> System.out.println("A be simple calculator he computer nahi jo kuchbhi dalta he sahi dal na");
    }
}

//Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
//    Input  - 12
//    Out - Dec.
    public static void monthFinder(Scanner scanner) {
        System.out.println("\nMonth Finder:");
        System.out.print("Enter a number between 1 and 12 to find the corresponding month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("A be earth pe  1 to 12 mahine hi he tu konse gole se aaya he ?.");
        }
    }

//Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//    Input. -
//    choice - 1 - km → m, km → 1km
//    choice - 2 - f → c, f → c
    public static void unitConverter(Scanner scanner) {
        System.out.println("\nUnit Converter:");
        System.out.println("1: Kilometers to Miles");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter kilometers: ");
                double kilometers = scanner.nextDouble();
                double miles = kilometers * 0.621371;
                System.out.println(kilometers + " km = " + miles + " miles");
            }
            case 2 -> {
                System.out.print("Enter Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
            }
            default -> System.out.println("2 hi choice he mere bhai me koi mobile nahi jo sab kuch dunga select either 1 or 2.");
        }
    }
}
