package day03_variables;

public class PrimitiveDataTypesIntro2 {
    public static void main(String[] args) {
        // Datatype variable = data
        // char :
        char a = '@';      // in singele qoute can be given only single caracter.
        char b = '!';
        //char ab = 'ab'; // compile error

        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------------------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);            // result : A
        System.out.println(ch2);            // result also : A


        System.out.println("-------------------------------------------------");
        char ch3 = 8000;
        System.out.println(ch3);
        char ch4 = 128;
        char ch5 = 1;
        System.out.println(ch4);
        System.out.println(ch5);
        //char ch6 = -100;          // error
        int sum = 'A' + 'B';
        //         65 + 66   =   131

        System.out.println(sum);    // 131


        //boolean r1 = 123;
        //boolean r2 = 2.5;
        //boolean r3 = "Java";
        boolean r4 = true;
        boolean r5 = false;
        System.out.println("-------------------------------------------------");
        boolean r6 = 100> 10 ;  // true then here can be given true, false expressions or sth gives them !
        boolean r7 = 0< -1;    // false
        System.out.println(r6);
        System.out.println(r7);






    }
}
