package Sept24.day13092024;

import java.sql.SQLOutput;

public class Lab004_1309 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Nikunj");
        System.out.println("is learning ATB*x");
        printTable(2);
        printTable(10);
        String fName = "nikunj";
        String lName = "patel";
        System.out.printf("Hii! i am %s and my sirname is %s", fName,lName);
        double a = 34;
        double b = 10;
        printCalculation(a,b);



    }
    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d" + "X" +"%d" +   "=" + "%d",number,i, number*i);
            System.out.println(" ");

        }
    }
    public static void printCalculation(double a, double b) {
        System.out.println("A + B = "+ (a+b));
        System.out.println("A - B = "+ (a-b));
        System.out.println("A * B = "+ (a*b));
        System.out.println("A / B = "+ (a/b));
        System.out.println("A % B = "+ (a%b));

    }
}


