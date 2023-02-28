package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    //look NextLineMethodpractice to see error reason
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt (); //45

        input.nextLine(); // this additional method is put in order to read the Enter enterance
        from provious scanner method (age)

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);


    }

}
