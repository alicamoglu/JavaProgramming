package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        // Datatype variable name = Data
        //    byte a = "Java"; // byte only accept integer values therefore :incompatible types error
         //   byte a = 200;   // its out of Byte range it must be in (-128 ~ 127) therefore :incompatible types error
         //   byte a = 30.5;    //  byte can not take decimal numbers therefore :incompatible types error
        //therefore :incompatible types error  he sead compile error
        byte a = 20;
        // price of the car is $17500
        short p = 17500;
        System.out.println(p);
        System.out.println("p");
        // salary is $95000
        int s = 95000;   // preferred
        System.out.println(s);
        // int n = 999999999;             // compile error
        // long n = 9999999999 ;          // compile error
        long n = 9999999999L;        // upper L or lower l should be at the end to compile error

        // gpa is 3.5
        double gpa1 = 3.5; // preferred

        //float gpa2 = 3.5;  // gives compile error because its preferred double therefore f or F musst be append at the end.


        float gpa2 = 3.5f;





    }

}
