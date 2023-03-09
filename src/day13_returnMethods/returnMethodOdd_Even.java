package day13_returnMethods;

import java.util.Scanner;

public class returnMethodOdd_Even {
    public static void main(String[] args) {
        // todo look at retunMethodsprctice for better solution
        System.out.print("enter a number: ");
//        byte number = input.nextByte();
        byte number = new Scanner(System.in).nextByte();
        oddOrEven(number);
        System.out.println(oddOrEven(number));
        System.out.println(ifOdd(number));
    }

    public static String oddOrEven(byte number) {


        String result = (number<0)?number+" is negative":
                (number>0)?number+" is positive":number+" is zero";
        return result;
    }

    public static boolean ifOdd(int number) {
        boolean result2 = false;
        if (number % 2 ==1) {
            result2=true;
        }
        return result2;
    }
}
