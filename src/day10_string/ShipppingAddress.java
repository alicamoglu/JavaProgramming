package day10_string;

import java.util.Scanner;

public class ShipppingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
               String fullName = input.nextLine();
        System.out.println("Enter your building number");
               int buildingNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter your Street name");
               String streetName = input.nextLine();
        System.out.println("Enter your city name");
               String cityName = input.nextLine();
        System.out.println("Enter your state");
               String stateName = input.nextLine();
        System.out.println("Enter your zip code");
               int zipCode = input.nextInt();
        System.out.println("Your shipping address is:\n\t" +
                fullName+ "\n\t"+
                buildingNumber + streetName + "\n\t"+
                cityName +  stateName + ", " + zipCode);
        input.close();
    }

}

/*
    Warmup tasks:
        1. Create a class named ShippingAddress and ask the user to:


        1.7 Display the shipping address
        Ex:
        Your shipping address is:
        John Smith
        7925 Jones Branch Dr
        McLean, VA 22012
*/
