package Sept24.day18092024;

public class TypeCastingExamples {
    public static void main(String[] args) {

        // Widening (Implicit)
        byte smallNum1 = 42;
        int largerNum1 = smallNum1;  // Implicit widening from byte to int
        System.out.println("Implicit Widening (byte to int): " + largerNum1);  // Output: 42

        // Widening (Explicit)
        byte smallNum2 = 42;
        double largeDouble1 = (double) smallNum2;  // Explicit widening from byte to double
        System.out.println("Explicit Widening (byte to double): " + largeDouble1);  // Output: 42.0

        // Widening (Implicit)
        int num1 = 1000;
        long largeNum1 = num1;  // Implicit widening from int to long
        System.out.println("Implicit Widening (int to long): " + largeNum1);  // Output: 1000

        // Widening (Explicit)
        float floatNum1 = 45.67f;
        double doubleNum1 = (double) floatNum1;  // Explicit widening from float to double
        System.out.println("Explicit Widening (float to double): " + doubleNum1);  // Output: 45.67

        // Narrowing (Explicit)
        long largeNum2 = 100000L;
        int smallNum3 = (int) largeNum2;  // Explicit narrowing from long to int
        System.out.println("Explicit Narrowing (long to int): " + smallNum3);  // Output: 100000

        // Narrowing (Explicit)
        double largeDouble2 = 9.87654321;
        float smallFloat1 = (float) largeDouble2;  // Explicit narrowing from double to float
        System.out.println("Explicit Narrowing (double to float): " + smallFloat1);  // Output: 9.876543

        // Narrowing (Explicit)
        int largeNum3 = 32000;
        short smallNum4 = (short) largeNum3;  // Explicit narrowing from int to short
        System.out.println("Explicit Narrowing (int to short): " + smallNum4);  // Output: 32000

        // Narrowing (Explicit with Overflow)
        int largeNum4 = 130;
        byte smallNum5 = (byte) largeNum4;  // Explicit narrowing from int to byte
        System.out.println("Explicit Narrowing (int to byte, with overflow): " + smallNum5);  // Output: -126

        // Implicit Widening in Arithmetic Expression
        int num2 = 10;
        double num3 = 20.5;
        double result = num2 + num3;  // Implicit widening of int to double during addition
        System.out.println("Implicit Widening in Arithmetic Expression: " + result);  // Output: 30.5

        // Narrowing with Overflow Prevention
        int largeNum5 = 150;
        byte smallNum6 = (byte) largeNum5;  // Explicit narrowing from int to byte
        System.out.println("Explicit Narrowing (int to byte, overflow prevention): " + smallNum6);  // Output: -106
    }
}
