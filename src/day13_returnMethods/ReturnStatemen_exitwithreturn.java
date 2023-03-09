package day13_returnMethods;

import java.util.Scanner;

public class ReturnStatemen_exitwithreturn {
    public static void main(String[] args) {
        System.out.print("enter a number between 1 to 7 to see day: ");
        int dayNum = new Scanner(System.in).nextInt();
        dayName(dayNum);
    }

    public static void dayName(int dayMum) {
        if (dayMum<1 || 7<dayMum){
            System.out.println("enter please valid num 1-7");
            return;
        }
        String day = "";
        switch (dayMum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "Sunday";
        }
        System.out.println("day = " + day);
    }
}
