//package day12_customMethods;
//
//import org.jetbrains.annotations.NotNull;
//
//import java.util.Scanner;
//
//public class MethodPractice {
//    public static void main(String[] args) {
//        eligibleToBuy(22);
//        eligibleToBuy(17);
//        maximumNumber(33,44);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter please first name:");
//        String firstName = input.next();
//        input.nextLine();
//        System.out.print("Enter please last name: ");
//        String lastName = input.next();
//        initialOfPerson(firstName,lastName);
//    }
//
//    public static void eligibleToBuy(int age) {
//
//        if (age >= 21 && age < 100) {
//            System.out.println("You are eligible to buy alcohol");
//        }
//
//
//        if (age < 21 || age > 100) {
//            System.err.println("You are not eligible to buy alcohol");
//        }
//    }
//
//    public static void maximumNumber(int n1, int n2){
//
//
//
//        if (n1 > n2) {
//            System.out.println(n1 + " is the maximum number");
//        }
//
//        if (n2 > n1) {
//            System.out.println(n2 + " is the maximum number");
//        }
//
//        if (n1 == n2) {
//            System.out.println("Equal");
//        }
//    }
//
//    public static void initialOfPerson(@NotNull String firstName, @NotNull String lastName) {   //Todo @notnull and its import at the top
//// create a method that can display the inital of a person
//        System.out.println(firstName.charAt(0)+"."+lastName.charAt(0));
//    }


//}
