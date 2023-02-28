package day09_scanner;

import java.util.Scanner;

public class ScannerMonthName {

    public static void main(String[] args) {
        System.out.print("enter a number: ");
        byte n = new Scanner(System.in).nextByte();

        String month = "";

//        if(n >= 1 && n <= 12){
//
//            if(n==1) month = "January";
//            else if(n==2) month = "February";
//            else if(n==3) month = "March";
//            else if(n==4) month = "April";
//            else if(n==5) month = "May";
//            else if(n==6) month = "June";
//            else if(n==7) month = "July";
//            else if(n==8) month = "August";
//            else if(n==9) month = "September";
//            else if(n==10) month = "October";
//            else if(n==11) month = "November";
//            else month = "December";
//
//        }else{
//            month = "No such a month";
//        }
        switch (n){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
            default:
                month = "invalid";

        }
        System.out.println("month = " + month);
    }

}
