package Sept24.day18092024;

public class Task1809 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(  --a + a--  + a--); // 9+9+8=26
        System.out.println(a); // 7

        System.out.println(  --a + a++ + a--); // 9+9+10=28
        System.out.println(a); // 9

        System.out.println(  a-- + a--  + a--); // 10+9+8=27
        System.out.println(a); // 7
    }
}
