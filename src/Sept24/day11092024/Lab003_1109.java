package Sept24.day11092024;

public class Lab003_1109 {
    public static void main(String[] args) {
        boolean isAtbx = true;
        // data_type variable_name = variable_value(literal)

        // Data Types
        // Boolean Type
        // Numerical Type
        // Integral - byte, short, int, long char.
        // size - how much they can store.
        byte b = 127;
        short s = 128;

        byte age = 127;
        short s1 = 128;


        System.out.println(b);

//        byte a = 129;// -128 to 127
//        byte a1 = 128;// -128 to 127
        byte a2 = 127;// -128 to 127
        short b1 = 128; //
        // Primitive Data Type
        byte b10  = 100; // 8 bits, 1 Byte
        short s10  = 128; // 16 bits, 2 Byte
        int i = 1000; // 32 bits, 4 Byte
        long phone_number = 9876543210l; // 64 Bits, 8 Bytes
        long phone_number2 = 9876543210L; // 64 Bits, 8 Bytes

        char grade = 'A'; // 'A', b, c , e, d, el -> ASCII value - int - assigned.
        // 16 Bits, 2 Byte

        float f  = 3.14f;
        float f2 = 3.14F; // 32 Bits, 4 Byte

        double d = 118.9876543; // 64 Bites, 8 Bytes


        // Non primitive Data Types (user defined)
        String name = "Pramod"; // String - bunch of char(collection of chars)
        // Array, Class- User Data Types.


        // Store the distance between earth and moon
        long distance_between_earth_moon = 384400000l; //in M
        double distance_between_earth_moon2 = 384400000.865; //in M

        //max age
        byte age0= 122;
        int age1 = 100; // wasting memory - 214768348488
        char c = 'A';
        System.out.println(c);

        char c1 = '$';
        System.out.println(c1);

        char c2 = '\n'; // Escape Char - give you newline
        System.out.println(c2);

        char c3 = '\u1F6A'; // Unicode
        System.out.println(c3);//  Ὢ :)


    }
}
