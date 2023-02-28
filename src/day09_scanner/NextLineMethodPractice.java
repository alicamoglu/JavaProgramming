package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter Enter (one comes from both gender and age since they can not read enter (no one else nextLine can read Enter input) therefore come to here Scanner a rest Enter (that could not be reading and writing on the console by other next.. methods but nextLine()
        // and than the rested Enter typing from last next type that could not read comes to comming next method und brings an error to typing its content.
//        But however that makes not error for age input below at the third line in print order         since the input method nextint does not also read Enter

        System.out.println("Enter your full name:");
        String full_name = input.nextLine(); //Aaron King Daniel + Enter are being typed and being

        System.out.println("Enter your school name:");
        String school_name = input.nextLine(); // Cydeo School + Enter

        System.out.println("Enter your gender: ");
        String gender = input.next();  // Male

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //28

        input.nextLine();  // Clear out the scanner
        // we have to give extra nextLine() method if we are using a nextLine() method after the other methods of scanner (other types of next.. of nextLine )

        System.out.println("Enter your street name:");
        String street = input.nextLine();

    }

}
