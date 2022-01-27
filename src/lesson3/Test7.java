package lesson3;

public class Test7 {
    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;

        int a = 10;
        int b = 5;
        int c = 99;
        int d = 100;

        boolean e = a > b | ++c == d;

        System.out.println(e);
        System.out.println(c);
    }
}
