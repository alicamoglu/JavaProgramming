package day19_array;

import java.util.Scanner;
import java.util.Arrays;

public class MaxNumFromArray {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter please the length of array");
        int lengthOfArray = scan.nextInt();
        int[] numList = new int[lengthOfArray];
        for (int i = 0; i < numList.length; i++) {
            numList[i] = scan.nextInt();
        }
        System.out.println("Array.toString(numList) = " + Arrays.toString(numList));
//        int maxNumber =-2147483648;    // this time we dont need it to comparetion
        int maxNumber = numList[0];   // assume that first element is the max number.
        for (int i = numList.length - 1; i >= 0; i--) {
            if (numList[i] > maxNumber){         //compares the element of array with current max number.
                maxNumber = numList[i];
            }
        }
        int minNumber = numList[numList.length-1];
        for (int i = numList.length - 1; i >= 0; i--) {
            if (numList[i] < minNumber){
                minNumber = numList[i];
            }
        }
        System.out.println("maximum Number = " + maxNumber);
        System.out.println("minimum Number = " + minNumber);
    }
}


