package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // + is optional, although it does appear a number is positive
        // - gives negativity if comes before a number like in math

        // they all change the value by 1
        // pre increment/decrement  are  ↓
        int x = 10;                 // it changes immediately
        System.out.println(++x);   // print: 11
        System.out.println(x);     // print: 11

        int y = 100;
        System.out.println(--y);   // print 99
        System.out.println(y);      // print 99
        // post increment/decrement  are  ↓
        // before print old correct assigned value is used and after print they will be changed
        // not immediately but eventually is changed with post increment and decrement

        int a = 50;
        System.out.println(a++);  // print : 50
        System.out.println(a);      // print : 51

        int b = 25;
        System.out.println(b--);  // print :25
        System.out.println(b);    // print :24

        int n = 30;
        int m = n++;
        int k = n;
        System.out.println("m = " + m);
        System.out.println("k = " + k);

        int z = 60;
        int q = z--;

        System.out.println("q = " + q);   // print 60
        System.out.println("z = " + z);    // print 59





    }
}
