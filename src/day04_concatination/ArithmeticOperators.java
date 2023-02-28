package day04_concatination;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //concatenation : + --->  "text" + "text" or "text" + any data
        System.out.println("100" + 200);    // that works
        //System.out.println("200" - 100);  // that works not since - is for only Arithmetic

        System.out.println(20 / 6);  // result in java (int/int = int value) but in math  20/6 = 3.3333

        System.out.println(20 / 6.0);  // result in java = in math = 3.3333... (int/double = double)

// 20 / 6 = 3.333 : 20 called here NUMERATOR, 6 called here DENOMİNATOR and result of division 3.33... called QUOTIENT
        System.out.println(50/6);      // 8 since type matters in java
        System.out.println(50/6.0);
        System.out.println(5/6);        // result = quotient = 0
        System.out.println(50d/6);      //d or D stands for double and converted 50 to double and the result=quotient = 8.3333..
        System.out.println(2.5/0.5);            // result = quotient = 5.0
        System.out.println( (int) (2.5/0.5));   // result = 5 int although quotient = 5.0 double
        //System.out.println(9/0);           // it's not allowed to divide 0 like in math not error but comes ArithmeticException problem

        System.out.println(10  * 2);
        //-----------------------------------MODULE OPERATOR % --------------------------------------------------------
                                        // Remainder : = numerator - (denominator * int part of quotient)
        System.out.println(10 / 3);     // Remainder = 10 - 3 * 3 = 1
        // if not evenly divisible, there will be a remainder
        System.out.println(10 % 3);      // this % module opera brings also remainder
        System.out.println(100 % 13);       // 9
        System.out.println(100 % 10);       // = 0 then evenly divisible
    }
}
