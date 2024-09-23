package Sept24.day20092024;

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
    }
}
