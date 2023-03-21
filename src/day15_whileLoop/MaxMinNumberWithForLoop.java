package day15_whileLoop;

import java.util.Scanner;

public class MaxMinNumberWithForLoop {
    public static void main(String[] args) {
        int minNum = 2147483647, //
            maxNum = -2147483648;

        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("enter number for max and min: ");
            int entryNum = scan.nextInt();
            if (entryNum < minNum){
                minNum = entryNum;
            }
            if (maxNum < entryNum){
                maxNum = entryNum;
            }
        }
        System.out.println("minNum = " + minNum);
        System.out.println("maxNum = " + maxNum);
    }
}
