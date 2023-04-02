package day20_forEach;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyOddNumsBy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number for the element of Array: ");
        int length = scan.nextInt();
        int[] arrayInt = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter a number: " );
            arrayInt[i] = scan.nextInt();
        }
        System.out.println("Array you entered = " + Arrays.toString(arrayInt));
        for (int i = 0; i < length ; i++) {
            if (arrayInt[i] % 2 !=0){
                arrayInt[i] = 2*arrayInt[i];
            }
        }
        System.out.println("Array with multiplied all odd numbers = " + Arrays.toString(arrayInt));
    }
}
