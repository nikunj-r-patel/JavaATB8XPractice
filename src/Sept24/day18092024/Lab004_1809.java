package Sept24.day18092024;

public class Lab004_1809 {
    public static void main(String[] args) {
        // GST = 18.45;
        int course = 100;
        float GST = 18.45f;
//        int total_price = course+GST; // Narrowing - Implicit - JVM - Invalid
        //float total_price = course+GST; // Widening - Implicit - JVM - Invalid


        int total_price = course+(int)GST; // Narrowing - Explicit - LOSS
        System.out.println(total_price);
        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing - Implicit - JVM // Invalid
        short s1 = (short)phone_no; // Narrowing - Explicit - Loss // Invalid

        // Increment (++) / Decrement (--) Operators
        // Pre and Post
        // Ready

//        // pre - increment - ++operand.
//        // value is incremented first and then stored in the result.
//        int a  = 10;
//        int b  = ++a; // a = a+1
//        //  | a |output (b)|
//        //   10
//        //   11 | 11
//        System.out.println(b);
//        System.out.println(a);

//        int a = 10;
//        System.out.println(++a);
//        System.out.println(a);

        // Post  a++
        // Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        int a= 10;
//        int result = ++a;
        System.out.println(++a + ++a);
        System.out.println(a);
        int a1 = 10;
        int result = a1--;
        int result1 = --a1;
        System.out.println(a1);
        System.out.println(result1);
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        System.out.println(++a + ++a);
        System.out.println(a);

        // A  -> ++a ->  Exp1 -> 11 , a = 11
        //  +
        // B- > ++a  ->  a = 12 , Exp2 = 12
        // 23 , 12



    }
}
