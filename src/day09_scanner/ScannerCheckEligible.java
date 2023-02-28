package day09_scanner;

import java.util.Scanner;

public class ScannerCheckEligible {

    public static void main(String[] args) {
        System.out.print("enter age to check if eligible: ");
        byte age = (byte) new Scanner(System.in).nextInt();

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("------------------------------------------");

        if(age >=21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("------------------------------------------");


    }


}
