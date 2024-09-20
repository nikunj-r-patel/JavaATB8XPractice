package Sept24.day20092024;

import java.lang.Math;


public class Lab007_2009 {
    public static void main(String[] args) {
        int a1 = (30 > 40) ? 10 : 20;
        System.out.println(a1);
        String str = (10 > 20) ? "10" : "twenty";
        System.out.println(str);
        // max and min of two numbers
        int num1 = 4;
        int num2 = 7;
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(min);
        int a = 10;
        if (a == 4) {
            System.out.println("Hahahah");
        } else {
            System.out.println("Bye");
        }
        boolean a2 = true;
        a2 = !a2;
        if (2 + 2 < 4) {
            System.out.println("Inside the loop");
        }
        System.out.println("Outside -> " + a2);

        int num = 11;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");

            int score = 65;
            //score >= 90 = "A";
            //score >=80 = "B";
            //score >=70 = "C";
            String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
            System.out.println("Grade: " + grade);


            System.out.println(Math.max(num1, num2));
            System.out.println(Math.min(num1, num2));
            System.out.println(Math.sin(90));

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
        }
    }
}
