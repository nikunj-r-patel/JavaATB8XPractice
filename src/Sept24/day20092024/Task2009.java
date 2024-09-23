package Sept24.day20092024;

import java.util.Scanner;

public class Task2009 {
    public static void main(String[] args) {
//  By using Ternary Operators max between 3 numbers.
//      Input
//      int - a,b,c - a = 10, b = 20, c = 45
//      Max → a,b,c → c
        int a = 100;
        int b = 20;
        int c = 45;

        int max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c); // if a is > then b it check if a is > then c
        System.out.println("the max amongst above is = "+ max);


//  Ternary Operators to handle multiple conditions.
//      Input → int score = 85
//      String grade →
//      score >= 90 → A
//      score >= 80 → B
//      score >= 70 → C
        int score = 65;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
        System.out.println("Grade: " + grade);

        if (score >= 90) {
            System.out.println("the grade is A");
        } else {
            if (score <= 89 && score >= 80) {
                System.out.println("the grade is B ");
            } else {
                if (score <= 79 && score >= 70) {
                    System.out.println(" the grade is C");
                } else {
                    System.out.println(" a be sharam kar you are fail");
                }
            }
        }
        // Triangle Classifier Task
        System.out.println("Triangle Classifier:");
        classifyTriangle();

        // FizzBuzz Task
        System.out.println("\nFizzBuzz Test:");
        fizzBuzz();

        // Leap Year Task (for 2024)
        System.out.println("\nLeap Year Check for 2024:");
        checkLeapYear(2024);
    }
    // Triangle Classifier
    public static void classifyTriangle() {
        Scanner sc = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = sc.nextInt();

        // Classify the triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }

    // FizzBuzz Test
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Leap Year Program
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
