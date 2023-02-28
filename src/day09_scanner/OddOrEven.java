package day09_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
//        byte number = input.nextByte();
        byte number = new Scanner(System.in).nextByte();

        System.out.println((number<0)?number+" is negative":
                (number>0)?number+" is positive":number+" is zero");

    }

}
